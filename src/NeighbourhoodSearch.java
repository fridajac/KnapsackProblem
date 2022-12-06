import model.Item;
import model.Knapsack;
import model.Lib;
import model.Solution;

import java.util.*;

public class NeighbourhoodSearch {

    public static void main(String[] args) {
        Solution greedySolution = Greedy.runGreedyAlgorithm();
        Solution newSolution = neighbourhoodSearch(greedySolution);
        Lib.printEvaluatedSolution(newSolution);
    }

    /**
     * Take a feasible solution (greedy) and optimize it
     * The best solution find is set to our local optima.
     * When local optima is found, break and return that.
     *
     * @param currentSolution
     */
    private static Solution neighbourhoodSearch(Solution currentSolution) {

        LinkedList<Knapsack> knapsacks = currentSolution.getKnapsacks();
        List<Item> itemsLeft = currentSolution.getItemsNotIncluded();
        Solution localOptima = currentSolution;

        //1. define neighbourhood as margin 0.1-1
        ArrayList<Double> neighbourhoodMargins = new ArrayList<>();
        neighbourhoodMargins.add(0.1);
        neighbourhoodMargins.add(0.2);
        neighbourhoodMargins.add(0.3);
        neighbourhoodMargins.add(0.4);
        neighbourhoodMargins.add(0.5);
        neighbourhoodMargins.add(0.6);
        neighbourhoodMargins.add(0.7);
        neighbourhoodMargins.add(0.8);
        neighbourhoodMargins.add(0.9);
        neighbourhoodMargins.add(1.0);

        double bestProfit = Lib.evaluateSolution(localOptima);
        Solution bestNeighbourHood = currentSolution;
        HashMap<Solution, Double> neighbourhoodValues = new HashMap<>();

        for (double neighbourMargin : neighbourhoodMargins) {
            //3. evaluate this neighbor
            Solution neighbour = rearrangeHolesByMargin(knapsacks, itemsLeft, neighbourMargin);
            double profitNeighbour = Lib.evaluateSolution(neighbour);
            neighbourhoodValues.put(neighbour, profitNeighbour);
        }

        //4. Find solution with best profit
        double bestNeighbourValue = Double.MIN_VALUE;

        for (Map.Entry<Solution, Double> entry : neighbourhoodValues.entrySet()) {
            if (entry.getValue() > bestNeighbourValue) {
                bestNeighbourValue = entry.getValue();
                bestNeighbourHood = entry.getKey();
            }
        }
        //5. return best neighbour as local optima
        if(bestNeighbourValue > bestProfit){
            localOptima = bestNeighbourHood;
        }
        return localOptima;
    }

    private static Solution rearrangeHolesByMargin(LinkedList<Knapsack> knapsacks, List<Item> itemsLeft, double margin) {
        //1. Rearrange items between knapsacks
        for (int i = 0; i < knapsacks.size(); i++) {
            Knapsack knapsack = knapsacks.get(i);
            if (knapsack.hasCapacityLeft()) {
                double weightLeft = knapsack.getWeightLeft();

                for (int j = 0; j < knapsacks.size(); j++) {
                    if (knapsacks.get(j).hasCapacityLeft()) {
                        Item item = knapsacks.get(j).getItemWithSpecificWeight(weightLeft, margin);
                        if (item != null) {
                            knapsacks.get(j).removeItem(item);
                            knapsack.addItem(item);
                            break;
                        }
                    }
                }
            }
        }

        //2. Fill new spaces with more items
        for (int i = 0; i < itemsLeft.size(); i++) {
            for (int j = 0; j < knapsacks.size(); j++) {
                Knapsack knapsack = knapsacks.get(j);
                Item item = itemsLeft.get(i);
                boolean doItemFit = knapsack.addItem(item);
                if (doItemFit) {
                    itemsLeft.remove(item);
                    break;
                }
            }
        }
        System.out.println(itemsLeft.size());
        return new Solution(knapsacks, itemsLeft);
    }
}

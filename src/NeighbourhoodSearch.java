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

        boolean localOptimaFound = false;

        //1. define neighbourhood as margin 0.1-1
        ArrayList<Double> neighbourhoodMargins = new ArrayList<>();
        for(double i = 0.1; i < 1; i++){
            neighbourhoodMargins.add(i);
        }

        Solution bestSolution = currentSolution;
        double bestProfit = Lib.evaluateSolution(bestSolution);

        for (double neighbourMargin : neighbourhoodMargins) {
            //3. evaluate this neighbor
            Solution neighbour = rearrangeHolesByMargin(knapsacks, itemsLeft, neighbourMargin);
            double profitNeighbour = Lib.evaluateSolution(neighbour);
            if (profitNeighbour > bestProfit) {
                bestProfit = profitNeighbour;
                bestSolution = neighbour;
            }
        }
        //4. return best neighbour as local optima
        System.out.println(bestProfit);
        return bestSolution;
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
        return new Solution(knapsacks, itemsLeft);
    }
}

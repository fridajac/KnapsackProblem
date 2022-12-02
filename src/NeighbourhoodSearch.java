import model.Item;
import model.Knapsack;
import model.Lib;
import model.Solution;

import java.util.LinkedList;
import java.util.List;

public class NeighbourhoodSearch {

    public static void main(String[] args) {
        Solution greedySolution = Greedy.runGreedyAlgorithm();

        Solution newSolution = neighbourhoodSearch(greedySolution);
        // System.out.println("Total profit of this solution: " + Lib.evaluateSolution(newSolution));
        Lib.printEvaluatedSolution(newSolution);

    }

    /**
     * Describe here...
     *
     * @param currentSolution
     */
    private static Solution neighbourhoodSearch(Solution currentSolution) {
        double profitCurrentSolution = Lib.evaluateSolution(currentSolution);

        LinkedList<Knapsack> knapsacks = currentSolution.getKnapsacks();
        List<Item> itemsLeft = currentSolution.getItemsNotIncluded();
        Solution localOptima = currentSolution;
        boolean localOptimaFound = false;

        while(!localOptimaFound) {

            //1. Rearranging part
            for (int i = 0; i < knapsacks.size(); i++) {
                Knapsack knapsack = knapsacks.get(i);
                if (knapsack.gotCapacityLeft()) {
                    int weightLeft = knapsack.getWeightLeft();

                    for (int j = 0; j < knapsacks.size(); j++) {
                        if (knapsacks.get(j).gotCapacityLeft()) {
                            Item item = knapsacks.get(j).getItemWithSpecificWeight(weightLeft);
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

            //3. evaluate solution
            Solution neighbour = new Solution(knapsacks, itemsLeft);
            double profitNeighbour = Lib.evaluateSolution(neighbour);
            if (profitNeighbour > profitCurrentSolution) {
                localOptima = neighbour;
                localOptimaFound = true;
            }
        }
        return localOptima;
    }
}

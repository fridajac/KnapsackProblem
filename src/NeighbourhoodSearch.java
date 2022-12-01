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

        //1. Rearranging part
        for (int i = 0; i < knapsacks.size(); i++) {
            Knapsack knapsack = knapsacks.get(i);
            int weightLeft = knapsack.getWeightLeft();

            //TODO only look through other knapsacks.

            for (int j = 0; j < knapsacks.size(); j++) {
                Knapsack otherKnapsack = knapsacks.get(j);
                if (otherKnapsack.gotCapacityLeft()) {
                    Item item = otherKnapsack.getItemWithSpecificWeight(weightLeft);
                    if (item != null) {
                        otherKnapsack.removeItem(item);
                        knapsack.addItem(item);
                        break;
                    }
                }
            }
        }

        //2. fill with more items part
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
        Solution newSolution = new Solution(knapsacks, itemsLeft);
        double newProfit = Lib.evaluateSolution(newSolution);
        if (newProfit > profitCurrentSolution) {
            return newSolution;
        } else {
            //continue looking through more neighbors. Where are these neighbours?
        }
        return newSolution;
    }
}

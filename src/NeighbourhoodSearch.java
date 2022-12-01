
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
     * Evaluate current profit from currentSolution
     * Define neighbourhood and evaluate those solutions
     * If we find a solution in neighbourhood with better profit, break.
     *
     * @param currentSolution
     */
    private static Solution neighbourhoodSearch(Solution currentSolution) {
        double profitCurrentSolution = Lib.evaluateSolution(currentSolution);

        LinkedList<Knapsack> knapsacks = currentSolution.getKnapsacks();
        List<Item> itemsLeft = currentSolution.getItemsNotIncluded();

        for (int i = 0; i < knapsacks.size(); i++) {
            Knapsack knapsack = knapsacks.get(i);
            int weightLeft = knapsack.getWeightLeft();
            //TODO only look through other knapsacks.
            //Try to find perfect fit.
            for (int j = 0; j < knapsacks.size(); j++) {
                Knapsack otherKnapsack = knapsacks.get(j);
                Item item = otherKnapsack.getItemWithSpecificWeight(weightLeft);
                if (item != null) {
                    otherKnapsack.removeItem(item);
                    knapsack.addItem(item);
                    break;
                }
            }
        }

        for (int i = 0; i < itemsLeft.size(); i++) {
            for (int j = 0; j < knapsacks.size(); j++) {
                Knapsack thisKnapsack = knapsacks.get(j);
                Item thisItem = itemsLeft.get(i);
                boolean doItemFit = thisKnapsack.addItem(thisItem);
                if (doItemFit) {
                    itemsLeft.remove(thisItem);
                    break;
                }
            }
        }
        Solution newSolution = new Solution(knapsacks, itemsLeft);
        double profitThisSolution = Lib.evaluateSolution(newSolution);
        if (profitThisSolution > profitCurrentSolution) {
            return newSolution;
        } else {
            //continue looking through more neighbors. Where are these neighbours?
        }
        return newSolution;
    }
}

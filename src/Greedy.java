import model.*;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Greedy {

    public static void main(String[] args) {
        Solution solution = runGreedyAlgorithm();
        //System.out.println("Total profit of this solution: " +Lib.evaluateSolution(solution));
        Lib.printEvaluatedSolution(solution);
    }
    static Solution runGreedyAlgorithm() {
        LinkedList<Knapsack> allKnapsacks = TestData.getKnapsacks(7);
        LinkedList<Item> items = TestData.getItems();
        return greedyAlgorithm(allKnapsacks, items);
    }

    /**
     * 1. Arrange the items in descending order based on profitByWeight.
     * 2. Add the items one by one into the first knapsack that has room
     */
    private static Solution greedyAlgorithm(LinkedList<Knapsack> allKnapsacks, LinkedList<Item> items){
        List<Item> sortedItems = items.stream()
                .sorted(Comparator.comparing(Item::getProfitByWeight).reversed())
                .collect(Collectors.toList());

        for(int i = 0; i < sortedItems.size() ; i++) {
            for (int j = 0; j < allKnapsacks.size(); j++) {
                Knapsack thisKnapsack = allKnapsacks.get(j);
                Item thisItem = sortedItems.get(i);
                    boolean doItemFit = thisKnapsack.addItem(thisItem);
                    if (doItemFit) {
                        sortedItems.remove(thisItem);
                        break;
                    }
                }
            }
        return new Solution(allKnapsacks, sortedItems);
    }
}

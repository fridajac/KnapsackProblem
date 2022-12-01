import model.Item;
import model.Knapsack;
import model.Lib;
import model.TestData;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Greedy {

    public static void main(String[] args) {
        LinkedList<Knapsack> solution = runGreedyAlgorithm();
        Lib.evaluateSolution(solution);
    }
    static LinkedList<Knapsack> runGreedyAlgorithm() {
        LinkedList<Knapsack> allKnapsacks = TestData.getKnapsacks(1);
        LinkedList<Item> items = TestData.getItems();
        return greedyAlgorithm(allKnapsacks, items);
    }

    /**
     * 1. Arrange the items in descending order based on profitByWeight.
     * 2. Add the items one by one into the first knapsack that has room
     */
    private static LinkedList<Knapsack> greedyAlgorithm(LinkedList<Knapsack> allKnapsacks, LinkedList<Item> items){
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
        return allKnapsacks;
    }
}

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Greedy {

    public static void main(String[] args) {
        LinkedList<Knapsack> allKnapsacks = Lib.getKnapsacks();
        LinkedList<Object> items = Lib.getItems();
        runGreedyAlgorithm(allKnapsacks, items);
    }

    private static void runGreedyAlgorithm(LinkedList<Knapsack> allKnapsacks, LinkedList<Object> items){
        //arrange the items in descending order based on profitByWeight
        //we make sure we add best values first
        List<Object> sortedItems = items.stream()
                .sorted(Comparator.comparing(Object::getProfitByWeight).reversed())
                .collect(Collectors.toList());

        for(int i = 0; i < sortedItems.size() ; i++) {
            for (int j = 0; j < allKnapsacks.size(); j++) {
                Knapsack thisKnapsack = allKnapsacks.get(j);
                Object thisItem = sortedItems.get(i);
                    boolean doItemFit = thisKnapsack.addItem(thisItem);
                    if (doItemFit) {
                        sortedItems.remove(thisItem);
                        break;
                    }
                }
            }

        for(Knapsack knapsack : allKnapsacks) {
            System.out.println("Knapsack " +knapsack.getId());
            System.out.println("Full at: " +knapsack.getWeight());
            System.out.println("Total profit: " +knapsack.getProfit());
            System.out.println("Total size: " +knapsack.getItems().size());
            for(Object item : knapsack.getItems()){
                System.out.println("Profit by weight: " +item.getProfitByWeight());
            }
            System.out.println("  ");
        }
    }
}

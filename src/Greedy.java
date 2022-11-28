import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Greedy {

    public static void main(String[] args) {
        KnapSack knapSack = new KnapSack(15.0);
        List<Object> items = Lib.getItems();
        runGreedyAlgorithmUsingFractions(knapSack, items);
    }

    private static void runGreedyAlgorithmUsingFractions(KnapSack knapSack, List<Object> items){
        //arrange the items in descending order based on profitByWeight
        List<Object> sorted = items.stream()
                .sorted(Comparator.comparing(Object::getProfitByWeight).reversed())
                .collect(Collectors.toList());

        //add items one by one into the knapsack, check, so you don't get false back.
        for (Object item : sorted){
            boolean roomLeft = knapSack.addItem(item);
            if(!roomLeft) {
                //try to add fraction
                //or typ to add another value instead.
                break;
            }
        }

        //calculate final profit
        System.out.println("Full at: " +knapSack.getTotalWeight());
        System.out.println("Total profit: " +knapSack.getTotalProfit());

    }
}

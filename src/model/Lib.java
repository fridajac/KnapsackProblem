package model;

public class Lib {

    public static void  evaluateSolution(Solution solution){
        for(Knapsack knapsack : solution.getKnapsacks()) {
            System.out.println("Knapsack " +knapsack.getId());
            System.out.println("Full at: " +knapsack.getWeight());
            System.out.println("Total profit: " +knapsack.getProfit());
            System.out.println("Nbr of items: " +knapsack.getItems().size());
            for(Item item : knapsack.getItems()){
                System.out.println("Profit by weight: " +item.getProfitByWeight());
            }
            System.out.println("  ");
        }
    }
}

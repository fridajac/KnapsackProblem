package model;

import java.util.LinkedList;

public class Lib {

    public static void printEvaluatedSolution(Solution solution){
        double totalProfit = 0;
        int nbrOfItems = 0;
        for(Knapsack knapsack : solution.getKnapsacks()) {
            totalProfit += knapsack.getProfit();
            nbrOfItems += knapsack.getItems().size();
            System.out.println("Knapsack " +knapsack.getId());
            System.out.println("Full at: " +knapsack.getWeight());
            System.out.println("Total profit: " +knapsack.getProfit());
            System.out.println("Nbr of items: " +knapsack.getItems().size());
            System.out.println("    ");
        }
        System.out.println("  ");
        System.out.println("Total evaluation:");
        System.out.println("Total profit for all knapsacks: " +totalProfit);
        System.out.println("Total nbr of items fit in all knapsacks: " +nbrOfItems);
        System.out.println("  ");
    }

    public static double evaluateSolution(Solution solution){
        double totalProfit = 0;
        LinkedList<Knapsack> allKnapsacks = solution.getKnapsacks();
        for(Knapsack knapsack : allKnapsacks){
            totalProfit += knapsack.getProfit();
        }
        return totalProfit;
    }
}

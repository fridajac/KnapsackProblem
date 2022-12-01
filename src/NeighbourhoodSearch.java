
import model.Knapsack;

import java.util.LinkedList;

public class NeighbourhoodSearch {

    public static void main(String[] args) {
        LinkedList<Knapsack> greedySolution = Greedy.runGreedyAlgorithm();
        //LinkedList<Knapsack> knapsacks = TestData.getKnapsacks(1);
        //LinkedList<Item> items = TestData.getItems();

        for(int i = 0; i < greedySolution.size() ; i++){
            System.out.println(greedySolution.get(i).getProfit());
        }
        neighbourhoodSearch(greedySolution);
    }

    private static void neighbourhoodSearch(LinkedList<Knapsack> greedySolution) {
        System.out.println("Running");
    }
}

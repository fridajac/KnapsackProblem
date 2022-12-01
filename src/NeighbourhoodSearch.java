
import model.Solution;

public class NeighbourhoodSearch {

    public static void main(String[] args) {
        Solution greedySolution = Greedy.runGreedyAlgorithm();

        neighbourhoodSearch(greedySolution);
    }

    private static void neighbourhoodSearch(Solution greedySolution) {
        System.out.println("Running");
    }
}

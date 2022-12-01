package model;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    private LinkedList<Knapsack> knapsacks;
    private List<Item> itemsNotIncluded;

    public Solution(LinkedList<Knapsack> knapsacks, List<Item> itemsNotIncluded) {
        this.knapsacks = knapsacks;
        this.itemsNotIncluded = itemsNotIncluded;
    }

    public LinkedList<Knapsack> getKnapsacks() {
        return knapsacks;
    }

    public void setKnapsacks(LinkedList<Knapsack> knapsacks) {
        this.knapsacks = knapsacks;
    }

    public List<Item> getItemsNotIncluded() {
        return itemsNotIncluded;
    }

    public void setItemsNotIncluded(List<Item> itemsNotIncluded) {
        this.itemsNotIncluded = itemsNotIncluded;
    }
}

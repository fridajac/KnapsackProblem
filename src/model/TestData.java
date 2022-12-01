package model;

import java.util.LinkedList;

public class TestData {

    public static LinkedList<Knapsack> getKnapsacks(int nbrOfKnapsacks) {
        int maxCapacity = 15;
        LinkedList<Knapsack> knapsacks = new LinkedList<>();
        for (int i = 1; i <= nbrOfKnapsacks; i++) {
            knapsacks.add(new Knapsack(i, maxCapacity));
        }
        return knapsacks;
    }

    public static LinkedList<Item> getItems() {
        LinkedList<Item> items = new LinkedList<Item>();
        items.add(new Item(3, 1));
        items.add(new Item(4, 5));
        items.add(new Item(2, 10));
        items.add(new Item(2, 4));
        items.add(new Item(2, 2));
        items.add(new Item(5, 6));
        items.add(new Item(2, 4));
        items.add(new Item(6, 4));
        items.add(new Item(3, 4));
        items.add(new Item(2, 5));
        items.add(new Item(9, 4));
        items.add(new Item(8, 4));
        items.add(new Item(1, 4));
        items.add(new Item(5, 5));
        items.add(new Item(3, 4));
        items.add(new Item(2, 4));
        items.add(new Item(1, 4));
        items.add(new Item(6, 5));
        items.add(new Item(8, 4));
        items.add(new Item(4, 4));
        items.add(new Item(1, 4));
        items.add(new Item(1, 5));
        items.add(new Item(3, 4));
        items.add(new Item(7, 4));
        items.add(new Item(1, 4));
        items.add(new Item(5, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 4));
        items.add(new Item(1, 4));
        items.add(new Item(2, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 1));
        items.add(new Item(1, 2));
        items.add(new Item(5, 3));
        items.add(new Item(5, 6));
        items.add(new Item(4, 4));
        items.add(new Item(1, 4));
        items.add(new Item(1, 5));
        items.add(new Item(3, 4));
        items.add(new Item(7, 4));
        items.add(new Item(1, 4));
        items.add(new Item(5, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 4));
        items.add(new Item(1, 4));
        items.add(new Item(2, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 1));
        items.add(new Item(1, 2));
        items.add(new Item(5, 3));
        items.add(new Item(5, 6));
        items.add(new Item(4, 4));
        items.add(new Item(1, 4));
        items.add(new Item(1, 5));
        items.add(new Item(3, 4));
        items.add(new Item(7, 4));
        items.add(new Item(1, 4));
        items.add(new Item(5, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 4));
        items.add(new Item(1, 4));
        items.add(new Item(2, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 1));
        items.add(new Item(1, 2));
        items.add(new Item(5, 3));
        items.add(new Item(5, 6));
        items.add(new Item(4, 4));
        items.add(new Item(1, 4));
        items.add(new Item(1, 5));
        items.add(new Item(3, 4));
        items.add(new Item(7, 4));
        items.add(new Item(1, 4));
        items.add(new Item(5, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 4));
        items.add(new Item(1, 4));
        items.add(new Item(2, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 1));
        items.add(new Item(1, 2));
        items.add(new Item(5, 3));
        items.add(new Item(5, 6));
        items.add(new Item(4, 4));
        items.add(new Item(1, 4));
        items.add(new Item(1, 5));
        items.add(new Item(3, 4));
        items.add(new Item(7, 4));
        items.add(new Item(1, 4));
        items.add(new Item(5, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 4));
        items.add(new Item(1, 4));
        items.add(new Item(2, 5));
        items.add(new Item(5, 6));
        items.add(new Item(3, 4));
        items.add(new Item(8, 1));
        items.add(new Item(1, 2));
        items.add(new Item(5, 3));
        items.add(new Item(5, 6));
        return items;
    }
}

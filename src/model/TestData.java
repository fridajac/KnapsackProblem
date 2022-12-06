package model;

import java.util.LinkedList;

public class TestData {

    public static LinkedList<Knapsack> getKnapsacks(int nbrOfKnapsacks) {
        double maxCapacity = 15.0;
        LinkedList<Knapsack> knapsacks = new LinkedList<>();
        for (int i = 1; i <= nbrOfKnapsacks; i++) {
            knapsacks.add(new Knapsack(i, maxCapacity));
        }
        return knapsacks;
    }

    public static LinkedList<Item> getItems() {
        LinkedList<Item> items = new LinkedList<Item>();
        items.add(new Item(3.3, 1.1));
        items.add(new Item(4.2, 5.6));
        items.add(new Item(2.1, 10.1));
        items.add(new Item(2.8, 4.1));
        items.add(new Item(2.7, 2.2));
        items.add(new Item(5.0, 6.6));
        items.add(new Item(2.1, 4.1));
        items.add(new Item(6.2, 4.9));
        items.add(new Item(3.9, 8.2));
        items.add(new Item(2.5, 1.9));
        items.add(new Item(9.6, 1.9));
        items.add(new Item(8.7,2.6));
        items.add(new Item(1.1, 4.2));
        items.add(new Item(5.9, 5.3));
        items.add(new Item(3.3, 1.1));
        items.add(new Item(4.2, 5.6));
        items.add(new Item(2.1, 10.1));
        items.add(new Item(2.8, 4.1));
        items.add(new Item(2.7, 2.2));
        items.add(new Item(5.0, 6.6));
        items.add(new Item(2.1, 4.1));
        items.add(new Item(6.2, 4.9));
        items.add(new Item(3.9, 8.2));
        items.add(new Item(2.5, 1.9));
        items.add(new Item(9.6, 1.9));
        items.add(new Item(8.7,2.6));
        items.add(new Item(1.1, 4.2));
        items.add(new Item(5.9, 5.3));
        items.add(new Item(4.2, 5.6));
        items.add(new Item(0.6, 10.1));
        items.add(new Item(2.8, 4.1));
        items.add(new Item(2.7, 2.2));
        items.add(new Item(5.0, 6.6));
        items.add(new Item(2.1, 4.1));
        items.add(new Item(6.2, 4.9));
        items.add(new Item(3.9, 8.2));
        items.add(new Item(2.5, 1.9));
        items.add(new Item(9.6, 1.9));
        items.add(new Item(0.2,2.6));
        items.add(new Item(1.1, 4.2));
        items.add(new Item(5.9, 5.3));
        items.add(new Item(4.2, 5.6));
        items.add(new Item(2.1, 10.1));
        items.add(new Item(2.8, 4.1));
        items.add(new Item(2.7, 2.2));
        items.add(new Item(5.0, 6.6));
        items.add(new Item(0.5, 4.1));
        items.add(new Item(6.2, 4.9));
        items.add(new Item(3.9, 8.2));
        items.add(new Item(2.5, 1.9));
        items.add(new Item(9.6, 1.9));
        items.add(new Item(8.7,2.6));
        items.add(new Item(1.1, 4.2));
        items.add(new Item(5.9, 5.3));
        items.add(new Item(1.1, 5.3));
        items.add(new Item(1.0, 3.5));
        items.add(new Item(0.4, 5.5));
        return items;
    }
}

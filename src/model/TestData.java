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
        items.add(new Item(3.2, 1.0));
        items.add(new Item(4.1, 5.0));
        items.add(new Item(3.2, 10.0));
        items.add(new Item(1.0, 4.0));
        items.add(new Item(1.9, 2.0));
        items.add(new Item(5.0, 6.6));
        items.add(new Item(3.0, 4.2));
        items.add(new Item(4.0, 4.9));
        items.add(new Item(1.0, 4.3));
        items.add(new Item(4.6, 5.0));
        items.add(new Item(3.0, 4.2));
        items.add(new Item(8.0, 4.9));
        items.add(new Item(1.0, 4.3));
        items.add(new Item(2.2, 5.0));
        items.add(new Item(3.0, 4.2));
        items.add(new Item(1.0, 4.9));
        items.add(new Item(1.0, 4.3));
        items.add(new Item(6.6, 5.0));
        items.add(new Item(3.0, 4.2));
        items.add(new Item(8.0, 4.9));
        items.add(new Item(1.0, 4.3));
        items.add(new Item(4.0, 5.0));
        items.add(new Item(3.0, 4.2));
        items.add(new Item(4.0, 4.9));
        items.add(new Item(1.0, 4.3));
        items.add(new Item(5.0, 5.0));
        items.add(new Item(5.0, 6.6));
        items.add(new Item(3.0, 4.2));
        items.add(new Item(8.0, 4.9));
        items.add(new Item(1.0, 4.3));
        items.add(new Item(2.0, 5.0));
        items.add(new Item(5.0, 6.6));
        items.add(new Item(3.0, 4.2));
        items.add(new Item(8.0, 4.9));
        items.add(new Item(1.0, 4.3));
        items.add(new Item(5.2, 5.0));
        items.add(new Item(5.6, 6.6));
        return items;
    }
}

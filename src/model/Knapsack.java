package model;

import java.util.ArrayList;

public class Knapsack {

    private int id;
    private double maxCapacity;
    private double weight;
    private int profit;
    private ArrayList<Item> items;

    public Knapsack(int id, double maxCapacity) {
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.weight = 0;
        this.profit = 0;
        this.items = new ArrayList<>();
    }

    public boolean addItem(Item item) {
        double newWeight = weight + item.getWeight();
        if (newWeight > maxCapacity) {
            return false;
        }
        items.add(item);
        weight += item.getWeight();
        profit += item.getProfit();
        return true;
    }

    public void removeItem(Item item) {
        items.remove(item);
        weight -= item.getWeight();
        profit -= item.getProfit();
    }

    public double getWeight() {
        return weight;
    }

    public double getProfit() {
        return profit;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getId() {
        return id;
    }

    public boolean hasCapacityLeft() {
        if (weight < 15.0) {
            return true;
        }
        return false;
    }

    public double getWeightLeft() {
        return maxCapacity - weight;
    }

    public Item getItemWithSpecificWeight(double weightLeft, double margin) {

        for (Item item : items) {
            if ((item.getWeight() > (weightLeft - margin)) && (item.getWeight() <= (item.getWeight() + margin))) {
                return item;
            }
        }
        return null;
    }
}

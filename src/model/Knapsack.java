package model;

import java.util.ArrayList;

public class Knapsack {

    private int id;
    private double maxCapacity;
    private double weight;
    private double profit;
    private ArrayList<Item> items;

    public Knapsack(int id, double maxCapacity) {
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.weight = 0;
        this.profit = 0;
        this.items = new ArrayList<>();
    }

    public boolean addItem(Item item){
        double newWeight = weight + item.getWeight();
        if(newWeight > maxCapacity){
            return false;
        }
        items.add(item);
        weight += item.getWeight();
        profit += item.getProfit();
        return true;
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

}

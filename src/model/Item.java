package model;

public class Item {

    private int weight;
    private int profit;
    private double profitByWeight;

    public Item(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
        this.profitByWeight = profit/weight;
    }

    public double getWeight() {
        return weight;
    }

    public double getProfit() {
        return profit;
    }

    public double getProfitByWeight() {
        return profitByWeight;
    }
}

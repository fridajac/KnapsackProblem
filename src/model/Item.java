package model;

public class Item {

    private double weight;
    private double profit;
    private double profitByWeight;

    public Item(double weight, double profit) {
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

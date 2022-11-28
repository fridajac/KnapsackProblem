public class Object {

    private double weight;
    private double profit;
    private double profitByWeight;

    public Object(double weight, double profit) {
        this.weight = weight;
        this.profit = profit;
    }

    public double getWeight() {
        return weight;
    }

    public double getProfit() {
        return profit;
    }

    public double getProfitByWeight() {
        return profit/weight;
    }

    public void setProfitByWeight(int profitByWeight) {
        this.profitByWeight = profitByWeight;
    }
}

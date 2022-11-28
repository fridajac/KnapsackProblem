public class Object {

    private int weight;
    private int profit;
    private int profitByWeight;

    public Object(int weight, int profit, int profitByWeight) {
        this.weight = weight;
        this.profit = profit;
        this.profitByWeight = profitByWeight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getProfitByWeight() {
        return profitByWeight;
    }

    public void setProfitByWeight(int profitByWeight) {
        this.profitByWeight = profitByWeight;
    }
}

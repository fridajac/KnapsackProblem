import java.util.ArrayList;

public class Knapsack {

    private int id;
    private double maxCapacity;
    private double weight;
    private double profit;
    private ArrayList<Object> items;

    public Knapsack(int id, double maxCapacity) {
        this.id = id;
        this.maxCapacity = maxCapacity;
        this.weight = 0;
        this.profit = 0;
        this.items = new ArrayList<>();
    }

    public boolean addItem(Object item){
        double newWeight = weight + item.getWeight();
        if(newWeight > maxCapacity){
            return false;
        }
        items.add(item);
        weight += item.getWeight();
        profit += item.getProfit();
        return true;
    }

    public boolean addItemUsingFractions(Object item){
        double newWeight = weight + item.getWeight();
        if(newWeight > maxCapacity){
            double diff = maxCapacity - newWeight;
            System.out.println(diff);
            //find fraction
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

    public ArrayList<Object> getItems() {
        return items;
    }

    public boolean gotCapacity() {
        return weight != maxCapacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

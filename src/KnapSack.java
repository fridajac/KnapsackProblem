import java.util.ArrayList;

public class KnapSack {

    private double maxCapacity;
    private double totalWeight;
    private double totalProfit;
    private ArrayList<Object> items;

    public KnapSack(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.totalWeight = 0;
        this.totalProfit = 0;
        this.items = new ArrayList<>();
    }

    public boolean addItem(Object item){
        double newWeight = totalWeight + item.getWeight();
        if(newWeight > maxCapacity){
            return false;
        }
        items.add(item);
        totalWeight += item.getWeight();
        totalProfit += item.getProfit();
        return true;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public double getTotalProfit() {
        return totalProfit;
    }

    public ArrayList<Object> getItems() {
        return items;
    }
}

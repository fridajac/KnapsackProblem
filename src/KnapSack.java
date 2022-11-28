import java.util.ArrayList;

public class KnapSack {

    private double maxCapacity;
    private double currentWeight;
    private ArrayList<Object> items;

    public KnapSack(double maxCapacity, double currentWeight) {
        this.maxCapacity = maxCapacity;
        this.currentWeight = currentWeight;
        this.items = new ArrayList<Object>();
    }

    public boolean addItem(Object item){
        currentWeight += item.getWeight();
        if(currentWeight > maxCapacity){
            return false;
        }
        items.add(item);
        return true;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }
}

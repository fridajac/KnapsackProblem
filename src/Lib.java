import java.awt.event.KeyAdapter;
import java.util.ArrayList;
import java.util.LinkedList;

public class Lib {

    static LinkedList<Object> getItems() {
       LinkedList<Object> items = new LinkedList<Object>();
        items.add(new Object(3.2, 1.0));
        items.add(new Object(4.1, 5.0));
        items.add(new Object(3.2, 10.0));
        items.add(new Object(1.0, 4.0));
        items.add(new Object(1.9, 2.0));
        items.add(new Object(5.0, 6.6));
        items.add(new Object(3.0, 4.2));
        items.add(new Object(4.0, 4.9));
        items.add(new Object(1.0, 4.3));
        items.add(new Object(4.6, 5.0));
        items.add(new Object(3.0, 4.2));
        items.add(new Object(8.0, 4.9));
        items.add(new Object(1.0, 4.3));
        items.add(new Object(2.2, 5.0));
        items.add(new Object(3.0, 4.2));
        items.add(new Object(1.0, 4.9));
        items.add(new Object(1.0, 4.3));
        items.add(new Object(6.6, 5.0));
        items.add(new Object(3.0, 4.2));
        items.add(new Object(8.0, 4.9));
        items.add(new Object(1.0, 4.3));
        items.add(new Object(4.0, 5.0));
        items.add(new Object(3.0, 4.2));
        items.add(new Object(4.0, 4.9));
        items.add(new Object(1.0, 4.3));
        items.add(new Object(5.0, 5.0));
        items.add(new Object(5.0, 6.6));
        items.add(new Object(3.0, 4.2));
        items.add(new Object(8.0, 4.9));
        items.add(new Object(1.0, 4.3));
        items.add(new Object(2.0, 5.0));
        items.add(new Object(5.0, 6.6));
        items.add(new Object(3.0, 4.2));
        items.add(new Object(8.0, 4.9));
        items.add(new Object(1.0, 4.3));
        items.add(new Object(5.2, 5.0));
        items.add(new Object(5.6, 6.6));
        return items;
    }


    static LinkedList<Knapsack> getKnapsacks() {
        LinkedList<Knapsack> knapsacks = new LinkedList<Knapsack>();
       for(int i = 1; i <= 3; i++){
           knapsacks.add(new Knapsack(i,15.0));
       }
        return knapsacks;
    }

}

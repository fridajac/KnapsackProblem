import java.util.ArrayList;
import java.util.List;

public class Lib {

    static ArrayList<Object> getItems() {
        ArrayList<Object> items = new ArrayList<Object>();
        items.add(new Object(3.2, 1.0));
        items.add(new Object(4.1, 5.0));
        items.add(new Object(8.2, 10.0));
        items.add(new Object(1.0, 4.0));
        items.add(new Object(1.9, 2.0));
        items.add(new Object(5.0, 6.6));
        items.add(new Object(4.0, 4.1));
        return items;
    }
}

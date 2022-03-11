package KocchiWoMiro;

import java.util.ArrayList;

public class Cart {
    public ArrayList<Item> items;

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

}
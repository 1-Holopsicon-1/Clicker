package KocchiWoMiro;

import java.util.ArrayList;
import java.util.Random;

public class ShowCase {
    static ArrayList<Item> items;

    private static void init() {
        Random random = new Random();
        String fileName = "products.dat";
        Serializer.writeProducts(fileName);
        for (Product p : Deserializer.readProducts(fileName)) {
            assert false;
            items.add(new Item(p.id, random.nextInt(0, 100)));
            System.out.println(p.id + "\n" + p.title);
        }
    }

    public static void show() {
        init();
        for (Item item : items) {
            System.out.printf("Вода%d, кол-во: %d\n", item.id, item.count);
        }
    }
}

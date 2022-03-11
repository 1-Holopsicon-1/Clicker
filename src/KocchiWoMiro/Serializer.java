package KocchiWoMiro;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Random;

public class Serializer {
    public static void writeProducts(String to) {
        Random random = new Random();
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(to))) {
            for (int i = 1; i <= 10; i++) {
                Product p = new Product(i, "вода" + i,
                        "вода" + i,
                        0.5,
                        random.nextInt(50, 100),
                        true);
                oos.writeObject(p);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
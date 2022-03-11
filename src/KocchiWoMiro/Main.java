package KocchiWoMiro;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new LogicOfRetry<>(new Query(1), 5, 1000);
    }
}

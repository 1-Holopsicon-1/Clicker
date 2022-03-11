package KocchiWoMiro;

public class MyThread extends Thread {
    Query cls;
    boolean hasError = false;

    public MyThread(Query cls) {
        this.cls = cls;
    }

    public void run() {
        try {
            cls.request();
        } catch (Exception e){
            hasError = true;
        }
    }
}
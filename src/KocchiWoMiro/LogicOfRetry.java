package KocchiWoMiro;

public class LogicOfRetry<T extends Retryable> {
    T cls;
    int attempt = 0;
    int maxAttempt;
    int msec;

    public LogicOfRetry(T cls, int maxAttempt, int msec) throws InterruptedException {
        this.cls = cls;
        this.maxAttempt = maxAttempt;
        this.msec = msec;
        MyThread myThread;
        while (true){
            if(this.attempt <= maxAttempt){
                int i = 0;
                myThread = new MyThread((Query) this.cls);
                myThread.start();
                while (i < msec){
                    if(!myThread.isAlive()){
                        break;
                    }
                    Thread.sleep(msec / 100);
                    i += msec / 100;
                }
                if(myThread.hasError){
                    System.out.println("LogicOfRetry!");
                    attempt++;
                    myThread.interrupt();
                }
                if(myThread.isAlive()){
                    System.out.println("Timeout!");
                    attempt++;
                    myThread.interrupt();
                }
                System.out.println("Great..");
            } else {
                System.out.println("hmm...");
            }
            break;
        }
    }
}

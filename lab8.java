
//..............................................................................
/*public class Lab8{

    static class ServerMonitor extends Thread {
        private Thread workerThread;

        public ServerMonitor(Thread workerThread) {
            this.workerThread = workerThread;
            this.setDaemon(true); // Make it a daemon thread
        }

        @Override
        public void run(){
            while(workerThread.isAlive()) {
                System.out.println("Monitoring server...");
                try {
                    Thread.sleep(1000); // Check every 500 milliseconds
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupted state
                    return; // Exit if interrupted
                }
            }
        }
    }

    static class WorkerTask extends Thread {
       
        public void run() {
            System.out.println("Worker task started...");
            try {
                Thread.sleep(1000); // Simulate a 5-second task
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted state
                return; // Exit if interrupted
            }
            System.out.println("Worker task finished!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        WorkerTask worker = new WorkerTask();
        ServerMonitor monitor = new ServerMonitor(worker);

        worker.start();
        monitor.start();

        worker.join(); // Wait for the worker thread to finish
        System.out.println("Main thread finishing.");
    }
}

//.............................................................................................................................................................


class SharedList {
    private int[] array;
    private int size = 0;
    private int addIndex = 0;
    private int removeIndex = 0;

    public SharedList(int s) {
        this.array = new int[s];
    }

    public synchronized void add(int number) throws InterruptedException {
        while (size == array.length) {
            wait();
        }
        array[addIndex] = number;
        addIndex = (addIndex + 1) % array.length;
        size++;
        System.out.println("Produced: " + number);
        notifyAll();
    }

    public synchronized int remove() throws InterruptedException {
        while (size == 0) {
            wait();
        }
        int number = array[removeIndex];
        removeIndex = (removeIndex + 1) % array.length;
        size--;
        System.out.println("Consumed: " + number);
        notifyAll();
        return number;
    }
}

class ProducerConsumer extends Thread {
    private final SharedList sharedList;
    private final boolean isProducer;

    public ProducerConsumer(SharedList sharedList, boolean isProducer) {
        this.sharedList = sharedList;
        this.isProducer = isProducer;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (isProducer) {
                    sharedList.add(i);
                    Thread.sleep(1000);
                } else {
                    sharedList.remove();
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Lab8 {
    public static void main(String[] args) {
        SharedList sharedList = new SharedList(5);
        ProducerConsumer producer = new ProducerConsumer(sharedList, true);
        ProducerConsumer consumer = new ProducerConsumer(sharedList, false);
        producer.start();
        consumer.start();
        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}*/






class Display
{
public synchronized void greet(String name)
{
for(int i=0;i<3;i++)
{
System.out.print("Hello...");
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println(name);
}
}
}
class Assign extends Thread
{

String name;
Display d;
Assign(Display d,String name)
{
this.d=d;

this.name=name;
}
public void run()
{
d.greet(name);
}
}
class Lab8
{
public static void main(String args[ ]) throws Exception
{
Display d=new Display(); 
Assign a1= new Assign(d,"Vedavyas");
Assign a2= new Assign(d,"Mahesh"); 
a1.start(); 
a2.start(); 
}
}








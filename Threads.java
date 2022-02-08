// FIRST METHOD TO USE THREADS
class Loader_A extends Thread { // 1. Inherit from Thread class
    public void run(){  // 2. Override the run() method
        System.out.println("Hello [LA]");
    }
}

// SECOND METHOD TO USE THREADS
class Loader_B implements Runnable {
    public void run(){
        System.out.println("Hello [LB]");
    }
}

public class Threads {
    public static void main(String[] args){

        // When we create the obj object and call its start() method, 
        // the run() method statements execute on a different thread.
        Loader_A object_a = new Loader_A();
        object_a.start();

        Thread object_b = new Thread(new Loader_B());
        object_b.start();

        // CHECKED EXCEPTIONS - checked when compiled
        try {
            Thread.sleep(1000); // Not catching this exception cause Checked Exception
        } catch (InterruptedException ie) {
            System.out.println("Error: Action interrupted.");
        }
        
        // UNCHECKED EXCEPTIONS - runtime exceptions
        try {
            int a = 2, b = 0;
            System.out.println( a / b ); // Runtime exception (div by 0) - compilation successfull
        } catch (ArithmeticException ae) {
            System.out.println("Error: Division by 0.");
        }

    }
}

/**
 * Created by sky on 17-5-14.
 */
import java.lang.*;
public class app {
    public static void main(String args[]){
        System.out.println("Hello, Now I will create 3 tasks to run");
        task1 t1 = new task1();
        task2 t2 = new task2();
        task3 t3 = new task3();
        t1.start();
        System.out.println("t1 created & started");
        t2.start();
        System.out.println("t2 created & started");
        t3.start();
        System.out.println("t3 created & started");
    }
}

/**
 * Created by sky on 17-5-14.
 */
import java.lang.*;
class task2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Task2,Run Every    1s");	    
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
            }
        }
    }
}

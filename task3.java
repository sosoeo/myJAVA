/**
 * Created by sky on 17-5-14.
 */
import java.lang.*;
class task3 extends Thread{
    int i;
    public void run(){
        while(true){
	    System.out.println("Task2,Run Every   10s");	    

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e){
            }
        }
    }
}

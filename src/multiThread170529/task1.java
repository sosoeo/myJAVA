/**
 * Created by sky on 17-5-14.
 */
import java.lang.*;
class task1 extends Thread{
    int i;
    public void run(){
        while(true){
            System.out.println("Task1,Run Every  0.1s");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e){
            }
        }
    }
}

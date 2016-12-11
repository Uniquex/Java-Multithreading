/**
 * Created by wvitz on 12.12.2016.
 */

import java.util.Date;

public class Worker implements Runnable{

    private boolean running = false;


    public Worker(){
        Thread thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run(){
        Date date = new Date();
        this.running = true;
        System.out.println("This is currently running on a separate thread, " +
                "the id is: " + Thread.currentThread().getId());

        System.out.println("-------------------------------------------------------------");

        System.out.println(date.toString());

        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        this.running = false;

    }

    public boolean isRunning(){
        return this.running;
    }
}

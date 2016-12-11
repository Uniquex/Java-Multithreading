/**
 * Created by vitz on 11.12.16.
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ThreadFactory;

public class Runner {

    public static void main(String[] args) throws InterruptedException{
        Date start = new Date();

        ArrayList<Worker> workers = new ArrayList<>();


        for(int x = 0; x < 8; x++)
        {
            workers.add(new Worker());
        }

/*        for(Worker wk : workers)
        {
            while(wk.isRunning())
            {
                Thread.sleep(100);
            }
        }*/

    }
}

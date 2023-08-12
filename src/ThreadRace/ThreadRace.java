package ThreadRace;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadRace {
    public static void main(String[] args) {
        BackOfTheThreadRace B=new BackOfTheThreadRace();
        ExecutorService pool= Executors.newFixedThreadPool(4);
        for(int i=0;i<12;i++){

            pool.execute(B);

        }

        try {
            pool.awaitTermination(1, TimeUnit.SECONDS);
        }catch (InterruptedException e){
            System.out.println("HATA");

        }
        pool.shutdown();
        System.out.println("EVEN LIST: "+B.getEvenList());
        System.out.println("ODD LIST: "+B.getOddList());






    }
}

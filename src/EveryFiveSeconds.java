import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;

public class EveryFiveSeconds extends Thread {
    private long beginTime = 0;

    public int getKolSek() {
        return kolSek;
    }

    public void setKolSek(int kolSek) {
        this.kolSek = kolSek;
    }

    private int kolSek = 0;
    public Exchanger<Long> ex;

    public EveryFiveSeconds(int kolSek, long beginTime, Exchanger<Long> exchanger) {
        super("Stream 2");
        this.kolSek = kolSek;
        this.beginTime = beginTime;
        this.ex = exchanger;
    }

    @Override
    public void run() {
        long prinyali = 0L;
        try {
            while (true)
            {
                prinyali = ex.exchange(0L);

                if (prinyali % 5 == 0) {
                    System.out.println("В потоке " + Thread.currentThread().getName()
                            + "!!  Прошло 5 секунд.");
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

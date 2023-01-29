import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

//producers details
class Procedure extends Thread {
    OutputStream os;

    public Procedure(OutputStream o) {
        os = o;
    }

    public void run() {
        int count = 1;

        while (true) {
            try {
                os.write(count);
                os.flush();
                System.out.println("produder will produce a value" + count);
                System.out.flush();

                Thread.sleep(10);


                ;

                count++;
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
//consumer details
class consumer extends Thread {
    InputStream ip;

    public consumer(InputStream i) {
        ip = i;
    }

    public void run() {
        int x;

        while (true) {
            try {
                x = ip.read();
                System.out.println("consumers consume the value" + x);
                System.out.flush();
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}


public class pipedDemo {
    public static void main(String[] args) throws Exception {
        PipedInputStream pis = new PipedInputStream();
        PipedOutputStream pio = new PipedOutputStream();
        pis.connect(pio);
        Procedure p = new Procedure(pio);
        consumer c = new consumer(pis);

        p.start();
        c.start();
    }
}
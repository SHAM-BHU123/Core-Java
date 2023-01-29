import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoDemo {
    public static void main(String[] args)throws Exception {
        ServerSocket ss=new ServerSocket(2000);
            Socket stk =ss.accept();

        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        String msg;
        StringBuilder sb;

        do {
                msg=br.readLine();
                sb=new StringBuilder(msg);
                sb.reverse();
                msg=sb.toString();
                ps.println(msg);
            System.out.println("Server is watting for the request:");

        }
        while (!msg.equals("dne"));
        
    }
}


 class Client {
    public static void main(String[] args)throws Exception {
        Socket stk=new Socket("192.168.1.73",2000);

       BufferedReader brr=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        String msg;


        do {
            msg=brr.readLine();
            msg=br.readLine();
            ps.println(msg);
            System.out.println("From server"+msg);

        }
        while (!msg.equals("dne"));

    }
}


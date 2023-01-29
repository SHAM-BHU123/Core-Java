import java.awt.*;

public class Firstapp {
    public static void main(String[] args) {
        Frame f=new Frame("My first app");
        f.setLayout(new FlowLayout());
        Button b=new Button("OK");
        Label l=new Label("Name");
        TextField tf=new TextField(20);
        f.add(l);
        f.add(tf);
        f.add(b);
        b.setSize(10,10);
        f.setSize(420,420);
        f.setVisible(true);
    }
}

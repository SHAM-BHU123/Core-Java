import javax.swing.*;
import java.awt.*;

class Myapp extends Frame {
Label l;
TextField tf;
Button b;

public Myapp(){
    super("My APP");
    setLayout(new FlowLayout());
    l=new Label("Name");
    tf=new TextField(20);
    b=new Button("ok");
    add(l);
    add(tf);
    add(b);
}


}
public class Secondapp {
    public static void main(String[] args) {
        Myapp ma=new Myapp();
        ma.setSize(400,400);
        ma.setVisible(true);

    }
}

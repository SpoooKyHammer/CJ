import java.awt.*;

public class Main extends Frame{

    Main(){
        super("Grid Layout");
        setLayout(new GridLayout(2,2));
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setVisible(true);
        setSize(600,600);
    }
    public static void main(String[] args) {
       new Main();
    }
}

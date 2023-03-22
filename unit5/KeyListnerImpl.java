import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends Frame{

    Main(){
        super("Grid Layout");
        setLayout(new GridLayout(3,1));
        setVisible(true);
        setSize(200,200);

        Label l1 = new Label("Number: ");
        add(l1);

        Label result = new Label();

        TextField inputField = new TextField();
        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                int num = (int)e.getKeyChar();
                String msg = num % 2 == 0 ? "Even" : "Odd";
                result.setText(msg);
            }
        });
        
        add(inputField);
        add(result);
    }
    public static void main(String[] args) {
       new Main();
    }
}

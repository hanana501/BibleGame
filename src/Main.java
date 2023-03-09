import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {

    public static final int CELL = 50;
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;
    public static final int ROW = HEIGHT / CELL;
    public static final int COLUMN= WIDTH / CELL;

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(WIDTH, HEIGHT);

    }

    @Override
    public void paintComponent(Graphics g){

    }
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setContentPane(new Main());
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
    }
}
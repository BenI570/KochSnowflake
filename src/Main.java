import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Panel panel = new Panel();
        frame.setSize(600, 600);
        frame.setTitle("Koch Snowflake");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);

        Timer timer = new Timer(2000, e -> panel.iterate(1));
        timer.start();
    }
}

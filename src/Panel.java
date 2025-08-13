import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Panel extends JPanel {
    private List<Line> lines = new ArrayList<Line>();
    private Color color;

    public Panel() {
        this(Color.BLACK);
    }

    public Panel(Color color) {
        this.color = color;
        lines.add(new Line(300, 200, 200, 400));
        lines.add(new Line(200, 400, 400, 400));
        lines.add(new Line(400, 400, 300, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(color);
        for (Line line : lines) {
            g.drawLine(line.x1, line.y1, line.x2, line.y2);
        }
    }

    public void iterate(int times) {
        if (times == 1) return;
        iterate(--times);
    }

    private static class Line {
        int x1, y1, x2, y2;

        public Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }
    }
}

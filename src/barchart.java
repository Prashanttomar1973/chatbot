import javax.swing.*;
import java.awt.*;

public class barchart extends JPanel {

    // Data values for each bar
    private final int[] values = {30, 50, 40, 38, 75, 25, 50};
    // Labels for each bar
    private final String[] labels = {"subject1", "subject2", "subject3", "subject4", "subject5", "subject6", "subject7"};
    // Colors for each bar
    private final Color[] colors = {Color.RED, Color.ORANGE, Color.BLUE, Color.GREEN, Color.PINK, Color.CYAN, Color.GRAY};

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;




        int width = getWidth();
        int height = getHeight();

        // Draw background grid labels

        g2d.setColor(Color.RED);

        g2d.drawLine(50, 50, width - 20, 50);
        g2d.drawLine(50, 120, width - 20, 120);
        g2d.drawLine(50, 190, width - 20, 190);

        // Draw labels
        g2d.setColor(Color.BLACK);
        g2d.drawString("Problematic", width - 100, 45);
        g2d.drawString("Difficult", width - 100, 115);
        g2d.drawString("OK", width - 100, 185);

        // Bar chart area
        int barWidth = (width - 100) / values.length;
        int maxBarHeight = height - 80;

        for (int i = 0; i < values.length; i++) {
            int barHeight = (values[i] * maxBarHeight) / 100;
            int x = 10+ (i * barWidth);
            int y = height - barHeight - 30;

            g2d.setColor(colors[i]);
            g2d.fillRect(x, y, barWidth - 10, barHeight);

            // Draw labels below bars
            g2d.setColor(Color.BLACK);
            g2d.drawString(labels[i], x + (barWidth / 4), height - 10);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Custom Bar Chart");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 400);
            frame.setContentPane(new barchart());
            frame.setVisible(true);

        });}
}

import javax.swing.*;
import java.awt.*;

public class Barchart_for_Subject extends JPanel {

    // Data values for each subject
    private final int[] values = {5,5, 5, 5, 5, 5};
    // Labels for each subject
    private final String[] labels = {
            "DBMS", "Web Technology", "DAA", "Compiler Design",
            "Machine Learning & Techniques", "Constitution of India"
    };

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int width = getWidth();
        int height = getHeight();
        int padding = 50;
        int maxUnits = 5;

        // Draw axes
        g2d.setColor(Color.BLACK);
        g2d.drawLine(padding, height - padding, width - 20, height - padding); // X-axis
        g2d.drawLine(padding, padding, padding, height - padding); // Y-axis

        // Draw Y-axis labels
        for (int i = 1; i <= maxUnits; i++) {
            int y = height - padding - (i * (height - 2 * padding) / maxUnits);
            g2d.drawLine(padding - 5, y, padding + 5, y);
            g2d.drawString(String.valueOf(i), padding - 25, y + 5);
        }

        // Draw bars
        int barWidth = (width - 2 * padding) / values.length - 20;
        for (int i = 0; i < values.length; i++) {
            int barHeight = (values[i] * (height - 2 * padding)) / maxUnits;
            int x = padding + i * (barWidth + 20);
            int y = height - padding - barHeight;

            // Set color based on unit count
            g2d.setColor(values[i] >= 4 ? Color.BLUE : (values[i] == 3 ? Color.ORANGE : Color.RED));
            g2d.fillRect(x, y, barWidth, barHeight);

            // Draw subject labels
            g2d.setColor(Color.BLACK);
            g2d.drawString(labels[i], x, height - 30);
        }

        // Draw X-axis label
        g2d.drawString("Subjects", width / 2, height - 10);
        // Draw Y-axis label
        g2d.drawString("Units", 10, height / 2);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Subject Bar Chart");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 500);
            frame.setContentPane(new Barchart_for_Subject());
            frame.setVisible(true);
 });
}
}

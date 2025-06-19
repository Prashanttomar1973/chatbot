import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class EnhancedDesktopApp {
    public static void main(String[] args) {
        // Create the JFrame for the desktop application
        JFrame frame = new JFrame("Enhanced Fetch URL Content");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Text field to enter the URL
        JTextField urlField = new JTextField("https://example.com");
        urlField.setPreferredSize(new Dimension(450, 30));

        // Buttons for fetching data and saving to a file
        JButton fetchButton = new JButton("Fetch");
        JButton saveButton = new JButton("Save to File");
        saveButton.setEnabled(false); // Initially disabled

        // Text area to display fetched data
        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Status label for feedback
        JLabel statusLabel = new JLabel("Enter a URL and click 'Fetch'");

        // Add components to the frame
        JPanel topPanel = new JPanel(new FlowLayout());
        topPanel.add(new JLabel("Enter URL: "));
        topPanel.add(urlField);
        topPanel.add(fetchButton);
        topPanel.add(saveButton);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(statusLabel, BorderLayout.SOUTH);

        // Action listener for the fetch button
        fetchButton.addActionListener(e -> {
            String urlString = urlField.getText();
            saveButton.setEnabled(false); // Disable saving until content is fetched
            statusLabel.setText("Fetching content... Please wait.");
            textArea.setText(""); // Clear previous content

            // Fetch content in a separate thread to avoid blocking the UI
            new Thread(() -> {
                try {
                    String content = fetchURLContent(urlString);
                    SwingUtilities.invokeLater(() -> {
                        textArea.setText(content);
                        statusLabel.setText("Content fetched successfully!");
                        saveButton.setEnabled(true); // Enable save button
                    });
                } catch (Exception ex) {
                    SwingUtilities.invokeLater(() -> {
                        statusLabel.setText("Error: " + ex.getMessage());
                        textArea.setText("");
                    });
                }
            }).start();
        });

        // Action listener for the save button
        saveButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Save Content to File");
            int userSelection = fileChooser.showSaveDialog(frame);

            if (userSelection == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                    writer.write(textArea.getText());
                    statusLabel.setText("Content saved to: " + file.getAbsolutePath());
                } catch (IOException ioException) {
                    statusLabel.setText("Error saving file: " + ioException.getMessage());
                }
            }
        });

        // Show the frame
        frame.setVisible(true);
    }

    // Method to fetch content from a URL using java.net
    private static String fetchURLContent(String urlString) throws Exception {
        StringBuilder content = new StringBuilder();

        // Open a connection to the URL
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Check response code
        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("HTTP Error: " + responseCode);
        }

        // Read the response
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }

        return content.toString();
    }
}

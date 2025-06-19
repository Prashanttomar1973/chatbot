
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Grandfather Class - Primary Education
class PrimaryEducation {
    String subjects = "Math, Science";

    public String getSubjects() {
        return subjects;
    }
}

// Father Class - Secondary Education
class SecondaryEducation extends PrimaryEducation {
    String subjects = super.getSubjects() + ", Algebra, Physics";

    @Override
    public String getSubjects() {
        return subjects;
    }
}

// Child Class - Higher Education
class HigherEducation extends SecondaryEducation {
    String subjects = super.getSubjects() + ", Machine Learning, AI";

    @Override
    public String getSubjects() {
        return subjects;
    }
}

// GUI Application Class
public class EducationApp extends JFrame {
    private JComboBox<String> educationLevelDropdown;
    private JTextArea subjectDisplay;

    public EducationApp() {
        setTitle("Education System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Select Education Level:");
        String[] levels = {"Primary Education", "Secondary Education", "Higher Education"};
        educationLevelDropdown = new JComboBox<>(levels);
        subjectDisplay = new JTextArea(5, 30);
        subjectDisplay.setEditable(false);

        JButton showSubjectsButton = new JButton("Show Subjects");
        showSubjectsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedLevel = (String) educationLevelDropdown.getSelectedItem();
                String subjects = "";

                if (selectedLevel.equals("Primary Education")) {
                    subjects = new PrimaryEducation().getSubjects();
                } else if (selectedLevel.equals("Secondary Education")) {
                    subjects = new SecondaryEducation().getSubjects();
                } else if (selectedLevel.equals("Higher Education")) {
                    subjects = new HigherEducation().getSubjects();
                }

                subjectDisplay.setText("Subjects: " + subjects);
            }
        });

        add(label);
        add(educationLevelDropdown);
        add(showSubjectsButton);
        add(new JScrollPane(subjectDisplay));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EducationApp().setVisible(true);
        });
    }
}


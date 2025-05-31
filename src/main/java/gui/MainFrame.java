package gui;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static final long serialVersionUID = 1L;
    private JButton addButton;
    private JLabel[] labels;
    private JTextField[] fields;

    public MainFrame() {
        this.setTitle("Gestore Contatti");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(4, 2, 5, 5)); // 3 righe input + 1 bottone

        labels = new JLabel[3];
        fields = new JTextField[3];
        addButton = new JButton("Submit");

        labels[0] = new JLabel("Enter name:");
        labels[1] = new JLabel("Enter numero:");
        labels[2] = new JLabel("Enter email:");

        for (int i = 0; i < 3; i++) {
            fields[i] = new JTextField();
            this.add(labels[i]);
            this.add(fields[i]);
        }

        // spazio vuoto per allineare il bottone a destra
        this.add(new JLabel(""));
        this.add(addButton);

        this.setVisible(true);
    }
}


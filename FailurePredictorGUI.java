import javax.swing.*;
import java.awt.event.*;

public class FailurePredictorGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Failure Predictor");

        JLabel cpuLabel = new JLabel("CPU Usage:");
        cpuLabel.setBounds(30, 30, 100, 25);
        JTextField cpuField = new JTextField();
        cpuField.setBounds(140, 30, 100, 25);

        JLabel memLabel = new JLabel("Memory Usage:");
        memLabel.setBounds(30, 70, 100, 25);
        JTextField memField = new JTextField();
        memField.setBounds(140, 70, 100, 25);

        JButton predictBtn = new JButton("Predict");
        predictBtn.setBounds(80, 110, 100, 30);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(30, 150, 200, 25);

        frame.add(cpuLabel);
        frame.add(cpuField);
        frame.add(memLabel);
        frame.add(memField);
        frame.add(predictBtn);
        frame.add(resultLabel);

        // Button click logic
        predictBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int cpu = Integer.parseInt(cpuField.getText());
                int mem = Integer.parseInt(memField.getText());

                if (cpu > 80 || mem > 80) {
                    resultLabel.setText("Result: HIGH RISK");
                } else {
                    resultLabel.setText("Result: LOW RISK");
                }
            }
        });

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
  
        

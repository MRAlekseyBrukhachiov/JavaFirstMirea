package ru.mirea.task9;
import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
    public int scoreMilan = 0, scoreMadrid = 0;
    public JButton milanButton = new JButton("Milan");
    public JButton madridButton = new JButton("Madrid");
    public JLabel lastScore = new JLabel("Last Scorer: N/A");
    public JLabel score = new JLabel("Result: 0X0");
    public Label result = new Label("Winner: Draw");
    void check()
    {
        if (scoreMilan > scoreMadrid)
            result.setText("Winner: Milan");
        else if (scoreMadrid > scoreMilan)
            result.setText("Winner: Madrid");
        else result.setText("Winner: Draw");
    }
    public Main(){
        super("Task9");

        Container container = getContentPane();
        GridBagConstraints constraints = new GridBagConstraints();
        container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        setLayout(new GridBagLayout());
        setSize(500,200);
        setLocationRelativeTo(null);

        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.ipady = 30;
        constraints.weightx = 0.3;
        constraints.gridy = 0;
        constraints.gridx = 0;
        container.add(milanButton, constraints);

        constraints.ipady = 30;
        constraints.weightx = 0.3;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.gridy = 0;
        constraints.gridx = 2;
        container.add(madridButton, constraints);

        constraints.ipady = 20;
        constraints.weightx = 1;
        constraints.gridy = 0;
        constraints.gridx = 1;
        constraints.fill=GridBagConstraints.CENTER;
        container.add(score, constraints);

        constraints.gridy = 1;
        constraints.gridx = 1;
        container.add(lastScore, constraints);

        constraints.ipady = 0;
        constraints.weightx = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.gridy = 3;
        constraints.gridx = 1;
        container.add(result, constraints);
        milanButton.addActionListener(f -> {
            scoreMilan++;
            score.setText("Result: "+scoreMilan+"X"+scoreMadrid);
            lastScore.setText("Last Scorer: Milan");
            check();
        });
        madridButton.addActionListener(f -> {
            scoreMadrid++;
            score.setText("Result: "+scoreMilan+"X"+scoreMadrid);
            lastScore.setText("Last Scorer: Madrid");
            check();
        });

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

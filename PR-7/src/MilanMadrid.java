import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilanMadrid extends JFrame {
    int rea = 0;
    int mil = 0;
    Font fnt = new Font("Times new roman",  Font.BOLD, 15);
    JButton ACMilan = new JButton("AC Milan");
    JButton realMadrid = new JButton("Real Madrid");
    JLabel result = new JLabel("Result: " + mil + " X " + rea);
    JLabel lastScorer = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    public MilanMadrid() {
        super("Match");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(1100, 600, 400, 200);

        setLayout(new GridLayout(4, 2));
        add(ACMilan);
        ACMilan.setFont(fnt);
        add(realMadrid);
        realMadrid.setFont(fnt);
        add(result);
        result.setFont(fnt);
        add(lastScorer);
        lastScorer.setFont(fnt);
        add(winner);
        winner.setFont(fnt);

        ACMilan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mil++;
                result.setText("Result: " + mil + " X " + rea);
                lastScorer.setText("Last Scorer: AC Milan");

                if (mil > rea) {
                    winner.setText("Winner: AC Milan");
                } else if (rea > mil) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
        realMadrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rea++;
                result.setText("Result: " + mil + " X " + rea);
                lastScorer.setText("Last Scorer: Real Madrid");

                if (mil > rea) {
                    winner.setText("Winner: AC Milan");
                } else if (rea > mil) {
                    winner.setText("Winner: Real Madrid");
                } else {
                    winner.setText("Winner: DRAW");
                }
            }
        });
    }

    public static void main(String[] args) {
        MilanMadrid match = new MilanMadrid();
        match.setVisible(true);
    }
}

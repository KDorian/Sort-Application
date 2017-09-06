import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewJFrame extends JFrame {
    private JPanel panel;
    private JButton selectionSortButton;
    private JTextArea textArea1;

    SortingAlgorithms algo = new SortingAlgorithms();

    public NewJFrame() {

        setContentPane(panel);

        selectionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long start = System.nanoTime();

                algo.SelectionSort();
                long elapsedTime = System.nanoTime() - start;

                textArea1.setText("SELECTION SORT\n Time: " + elapsedTime + " nanosec.");
            }
        });
    }
}

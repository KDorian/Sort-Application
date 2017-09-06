import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewJFrame extends JFrame {
    private JPanel panel;
    private JButton selectionSortButton;
    private JTextArea textArea1;
    private JButton bubbleSortButton;

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

        bubbleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long start = System.nanoTime();

                algo.BubbleSort();
                long elapsedTime = System.nanoTime() - start;

                textArea1.setText("BUBBLE SORT\n Time: " + elapsedTime + " nanosec.");
            }
        });
    }
}

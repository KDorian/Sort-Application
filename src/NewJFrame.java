import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewJFrame extends JFrame {
    private JPanel panel;
    private JButton selectionSortButton;
    private JTextArea textArea1;
    private JButton bubbleSortButton;
    private JButton insertionSortButton;
    private JButton mergeSortButton;

    SortingAlgorithms algo = new SortingAlgorithms();

    public NewJFrame() {

        setContentPane(panel);

        selectionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long start = System.nanoTime();

                algo.selectionSort();
                long elapsedTime = System.nanoTime() - start;

                textArea1.setText("SELECTION SORT\n Time: " + elapsedTime + " nanosec.");
            }
        });

        bubbleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long start = System.nanoTime();

                algo.bubbleSort();
                long elapsedTime = System.nanoTime() - start;

                textArea1.setText("BUBBLE SORT\n Time: " + elapsedTime + " nanosec.");
            }
        });

        insertionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long start = System.nanoTime();

                algo.insertionSort();
                long elapsedTime = System.nanoTime() - start;

                textArea1.setText("INSERTION SORT\n Time: " + elapsedTime + " nanosec.");
            }
        });

        mergeSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long start = System.nanoTime();

                algo.mergeSort(algo.arr4,0,algo.arr4.length-1);
                long elapsedTime = System.nanoTime() - start;

                textArea1.setText("MERGE SORT\n Time: " + elapsedTime + " nanosec.");
            }
        });
    }
}

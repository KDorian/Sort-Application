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
    private JButton quickSortButton;
    private JButton newArraysButton;
    private JButton allAlgorithmsButton;

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

        quickSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long start = System.nanoTime();

                algo.quickSort(algo.arr5,0,algo.arr5.length-1);
                long elapsedTime = System.nanoTime() - start;

                textArea1.setText("QUICK SORT\n Time: " + elapsedTime + " nanosec.");
            }
        });

        newArraysButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                algo.newArrays();
                textArea1.setText("OK!");
            }
        });

        allAlgorithmsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                long start = System.nanoTime();
                algo.selectionSort();
                long elapsedTime = System.nanoTime() - start;

                long start1 = System.nanoTime();
                algo.bubbleSort();
                long elapsedTime1 = System.nanoTime() - start1;

                long start2 = System.nanoTime();
                algo.insertionSort();
                long elapsedTime2 = System.nanoTime() - start2;

                long start3 = System.nanoTime();
                algo.mergeSort(algo.arr4,0,algo.arr4.length-1);
                long elapsedTime3 = System.nanoTime() - start3;

                long start4 = System.nanoTime();
                algo.quickSort(algo.arr5,0,algo.arr5.length-1);
                long elapsedTime4 = System.nanoTime() - start4;

                textArea1.setText("SELECTION SORT\n Time: " + elapsedTime + " nanosec."
                + "\nBUBBLE SORT\n Time: " + elapsedTime1 + " nanosec."
                + "\nINSERTION SORT\n Time: " + elapsedTime2 + " nanosec."
                + "\nMERGE SORT\n Time: " + elapsedTime3 + " nanosec."
                + "\nQUICK SORT\n Time: " + elapsedTime4 + " nanosec.");
            }
        });
    }
}

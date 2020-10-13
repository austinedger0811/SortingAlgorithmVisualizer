import java.awt.BorderLayout;
// import java.awt.ActionListener;
// import java.awt.ActionEvent;
import javax.swing.*;

public class SortingAlgorithmVisualiser {

    private static final int WINDOW_WIDTH = 1200;
    private static final int WINDOW_HEIGHT = 600;

    // JFrame to create GUI window
    private JFrame window;
    private Sort array;

    // Constructor
    public SortingAlgorithmVisualiser() {

        // Construct the JFrame
        window = new JFrame("Sorting Algorith Visualiser");

        // Add the Sort JPanel to the JFrame
        array = new Sort();
        window.add(array, BorderLayout.CENTER);

        // Add Menu Bar JPanel to the JFrame
        MenuBar menu = new MenuBar();
        window.add(menu.algorithmMenu, BorderLayout.PAGE_START);
        window.add(menu.sortButton, BorderLayout.SOUTH);

        // Set Basic JFrame Settings
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void run() {
        array.unsort();
        array.selectionSort();
    }

    public static void main(String[] args) {
        SortingAlgorithmVisualiser vis = new SortingAlgorithmVisualiser();
        vis.run();
    }

}
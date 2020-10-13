import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Sort extends JPanel {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private static final int ARRAY_SIZE = 25;
    private static final int WINDOW_WIDTH = 1200;
    private static final int WINDOW_HEIGHT = 600;
    private static int barWidth = WINDOW_WIDTH / ARRAY_SIZE;
    private int[] elementColor;

    // Array to sort
    private int[] array;

    // Contructor
    public Sort() {

        // DO SOMETHING WITH THIS!!!!
        array = new int[ARRAY_SIZE];
        elementColor = new int[ARRAY_SIZE];

        // Fill Array
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
            elementColor[i] = 0;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);

        for (int i = 0; i < ARRAY_SIZE; i++) {
            int height = (array[i] * 20 + 100);
            int x = i + (barWidth - 1) * i;
            int y = WINDOW_HEIGHT - height;
            g.fillRect(x, y, barWidth, height);
        }
    }

    public void unsort() {
        int shuffles = 100;
        for (int i = 0; i < shuffles; i++) {
            int rand1 = (int) (Math.random() * ARRAY_SIZE);
            int rand2 = (int) (Math.random() * ARRAY_SIZE);

            int temp = array[rand1];
            array[rand1] = array[rand2];
            array[rand2] = temp;
        }
    }

    public void selectionSort() {

        int n = ARRAY_SIZE;

        // Loop thought unsorted array
        for (int i = 0; i < n - 1; i++) {

            // Set Current Min
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }

            // Swap the min element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

            // Repaints the Array after every swap
            repaint();
            wait(1000);
        }
    }

    public void insertionSort() {

    }

    public void quickSort() {

    }

    public void mergeSort() {

    }

    // Wait fuction for visualisation delay
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        }

        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
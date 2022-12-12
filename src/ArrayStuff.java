import java.util.Random;

public class ArrayStuff {
    public static void main(String[] args) {
        int dataPoints[];
        int randomnum;
        int sum = 0;
        dataPoints = new int[100];
        Random rnd = new Random();
        for (int i = 0; i <= 99; ++i) {
            randomnum = rnd.nextInt(100) + 1;
            dataPoints[i] = randomnum;
        }
        for (int k = 0; k <= 99; k++){
            System.out.print(dataPoints[k]+" | ");
            sum = sum + dataPoints[k];
        }
        double average = sum /100;
        System.out.print("\nThe average of the random array dataPoints is: "+average);
    }
}

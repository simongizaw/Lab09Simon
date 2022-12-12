import java.util.Random;
import java.util.Scanner;

public class LinearE {
    public static void main(String[] args) {
        double dataPoints[];
        int randomnum;
        int checked;
        int howmany=0;
        int firstfound;
        Scanner in = new Scanner(System.in);
        dataPoints = new double[100];
        Random rnd = new Random();
        for (int i = 0; i <= 99; ++i) {
            randomnum = rnd.nextInt(100) + 1;
            dataPoints[i] = randomnum;
        }
        System.out.println("Average of dataPoints is:  "+ getAverage(dataPoints));
    }

    public static double getAverage(double values[]) {
        double sum = 0;
        for (int k = 0; k <= (values.length-1); k++){
            sum = sum + values[k];
        }
        double average = sum/ values.length;
        return average;
    }
}
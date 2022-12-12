import java.util.Random;
import java.util.Scanner;

public class LinearD {
    public static void main(String[] args) {
        int dataPoints[];
        int randomnum;
        int checked;
        Scanner in = new Scanner(System.in);
        dataPoints = new int[100];
        Random rnd = new Random();
        for (int i = 0; i <= 99; ++i) {
            randomnum = rnd.nextInt(100) + 1;
            dataPoints[i] = randomnum;
        }
        int min =dataPoints[0];
        int max=dataPoints[0];
        for(int k =0; k <=99; ++k){
            if(min>dataPoints[k]){
                min = dataPoints[k];
            } else if (max<dataPoints[k]) {
                max = dataPoints[k];
            }
        }
        System.out.print("The minimum was " + min + "\nThe maximum was " +max);
    }
}
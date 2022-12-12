import java.util.Random;
import java.util.Scanner;

public class LinearB {
    public static void main(String[] args) {
        int dataPoints[];
        int randomnum;
        int checked;
        int howmany=0;
        int firstfound;
        Scanner in = new Scanner(System.in);
        dataPoints = new int[100];
        Random rnd = new Random();
        for (int i = 0; i <= 99; ++i) {
            randomnum = rnd.nextInt(100) + 1;
            dataPoints[i] = randomnum;
        }
        checked = SafeInput.getRangedInt(in, "Enter your random number: ", 0, 100);
        for(int k = 0; k <= 99; ++k){
            if(dataPoints[k] == checked){
                howmany = howmany+1;
            }
        }
        System.out.print(checked+" was found "+howmany+" times");


    }
}
import java.util.Random;
import java.util.Scanner;

public class LinearC {
    public static void main(String[] args) {
        int dataPoints[];
        int randomnum;
        int checked;
        int firstfound=0;
        Scanner in = new Scanner(System.in);
        dataPoints = new int[100];
        Random rnd = new Random();
        checked = SafeInput.getRangedInt(in, "Enter your random number: ", 0, 100);
        for (int i = 0; i <= 99; ++i) {
            randomnum = rnd.nextInt(100) + 1;
            dataPoints[i] = randomnum;
        }
        for(int k = 0; k <= 99; ++k){
            if(dataPoints[k] == checked) {
                firstfound = k;
                System.out.print("The value " + checked + " was found at array index " + firstfound);
                break;
            }else{
                firstfound = 400;
            }
        }
        if(firstfound == 400){
            System.out.print("The value " + checked + " was not found");
        }


    }
}
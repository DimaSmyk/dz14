package selfwork14.task02;

import java.util.Arrays;
import java.util.Random;

public class Exp2 {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20);
        }
        System.out.println(Arrays.toString(array));

        int division;
        int rnd1 = new Random().nextInt(20);
        int rnd2 = new Random().nextInt(20);
        //int rnd2 = 30;

        try {
            division = array[rnd1] / array[rnd2];
            System.out.println(array[rnd1] +", " +  array[rnd2]);
            System.out.println(division);

        }catch (ArithmeticException exp){
            System.out.println(exp.getMessage());
            try {
               division = array[rnd1] / array[rnd2];
                System.out.println(division);
            } catch (ArithmeticException exp1){
                System.out.println(exp1.getMessage());
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

}


package selfwork14.task03;

import java.util.Arrays;
import java.util.Random;

public class ForStart {
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
            doException(array[rnd1], array[rnd2] );
            //for fast test
            //doException(array[rnd1], 0);

            division = array[rnd1] / array[rnd2];

            System.out.println(array[rnd1] +", " +  array[rnd2]);
            System.out.println(division);

        }catch (DivideByZeroException myExp){
            System.out.println("My Exception");
            try {
                doException(array[rnd1], array[rnd2] );

                //for fast test
                //doException(array[rnd1], 0 );

                division = array[rnd1] / array[rnd2];
                System.out.println(division);
            } catch (DivideByZeroException exp1){
                System.out.println("My exception again");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public static void doException(int x, int y) throws DivideByZeroException {
        if (y == 0)throw new DivideByZeroException();
    }
}

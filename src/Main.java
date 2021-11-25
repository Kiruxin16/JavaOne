//import Lesson1.FirstHW;
//import Lesson2.SecondHW;
import Lesson3.ThirdHW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] taskOne = new int[]{0,1,0,1,1,1,0,0,1};
        System.out.println((Arrays.toString(ThirdHW.revZeroOne(taskOne))));     //Задание 1


        System.out.println((Arrays.toString(ThirdHW.hundred())));               //Задание 2

        int[] taskThree = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
        System.out.println((Arrays.toString(ThirdHW.lessThanSix(taskThree)))); //Задание 3


        int[][] taskFour = new int[8][8];
        ThirdHW.printMatrix(ThirdHW.matrixDiag(taskFour));                      //Задание 4


        System.out.println(Arrays.toString(ThirdHW.initialValues(12,65)));            //Задание 5

        int[] taskSix = new int[] {4,5,7,13,34,8,1,11,52,6,8,4,-5,15};          //Задание 6
        ThirdHW.arrMax(taskSix);
        ThirdHW.arrMin(taskSix);

        int[] taskSeven = new int[]{5,12,12,4,25};
        System.out.println(ThirdHW.arrayBalance(taskSeven));                    //Задание 7

        System.out.println(Arrays.toString(taskSix));
        System.out.println(Arrays.toString(ThirdHW.pushArray(taskSix,-2))); //Задание 8








    }
}

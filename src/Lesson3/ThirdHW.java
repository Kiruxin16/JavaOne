package Lesson3;

public class ThirdHW {
    /**
     * Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     * С помощью цикла и условия заменить 0 на 1, 1 на 0
     */
    public static int[] revZeroOne(int[] input){
        for (int i = 0; i <input.length ; i++) {
            if(input[i]==1){
                input[i]=0;
            }else if (input[i]==0){
                input[i]=1;
            }else{
                System.out.println("Условия задачи не соблюдены.");
                return null;
            }
        }
        return input;
    }


    /**
     * Задать пустой целочисленный массив длиной 100.
     * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
     */
    public static int[] hundred(){
        int[] hun =new int[100];
        for (int i = 0; i <hun.length ; i++) {
            hun[i]=i+1;
        }
        return hun;
    }


    /**
     * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
     * и числа меньшие 6 умножить на 2
     */
    public static int[] lessThanSix(int[] input){
        for (int i = 0; i <input.length ; i++) {
            if (input[i]<6){
                input[i]*=2;
            }
        }
        return input;
    }

    /**
     * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
     * то есть [0][0], [1][1], [2][2], …, [n][n]
     */
    public static int[][] matrixDiag(int[][] input){
        for (int i = 0; i <input.length ; i++) {
            input[i][i]=1;
            input[i][input.length-i-1]=1;
        }
        return input;
    }

    /**
     * Вывод двумерного массива на консоль в виде матрицы.
     */
    public static void printMatrix(int[][] matr){
        for (int i = 0; i <matr.length ; i++) {
            for (int j = 0; j <matr[i].length ; j++) {
                System.out.printf("%4d",matr[i][j]);
            }
            System.out.println();
        }
    }

    /**
     * Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len,
     * каждая ячейка которого равна initialValue
     */
    public static int[] initialValues(int len,int initialValue){
        int[] poolMass = new int[len];
        for (int i = 0; i <poolMass.length ; i++) {
            poolMass[i]=initialValue;
        }
        return poolMass;
    }

    /**
     * Находит максимальный элемент в массиве
     */
    public static void arrMax(int[] input){
        int max=input[0];
        int maxIndex=1;
        for (int i = 1; i <input.length ; i++) {
            if(input[i]>max){
                max=input[i];
                maxIndex=i+1;
            }
        }
        System.out.printf("Максимальый элемент массива под омером %d. Он равен %d.\n",maxIndex,max);
    }
    /**
     * Находит минимальный элемент в массиве
     */
    public static void arrMin(int[] input){
        int min=input[0];
        int minIndex=1;
        for (int i = 1; i <input.length ; i++) {
            if(input[i]<min){
                min=input[i];
                minIndex=i+1;
            }
        }
        System.out.printf("Минимальный элемент массива под омером %d. Он равен %d.\n",minIndex,min);
    }


    /**
     *  Написать метод, в который передается не пустой одномерный целочисленный массив,
     *  метод должен вернуть true, если в массиве есть место,
     *  в котором сумма левой и правой части массива равны.
     */
    public static boolean arrayBalance(int[] input){
        int sumLeft;
        int sumRight;//5,12,4,4,25
        for (int i = 0; i <input.length ; i++) {
            sumLeft=0;
            sumRight=0;
            for (int j = 0; j <i+1 ; j++) {
                sumLeft+=input[j];
            }
            for (int j =i+1; j < input.length; j++) {
                sumRight+=input[j];
            }
            if (sumLeft==sumRight){
                return  true;
            }
        }
        return false;
    }

    /**
     *Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
     *  при этом метод должен сместить все элементы массива на n позиций.
     *  Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     */
    public static int[] pushArray(int[] arr,int pushVal){
        int pool1,pool2;
        if (pushVal>0){
            for (int i = 0; i <pushVal ; i++) {
                pool1=arr[0];
                for (int j = 1; j <arr.length ; j++) {
                    pool2=arr[j];
                    arr[j]=pool1;
                    pool1=pool2;
                }
                arr[0]=pool1;
            }
        }else if(pushVal<0){
            pushVal *=-1;
            for (int i = 0; i <pushVal ; i++) {
                pool1=arr[arr.length-1];
                for (int j = arr.length-2; j >=0 ; j--) {
                    pool2=arr[j];
                    arr[j]=pool1;
                    pool1=pool2;
                }
                arr[arr.length-1]=pool1;
            }
        }
        return arr;
    }

}

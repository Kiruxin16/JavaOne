package Tasks;

public  class HWTasks {

    public static void printThreeWords() {
        System.out.println("Orange\n" +
                           "Banana\n" +
                           "Apple");
    }

    public static void checkSumSign(int first, int second){
        System.out.println("Сумма чисел равна: "+(first+second));
        if (first+second>=0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor(int indicator){
        if (indicator<=0)
            System.out.println("Красный");
        else if (indicator<=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");

    }

    public static void compareNumbers(int a, int b){

        if (a>=b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }

}

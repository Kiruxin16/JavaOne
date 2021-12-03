package Lesson2;

public class SecondHW {

    //Задание 1
    /**
     * Проверяет, лежит ли сумма в пределах от 10 до 20.
     * @return true, если лежит; false, если нет.
     */
    public static boolean isINRange(int first, int second){
        if ((first+second)>=10 && (first+second)<=20){
            return true;
        }
        return false;

    }

    /**
     * Выводит на консоль ответ в текстовом виде.
     */
    public static void tenToTwenty(int first,int second){
        System.out.println(first+"+"+second+"="+(first+second));
        if(isINRange(first,second)){
            System.out.println("Сумма чисел лежит в пределах от 10 до 20 (включительно)");
        }else {
            System.out.println("Сумма чисел не лежит в пределах от 10 до 20 (включительно)");
        }
    }



    //Здание 2
    /**
     * Проверяет, положительное ли принятое число.
     * @return true, если положительное; false, если нет.
     */
    public static boolean isPositive(int value){
        if (value>=0){
            return true;
        }
        return false;

    }

    /**
     * Выводит на консоль ответ в текстовом виде.
     */
    public static void typeSign(int value){
        if(isPositive(value)){
            System.out.println(value +" положительное.");
        }else {
            System.out.println(value +" отрицательное.");
        }
    }

    //Задание 3
    /**
     * Проверяет, отрицательное ли принятое число.
     * @return true, если отрицательное; false, если нет.
     */
    public static boolean isNegative(int value){
        if (value<0){
            return true;
        }
        return false;

    }


    // Задание 4
    /**
     * Принимает строку и число n. Печатает полученную строку n раз.
     */
    public static void multiType(String mess,int n){
        for (int i = 0; i < n ; i++) {
            System.out.println(mess);
        }
    }


    // Задание 5
    /**
     * Проверяет, високостный ли введенный код.
     * @return true, если високостный; false, если нет.
     */
    public static boolean isLeapYear(int year){

        if (year % 4 == 0) {
            year /= 4;
            if (year % 25 == 0) {
                year /= 25;
                if (year % 4 == 0) {
                    return true;
                } else return false;
            } else return true;
        } else return false;
    }


    public static boolean isLeapYear2(int year){
        if ((year%4==0 && year%100!=0) || year%400==0 ){
            return true;
        }
        return false;
    }
    /**
     * Выводит на консоль ответ в текстовом виде.
     */
    public static void leapYear(int year){
        if(isLeapYear(year)){
            System.out.println(year +" високостный.");
        }else {
            System.out.println(year +" не високостный.");
        }
    }
}

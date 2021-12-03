//import Lesson1.FirstHW;
//import Lesson2.SecondHW;
//import Lesson3.ThirdHW;
import Lesson5.Employee;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Employee[] staff=new Employee[]{(new Employee("Минин Сергей Юрьевич","Инженер",
                                                      "SYMinin@mail.ru","89069472214",54700,43)),
                                         new Employee("Картаев Олег Михайлович","Техник",
                                                      "OlMKartaev@mail.ru","89138148834",45200,35),
                                         new Employee("Филатова Ольга Михайловна","Ведущий специалист",
                                                       "OMFilatova@mail.ru","89239405621",40760,29),
                                         new Employee("Максимова Вера Леонидовна","Технолог",
                                                      "VeLMaksimova","89039469012",48400,52),
                                         new Employee("Кузовлев Денис Олегович","Начальник смены",
                                                      "DOKuzovlev@mail.ru","89237780043",75200,44)};
        for (int i = 0; i <staff.length ; i++) {
            if(staff[i].getAge()>=40){
                staff[i].info();
            }

        }


    }
}

//import Lesson1.FirstHW;
//import Lesson2.SecondHW;
//import Lesson3.ThirdHW;
import Lesson5.Employee;
import java.util.Arrays;
import Lesson6.*;
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик","Рыжий",4,3);
        Cat cat2 = new Cat("Фаня","Черно-пятнистый",4,8);
        Cat cat3 = new Cat("Семен","Серый",3,2);
        Dog dog1 = new Dog("Джек","Черный",11,6);
        Dog dog2 = new Dog("Мухтар","Коричневый",4,12);


        cat1.run(150);
        cat2.run(400);
        cat3.swim(5);
        dog1.run(400);
        dog2.swim(7);
        dog1.swim(15);

        Animal.populationInfo();
        Cat.populationInfo();
        Dog.populationInfo();


    }

}

 



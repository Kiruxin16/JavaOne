//import Lesson1.FirstHW;
//import Lesson2.SecondHW;
//import Lesson3.ThirdHW;
import Lesson5.Employee;
import java.util.Arrays;

import Lesson7.*;
public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(120);
        Cat[] strongAndIndep = new Cat[]{
                new Cat("Жора",35),
                new Cat("Барсик", 15),
                new Cat("Семен",20),
                new Cat("Фаня",30),
                new Cat("Маркиз", 15),
                new Cat("Лева",10),
                new Cat("Леопольд",30),
                new Cat("Тоша", 15),
                new Cat("Пушок",10)
        };
        for (Cat cat:strongAndIndep) {
            cat.eatFood(bowl);
            bowl.foodInfo();
        }
        bowl.addFood(120);
        for (Cat cat:strongAndIndep) {
            cat.eatFood(bowl);
            bowl.foodInfo();
        }


    }

}

 



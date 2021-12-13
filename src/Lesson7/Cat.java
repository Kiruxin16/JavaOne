package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety=false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eatFood(Bowl bowl) {
        if (!satiety) {
            if (appetite > bowl.getCurFood()) {
                System.out.println("Еды в миске не хватило. " + name + " не стал есть.");
            } else {
                bowl.reduceFood(appetite);
                satiety=true;
                System.out.println("Кот " + name + " поел из миски.");
            }
        }
        System.out.println(name + (satiety ? " сытый." : " голоден."));

    }



}

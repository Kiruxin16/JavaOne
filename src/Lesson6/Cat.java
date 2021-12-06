package Lesson6;

public class Cat extends Animal {

    private static final int CAT_MAX_RUN = 200;
    private static int catCount=0;

    public Cat(String name, String color, int age, int weight) {
        super(name, color, age, weight);
        catCount++;
    }

    @Override
    public void run(int distance) {
        System.out.println("Кот " + name + " пробежал " +
                ((distance <= CAT_MAX_RUN) ? distance : (distance - CAT_MAX_RUN) )+ "м.");
        if (distance > CAT_MAX_RUN) {
            System.out.println("Оставшиеся " + (distance - CAT_MAX_RUN) + "м "
                    + name + " \"пролежал\".");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Кошки не любят воду !\nВ результате руки расцарапаны а " +
                "%dм, это минимальная дистанция на которую он к вам подойдет!\n",distance);

    }

    public static int getCatCount() {
        return catCount;
    }

    public static void populationInfo(){
        System.out.println("Всего кошек: "+getCatCount());
    }
}

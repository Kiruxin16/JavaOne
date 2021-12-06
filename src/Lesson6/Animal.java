package Lesson6;

public abstract class Animal {
    private static int genCount=0;
    protected String name;
    protected String color;
    protected int age;
    protected int weight;

    public Animal(String name, String color, int age, int weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
        genCount++;
    }


    public abstract void run(int distance);
    public abstract void swim(int distance);

    public static int getGenCount() {
        return genCount;
    }

    public static void populationInfo(){
        System.out.println("Всего животных: "+getGenCount());
    }
}

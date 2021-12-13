package Lesson6;

public class Dog extends Animal {
    private static final int DOG_MAX_RUN=500;
    private static final int DOG_MAX_SWIM=10;
    private static int dogCount=0;
    public Dog(String name, String color, int age, int weight) {
        super(name, color, age, weight);
        dogCount++;
    }



    @Override
    public void run(int distance) {
        if (distance<=DOG_MAX_RUN){
            System.out.println("Пес "+name+" пробежал "+distance+"м. Хороший мальчик!");
        } else {
            System.out.println(name+" осилил только "+DOG_MAX_RUN+"м из "+
                    distance+". Похвалите его он очень старался.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance<=DOG_MAX_SWIM){
            System.out.printf("Пес %s проплыл %dм. Хороший мальчик\n",name,distance);
        }else System.out.printf("%s не может проплыть больше %dм. Пожалуйста, вытащите его из воды, пока он не утонул!\n",name,DOG_MAX_SWIM);

    }

    public static int getDogCount() {
        return dogCount;
    }

    public static void populationInfo(){
        System.out.println("Всего собак: "+getDogCount());
    }
}

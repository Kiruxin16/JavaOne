package Lesson7;

public class Bowl {
    private int curFood;

    public Bowl(int curFood) {
        this.curFood = curFood;
    }

    public int getCurFood() {
        return curFood;
    }

    public int addFood(int vol){
        if (vol <0){
            System.out.println("Количество еды не может быть отрицательным. Еды в миске осталось столько же");
            return curFood;
        }
        curFood +=vol;
        return curFood;
    }

    public void reduceFood(int vol){
        if (vol <0){
            System.out.println("Количество еды не может быть отрицательным. Еды в миске осталось столько же");
            return;
        }
        if (curFood-vol<0){
            System.out.println("Нельзя забрать еды из миски больше, чем в ней осталось. Еды в миске осталось столько же: "+curFood+".");
            return;
        }
        curFood-=vol;
        return;
    }
    public void foodInfo(){
        System.out.println("Еды в миске: "+curFood);
    }
}

package Lesson5;

public class Employee {
    private String fio;
    private String position;
    private String eMail;
    private String phoneNum;
    private int salary;
    private int age;

    public Employee(String fio, String position,String eMail, String phoneNum, int salary, int age ){
        this.fio=fio;
        this.position=position;
        this.eMail=eMail;
        this.phoneNum=phoneNum;
        this.salary=salary;
        this.age=age;
    }
    public void info(){
        System.out.println(this.toString());
    }
    @Override
    public String toString(){
        return             "Сотрудник:  "+ fio+"\n"+
                "Должность:  "+ position+"\n"+
                "Эл. почта:  "+ eMail+"\n"+
                "Телефон:    "+ phoneNum+"\n"+
                "Зарплата:   "+ salary+"\n"+
                "Возраст:    "+ age;
    }

    public int getAge() {
        return age;
    }
}

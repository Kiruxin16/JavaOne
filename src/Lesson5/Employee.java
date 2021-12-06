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


/*
    Employee[] staff = new Employee[]{(
            new Employee("Минин Сергей Юрьевич", "Инженер",
                    "SYMinin@mail.ru", "89069472214", 54700, 43)),
            new Employee("Картаев Олег Михайлович", "Техник",
                    "OlMKartaev@mail.ru", "89138148834", 45200, 35),
            new Employee("Филатова Ольга Михайловна", "Ведущий специалист",
                    "OMFilatova@mail.ru", "89239405621", 40760, 29),
            new Employee("Максимова Вера Леонидовна", "Технолог",
                    "VeLMaksimova", "89039469012", 48400, 52),
            new Employee("Кузовлев Денис Олегович", "Начальник смены",
                    "DOKuzovlev@mail.ru", "89237780043", 75200, 44
            )};
        for (int i = 0; i < staff.length; i++) {
        if (staff[i].getAge() >= 40) {
        staff[i].info();
        }
        }*/

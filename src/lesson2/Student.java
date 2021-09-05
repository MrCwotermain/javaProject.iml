package lesson2;

public class Student extends Person{
    private int avaragePoint;
   private String group;

    public int getAvaragePoint() {
        return avaragePoint;
    }

    public void setAvaragePoint(int avaragePoint) {
        this.avaragePoint = avaragePoint;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "avaragePoint=" + avaragePoint +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public void method() {
        System.out.println("Im student");;
    }


    public Student(int id, String name, int age, int avaragePoint, String group) {
        super(id, name, age);
        this.avaragePoint = avaragePoint;
        this.group = group;

    }
}

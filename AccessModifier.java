class Student{
    private String name;
    private int age;
    private int roll_no;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
    public int getRoll_no(){
        return roll_no;
    }
}




public class AccessModifier {
    public static void main(String[] args) {
        Student t=new Student();
        t.setName("Jamshaid ");
        t.setAge(17);
        t.setRoll_no(56);
        System.out.println("Age is "+t.getAge());
        System.out.println("RoLL Number "+t.getRoll_no());
        System.out.println("Name of the Student "+t.getName());
    }
}

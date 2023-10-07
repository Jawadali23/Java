/*class Base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }


}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}*/
class Animal {
    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class  Dog extends Animal{

 boolean bark=true;

   // public void setBark(boolean bark) {
      //  this.bark = bark;
    //}

    public boolean getBark() {
        return bark;
    }
}


public class Inheritance {
    public static void main(String[] args) {
   /*     Base b=new Base();
      ///  b.setY(44);
        b.setX(52);
        System.out.println(b.getX());
        Derived d=new Derived();
        d.setX(16);
        System.out.println(d.getX());
    */
        Dog d= new Dog();
        d.setName("Tiger");
        System.out.println(d.getName());
        //d.setBark(d.bark);
        System.out.println(d.getBark());


    }
}

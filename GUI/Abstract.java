//abstract class Animal{
//    public  abstract void cat();// NOBody of the Abstract Class extending from the
//    // New class th
//    public void dog(){
//        System.out.println("The Dog Barking Wee Wee");
//    }
//}
interface  Animal1{
    public void cat();
    public void dog();
}
class Pig implements Animal1{
    @Override
    public void cat() {
        System.out.println("The Sound of the cater is mawo mawo");
    }

    @Override
    public void dog() {
        System.out.println("The Big Dog was Barking Wee Wee");
    }
}


//class pig extends Animal{
//
//    @Override
//    public void cat() {
//        System.out.println("The Sound of the Cat is mawo mawo");
//    }
//}



public class Abstract {
    public static void main(String[] args) {
        Pig p= new Pig();
       // pig p1=new pig();
        p.cat();
        p.dog();
//        p.dog();
//        p.cat();

    }
}

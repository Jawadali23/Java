class Quadrilateral{
    double d1,d2,d3,d4;
    public Quadrilateral(double side1,double side2){
        d1=side1;
        d2=side2;
        //d3=side3;
       //side4;
       // d4=side4;
    }

}









class Square extends Quadrilateral {
     float s1;
     float s2;

     public Square(float side1, float side2) {
         super(side1,side2);
         s1 = side1;
         s2 = side2;
     }

     public float computeArea() {
         System.out.println("The Area of the Square: ");
         return (s1 * s2);
     }
 }
 class Rectangle extends Square{
    int  r1;
    int   r2;
 public Rectangle(int rec,int rec1){
     super(rec,rec1);
     r1=rec;
     r2=rec1;
 }
 public float computeArea(){
     System.out.println("The Area of the Rectangle:");
     return (r1*r2);

 }
        }

public class Runtime {
    public static void main(String[] args) {
     Rectangle Rec=new Rectangle(12,14);
     Rec.computeArea();
    }
}

class linDer{
    private int radius;
    private int height;

    public linDer(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}
class rectangle{
    private int length;
    private int breath;

    public rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}
public class Cylinder {
    public static void main(String[] arr) {
       /* linDer obj=new linDer(9,12);
       // obj.setRadius(9);
        System.out.println(obj.getRadius());
        //obj.setHeight(12);
        System.out.println(obj.getHeight());
        System.out.println(obj.surfaceArea());
        System.out.println(obj.volume());*/
        rectangle r= new rectangle(9,12);
        System.out.println(r.getBreath());
        System.out.println(r.getLength());


    }
}
public class stringBuffer {
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer("Javed");
        sbf.append(" Ali");
        System.out.println(sbf);
        sbf.replace(0,5,"Jawad");
        System.out.println(sbf);
        sbf.delete(0,6);
        System.out.println(sbf);
    }
}

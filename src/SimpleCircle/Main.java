package SimpleCircle;

public class Main {
    public static void main(String[] args) {
       //Yarıçapı 1.0 olan dairenin yarıçapı
        SimpleCircle circle1=new SimpleCircle();
        System.out.println("Yarıçapı" + " " + circle1.radius +" " + "olan dairenin alanı " + " " + circle1.getArea());

        //Yarıçapı 25.0 olan dairenin alanı
        SimpleCircle circle2 =new SimpleCircle(25);
        System.out.println("yarıçapı " + circle2.radius + " olan dairenin alanı " + circle2.getArea());

        //Yarıçapı 125.0 olan dairenin alanı
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("yarıçapı " + circle3.radius + " olan dairenin alanı " + circle3.getArea());
    }
}

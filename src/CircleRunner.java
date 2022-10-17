public class CircleRunner {
    public static void main(String[] args){
        Circle myCircle = new Circle(5.0);
        System.out.println(myCircle.getInfo());
        myCircle.setRadius(9.2);
        System.out.println(myCircle.getInfo());
    }
}

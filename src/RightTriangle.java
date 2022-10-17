public class RightTriangle {
    private double base;
    private double height;

    public RightTriangle(double base, double height){
        this.base  = base;
        this.height = height;
    }

    public double hypotenuse(){
        double aSquared = Math.pow(base, 2);
        double bSquared = Math.pow(height, 2);
        double c = Math.pow((aSquared + bSquared), .5);
        return c;
    }

    public String randomValues(){
        double a = (int)(Math.random() * 35) + 51;
        double b = Math.random() *9 + 1;
        double c = Math.random() *75 + 25;
        return "random 1: " + a + "\n" + "random 2: " + b + "\n" + "random 3: " + c + "\n";
    }
}

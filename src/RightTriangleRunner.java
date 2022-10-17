public class RightTriangleRunner {
    public static void main(String[] args){
        RightTriangle triOne = new RightTriangle(5, 12);
        RightTriangle triTwo = new RightTriangle(6, 8);
        double hypOne = triOne.hypotenuse();
        double hypTwo = triTwo.hypotenuse();
        System.out.println(hypOne);
        System.out.println(hypTwo);
        System.out.println(triOne.randomValues());
        for (int i = 0; i < 100; i++) {
            int randomNum = (int)(Math.random() * 35) + 51;
                    System.out.println(randomNum);
        }

    }
}

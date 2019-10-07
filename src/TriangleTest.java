public class TriangleTest {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(6, 8, 10);
        RightTriangleTest rightTriangleTest = new RightTriangleTest();
        rightTriangleTest.isRightTriangle(triangle);

        System.out.println(rightTriangleTest.isRightTriangle(triangle));

    }
}

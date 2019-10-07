public class RightTriangleTest {

    public boolean isRightTriangle(Triangle triangle) {
        boolean mod = Math.pow(triangle.sideA, 2) + Math.pow(triangle.sideB, 2) == Math.pow(triangle.sideC, 2) ||
                Math.pow(triangle.sideA, 2) + Math.pow(triangle.sideC, 2) == Math.pow(triangle.sideB, 2) ||
                Math.pow(triangle.sideC, 2) + Math.pow(triangle.sideB, 2) == Math.pow(triangle.sideA, 2);
        return mod;


    }
}


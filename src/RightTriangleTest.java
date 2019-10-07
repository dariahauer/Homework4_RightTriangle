public class RightTriangleTest {

//    public  void isRightTriangle (double a, double b, double c){
//        double calc = (((a*a)+(b*b)=(c*c))||(a*a+c*c=b*b)||(c*c+b*b=a*a));
//        return
//
//        boolean rightTriangle
   public boolen isRightTriangle (Triangle triangle){
       boolen isTrue = Math.pow(triangle.sideA,2)+Math.pow(triangle.sideB,2)==Math.pow(triangle.sideC,2)||
               Math.pow(triangle.sideA,2)+ Math.pow(triangle.sideC,2)==Math.pow(triangle.sideB,2)||
               Math.pow(triangle.sideC,2)+ Math.pow(triangle.sideB,2)==Math.pow(triangle.sideA,2);
       return isTrue;


   }
}

//
//    boolean isEven(int value) {
//        int mod = value % 2;
//        return mod == 0;
//    }
//
//    boolean isOdd(int value) {
//        return isEven(value);
//    }
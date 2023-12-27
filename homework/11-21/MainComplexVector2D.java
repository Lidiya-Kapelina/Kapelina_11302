public class MainComplexVector2D {
    public static void main(String[] args) {

        ComplexNumber complex1 = new ComplexNumber(1, 2);
        ComplexNumber complex2 = new ComplexNumber(3, 4);
        ComplexVector2D vector1 = new ComplexVector2D(complex1, complex2);
        ComplexVector2D vector2 = new ComplexVector2D(new ComplexNumber(2, 3), new ComplexNumber(1, 4));
        System.out.println("Vector 1: " + vector1);
        System.out.println("Vector 2: " + vector2);
        /*ComplexVector2D sumVector = vector1.add(vector2);
        System.out.println("Sum Vector: " + sumVector);
        ComplexNumber scalarProduct = vector1.scalarProduct(vector2);
        System.out.println("Scalar Product: " + scalarProduct);
        ComplexVector2D vector3 = new ComplexVector2D(complex1, complex2);
        System.out.println("Are Vector 1 and Vector 3 equal? " + vector1.equals(vector3));*/
    }
}

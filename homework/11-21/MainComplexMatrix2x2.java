public class MainComplexMatrix2x2 {

    public static void main(String[] args) {
        ComplexNumber complex1 = new ComplexNumber(1, 2);
        ComplexNumber complex2 = new ComplexNumber(3, 4);
        ComplexNumber complex3 = new ComplexNumber(5, 6);
        ComplexNumber complex4 = new ComplexNumber(7, 8);
        ComplexMatrix2x2 matrix1 = new ComplexMatrix2x2(complex1, complex2, complex3, complex4);
        ComplexMatrix2x2 matrix2 = new ComplexMatrix2x2(new ComplexNumber(2, 3), new ComplexNumber(4, 5), new ComplexNumber(6, 7), new ComplexNumber(8, 9));
    /*    System.out.println("Matrix 1:\n" + matrix1);
        System.out.println("Matrix 2:\n" + matrix2);
        ComplexMatrix2x2 sumMatrix = matrix1.add(matrix2);
        System.out.println("Sum Matrix:\n" + sumMatrix);
        ComplexMatrix2x2 multMatrix = matrix1.mult(matrix2);
        System.out.println("Multiplication Matrix:\n" + multMatrix);
        ComplexNumber detMatrix1 = matrix1.det();
        ComplexNumber detMatrix2 = matrix2.det();
        System.out.println("Determinant of Matrix 1: " + detMatrix1);
        System.out.println("Determinant of Matrix 2: " + detMatrix2);
        ComplexVector2D vector = new ComplexVector2D(new ComplexNumber(2, 3), new ComplexNumber(1, 4));
        ComplexVector2D multVector = matrix1.multVector(vector);
        System.out.println("Matrix 1 * Vector:\n" + multVector);*/
    }


}

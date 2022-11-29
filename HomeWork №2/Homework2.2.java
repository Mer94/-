public class Homework22 {
        public static void main(String[] args) {

                int[] intArray = { 1, 2, 3, 4, 6, 7, 8, 9 };

                try {
                        int d = 0;
                        double catchedRes1 = intArray[8] / d;
                        System.out.println("catchedRes1 = " + catchedRes1);
                } catch (ArithmeticException e) {
                        System.out.println("Arithmetic exception: " + e);
                } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Array out of bound " + e);
                } catch (NullPointerException e) {
                        System.out.println("Nulls are not alowed" + e);
                }

        }
}

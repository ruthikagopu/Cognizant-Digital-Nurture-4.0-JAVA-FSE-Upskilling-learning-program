public class TypeCastingExample {
    public static void main(String[] args) {
        double doubleVal = 9.78;
        int intVal = (int) doubleVal; // double to int

        int anotherInt = 42;
        double anotherDouble = (double) anotherInt; // int to double

        System.out.println("Double value: " + doubleVal);
        System.out.println("After casting to int: " + intVal);
        System.out.println("Int value: " + anotherInt);
        System.out.println("After casting to double: " + anotherDouble);
    }
}

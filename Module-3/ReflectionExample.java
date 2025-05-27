import java.lang.reflect.Method;

public class ReflectionExample {
    public void sayHi() {
        System.out.println("Hello using Reflection!");
    }

    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("ReflectionExample");
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        Method method = clazz.getMethod("sayHi");
        method.invoke(obj);
    }
}

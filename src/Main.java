public class Main {
    public static void main(String[] args) {
        ClassA instance1 = new ClassA();
        instance1.x = 10;
        instance1.y = 20;
        ClassA.z = 30;

        ClassA instance2 = new ClassA();
        instance2.x = 1;
        instance2.y = 2;
        ClassA.z = 3;

        int sum1 = instance1.x + instance1.y + ClassA.z;
        int sum2 = instance2.x + instance2.y + ClassA.z;

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
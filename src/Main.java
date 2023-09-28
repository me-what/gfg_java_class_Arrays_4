import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int intArr[] = { 10, 20, 15, 22, 35 };
        System.out.println("Integer Array: "
                + Arrays.spliterator(intArr)+"\n");


        int intArr2[] = { 10, 20, 15, 22, 35 };
        System.out.println("Integer Array: "
                + Arrays.spliterator(intArr2, 1, 3)+"\n");


        int intArr3[] = { 10, 20, 15, 22, 35 };
        System.out.println("Integer Array: "
                + Arrays.stream(intArr3)+"\n");


        int intArr4[] = { 10, 20, 15, 22, 35 };
        System.out.println("Integer Array: "
                + Arrays.toString(intArr4));
    }
}
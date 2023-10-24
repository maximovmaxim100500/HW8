import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986};
        int[] array3 = {0, 1, 2, 3, 4, 5, 6, 7};

        System.out.println(" ");
        System.out.println("Задача 2");
        for (int i = 0; i < array1.length; i++) {
            if (i == array1.length - 1) {
                System.out.print(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            if (i == array2.length - 1) {
                System.out.print(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }
        System.out.println(" ");
        for (int i = 0; i < array3.length; i++) {
            if (i == array3.length - 1) {
                System.out.print(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        System.out.println(" ");
        for (int i = array2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }
        System.out.println(" ");
        for (int i = array3.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 > 0) {
                array1[i]++;
            }
        }
        System.out.println(Arrays.toString(array1)); //
    }
}
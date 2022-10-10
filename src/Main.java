import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int index_del = 0;
        int[] array = {2, 4, 6, 8, 6, 0, 3, 0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("input an element to remove: ");
        int input = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                System.out.println("Index of " + input + " is: " + i);
                index_del = i;
            }
        }
        for (int i = index_del; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        System.out.println("new array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

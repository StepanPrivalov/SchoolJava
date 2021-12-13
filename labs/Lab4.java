import java.util.Scanner;

public class Lab4 {

    public static void printText(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printText("Enter the number of elements of the array: ");
        int n = in.nextInt();

        if (n <= 0)
        {
            printText("Wrong input data!");
        }
        else {
            float[] arr = new float[n];
            float[] tempArr = new float[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter the element number " + (i + 1) + " in the array: ");
                arr[i] = in.nextFloat();
                tempArr[i] = arr[i];
            }

            printText("The array at the beginning: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
            float sum;

            for (int i = 1; i < n; i++) {
                sum = 0;
                for (int k = 0; k <= i; k++) {
                    sum += tempArr[k];
                }
                arr[i] = sum / (i + 1);
            }

            printText("The array at the end of the program: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        in.close();

    }
}

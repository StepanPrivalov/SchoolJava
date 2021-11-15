import java.util.Scanner;

public class Lab1 {

    public static void printText(String text)
    {
        System.out.println(text);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printText("Enter the number of month: ");
/* thought byte type would be better for this variable even though if you try a number > 127 the program'll crush*/
        byte num = in.nextByte();


        if ((num > 0) && (num < 13)) {
            switch (num) {
                case 12:
                case 1:
                case 2:
                    printText("It's winter");
                    break;
                case 3:
                case 4:
                case 5:
                    printText("It's spring");
                    break;
                case 6:
                case 7:
                case 8:
                    printText("It's summer");
                    break;
                case 9:
                case 10:
                case 11:
                    printText("It's autumn");
                    break;

            }
        } else {
            printText("Number must be from 1 to 12");
        }

/* 1st task*/
        printText("Now enter 4 numbers to compare");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int min = a;

        if (min > b) {
            min = b;
            if (min > c) {
                min = c;
                if (min > d) {
                    min = d;
                }
            }
            if (min > d) {
                min = d;
            }
        } else if (min > c) {
            min = c;
            if (min > d) {
                min = d;
            }
        }
        else if (min > d)
        {
            min = d;
        }


        System.out.printf("Min is %d \n", min);
    }

}
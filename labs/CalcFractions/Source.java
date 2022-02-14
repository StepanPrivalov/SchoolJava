package calculator
import java.util.Scanner;
import static calculator.Calc.*;

public class Source {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the nominator");
        if(!scan.hasNextInt()){
            throw new Exception();
        }
        int num1 = scan.nextInt();

        System.out.println("Enter the denominator");
        if(!scan.hasNextInt()){
            throw new Exception();
        }
        int den1 = scan.nextInt();

        if (den1 == 0) {
            System.out.println("Not zero!!!");
            throw new Exception();
        }
        Calc obj1 = new Calc(num1, den1); // our first object 

        System.out.println("Now, again, enter the nominator");
        if(!scan.hasNextInt()){
            throw new Exception();
        }
        int num2 = scan.nextInt();

        System.out.println("And enter the denominator");
        if(!scan.hasNextInt()){
            throw new Exception();
        }
        int den2 = scan.nextInt();

        if (den2 == 0) {
            System.out.println("Not zero!!!");
            throw new Exception();
        }
        
        Calc obj2 = new Calc(num2, den2); // second object
        Calc obj3 = new Calc(); // default(1/1)
        scan.close();

// all the functions

        show(obj1);
        show(obj2);
        composition(obj1, obj2);
        subtraction(obj1, obj2);
        multiple(obj1, obj2);
        division(obj1, obj2);

        System.out.println("Second variant:");
        obj1.composition(obj2);
        obj1.subtraction(obj2);
        obj1.multiple(obj2);
        obj1.division(obj2);
    }
}

package calculator
import java.util.Scanner;
import static calculator.Calc.*;

public class Lab8 
{
    public static void main(String[] args) throws Exception 
    {
        String[] parts, first, sec;
        String s;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the line");
        s = scan.nextLine();
        
        parts = s.split(" ");
        
        first = parts[0].split("/");
        sec = parts[2].split("/");

        Calc obj1 = new Calc(Integer.parseInt(first[0]), Integer.parseInt(first[1])); 
        Calc obj2 = new Calc(Integer.parseInt(sec[0]), Integer.parseInt(sec[1]));
        
        if (part[1] == "+")
        {
            composition(obj1, obj2);
        }

        if (part[1] == "+")
        {
            subtraction(obj1, obj2);
        }

        if (part[1] == "+")
        {
            multiply(obj1, obj2);
        }

        if (part[1] == "+")
        {
            division(obj1, obj2);
        }
        
        scan.close();
    }
}

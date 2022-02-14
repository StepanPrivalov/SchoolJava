package calculator;
public class Calc {
    public int numerator; 
    public int denominator; 

    public Calc(int numerator, int denominator) { 
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Calc() { 
        this.numerator = 1;
        this.denominator = 1;
    }

// НОД(greatest common divisor)?
    public static int gcd(int num1, int num2) {
        int temp;
        while (num2 != 0) {
            temp = num1 % num2; 
            num1 = num2; 
            num2 = temp; 
        }
        return num1;
    }

// НОК(lesser common multiple)?
    public static int lcm(int num1, int num2){
        return num1 / gcd(num1, num2) * num2;
    }

// converting the fraction to ordinary
    public static void showReduction(String a, Calc obj) {
        int x;
        while (gcd(obj.numerator, obj.denominator) != 1) {
            x = gcd(obj.numerator, obj.denominator);
            obj.numerator /= x;
            obj.denominator /= x;
        }
        to_normal(obj);

        System.out.printf("The result of %s is %d/%d\n", a, obj.numerator, obj.denominator);
    }

// we need this function to pass an object of a new class as the argument in order not to lose the real values
    public static void show(Calc obj) {
        String a;
        a = "entering fraction values";
        showReduction(a,new Calc(obj.numerator, obj.denominator));
    }

// this will convert our fraction to normal(change of the sign)
// dunno rly how that works just found in the interent...
    public static void to_normal(Calc obj) {
        obj.numerator = obj.denominator < 0 ? -obj.numerator : obj.numerator;
        obj.denominator = obj.numerator < 0 ? -obj.denominator : obj.denominator;
    }

// operations follow further 
    public static void composition(Calc num1, Calc num2) {
        String a; int nok, first, sec, final1;

        nok = lcm(num1.denominator, num2.denominator);
        first = nok / num1.denominator * num1.numerator;
        sec = nok / num2.denominator * num2.numerator;
        final1 = first + sec;
        a = "composition";

        showReduction(a,new Calc(final1, nok));
    }
    
    public static void subtraction(Calc num1, Calc num2) {
        String a; int nok, first, sec, final1;

        nok = lcm(num1.denominator, num2.denominator);
        first = nok / num1.denominator * num1.numerator;
        sec = nok / num1.denominator * num2.numerator;
        final1 = first - sec;
        a = "subtraction";

        showReduction(a,new Calc(final1, nok));
    }
  
    public static void multiple(Calc num1, Calc num2) {
        String a; int final1, final2;

        final1 = num1.numerator * num2.numerator;
        final2 = num1.denominator * num2.denominator;
        a = "multiple";

        showReduction(a,new Calc(final1, final2));
    }

    public static void division(Calc num1, Calc num2) throws Exception {
        String a; int final1, final2;

        if (num2.numerator == 0) {
            System.out.println("Not zero!!!");
            throw new Exception();
        }

        final1 = num1.numerator * num2.denominator;
        final2 = num1.denominator * num2.numerator;
        a = "division";

        showReduction(a, new Calc(final1, final2));
    }


//second variation of operations
    public void composition(Calc num2) {
        String a; int nok, first, sec, final1;

        nok = lcm(this.denominator, num2.denominator);
        first = nok / this.denominator * this.numerator;
        sec = nok / num2.denominator * num2.numerator;
        final1 = first + sec;
        a = "composition";

        showReduction(a,new Calc(final1, nok));
    }

    public void subtraction(Calc obj2) {
        String a; int nok, first, sec, final1;

        nok = lcm(this.denominator, obj2.denominator);
        first = nok / this.denominator * this.numerator;
        sec = nok / obj2.denominator * obj2.numerator;
        final1 = first - sec;
        a = "subtraction";

        showReduction(a,new Calc(final1, nok));
    }

    public void multiple(Calc num2) {
        String a; int final1, final2;

        final1 = this.numerator * num2.numerator;
        final1 = this.denominator * num2.denominator;
        a = "multiple";

        showReduction(a,new Calc(final1, final1));
    }

    public void division(Calc num2) throws Exception {
        String a; int final1, final2;

        if (num2.numerator == 0) {
            System.out.println("You can't divide by zero");
            throw new Exception();
        }

        final1 = this.numerator * num2.denominator;
        final1 = this.denominator * num2.numerator;
        a = "division";

        showReduction(a, new Calc(final1, final1));
    }
}

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        HelloClass hello = new HelloClass("Jonas");
        hello.printHello();
        hello.printName();
        int year = 01;
        YearTests leapClass = new YearTests(year);
        for (int n = 0; n < 2022; n++){
            leapClass.setYear(n);
            if(leapClass.isLeapYear()){
                System.out.println(n + " is a leap Year");
            }
        }

        int a = 12;
        int b = 7;
        Calculator calcClass = new Calculator();
        System.out.println("A=" + a);
        calcClass.setA(a);
        System.out.println("B=" + b);
        calcClass.setB(b);
        System.out.println("A + B =" +  calcClass.add());
        System.out.println("A - B =" + calcClass.subtract());
        System.out.println("A * B =" + calcClass.multiply());
        System.out.println("A / B =" + calcClass.divide());

        int c = 9 ;

        double average = calcClass.avg(a,b,c);
        System.out.println("Average is " + average);

        MyParser myParser = new MyParser();
        String words = null;
        try {
            System.out.println("Enter words: ");
            words = myParser.getWords();
            System.out.println(words);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        hello = new HelloClass(words);
        hello.printHello();
        hello.printName();


        try {
            System.out.println("Enter a number: ");
            int val1 = myParser.getInteger();
            System.out.println("Enter another number: ");
            int val2 = myParser.getInteger();
            Calculator calc = new Calculator();
            calc.setA(val1);
            calc.setB(val2);
            System.out.println("Their sum is: " + calc.add());
            System.out.println("Their product is: " + calc.multiply());
            System.out.println("Their difference is: " + calc.subtract());
            System.out.println("Their quota is: " + calc.divide());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Date today = new Date((long)86399000);
        SimpleDateFormat dateForm = new SimpleDateFormat("hh:mm:ss");

        System.out.println(dateForm.format(today));

        int numGuess;
        try {
            int randNum = (int) (100*Math.random());
            System.out.println("Guess a number between 0 and 100: (Correct is " + randNum + ")");
            numGuess = myParser.getInteger();
            if(randNum < numGuess){
                System.out.println("Your guess was above");
            } else if(randNum > numGuess) {
                System.out.println("Your guess was below");
            } else {
                System.out.println("You guessed Correct!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
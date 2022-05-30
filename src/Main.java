public class Main {
    public static void main(String[] args) {

        TestClass mainClass = new TestClass("Jonas");
        mainClass.printHello();
        mainClass.printName();
        int year = 01;
        YearTests leapClass = new YearTests(year);
        for (int n = 0; n < 2022; n++){
            leapClass.setYear(n);
            if(leapClass.isLeapYear()){
                System.out.println(n + " is a leap Year");
            }
        }

        Calculator calcClass = new Calculator();

    }
}
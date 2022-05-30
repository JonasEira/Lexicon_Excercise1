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

    }
}
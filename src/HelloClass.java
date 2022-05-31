public class HelloClass {

    private final String name;

    public HelloClass() {
        this.name = "DefaultName";
    }

    public HelloClass(String name) {
        this.name = name;
    }

    public void printName() {
       System.out.println(this.name);
    }

    public void printHello() {
        System.out.println("Hello");
    }
}

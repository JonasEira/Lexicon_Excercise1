public class TestClass {

    private final String name;

    public TestClass() {
        this.name = "DefaultName";
    }

    public TestClass(String name) {
        this.name = name;
    }

    public void printName() {
       System.out.println(this.name);
    }

    public void printHello() {
        System.out.println("Hello");
    }
}

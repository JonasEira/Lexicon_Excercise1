public class Calculator {
    public int a;
    public int b;
    public Calculator(){
        this.a = 0;
        this.b = 0;
    }

    public void setA(int i) {
        this.a = i;
    }

    public void setB(int i) {
        this.b = i;
    }

    public int add() {
        return this.a + this.b;
    }

    public int subtract() {
        return this.a - this.b;
    }

    public int multiply() {
        return this.a * this.b;
    }

    public int divide() {
        return (int)((double)this.a / (double)this.b);
    }
}

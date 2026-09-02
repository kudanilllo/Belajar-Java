package method;

public class callMethod {

    //method nya itu myMethod
    static void myMethod() {
        System.out.println("Hi aku baru saja di panggil!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
        myMethod();  // method dapat di panggil berulang kali
    }
}

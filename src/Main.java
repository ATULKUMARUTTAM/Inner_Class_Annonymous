interface engine{
     public void start();
}
class car{
    String brandName = "Honda!!!!";
    public void button(int w)
    {
        final int capacity = 100;
        int wheeldrive= w;
         engine e1 = new engine() {
            @Override
            public void start() {
                System.out.println(brandName+" car with cap of "+capacity+ " cc "+wheeldrive+" wheel drive");
            }
        };
        e1.start();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        car amaze = new car();
        amaze.button(4);
    }
}



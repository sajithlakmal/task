
public class Main {
    public static void main(String[] args) {

        printFibonacchi();

    }

    static void printFibonacchi(){
        int n = 0, a, b = 0;
        int c = 1;
        for(int x = 1; x <= 100; x++)
        {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a+" ");
        }
    }
}
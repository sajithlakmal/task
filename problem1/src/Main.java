import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(5);

        System.out.println(sumForLoop(list));
        System.out.println(whileLoop(list));

    }

    static int sumForLoop(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    static int whileLoop(List<Integer> list){
        int sum = 0;
        int i = 0;
        while (i < list.size()) {

            sum = sum + list.get(i);
            ++i;
        }
        return sum;
    }

}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(45);
        list.add(89);
        list.add(126);

        System.out.println(sumForLoop(list));


    }

    static int sumForLoop(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }


}
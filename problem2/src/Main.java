import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<String>();

        list1.add("a");
        list1.add("b");
        list1.add("c");

        List<Integer> list2 = new ArrayList<Integer>();

        list2.add(1);
        list2.add(2);
        list2.add(3);

        System.out.println(combineList(list1,list2 ));

    }

   static List<Object>  combineList(List<String> list1 , List<Integer> list2 ){

       List<Object> mixList = new ArrayList<Object>();
        for(int i = 0; i <list1.size(); i++){

            mixList.add(list1.get(i));
            mixList.add(list2.get(i));

       }
        return mixList;
   }
}

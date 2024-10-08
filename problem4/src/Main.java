import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(158);
        list.add(98);
        arrangeList(list);

        }


    static void arrangeList(List<Integer> list){

        List<String> convertList = list.stream().map(Object::toString)
                .collect(Collectors.toList());
        System.out.println(list);



        for(int x = 0; x <list.size()-1; x++){

            for(int i = 0; i <list.size()-1; i++){
            if(convertList.get(i).charAt(i) < convertList.get(i).charAt(i+1) ){
                String temp = convertList.get(i);
                convertList.set(i, convertList.get(i+1));
                convertList.set(i+1, temp);
            }
            }

            System.out.println(convertList);


        }


    }
}
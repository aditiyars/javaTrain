import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        // struktur data

        // arraylist
        // hashset
        // hashmap

        // List adalah interface
        // arraylist mengimplentasikan list

        List<Integer> numbers = new ArrayList();
        
        // find pair given sum on the list
        // 3, 4, 5, 9, 1, 2, 0
        int sum = 10;
        
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(9);
        numbers.add(1);
        numbers.add(2);
        numbers.add(0);

        // for (Integer integer : numbers) {
        //     System.out.print(integer);
        // }

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = numbers.size()-1; j > i; j--) {
                if(numbers.get(i)+numbers.get(j) == sum){
                    System.out.println("Numbers = "+ numbers.get(i) + " "+ numbers.get(j));
                }
            }
        }

    }
}

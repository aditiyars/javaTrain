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

        Excercise.findSumNumber(numbers, sum);
        Excercise.soalI(numbers);

        List<String> trainee = new ArrayList<>();
        trainee.add("Anas");
        trainee.add("SheiLA");
        trainee.add("SULAS");
        trainee.add("Ficri");
        trainee.add("adiT");
        trainee.add("dARIAN");
        trainee.add("ReDhA");


        Excercise.soalII(trainee);

        String[] vowel = {"a", "i", "u", "e", "o"};
        Excercise.soalIII(vowel);

        int[] scores = {1, 1, 4};
        Excercise.soalIV(scores);

        String s = "Hi, my name is Adit";
        Excercise.soalV(s);

    }
}

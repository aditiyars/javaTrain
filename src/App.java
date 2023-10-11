import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        
        // struktur data

        // Excercise ONE
        System.out.println("Excercise ONE\n");

        List<Integer> numbers = Arrays.asList(3, 4, 5, 9, 1, 2, 0);
        int sum = 10;
        Excercise.findSumNumber(numbers, sum);
        
        Excercise.soalI(numbers);

        List<String> trainee = Arrays.asList("Anas", "SheiLA", "SULAS", "Ficri", "adiT", "dARIAN", "ReDha");
        
        Excercise.soalII(trainee);

        String[] vowel = {"a", "i", "u", "e", "o"};
        Excercise.soalIII(vowel);

        int[] scores = {1, 1, 4};
        Excercise.soalIV(scores);

        String s = "Hi, my name is Adit";
        Excercise.soalV(s);

        // Excercise Two
        System.out.println("\nExcercise TWO\n");

        // soal 6
        List<String> strings = Arrays.asList("a", "b", "a", "c", "b");
        ExcerciseTwo.soalVI(strings);
        
        // soal 7
        String[] seven = {"man", "moon", "good", "night"};
        ExcerciseTwo.soalVII(seven);

        // soal 8
        Map <String, String> map = new HashMap<>();
        map.put("a", "candy");
        map.put("b", "dirt");
        map.put("c", "meh");
        ExcerciseTwo.soalVIII(map);

        // Soal 9
        Map<String, String> mapTwo = new HashMap<>();
        mapTwo.put("a", "aaa");
        mapTwo.put("b", "bbb");
        mapTwo.put("c", "ccc");
        ExcerciseTwo.soalIX(mapTwo);
        
        // Soal 10
        ExcerciseTwo.soalX(3, 1, 9);
    }
}

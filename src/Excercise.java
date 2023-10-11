import java.util.ArrayList;
import java.util.List;

/**
 * Excercise
 */
public class Excercise {

    public static void findSumNumber(List<Integer> numbers, int sum){
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = numbers.size()-1; j > i; j--) {
                int firstNumber = numbers.get(i);
                int secondNumber = numbers.get(j);
                
                if(firstNumber+secondNumber == sum){
                    System.out.println("Numbers = "+ firstNumber + " "+ secondNumber);
                }
            }
        }
    }

    public static void soalI(List<Integer> numbers){
        
        for (int i = 0; i < numbers.size(); i++) {
            // multipleByItself
            int a = numbers.get(i);
            numbers.set(i, a*a);
            
        }

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > 10){
                System.out.print(numbers.get(i)+" ");
            }
        }

        System.out.println();
    }

    public static void soalII(List<String> trainee){
        for (int i = 0; i < trainee.size(); i++) {
            trainee.set(i, trainee.get(i).toLowerCase());
        }

        for (int i = 0; i < trainee.size(); i++) {
            System.out.print(trainee.get(i) + " ");
        }

        System.out.println();
    }

    public static void soalIII(String[] vowel){
        
        for (int i = 0; i < vowel.length; i++) {
            vowel[i] = "x"+vowel[i] + "x";
        }

        for (int i = 0; i < vowel.length; i++) {
            System.out.print(vowel[i] + " ");
        }

        System.out.println();
    }

    public static void soalIV(int[] scores){
        boolean check = true;

        for (int i = 0; i < scores.length; i++) {
            for (int j = i+1; j < scores.length; j++) {
                if(scores[i] > scores[j]){
                    check = false;
                    break;
                }
            }
        }

        System.out.println(check + " ");
    }

    public static void soalV(String s){
        String result = s.replaceAll("[AEIOUaeiou]", "!");
        
        System.out.println(result);
    }
}
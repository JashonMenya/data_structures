import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Integer> myLuckyNumbers = new ArrayList<>(Arrays.asList(10, 20, 30));

        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Steve", 3);
        studentScores.put("Brian", 5);
        studentScores.put("Cecil", 6);

        // calculate average of the scores

        Iterator<Map.Entry<String, Integer>> it = studentScores.entrySet().iterator();

        int total = 0;
        while(it.hasNext()) {
            Map.Entry<String, Integer> workingEntry = it.next();
            total += workingEntry.getValue();
        }

        double tt = (double)total/studentScores.size();

        System.out.print("The average score is: " + tt);

    }

}
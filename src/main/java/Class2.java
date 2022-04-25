import java.util.Arrays;
import java.util.Collections;

public class Class2 {

    public int[] minMax(Integer[] arrayOfIntegers){
        int[] answers = new int[2];
        int min = Collections.min(Arrays.asList(arrayOfIntegers));
        int max = Collections.max(Arrays.asList(arrayOfIntegers));
        answers[0] = min;
        answers[1] = max;
        return answers;
    };

}




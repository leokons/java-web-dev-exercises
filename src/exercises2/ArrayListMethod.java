package exercises2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod {
    public static Integer getSum(ArrayList<Integer> arr) {
        int newSum=0;
        for (int i=0; i<arr.size(); i++) {
            newSum=newSum+arr.get(i);
        }
        return newSum;

    }
}

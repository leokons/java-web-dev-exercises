package exercises2;
        import java.util.ArrayList;

public class ArrayListMethod2 {
    public static ArrayList<String> printWord(ArrayList<String> arr, int n) {
        ArrayList<String> arr2 = new ArrayList<>();

        for (int i=0; i<arr.size(); i++) {
            if (arr.get(i).length() == n) {
                arr2.add(arr.get(i));
            }
        }
        return arr2;
    }
}

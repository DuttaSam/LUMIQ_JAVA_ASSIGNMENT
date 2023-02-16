import java.util.*;

public class countDistinct {
  public static int countDistincts(int[] arr, int k) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < k; i++) {
      set.add(arr[i]);
    }
    return set.size();
  }

  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 3, 4, 2, 3};
    int k = 4;
    for (int i = 0; i <= arr.length - k; i++) {
      System.out.println(countDistincts(Arrays.copyOfRange(arr, i, i + k), k));
    }
  }
}
import java.util.*;
public class RemoveAdjacentDuplicates {
  public static String removeDuplicates(String s) {
    int n = s.length();
    if (n <= 1) return s;

    StringBuilder sb = new StringBuilder();
    int i = 0;
    while (i < n - 1) {
      if (s.charAt(i) != s.charAt(i + 1)) {
        sb.append(s.charAt(i));
        i++;
      } else {
        i++;
        while (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
          
        }
        i++;
      }
    }

    if (s.charAt(n - 1) != s.charAt(n - 2)) {
      sb.append(s.charAt(n - 1));
    }

    String result = sb.toString();
    if (result.equals(s)) {
      return result;
    } else {
      return removeDuplicates(result);
    }
  }

  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    String s1 = sc.next();
    System.out.println(removeDuplicates(s1));
  }
}

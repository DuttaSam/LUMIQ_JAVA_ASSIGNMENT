import java.util.*;
public class countDistinct {    
public static String removeDups(String s1 ){
    int start=0;
    for(int i=start;i<s1.length()-1;i++){
        if (s1.charAt(i) == s1.charAt(i+1)){
            start=(i>0)?i-1:0;
            return removeDups(s1.substring(0,i)+s1.substring(i+2));
        }
        
    }
    return s1;
        
}

  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String s1 = sc.next();
      System.out.println(removeDups(s1));
  }
}

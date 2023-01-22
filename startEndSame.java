
//check first and last char of string whether they're same

public class MyClass {
    public static void main(String args[]) {
      String text = "madam";
      char frist = text.charAt(0);
      char last = text.charAt(text.length()-1);
      boolean same = frist == last;
      System.out.println(same);
    }
}

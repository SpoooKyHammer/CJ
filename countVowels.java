
// count vowels in a string
public class MyClass {
    public static void main(String args[]) {
      String text = "welcome";
      String vowels = "aeiou";
      int count = 0;
      for(int i=0; i < text.length(); i++){
          char c = text.charAt(i);
          if(vowels.indexOf(c) != -1){
              count++;
          }
      }
      System.out.println(count);
    }
}

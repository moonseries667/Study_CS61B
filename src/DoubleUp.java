public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
   public static String doubleUp(String s) {
      // TODO: Fill in this function
      StringBuilder res=new StringBuilder();
      for (char c: s.toCharArray()) {
        res.append(c);
        res.append(c);
      }
      return res.toString();
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}
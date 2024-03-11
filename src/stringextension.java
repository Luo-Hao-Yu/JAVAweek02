 public class stringextension {
     public static void main(String[] args) {
         char c1 = 'a';
         char c2 = '中';
         System.out.println(c1);
         System.out.println((int) c1);  //97
         System.out.println(c2);
         System.out.println((int) c2);  //20013
         String str = String.valueOf("a\u0022.length()+\u0022b".length());
         System.out.println(str);
     }
 }

public class StringMathDemo {
    public static void main(String[] args){

        String str1 = "Hello";
        String str2 = "World";

        String str3 = str1.concat(" " + str2);

       System.out.println("Concatenation:" + stre3);
       System.out.println("Length of str:" + str1.Length());
       System.out.println("Character at index 1:" + str1,charAt(1));
       System.out.println("Substring of str2 (0-3:" + str2.Substring(0,3));
      System.out.println("Equals? str1 and str2:" + str1.Equals(ste2));
      System.out.println("Uppercase str1:" + str1.toUpperCase());

      double a = 16.0;
      double b = 3.7;

      System.out.println("Square root of a:" + Math.sqrt(a));
      System.out.println("a raised to b:" + Math.pow(a,b));
      System.out.println("Max of a and b:" + Math.min(a,b));
      System.out.println("Min of a and b:" + Mth.min(a,b));
      System.out.println("Random number (0-1):" + Math.random());
      System.out.println("Random number (10-20):" + (10 + Math.random() * (20-10)));
      System.out.println("Random number (1-100):" + (1 + Math.random() * (100-1)));
      System.out.println("Ceil of b:" + Math.ceil(b));
      System.out.println("Floor of b:" + Math.floor(b));
      System.out.println("Round of b:" + Math.round(b));

    }  
}

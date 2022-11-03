package TP1;
public class EX1 {
      public static void main(String[] args) {
          int x, y;
          char c;
          int result;
          if (args.length > 3) {
              System.out.println("ERREUR");
          }
          x = Integer.parseInt(args[1]);
          y = Integer.parseInt(args[2]);
          c = Integer.charAt(args[0]);
          switch (c) {
              case '+':
                   result = x + y;
              case '-':
                   result = x - y;
              case '*':
                   result = x * y;
              case '/':
                   result = x / y;
              default:
                  System.out.println("erreur");
          }
          System.out.println(result);
        }
}

import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
   Stack<String> post = new Stack();
    Stack<String> infix = new Stack();
    Stack<Integer> value = new Stack();


    for (int i = exp.length()-1 ; i >=0 ; i--) {
      char c = exp.charAt(i);
     if (c == '+' || c == '-' || c == '*' || c == '/') {
      

          int a = value.pop();
          
          int b = value.pop();
          int res = evaluate(a, b, c);
          value.push(res);

          String av = infix.pop();
          
          String bv = infix.pop();

          infix.push("(" + av + c +bv + ")");

          String ap = post.pop();


          String bp = post.pop();
          post.push(ap +""+ bp+c);

        


      }else{

        post.push(c + "");
        infix.push(c + "");
        value.push( c - '0');
       
      }

    }

    System.out.println(value.peek());
    System.out.println(infix.peek());
    System.out.println(post.peek());

  }

  public static int evaluate(int a, int b, char c) {
    if (c == '+' ) {
      return (a + b);
    } else if ( c == '-') {
      return (a - b);
    } else if ( c == '*') {
      return (a * b);
    } else if ( c == '/') {
      return (a / b);
    }
    return 0;
  
 }
}
import java.io.*;
import java.util.*;

public class Main {


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<String> pre = new Stack();
    Stack<String> infix = new Stack();
    Stack<Integer> value = new Stack();


    for (int i = 0 ; i < exp.length(); i++) {
      char c = exp.charAt(i);
     if (c == '+' || c == '-' || c == '*' || c == '/') {
      

          int b = value.pop();
          int a = value.pop();
          int res = evaluate(a, b, c);
          value.push(res);

          String bv = infix.pop();
          String av = infix.pop();

            infix.push("(" + av + c +bv + ")");

          String bp = pre.pop();
          String ap = pre.pop();


          pre.push(c+"" + ap +""+ bp);

        


      }else{

        pre.push(c + "");
        infix.push(c + "");
        value.push( c - '0');
       
      }

    }

    // while (ope.size() > 0) {
    //   char ex = ope.pop() ;

    //   int b = value.pop();
    //   int a = value.pop();
    //   int res = evaluate(a, b, ex);
    //   value.push(res);

    //   String bv = infix.pop();
    //   String av = infix.pop();

    //   infix.push("(" + av + ex +bv + ")");

    //   String bp = pre.pop();
    //   String ap = pre.pop();


    //   pre.push(ex + ap + bp);
    // }
    
    System.out.println(value.peek());
    System.out.println(infix.peek());
    System.out.println(pre.peek());

  }

  public static int precedence(char c) {
    if (c == '+' || c == '-') {
      return 1;
    } else {
      return 2;
    }
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
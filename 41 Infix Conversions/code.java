import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

   Stack<String> pre = new Stack();
   Stack<String> post = new Stack();

    Stack<Character> ope= new Stack();

    for (int i = 0; i < exp.length(); i++) {
      char  c = exp.charAt(i);
      if (c >= '0' && c<= '9' || c >= 'a' && c<= 'z' || c >= 'A' && c<= 'Z') {
        pre.push(c+"");
        post.push(c+"");
        
      } else if (c == '(') {

        ope.push(c);

      } else if (c == ')') {
        while (ope.size() > 0 && ope.peek() != '(') {
          char ex = ope.pop() ;
          String b = pre.pop();
          String a = pre.pop();
          
          String bp = post.pop();
          String ap = post.pop();
          
          
        //   int res =  evaluate(a, b, ex);
          pre.push(ex+a+b);
          post.push(ap+bp+ex);
        }
        ope.pop();

      } else if (c == '+' || c == '-' || c == '*' || c == '/') {
        while (ope.size() > 0 && ope.peek() != '(' && precedence(c) <=  precedence(ope.peek())) {
           char ex = ope.pop() ;
          String b = pre.pop();
          String a = pre.pop();
          
          String bp = post.pop();
          String ap = post.pop();
          
          
        //   int res =  evaluate(a, b, ex);
          pre.push(ex+a+b);
          post.push(ap+bp+ex);
        }

        ope.push(c);

      }

    }
    while (ope.size() > 0) {
   char ex = ope.pop() ;
          String b = pre.pop();
          String a = pre.pop();
          
          String bp = post.pop();
          String ap = post.pop();
          
          
        //   int res =  evaluate(a, b, ex);
          pre.push(ex+a+b);
          post.push(ap+bp+ex);
    }

    System.out.println(post.peek());
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
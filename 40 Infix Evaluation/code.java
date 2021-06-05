import java.io.*;
import java.util.*;

public class Main {


  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();

    Stack<Integer> operend = new Stack();

    Stack<Character> operator= new Stack();

    for (int i = 0; i < exp.length(); i++) {
      char  c = exp.charAt(i);
      if ( Character.isDigit(c)) {
        operend.push(c - '0');
      } else if (c == '(') {

        operator.push(c);

      } else if (c == ')') {
        while (operator.size() > 0 && operator.peek() != '(') {
          char ex = operator.pop() ;
          int b = operend.pop();
          int a = operend.pop();
          int res =  evaluate(a, b, ex);
          operend.push(res);
        }
        operator.pop();

      } else if (c == '+' || c == '-' || c == '*' || c == '/') {
        while (operator.size() > 0 && operator.peek() != '(' && precedence(c) <=  precedence(operator.peek())) {
          char ex = operator.pop() ;
          int b = operend.pop();
          int a = operend.pop();
          int res =  evaluate(a, b, ex);
          operend.push(res);
        }

        operator.push(c);

      }

    }
    while (operator.size() > 0) {
      char ex = operator.pop() ;
      int b = operend.pop();
      int a = operend.pop();
      int res =  evaluate(a, b, ex);
      operend.push(res);
    }

    System.out.println(operend.peek());


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
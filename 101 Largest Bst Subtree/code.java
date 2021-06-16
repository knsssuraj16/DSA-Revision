import java.io.*;
import java.util.*;

public class Main {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }
  
  
  public static class BST{
      int min;
      int max;
      boolean bst;
      int hieght;
      
  }
  
  static int h=0;
  static int data=0;
  public static BST lbst(Node node){
      if(node == null){
         BST bst = new BST();
         bst.bst= true;
         bst.min= Integer.MAX_VALUE;
         bst.max= Integer.MIN_VALUE;
         bst.hieght = 0;
         return bst;
      }
      
      BST l=lbst(node.left);
      BST r=lbst(node.right);
      
      BST b = new BST();
      b.bst = l.bst && r.bst && l.max <= node.data && r.min>= node.data;
      b.hieght = l.hieght + r.hieght+1;
      b.min = Math.min(node.data, Math.min(l.min,r.min));
      b.max = Math.max(node.data, Math.max(l.max,r.max));
      if(b.bst && b.hieght >= h){
         data =node.data;
         h = b.hieght;
      }
      return b;
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    lbst(root);
    System.out.println(data+"@"+h);
    // write your code here
  }

}
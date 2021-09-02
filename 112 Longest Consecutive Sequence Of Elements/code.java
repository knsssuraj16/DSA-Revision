import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    int []arr = new int[n];
    HashMap<Integer,Boolean> n1 = new HashMap();

    for (int i = 0 ; i < n; i++) {
      arr[i] = scan.nextInt();
    }

    for (int i = 0 ; i < n; i++) {
      n1.put(arr[i], true);

    }
  for(int val: n1.keySet()) {
      
    //  System.out.println("val: "+val);
      if (n1.containsKey(val - 1)) {
        n1.put(val, false);
      }

    }

    ArrayList<Integer> curr= new ArrayList();
    ArrayList<Integer> temp = new ArrayList();

    for(int val: n1.keySet()){
    boolean b= n1.get(val);
      if (b) {
          
        int c = val;
        
        while (n1.containsKey(c)) {
            
        //  System.out.println("val: "+val);
         
        //  System.out.println("c: "+c);
            temp.add(c);
            c++;
        }
        
        if(temp.size() >curr.size() ){
            
    //  System.out.println("ts: "+temp.size());
    //  System.out.println("cs: "+curr.size());
            curr.clear();
            curr= new ArrayList(temp);
            temp= new ArrayList();
        }else{
            temp.clear();
        }
      }

    }
    
    for(int a: curr){
        System.out.println(a);
    }
  }

}
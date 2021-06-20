import java.io.*;
import java.util.*;

public class Main {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      // write your code here
      data.add(val);
      int id = data.size() - 1;
      upheapy(id);

    }
    
    private void downheapy(int id){
        // if(id == 0){
        //     return;
        // }
        
        int min= id;
        
        int l = 2*id +1;
        if(l< data.size() && data.get(l) < data.get(min)){
            min = l;
        }
        
        
        int r = 2*id +2;
        
        if(r< data.size() && data.get(r) < data.get(min)){
            min = r;
        }
        
        
       
        if(id !=  min){
            swap(min,id);
            downheapy(min);
        }
      }

    private void upheapy(int id){
        if(id == 0){
            return;
        }
        int par = (id - 1) / 2;
        if(data.get(id) < data.get(par)){
            swap(par,id);
            upheapy(par);
        }
      }
    
    
    private void swap(int id , int par){
        int temp = data.get(id);
        data.set(id,data.get(par)) ;
        data.set(par,temp);
    }

    public int remove() {
     if (data.size() == 0) {
        System.out.println("Underflow");
        return -1;
      }
      swap(0,data.size()-1);
      int res= data.get(data.size()-1);
      
      data.remove(data.size()-1);
      downheapy(0);
      return res;

    }

    public int peek() { 
        if (data.size() == 0) {
        System.out.println("Underflow");
        return -1;
      }
      return data.get(0);
    }

    public int size() {

      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}
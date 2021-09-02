import java.util.*;
 
 public class Main {
     public static int pow(int i){
         int res=2;
         while(i != 1){
             res = res*2;
             i--;
         }
         return res;
     }
 
     public static List<Integer> grayCode(int n) {
          if(n==0){
     	     List<Integer> l= new ArrayList();
     	     l.add(0);
     	     return l;
     	 }
     	 if(n==1){
     	     List<Integer> l= new ArrayList();
     	     l.add(0);
     	     l.add(1);
     	     return l;
     	 }
     	 List<Integer> myres= new ArrayList();
     	 List<Integer> res=grayCode(n-1);
     	 for(int i =0; i<res.size(); i++){
     	     myres.add(res.get(i));
     	 }
     	 int powVal =  pow(n-1);
     	 for(int i =res.size()-1; i>=0; i--){
     	     myres.add(res.get(i)+powVal);
     	 }
     	 return myres;
     	 
     	 
     }
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         List<Integer> ans=grayCode(scn.nextInt());
         Collections.sort(ans);
         System.out.println(ans);
     }
 }
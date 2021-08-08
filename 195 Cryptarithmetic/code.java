import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String s1 = scn.nextLine();
    String s2 = scn.nextLine();
    String s3 = scn.nextLine();

    HashMap<Character, Integer> charIntMap = new HashMap<>();
    String unique = "";
    for (int i = 0; i < s1.length(); i++) {
      if (!charIntMap.containsKey(s1.charAt(i))) {
        charIntMap.put(s1.charAt(i), -1);
        unique += s1.charAt(i);
      }
    }

    for (int i = 0; i < s2.length(); i++) {
      if (!charIntMap.containsKey(s2.charAt(i))) {
        charIntMap.put(s2.charAt(i), -1);
        unique += s2.charAt(i);
      }
    }

    for (int i = 0; i < s3.length(); i++) {
      if (!charIntMap.containsKey(s3.charAt(i))) {
        charIntMap.put(s3.charAt(i), -1);
        unique += s3.charAt(i);
      }
    }

    boolean[] usedNumbers = new boolean[10];
    solution(unique, 0, charIntMap, usedNumbers, s1, s2, s3);
  }

public static int res(String s,HashMap<Character, Integer> map ){
    String tot="";
    for(int i =0 ; i< s.length(); i++){
        tot+=map.get(s.charAt(i));
    }
    return Integer.parseInt(tot);
}

public static void printMap(HashMap<Character, Integer> map ){
    for(int i =0; i< 26; i++){
        char c= (char)('a'+i);
        if(map.containsKey(c)){
            System.out.print(c +"-"+ map.get(c)+" ");
        }
    }
    System.out.println();
}
  public static void solution(String unique, int idx,HashMap<Character, Integer> charIntMap, boolean[] usedNumbers,
                              String s1, String s2, String s3) {
                                  
    if(idx == unique.length()){
        int num1= res(s1,charIntMap);
        int num2= res(s2,charIntMap);
        int tot= res(s3,charIntMap);
        
        
        if((num1+num2) == tot){
            // System.out.println("num1: "+num1+" num2 "+num2+" tot: "+tot);
             printMap(charIntMap);
        }
        return;
    }                              
    
    char c= unique.charAt(idx);
    
    for(int i =0; i<= 9; i++){
        if(usedNumbers[i] == false){
            charIntMap.put(c,i);
            usedNumbers[i] = true;
            
        solution(unique,idx+1, charIntMap, usedNumbers, s1, s2, s3);
            charIntMap.put(c,-1);
            usedNumbers[i] = false;
        }
    }
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  

}

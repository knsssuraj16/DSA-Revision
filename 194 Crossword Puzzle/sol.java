import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean cphor(char[][]arr,int i,int j,String word){
        if(j-1 >= 0 && arr[i][j-1] != '+' ){
            return false;
        } else if(j+word.length() < arr[0].length && arr[i][j+word.length()] != '+' ){
            return false;
        }
        
         for(int jj= 0 ;jj<word.length() ; jj++){
            
             if(j+jj >= arr[0].length ){
                 return false;
             }
               if( arr[i][j+jj] == '-' ||  arr[i][j+jj] == word.charAt(jj)){
                   continue;
                
               }else{
                   
                 return false;
               }       
             
             
         }
        
        return true;
    }
    public static boolean cpver(char[][]arr,int i,int j,String word){
        if(i-1 >= 0 && arr[i-1][j] != '+' ){
            return false;
        } else if(i+word.length() < arr[0].length && arr[i+word.length()][j] != '+' ){
            return false;
        }
        
         for(int ii= 0 ;ii<word.length() ;ii++){
            
             if(i+ii >= arr[0].length ){
                 return false;
             }
               if( arr[i+ii][j] == '-' ||  arr[i+ii][j] == word.charAt(ii)){
                   continue;
                
               }else{
                   
                 return false;
               }       
             
             
         }
        
        return true;
    }

    public static boolean [] placeHor(char[][]arr,int i,int j,String word){
     boolean wePlaced[]= new boolean [word.length()];
     
     for(int jj=0; jj< word.length(); jj++){
         if(arr[i][j+jj] == '-'){
             arr[i][j+jj] = word.charAt(jj);
             wePlaced[jj] = true;
         }
     }
     
     return wePlaced;
 }
    public static void unplaceHor(char[][]arr,int i,int j,boolean[] word){
   
     
     for(int jj=0; jj< word.length; jj++){
         if(word[jj]==true){
             arr[i][j+jj] ='-';
         }
     }
     
 }
 
    public static boolean [] placeVer(char[][]arr,int i,int j,String word){
     boolean wePlaced[]= new boolean [word.length()];
     
     for(int ii=0; ii< word.length(); ii++){
         if(arr[i+ii][j] == '-'){
             arr[i+ii][j] = word.charAt(ii);
             wePlaced[ii] = true;
         }
     }
     
     return wePlaced;
 }
    public static void unplaceVer(char[][]arr,int i,int j,boolean[] word){
   
     
     for(int ii=0; ii< word.length; ii++){
         if(word[ii]==true){
             arr[i+ii][j] ='-';
         }
     }
     
 }
 
 
  public static void solution(char[][] arr, String[] words, int vidx) {
      
      
    // System.out.println(vidx);
      if(vidx == words.length){
          print(arr);
          
          return ;
      }
      
        
        String word = words[vidx];
        for(int i= 0 ;i<arr.length ; i++){
            for(int j= 0 ; j< arr.length ; j++){
                
                if(arr[i][j] == '-' || arr[i][j] == word.charAt(0)){
                    
                    if(cphor(arr,i,j,word)){
                       boolean wePlaced[]=  placeHor(arr,i,j,word);
                        
                        solution(arr, words, vidx+1);
                        unplaceHor(arr,i,j,wePlaced);
                    }
                    if(cpver(arr,i,j,word)){
                        boolean wePlaced[]= placeVer(arr,i,j,word);
                        
                        solution(arr, words, vidx+1);
                        unplaceVer(arr,i,j,wePlaced);
                    }
                }
            }
        }

  }
  


  public static void print(char[][] arr) {
    for (int i = 0 ; i < arr.length; i++) {
      for (int j = 0 ; j < arr.length; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[][] arr = new char[10][10];
    for (int i = 0 ; i < arr.length; i++) {
      String str = scn.next();
      arr[i] = str.toCharArray();
    }
    int n = scn.nextInt();
    String[] words = new String[n];
    for (int i = 0 ; i  < words.length; i++) {
      words[i] = scn.next();
    }
    solution(arr, words, 0);
  }
}
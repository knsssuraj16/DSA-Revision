import java.io.*;
import java.util.*;

public class Main {

    public static int findBitofword(String word){
        int re=0;
        for(char c: word.toCharArray()){
            int a = c-'a';
            re=(re | ( 1 << a));
        }
        return re;
    }
	public static ArrayList<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
		
		HashMap<Character,ArrayList<Integer>> hm= new HashMap();
		
		for(int i =0 ;i< 26; i++){
		    hm.put((char)('a' + i),new ArrayList());
		}
		
		for(String s:words){
		    int bitmask= findBitofword(s);
		    HashSet<Character> hs= new HashSet();
		     for(char c: s.toCharArray()){
		         if(hs.contains(c)){
		             continue;
		         }
		         hs.add(c);
                hm.get(c).add(bitmask);
            }
		}
		
		 ArrayList<Integer> res=  new ArrayList();
		for(String puzzle :puzzles){
            int mask = findBitofword(puzzle);
		    int count=0;
		    ArrayList<Integer> wordBFirLet = hm.get(puzzle.charAt(0));
		     
		    
		    for(int el:wordBFirLet){
		        if((el & mask)  == el){
		            count++;
		       }
		     
		    }
		    res.add(count);
		    
		    
		    
		}
		 
		
		
		
		return res;
	 }

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] words = new String[n];
		for(int i = 0 ; i < words.length; i++) {
			words[i] = scn.next();
		}
		int m = scn.nextInt();
		String[] puzzles = new String[m];
		for(int i = 0 ; i < m ;i++) {
			puzzles[i] = scn.next();
		}
		ArrayList<Integer> ans = findNumOfValidWords(words,puzzles);
		for(int i=0;i<m;i++) {
			System.out.println(puzzles[i] + " -> " + ans.get(i));
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
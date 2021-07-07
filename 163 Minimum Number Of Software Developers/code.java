import java.io.*;
import java.util.*;

public class Main {

	static ArrayList<Integer> sol = new ArrayList<>();

	public static void solution(int[] people, int nskills, int cp, ArrayList<Integer> onesol, int skills) {
	    
	    //base  case
	    if(cp ==people.length){
	        if(skills ==(1 << nskills) - 1){
	            if(sol.size() == 0 || onesol.size() < sol.size()){
	                sol = new ArrayList<>(onesol);
	            }
	        }
	        
	        return;
	    }
		
		//not comming
		
		solution(people, nskills, cp+1, onesol, skills);
		
		//yes coming
		
		onesol.add(cp);
		
		solution(people, nskills, cp+1, onesol, (skills| people[cp]));
		onesol.remove(onesol.size()-1);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		HashMap<String, Integer> smap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			smap.put(scn.next(), i);
		}
		
		int np = scn.nextInt();
		int[] people = new int[np];
		for (int i = 0; i < np; i++) {
			int personSkills = scn.nextInt();
			for (int j = 0; j < personSkills; j++) {
				String skill = scn.next();
				int snum = smap.get(skill);
				people[i] = people[i] | (1 << snum);
// System.out.println(i+ " : snum: "+Integer.toBinaryString(people[i]));
			}
		}

		solution(people, n, 0, new ArrayList<>(), 0);
		System.out.println(sol);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
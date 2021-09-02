import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    
    public static Pair implements Comparable<Pair>{
        int src;
        int wei;
        int des;
            Pair(int src,int wei, int des){
                this.src=src;
                this.wei = wei;
                this.des = des;
                
            }
            public int compareTo(Pair ob){
                return (this.wei-ob.wei);
            }
    }
	public static void main(String[] args) throws NumberFormatException, IOException {
                Scanner scan= new Scanner(System.in);
                int nv = scan.nextInt();
                int me = scan.nextInt();
                
                SortedMap<Integer,ArrayList> graph= new TreeMap<Integer,ArrayList>();
                int srckey =0;
                for(int i =0 ; i<me ; i++){
                   
                    int src = scan.nextInt();
                    int des = scan.nextInt();
                    int wei = scan.nextInt();
                     if(i==0){
                        srcKey = src;
                    }
                    
                    ArrayList<Pair> last = graph.get(src);
                    if(last != null){
                        last.add(new Pair(src,wei,des));
                    }else{
                        last= new ArrayList();
                        last.add(new Pair(src,wei,des));
                    }
                    graph.put(src,last);
                }
                
                findSortestDistance(graph,srckey);
                
                
			}
			
			public static void printSortest(SortedMap<Integer,ArrayList> graph,int srckey,int des){
			    PriorityQueue<pair> pq= new PriorityQueue();
			    pq.add(graph.get(srcKey.get(0)));
			    while(pq.size()>0){
			        Pair p = pr.remove();
			        
			        
			    }
			}
			
			public static void findSortestDistance( SortedMap<Integer,ArrayList> graph,int srckey){
			   Iterator i = graph.iterator();
  
            while (i.hasNext()) {
            Map.Entry m = (Map.Entry)i.next();
            int key = m.getKey();
            if(key == srcKey){
                continue;
            }
            ArrayList value = m.getValue();
            
            printSortest(graph,srckey,key);
  
            // System.out.println("Key : " + key
            //                   + "  value : " + value);
         }
	}
			
			
}












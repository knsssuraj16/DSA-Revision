import java.io.*;
import java.util.*;

public class Main {

  public static class HashMap<K, V> {
    private class HMNode {
      K key;
      V value;

      HMNode(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; // n
    private LinkedList<HMNode>[] buckets; // N = buckets.length

    public HashMap() {
      initbuckets(4);
      size = 0;
    }

    private void initbuckets(int N) {
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; bi++) {
        buckets[bi] = new LinkedList<>();
      }
    }

    public void put(K key, V value) throws Exception {
      int bi = getHashfn(key);
      int di = getDatIndedx(key,bi);
      
      if(di != -1){
         HMNode node = buckets[bi].get(di);
         node.value = value;
      }else{
          HMNode node =new HMNode(key,value);
          size++;
          buckets[bi].add(node);
      }
      double lamda= (size* 1.0) /buckets.length;
      if(lamda > 2.0 ){
          rehash();
      }
      
    }
    
    private void rehash () throws Exception{
        LinkedList<HMNode>[] bc = buckets;
        initbuckets(buckets.length * 2);
        size = 0;
         for( LinkedList<HMNode> l :bc){
          for(HMNode h: l){
              put(h.key,h.value);
          }
      }
    }

    public V get(K key) throws Exception {
      int bi = getHashfn(key);
      int di = getDatIndedx(key,bi);
      
      
      if(di != -1){
          return buckets[bi].get(di).value;
      }else{
          return null;
      }
      
    }
    
    private int getDatIndedx(K key, int bi){
        int i =0;
        for(HMNode node : buckets[bi]){
            if(node.key.equals(key)){
                return i;
            }
            i++;
        }
        return -1;
    }

    private int getHashfn(K key){
        int hc = key.hashCode();
        return Math.abs(hc) % buckets.length;
    }
    public boolean containsKey(K key) {
       int bi = getHashfn(key);
      int di = getDatIndedx(key,bi);
      
      
      if(di != -1){
         return true;
      }else{
          return false;
      }
    }

    public V remove(K key) throws Exception {
       int bi = getHashfn(key);
      int di = getDatIndedx(key,bi);
      
      
      if(di != -1){
         HMNode node = buckets[bi].remove(di);
         size--;
         return node.value;
         
      }else{
          return null;
      }
    }

    public ArrayList<K> keyset() throws Exception {
        ArrayList<K>  list= new ArrayList<K>();
        
      for( LinkedList<HMNode> l :buckets){
          for(HMNode h: l){
              list.add(h.key);
          }
      }
      
      return list;
    }

    public int size() {
      return size;
    }

   public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.print("Bucket" + bi + " ");
        for (HMNode node : buckets[bi]) {
          System.out.print( node.key + "@" + node.value + " ");
        }
        System.out.println(".");
      }
      System.out.println("Display Ends");
  }
}

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("put")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        Integer val = Integer.parseInt(parts[2]);
        map.put(key, val);
      } else if (str.startsWith("get")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.get(key));
      } else if (str.startsWith("containsKey")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.containsKey(key));
      } else if (str.startsWith("remove")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.remove(key));
      } else if (str.startsWith("size")) {
        System.out.println(map.size());
      } else if (str.startsWith("keyset")) {
        System.out.println(map.keyset());
      } else if (str.startsWith("display")) {
        map.display();
      }
      str = br.readLine();
    }
  }
}
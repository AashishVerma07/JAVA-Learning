import java.util.HashSet;
import java.util.Iterator;


class Hashset {
  public static void main(String[] args) {

  HashSet<Integer> set = new HashSet<Integer>();

    set.add(1);
    set.add(5);
    set.add(8);
    set.add(9);
    set.add(12);
    set.add(7);
    set.add(1);
    set.add(7);
    set.add(9);

    // it dose not contain duplicates.
    System.out.println(set);

    if(set.contains(7)){
      System.out.println("Contains");
    }else if(!set.contains(0)){
      System.out.println("Not contains");
    }

System.out.println("Resmove one element");
    set.remove(8);
    System.out.println(set);


    System.out.println("Get SIze       " + set.size());

    System.out.println("Iterator");
    Iterator it = set.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }

    
    
  
  }
}
import java.util.*;
class test
{
   public static void main(String args[]) 
  {
    ArrayDeque<Integer>   adq = new   ArrayDeque<Integer>();
    adq.add(15);
    adq.add(20);
    adq.addLast(30);
    adq.addLast(40);
    adq.addLast(50);
    adq.addFirst(10);
    System.out.println(adq);
    adq.pollLast();
    System.out.println(adq);

  }
}

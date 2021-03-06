/*
 * @author: Bob
 * Added some comments here.
 * This is the Counter Class, it just counts.
 */

public class app
{
   public static void main(String[] args)
   {
      System.out.println("Git Test App");
      
      Count c = new Count(200);
      for (int i=0; i<10; i++)
      {
         System.out.println("Count=" + c.getCount());
         c.incrementCount(5);
      }
      c.resetCount();
      System.out.println("Count reset to " + c.getCount());
      System.out.println("Git Test...done");
   }
}

class Count
{
   private int count;
   
   public Count(int count)
   {
      this.count = count;
   }
   public int getCount(){ return count; }
   public void incrementCount()
   {
      count++;
   }
   public void incrementCount(int i)
   {
      count+=i;
   }
   public void resetCount()
   {
      count = 0;
   }
   public String toString()
   {
      return "The count is " + count + ".";
   }
}

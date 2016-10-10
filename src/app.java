
public class app
{
   public static void main(String[] args)
   {
      System.out.println("Git Test App");
      
      Count c = new Count(10);
      for (int i=0; i<4; i++)
      {
         System.out.println("Count=" + c.getCount());
         c.incrementCount();
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
   public void resetCount()
   {
      count = 0;
   }
}

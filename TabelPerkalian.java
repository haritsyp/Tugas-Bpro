public class TabelPerkalian
{
  public static void main(String[]args)
  {
 
    for (int a=1;a<=9;a++)
    {
      for(int b=1;b<=10;b++)
      {
        int c=a*b;
        System.out.print(a+"x"+ b +"="+ c+"\t");
        if (b>=10)
        {
          System.out.println();
          System.out.println();
        }
      }
    }    
  }
}

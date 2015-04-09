public class LatArray2
{
  public static void main(String[]args)
  {
    int[][]data={
      {1,0,0,0,0,0},
      {0,1,0,0,0,0},
      {0,0,1,0,0,0},
      {0,0,0,1,0,0},
      {0,0,0,0,1,1},
      {0,0,0,0,1,1}};
    
    for(int i=5;i>=0;i--)
    {
      for(int j=5;j>=0;j--)
      {
        if(data[i][j]==0)
        {
          System.out.print(" * ");
        }
        else
        {
        System.out.print(" X ");
        }
      }
      System.out.println();
    }
  }
}

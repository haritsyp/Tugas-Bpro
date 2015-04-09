public class LatArray
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
    
    for(int i=0;i<data.length;i++)
    {
      for(int j=0;j<data[i].length;j++)
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

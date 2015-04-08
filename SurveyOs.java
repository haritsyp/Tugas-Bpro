import java.io.*;
public class SurveyOs
{
    
  public static void main(String[]args)throws IOException
  {
    int jumlah=0;
    int total=0;
    String[]os = {"Android","Blackbery","IOS","Symbian","Windows","Other"};
    String[] nama = {"Nur", "Dimas", "Naufal", "Yanuar", "Alifand", "Arizky","Egen","Bagus"};
    int[][] jual = {{3,0,0,0,0,0},
                    {1,0,0,0,0,1},
                    {1,0,0,0,0,1},
                    {1,0,0,0,0,1},
                    {1,0,0,0,0,0},
                    {3,0,0,1,1,0},
                    {2,0,1,0,0,0},
                    {1,0,1,0,1,1}};
    
    
    System.out.println("NAMA/OS\t\tAndroid\tBlackberry\tIOS\tSymbian\tWindows\tOther");
    
    for(int i=0;i<8;i++)
    {
      System.out.print(nama[i]+"\t\t");
      for(int j=0;j<6;j++)
      {
        System.out.print(jual[i][j]+"\t");
      }
      System.out.println();
    }
    
      System.out.println();
    
     for(int k=0;k<6;k++)
    {
      for(int l=0;l<8;l++)
      {
        jumlah=jumlah+jual[l][k];
      }
      System.out.println("Total Pengguna "+os[k]+" : "+jumlah);
      jumlah=0;
    }
  }
}

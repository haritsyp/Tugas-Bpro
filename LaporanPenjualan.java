import java.io.*;
public class LaporanPenjualan
{
    
  public static void main(String[]args)throws IOException
  {
    int jumlah=0;
    int total=0;
    String[]hari = {"Senin","Selasa","Rabu","Kamis","Jumat"};
    String[] alat = {"Pensil", "BukuTulis", "BukuGambar", "Penggaris"};
    int[][] jual = {{3,0,10,3,2},
                  {1,3,7,10,5},
                  {10,12,3,7,6},
                  {3,1,1,2,1}};
    
    System.out.println("Alat/Hari\t\tSenin\tSelasa\tRabu\tKamis\tJumat");
    
    for(int i=0;i<4;i++)
    {
      System.out.print(alat[i]+"\t\t");
      for(int j=0;j<5;j++)
      {
        System.out.print(jual[i][j]+"\t");
      }
      System.out.println();
    }
    
    System.out.println();
    
    for(int k=0;k<4;k++)
    {
      for(int l=0;l<5;l++)
      {
        total=total+jual[k][l];
      }
      System.out.println("Total Penjualan "+alat[k]+" : "+total);
      total=0;
    }
    
      System.out.println();
    
     for(int k=0;k<5;k++)
    {
      for(int l=0;l<4;l++)
      {
        jumlah=jumlah+jual[l][k];
      }
      System.out.println("Total Penjualan "+hari[k]+" : "+jumlah);
      jumlah=0;
    }
  }
}

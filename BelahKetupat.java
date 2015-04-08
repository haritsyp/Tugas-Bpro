import java.util.*;
public class BelahKetupat
{
  public static void main(String[]args)
  {
 
    Scanner br=new Scanner(System.in);
    int tinggi,miring,tinggi2;
    int spasi=0;
    int j;
    
    try
    {
    System.out.print("Masukkan bilangan : ");
    tinggi=br.nextInt();
    tinggi=tinggi*2;
    tinggi2=tinggi;
    tinggi=tinggi-2;
    miring=(tinggi/2);

    for(int x=0;x<miring;x++)
    {
      for(j=miring;j>=x;j--)
      {
        System.out.print("*");
      }
      for(int k=0;k<spasi;k++)
      {
        System.out.print(" ");
      }
      spasi+=2;
      for(j=miring; j>=x;j--)
      {
        System.out.print("*");
      }
      for(int k=0;k<spasi;k++)
      {
        System.out.print(" ");
      }
      System.out.println();
    }  
    for(int x=0;x<tinggi-miring;x++)
    {
      for(j=0;j<=x;j++)
      {
        System.out.print("*");
      }
      
      for(j=spasi;j>0;j--)
      {
        System.out.print(" ");
      }
      spasi-=2;
      for(j=0;j<=x;j++)
      {
        System.out.print("*");
      }
      for(j=spasi;j>0;j--)
      {
        System.out.print(" ");
      }
      System.out.println();
    }
    for(int i=0;i<tinggi2;i++)
    {
      System.out.print("*");
    }
    System.out.println();
     }
    catch (Exception e)
    {
      System.out.println("Inputtan harus angka!");
    }
  }
}


import java.util.*;
public class KoinAcak
{
  public static void main(String[]args)
  {
    Scanner masukan= new Scanner(System.in);
    
    int lemparan;
    int gambar=0;
    int angka=0;
    
    try
    {
    System.out.print ("Lempar Koin Sebanyak : ");
    lemparan=masukan.nextInt();
    System.out.print("\n");
    
    System.out.println("Ke\t|     HASIL LEMPARAN   ");
    System.out.println("---------------------------------");
    
    for (int a=1;a<=lemparan;a++)
    {
      int bilRandom=(int)(Math.random() +0.5);
      if(bilRandom==1)
      {
        gambar++;
        System.out.print(a+"\t");
        System.out.print("|\t");
        System.out.println("GAMBAR");
        System.out.print("\n");
      }
      else
      {
        angka++;
        System.out.print(a+"\t");
        System.out.print("|\t");
        System.out.println("ANGKA");
        System.out.print("\n");
      }      
    }
    System.out.println("---------------------------------");
    System.out.println("Score GAMBAR : "+gambar);
    System.out.println("Score ANGKA  : "+angka);
    if(gambar==angka)
    {
      System.out.print("------- S  E  R  I------");
    }
    else if(gambar>angka)
    {
      System.out.print("Koin yang sering muncul adalah GAMBAR");
    }
    else if(angka>gambar)
    {
      System.out.print("Koin yang sering muncul adalah ANGKA");
    }
    }
    catch (Exception e)
    {
      System.out.println("Inputtan harus angka!");
    }
  }
}

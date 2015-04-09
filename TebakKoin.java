import java.util.*;
public class TebakKoin
{
  public static void main(String [] args)
  {
    Scanner masukan= new Scanner(System.in);
    
    int tebakan;
    
    System.out.print ("Masukaan tebakkan anda(gambar=1, angka=0)=");
    tebakan=masukan.nextInt();
    int bilRandom=(int)(Math.random() +0.5);
    if (tebakan == 1) {
      System.out.println ("Pilihan anda Gambar");
    }
    else {
      System.out.println("Pilihan anda Angka");
    }
    if (bilRandom == 1) {
      System.out.println ("Koin yang muncul GAMBAR");
    }
    else {
      System.out.println("Koin yang muncul ANGKA");
    }
    if (bilRandom == tebakan) {
      System.out.println ("selamat tebakkan anda benar");
    }
    else {
      System.out.println("Maaf tebakkan anda salah");
    }
  }
}

    
         
    

    

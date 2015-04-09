 import java.util.Scanner;
 public class BonusKaos
 {
  public static void main(String [] args)
  {
   Scanner scan = new Scanner(System.in );
   
   int kaos_didapat=0;
   int harga_kaos=50000;
   int total_harga=0;
   int bonus_kaos=0;
   int jml_kaos_dibeli=0;
   
   
   System.out.print("Masukkan jumlah kaos yang didapat");
   kaos_didapat=scan.nextInt();
   
   bonus_kaos=kaos_didapat/3;
   jml_kaos_dibeli=kaos_didapat-bonus_kaos;
   total_harga=harga_kaos*jml_kaos_dibeli;
   
   System.out.println ("jumlah kaos yang dibeli:" +kaos_didapat);
   System.out.println ("jumlah kaos yang perlu dibayar:" +jml_kaos_dibeli);
   System.out.println ("Total harga:" +total_harga);
   System.out.println ("Bonus yang anda dapat;" +bonus_kaos);
  }
 } 
   
   
  

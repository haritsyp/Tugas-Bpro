import java.util.*;
public class KasirSederhana
{
 public static void main(String[]args)
 {
  Scanner br=new Scanner(System.in);
  int menu=0;  
  int pilihan;  
  int porsi;  
  int subtotal=0;
  int harga;
  int keluar=0;
  int total=0;
    
  do{
  
   System.out.println("Menu Makanan");
   System.out.println("1. Nasi Goreng");
   System.out.println("2. Mie Goreng");
   System.out.println("3. Mie Kuah");
   System.out.println("4. Es Teh"); 
   System.out.println("5. Es Jeruk");
   System.out.print("SILAHKAN PILIH MENU YANG ANDA INGINKAN[1-5]: ");
   pilihan=br.nextInt();  
    
   switch(pilihan) {
    case 1: menu=12000;
    break;
    case 2: menu=12000;
    break;
    case 3: menu=14000;
    break;
    case 4: menu=3000;
    break;
    case 5: menu=4000;
    break;
    default:
      subtotal=0;
      System.out.println("Maaf menu yang anda pilih tidak tersedia !");
   }
        
   if (pilihan<=5){
    System.out.print("Masukkan jumlah porsi : ");
    porsi=br.nextInt(); 
    subtotal= menu * porsi;
    System.out.println("Subtotal : "+subtotal);
 
    }      
    System.out.print("Beli lagi?[1=ya 0=tidak] : ");
    keluar=br.nextInt();
    total=total+subtotal;
   
  }
  while(keluar==1);{
   
   System.out.print("TOTAL Transaksi : " + total);
  }
 }
}

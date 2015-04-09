import java.util.*;
public class TiketPesawat
{
    
  public static void main(String[]args)
  {
    Scanner br=new Scanner(System.in);
    int pesan=0;
    int jumlah=0;
    int total=0;
    String[]kolom = {"A","B","C","D","E","F"};
    String[] baris = {"1", "2", "3", "4","5","6","7","8","9","10","11","12","13"};
    int[][] kursi = 
      {{0,0,1,0,1,1},
      {0,1,0,1,0,1},
      {0,0,1,1,0,1},
      {1,0,1,0,1,1},
      {0,1,0,1,0,0},
      {0,1,0,0,0,1},
      {1,0,0,0,1,1},
      {0,1,0,1,1,0},
      {1,0,1,1,0,1},
      {0,1,0,1,1,1},
      {0,0,1,0,1,0},
      {0,0,1,1,0,1},
      {0,0,0,0,1,0}};

    int[][] nKursi = 
     {{0,0,1,0,1,1},
      {0,1,0,1,0,1},
      {0,0,1,1,0,1},
      {1,0,1,0,1,1},
      {0,1,0,1,0,0},
      {0,1,0,0,0,1},
      {1,0,0,0,1,1},
      {0,1,0,1,1,0},
      {1,0,1,1,0,1},
      {0,1,0,1,1,1},
      {0,0,1,0,1,0},
      {0,0,1,1,0,1},
      {0,0,0,0,1,0}};

    
    System.out.println("Baris/Kolom\tA\tB\tC\tD\tE\tF");
    for(int i=0;i<13;i++)
    {
      System.out.print("baris "+baris[i]+"\t");
      for(int j=0;j<6;j++)
      {
        if(kursi[i][j]==0)
        {
          System.out.print("*\t");
        }
        else
        {
        System.out.print("X\t");
        }
      }
      System.out.println();
    }
    System.out.println();
    do{
    System.out.println("1. Penjualan Tiket");
    System.out.println("2. Daftar Kursi Kosong");
    System.out.println("3. Daftar Kursi terisi");
    System.out.println("4. Jumlah Semua kursi");
    System.out.println("5. Omset");
    System.out.println("6. Keluar");        
    System.out.print("SILAHKAN PILIH MENU YANG ANDA INGINKAN[1-5]: ");
    int pilihan=br.nextInt();  
        
    switch(pilihan) {
    case 1: 
      
      System.out.print("baris ke : ");
      int bariskursi=br.nextInt();  
      System.out.print("kolom ke : ");
      int kolomkursi=br.nextInt(); 
           
         if(nKursi[bariskursi][kolomkursi] == 0)
         {
         System.out.println("Kursi Tersedia");
         }
         else if(nKursi[bariskursi][kolomkursi] == 1)
         {
         System.out.println("Maaf kursi telah dipesan");
         }      
     
    if(nKursi[bariskursi][kolomkursi] == 0)
    {
      if(bariskursi==1||bariskursi==2)
      {
        System.out.print("Harga Tiket : Rp.175.000");
      }
      else if(bariskursi>=3&&bariskursi<=7)
      {
        System.out.print("Harga Tiket Rp.150.000");
      }
      else
      {
        System.out.print("Harga Tiket Rp.100.000");
      }
    }
    break;
    case 2: 
      int kosong = 0;
 for (int a = 0 ; a < 13 ; a++)
 {
  for (int b = 0; b < 6; b++ )
  {
   if (kursi[a][b] == 0)
   {
   kosong++;
   }
  }
 }
 System.out.println("Jumlah kursi kosong : " +kosong);
    break;
    case 3:
       int terisi = 0;
 for (int a = 0 ; a < 13 ; a++)
 {
  for (int b = 0; b < 6; b++ )
  {
   if (kursi[a][b] == 1)
   {
   terisi++;
   }
  }
 }
 System.out.println("Jumlah kursi yang sudah terisi : " +terisi);
    break;
    case 4: 
       int semua = 0;
 for (int a = 0 ; a < 13 ; a++)
 {
  for (int b = 0; b < 6; b++ )
  {
   if (kursi[a][b] == 1||kursi[a][b] == 0)
   {
   semua++;
   }
  }
 }
 System.out.println("Jumlah semua kursi: " +semua);
    break; 
    case 6:
      int jum=0;
      for(int i=0;i<13;i++)
    {
    for(int j=0;j<6;j++)
    {
      if(kursi[i][j]==1)
      {
        jum++;
      }
    }
    int omset=jum*150000;
    System.out.print("Total Omset : "+omset);
    }
    break;
    case 5:
      System.exit(0);
    break;
    }
    System.out.println();
    }    
    while(true);
   
  }
}

import java.util.*;
public class TiketPesawat
{
    
  public static void main(String[]args)
  {
    Scanner br=new Scanner(System.in);
    int omset=0;
    int pesan=0;
    int jumlah=0;
    int total=0;
    int harga=0;
    String[]kolom = {"A","B","C","D","E","F"};
    String[] baris = {" 1", " 2", " 3", " 4"," 5"," 6"," 7"," 8"," 9","10","11","12","13"};
    int[][] kursi = 
    {{0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0},
    {0,0,0,0,0,0}};
    
    try
    {
      do{
        System.out.println("1. Penjualan Tiket");
        System.out.println("2. Daftar Kursi");
        System.out.println("3. Jumlah Kursi Terisi");
        System.out.println("4. Jumlah Kursi Kosong");
        System.out.println("5. Omset");
        System.out.println("6. Keluar");        
        System.out.print("SILAHKAN PILIH MENU YANG ANDA INGINKAN[1-5]: ");
        int pilihan=br.nextInt();  
        
        switch(pilihan) {
          case 1: 
            
            System.out.print("baris ke : ");
            int bariskursi=(br.nextInt()-1);  
            System.out.print("kolom ke : ");
            int kolomkursi=(br.nextInt()-1); 
            
            if(kursi[bariskursi][kolomkursi] == 0)
            {
              System.out.println("Kursi Tersedia");
            }
            else if(kursi[bariskursi][kolomkursi] == 1)
            {
              System.out.println("Maaf kursi telah dipesan");
            }      
            
            if(kursi[bariskursi][kolomkursi] == 0)
            {
              if(bariskursi==0||bariskursi==1)
              {
                harga=175000;
                System.out.print("Harga Tiket : Rp."+harga);
              }
              else if(bariskursi>=2&&bariskursi<=6)
              {
                harga=150000;
                System.out.print("Harga Tiket Rp."+harga);
              }
              else
              {
                harga=100000;
                System.out.print("Harga Tiket Rp."+harga);
              }
              omset=omset+harga;
            }
            

            kursi[bariskursi][kolomkursi]=1;
            
            break;
          case 2: 
            System.out.println("Baris/Kolom\tA\tB\tC\tD\tE\tF");
            for(int i=0;i<13;i++)
            {
              System.out.print("baris "+baris[i]+"   "+"\t");
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
            
            break;
          case 3:
            int vip = 0;
            for (int a = 0 ; a < 2 ; a++)
            {
              for (int b = 0; b < 6; b++ )
              {
                if (kursi[a][b] == 1)
                {
                  vip++;
                }
              }
            }
            
             int bisnis= 0;
            for (int a = 2 ; a <=6 ; a++)
            {
              for (int b = 0; b < 6; b++ )
              {
                if (kursi[a][b] == 1)
                {
                  bisnis++;
                }
              }
            }
            
            int ekonomi= 0;
            for (int a = 7 ; a <13 ; a++)
            {
              for (int b = 0; b < 6; b++ )
              {
                if (kursi[a][b] == 1)
                {
                  ekonomi++;
                }
              }
            }
            
            int terisi= 0;
            for (int a = 0 ; a <13 ; a++)
            {
              for (int b = 0; b < 6; b++ )
              {
                if (kursi[a][b] == 1)
                {
                  terisi++;
                }
              }
            }
            
            System.out.println("Jumlah kursi terisi : " +terisi);
            System.out.println("Jumlah kursi vip terisi  : " +vip);
            System.out.println("Jumlah kursi bisnis terisi : " +bisnis);
            System.out.println("Jumlah kursi ekonomi terisi : " +ekonomi);
            break;
          case 4: 
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
            
            int vipk = 0;
            for (int a = 0 ; a < 2 ; a++)
            {
              for (int b = 0; b < 6; b++ )
              {
                if (kursi[a][b] == 0)
                {
                  vipk++;
                }
              }
            }
            
             int bisnisk= 0;
            for (int a = 2 ; a <=6 ; a++)
            {
              for (int b = 0; b < 6; b++ )
              {
                if (kursi[a][b] == 0)
                {
                  bisnisk++;
                }
              }
            }
            
            int ekonomik= 0;
            for (int a = 7 ; a <13 ; a++)
            {
              for (int b = 0; b < 6; b++ )
              {
                if (kursi[a][b] == 0)
                {
                  ekonomik++;
                }
              }
            }
            
            System.out.println("Jumlah kursi kosong : " +kosong);
            System.out.println("Jumlah kursi vip kosong : " +vipk);
            System.out.println("Jumlah kursi bisnis kosong : " +bisnisk);
            System.out.println("Jumlah kursi ekonomi kosong : " +ekonomik);
            break; 
          case 5:
            System.out.print("Total Omset : "+omset);
            break;
          case 6:
            System.exit(0);
            break;
        }
        System.out.println();
      }    
      while(true);
    }
    catch(Exception e)
    {
      System.out.print("Inputan Anda Salah atau Kursi yang Anda Pilih Tidak Tersedia");
    }
  }
}

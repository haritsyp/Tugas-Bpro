import java.util.*;
import java.io.*;
public class UasBpro{
  
  //Deklarasi Array 2D untuk DataBarang
  public static String [][] dataBarang = 
    //kodebarang,namabarang,hargabeli,hargajual
  {{"L001","Acer Aspire E3-112","2980000","3260000"},
    {"L002","Acer One 10-S100X","3350000","3600000"},
    {"L003","Acer Aspire E5-551","6490000","6900000"},
    {"L004","Asus H100TAM-DK022P","6230000","6600000"},
    {"L005","Asus TP300LD-DW020H","5800000","6200000"},
    {"L006","Dell Vostro 5470","5360000","5850000"},
    {"L007","Dell Inspiron 3458","5200000","5750000"},
    {"L008","HP Envy 15-K024TX","8730000","9110000"},
    {"L009","HP Stream 13-C017TU","5710000","6200000"},
    {"L010","Lenovo B40-80-CID","6240000","6700000"},
    {"L011","Dell Inspiron 5470","9350000","9900000"},
    {"S001","Apple Iphone 5S-16","5000000","5400000"},
    {"S002","Apple Iphone 4S-8","1800000","2300000"},
    {"S003","Asus Zenfone 2-32GB","2800000","3200000"},
    {"S004","Samsung Grand Prime","1900000","2300000"},
    {"S005","Samsung Grand Neo","2000000","2350000"},
    {"S006","Xiami Redmi 1S-8GB","1100000","1400000"},
    {"S007","Lenovo A700 DualSIM","1600000","1999000"},
    {"S008","Sony Experia M2Dual","2100000","2500000"},
    {"S009","Sony Experia ZUltra","2900000","3400000"},
    {"S010","Sony Experia C2305","1500000","1900000"},
    {"T001","LG LED TV 22LB450","1100000","1599000"},
    {"T002","Sharp LC 24LE107I","1500000","1800000"},
    {"T003","Sony Bravia 32R300B","2540000","2949000"},
    {"T004","Sony Bravia 40R350B","4000000","4600000"},
    {"T005","Toshiba LED 32P1400","2000000","2500000"},
    {"T006","Toshiba LED 32L2400","3200000","3800000"},
    {"T007","Toshiba TV Android","4000000","4499000"},
    {"C001","Canon EOS 1200D-18MP","3950000","4626000"},
    {"C002","Nikon D3200 24.2 MP","4000000","4700000"},
    {"C003","Nikon D5200 24.1 MP","5700000","6400000"},
    {"C004","Sony Kamera NEX-5T","4650000","5200000"},
    {"C005","Fujifilm X-M1 XC16","5100000","5899000"},
    {"C006","Pentax K50 18-55mm","5200000","5900000"},
    {"C007","Pentax K S1 - 20 MP","8600000","9420000"}};
  
  //username,password
  public static String [][] userPass = {{"root","root"},{"harits","harits"}};
  
  public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
  public static Scanner sc = new Scanner (System.in);
  
  public static int sx=0, sy=0, sz=1, hasil;
  
  public static String cari, pil;
  
  public static boolean lagi,deal,beli,kembali,kembal,keluar,jawab;
  
  public static Vector<Vector> transaksiBarang = new Vector<Vector>();
  
  //Method Menyimpan Transaksi Penjualan
  public static Vector<Object> addTransaksi(String kdtr,String tgl, int totalTransaksi, int totalModal){
    Vector <Object> vector = new Vector<Object>();
    vector.addElement(kdtr);
    vector.addElement(tgl);
    vector.addElement(totalTransaksi);
    vector.addElement(totalModal);
    return vector;
  }
  
  public static Vector<Vector> penjualanBarang = new Vector<Vector>();
  
  //Method Menyimpan data Penjualan
  public static Vector<Object> addPenjualan(String kdt,String kdb, String nmbr, int hgbr, int jmbr, int tothg){
    Vector<Object>  vector = new Vector<Object>();
    vector.addElement(kdt);
    vector.addElement(kdb);
    vector.addElement(nmbr);
    vector.addElement(hgbr);
    vector.addElement(jmbr);
    vector.addElement(tothg);  
    return vector;
  }
  
  //Method Mencetak Data Transaksi Penjualan
  public static void viewPenjualan(){
    int co = 0;
    for(int j=0;j<transaksiBarang.size();j++){
      cetakGaris(71);
      System.out.println("Kode Transaksi    : " + transaksiBarang.elementAt(j).elementAt(0));
      System.out.println("Tanggal Transaksi : " + transaksiBarang.elementAt(j).elementAt(1));
      cetakGaris(71);
      System.out.println("KdBrng\tNamaBarang\t\t Harga\t\tJumlah\tTotal");
      cetakGaris(71);
      for(int h=0;h<penjualanBarang.size();h++){
        if(transaksiBarang.elementAt(j).elementAt(0)==penjualanBarang.elementAt(h).elementAt(0)){
          co++;
          System.out.println(penjualanBarang.elementAt(h).elementAt(1)+"\t"+
                             penjualanBarang.elementAt(h).elementAt(2)+"\t"+penjualanBarang.elementAt(h).elementAt(3)+"\t\t"+
                             penjualanBarang.elementAt(h).elementAt(4)+"\t"+penjualanBarang.elementAt(h).elementAt(5));
        }
      }
      if(co==0){
        System.out.println("Tidak Ada Transaksi");
      }
      cetakGaris(71);
      System.out.println("TOTAL TRANSAKSI : Rp." + transaksiBarang.elementAt(j).elementAt(2));
      cetakGaris(71);
      System.out.println();
    }    
  } 
  
  //Method Membandingkan User dan Password
  public static boolean loginUser(String user,String password){   
    boolean login = false;   
    for(int i=0;i<userPass.length;i++){
      if(user.equals(userPass[i][0]) && password.equals(userPass[i][1])){
        login = true;
        return login;
      }
    }
    return login;
  }
  
  //Method System Login
  public static boolean loopingLogin(){    
    boolean login = false;
    int i=1;    
    do{
      System.out.println("PROGRAM LOGIN (" + i + ")");
      System.out.print("User      : ");
      String user = sc.next();
      System.out.print("Password  : ");
      String pass = sc.next();    
      login = loginUser(user,pass);
      i++;
    }while((login == false) && (i<=3));
    return login;
  }
  
  //Mencetak MENU UTAMA
  public static void cetakMenu(){
    System.out.println("|----------------------------HARITS ELECTRONIC------------------------|");
    System.out.println("|=======================SISTEM INFORMASI TRANSAKSI====================|");
    System.out.println("| [1]TRANSAKSI PENJUALAN                                              |");
    System.out.println("| [2]MAINTANCE DATA BARANG                                            |");
    System.out.println("| [3]VIEW DATA PENJUALAN                                              |");
    System.out.println("| [4]VIEW DATA BARANG                                                 |");
    System.out.println("| [5]CARI DATA BARANG                                                 |");
    System.out.println("| [6]OMSET PENJUALAN                                                  |");
    System.out.println("| [7]KELUAR                                                           |");
    System.out.println("|=====================================================================|");
    System.out.print("Masukkan Pilihan Anda [1-7] : "); 
  }
  
  //Mencetak Menu MAINTANCE DATA BARANG
  public static void menuMaintance(){
    System.out.println("|==========================MAINTANCE DATA BARANG======================|");
    System.out.println("| [1]TAMBAH DATA BARU                                                 |");
    System.out.println("| [2]UBAH DATA BARANG                                                 |"); 
    System.out.println("| [3]HAPUS DATA BARANG                                                |");
    System.out.println("| [4]KEMBALI KE MENU UTAMA                                            |");
    System.out.println("|=====================================================================|");    
    System.out.print("Masukkan Pilihan Anda [1-4] : "); 
  }
  
  //Mencetak Menu CARI DATA BARANG
  public static void menuCari(){
    System.out.println("|=============================CARI DATA BARANG========================|");
    System.out.println("| [1]FILTER BY KODE BARANG                                            |");
    System.out.println("| [2]FILTER BY NAMA                                                   |");
    System.out.println("| [3]KEMBALI KE MENU UTAMA                                            |");
    System.out.println("|=====================================================================|");  
    System.out.print("Masukkan Pilihan Anda [1-3] : "); 
    
  }
  
  //Mencetak Menu VIEW DATA BARANG
  public static void menuView(){
    System.out.println("|=============================VIEW DATA BARANG========================|");
    System.out.println("| [1]LIHAT SEMUA DATA                                                 |");
    System.out.println("| [2]LIHAT BERDASARKAN KATEGORI                                       |");
    System.out.println("| [3]KEMBALI KE MENU UTAMA                                            |");
    System.out.println("|=====================================================================|");  
    System.out.print("Masukkan Pilihan Anda [1-3] : ");     
  }
  
  //Mencetak Menu KATEGORI BARANG
  public static void menuKategori(){
    System.out.println("|=============================KATEGORI BARANG=========================|");
    System.out.println("| [1]lAPTOP/NOTEBOOK                                                  |");
    System.out.println("| [2]SMARTPHONE                                                       |");
    System.out.println("| [3]TELEVISI LED                                                     |");
    System.out.println("| [4]KAMERA                                                           |");
    System.out.println("| [5]KEMBALI KE MENU SEBELUMNYA                                       |");
    System.out.println("|=====================================================================|");  
    System.out.print("Masukkan Pilihan Anda [1-3] : ");     
  }
  
  //Method untuk Mencetak Garis
  public static void cetakGaris(int panjang){
    for(int i=0;i<panjang;i++){
      System.out.print("-");
    }
    System.out.println();
  }
  
  //Method untuk Mencetak Data Barang
  public static void viewDataBarang(){
    cetakGaris(70);
    System.out.println("KdBrng\tNamaBarang\t\t HargaBeli  \tHargaJual");
    cetakGaris(70);
    for(int j=0;j<dataBarang.length;j++){
      System.out.println(dataBarang[j][0]+"\t"+dataBarang[j][1]+"\tRp."+dataBarang[j][2]+"  \tRp."+dataBarang[j][3]);
    }
    cetakGaris(70);
  }
  
  //Mehtod View Data Barang berdasarkan Kategori
  public static void viewKategori(String kd){
    cetakGaris(70);
    System.out.println("KdBrng\tNamaBarang\t\t HargaBeli  \tHargaJual");
    cetakGaris(70);
    for(int a=0;a<dataBarang.length;a++){
      if(dataBarang[a][0].toLowerCase().contains(kd.toLowerCase()) == true){
        System.out.println(dataBarang[a][0]+"\t"+dataBarang[a][1]+"\tRp."+dataBarang[a][2]+"  \tRp."+dataBarang[a][3]);
      } 
    }
    cetakGaris(70); 
  }
  
  //Method untuk Membuat Kode Transaksi Secara Urut
  public static String kodePenjualan(int nt){
    String kdJual = "TR";
    for(int x=sx;x<9;x++){
      kdJual = kdJual + x;
      for(int y=sy;y<9;y++){
        kdJual = kdJual + y;
        for(int z=sz;z<=9;z++){
          kdJual = kdJual + (z-nt);
          sz = sz + (1 - nt);         
          if(sz > 9){
            sz=0;
            sy++;
          }          
          if(sy > 9){
            sz=0;
            sy=0;
            sx++;
          }     
          return kdJual;
        }
      }
    }return kdJual;     
  }
  
  //Method Searching by KODE BARANG
  public static int cariKode(String [][] dataBarang, String cari){
    int idx = -1;
    for(int a=0;a<dataBarang.length && idx == -1;a++){
      if(cari.equalsIgnoreCase(dataBarang[a][0])){
        idx = a;
      }
    }
    return idx;
  }
  
  //Method untuk Mencetak Data Barang dari Kode yang Dicari
  public static void cetakCariKode(int idx, String cari){
    if(idx == -1){
      System.out.println("Data Barang " + cari + " Tidak Ditemukan");
    }
    else{
      System.out.println("Kode Barang  : " + dataBarang[idx][0]);
      System.out.println("Nama Barang  : " + dataBarang[idx][1]);
      System.out.println("Harga Barang : Rp." + dataBarang[idx][2]);
    }
  }
  
  //Method searching by NAMA BARANG 
  public static void cariBarang(String [][] dataBarang, String cari){
    cetakGaris(70);
    System.out.println("KdBrng\tNamaBarang\t\tHargaBeli\t\tHargaJual");
    cetakGaris(70);
    for(int a=0;a<dataBarang.length;a++){
      if(dataBarang[a][1].toLowerCase().contains(cari.toLowerCase()) == true){
        System.out.println(dataBarang[a][0]+"\t"+dataBarang[a][1]+"\t"+dataBarang[a][2]+"\t\t"+dataBarang[a][3]);
      } 
    }
    cetakGaris(70); 
  }
  
  //Method case transaksi Penjualan
  public static void inputTransaksi(){
    Date date = new Date();
    beli = false;
    deal = false;
    int totalTransaksi = 0;
    int totalModal = 0;
    int count =0;
    String kdt = kodePenjualan(0);   
    String tgl = date.toString();
    do{
      int indeks = -1;
      System.out.print("Kode Barang   : ");
      String kdb = sc.next();
      int k = cariKode(dataBarang,kdb);
      if(k == -1){
        System.out.println("Kode Barang Tidak Ditemukan");
      }
      else{
        System.out.print("Jumlah Barang : ");
        int jmlb = sc.nextInt();                 
        if(kdb.equalsIgnoreCase(dataBarang[k][0])){
          count++;
          String kdbr = dataBarang[k][0];
          String nmbr = dataBarang[k][1];
          int hgbr = Integer.parseInt(dataBarang[k][3]);
          int tothg = hgbr * jmlb;
          int trmdl = Integer.parseInt(dataBarang[k][2])*jmlb;
          totalModal = totalModal + trmdl;
          penjualanBarang.addElement(addPenjualan(kdt,kdbr,nmbr,hgbr,jmlb,tothg));  
          totalTransaksi = totalTransaksi + tothg;
          System.out.println("---------------------------------------------");
          System.out.println("Nama Barang   : " + nmbr);
          System.out.println("Harga Barang  : Rp." + hgbr);
          System.out.println("Jumlah Barang : " + jmlb);
          System.out.println("Total Harga   : Rp." + tothg);
          System.out.println("---------------------------------------------");
          System.out.println("TOTAL TRANSAKSI: Rp." + totalTransaksi);
        }
      }
      jawab = false;
      do{
        System.out.print("Ingin Melanjutkan Transasksi[y/t] : ");
        String trAw = sc.next();
        if(trAw.equalsIgnoreCase("y")){
          beli = false;
          jawab = true;
        }
        else if(trAw.equalsIgnoreCase("t")){
          beli = true;
          jawab = true;
        }
        else{
          System.out.println("PILIHAN TIDAK TERSEDIA!");
        }
      }while(jawab == false);
    }while(beli == false);
    if(count>0){
      jawab = false;
      do{
        System.out.print("Apakah Anda Menyetujui Transaksi Ini [y/t] :");
        pil = sc.next();
        if(pil.equalsIgnoreCase("y")){
          deal = true;
          jawab = true;
        }
        else if(pil.equalsIgnoreCase("t")){
          deal = false;
          jawab = true;
        }
        else{
          System.out.println("PILIHAN TIDAK TERSEDIA!");
        }
      }while(jawab == false);
    }
    if((count>0) && (deal == true)){
      transaksiBarang.addElement(addTransaksi(kdt,tgl,totalTransaksi,totalModal));
    }else if((count == 0) || (deal == false)){
      kodePenjualan(2);
    }
  }
  
  //Method Menambah Data
  public static void insertData() throws IOException{
    do{
      String arr1 [][] = new String [dataBarang.length][4];
      lagi = false;
      
      System.arraycopy(dataBarang,0,arr1,0,dataBarang.length);
      
      System.out.print("Kode Barang Baru : ");
      String kdbr = sc.next();
      hasil = cariKode(dataBarang,kdbr);
      if(hasil == -1){
        System.out.print("Nama Barang baru : ");
        String nmbr = br.readLine(); 
        System.out.print("Harga Beli Baru  : ");
        String hbbr = sc.next(); 
        System.out.print("Harga Jual baru  : ");
        String hjbr = sc.next();         
        dataBarang = new String[dataBarang.length+1][4];       
        dataBarang[dataBarang.length-1][0] = kdbr.toUpperCase();
        dataBarang[dataBarang.length-1][1] = nmbr;
        dataBarang[dataBarang.length-1][2] = hbbr;
        dataBarang[dataBarang.length-1][3] = hjbr;        
        System.arraycopy(arr1,0,dataBarang,0,arr1.length);
        System.out.println("DATA BARANG BERHASIL DI TAMBAHKAN");
      }
      else{
        System.out.println("Kode Barang Sudah Digunakan");
        do{
          System.out.print("Coba Lagi [y/t] : ");
          pil = sc.next();
          jawab = false;
          if(pil.equalsIgnoreCase("y")){
            lagi = true;
            jawab = true;
          }
          else if(pil.equalsIgnoreCase("t")){
            lagi = false;
            jawab = true;
          }
          else{
            System.out.println("PILIHAN TIDAK TERSEDIA!");
          }
        }while(jawab == false);
      }
    }while(lagi == true);
  }
  
  //Method Merubah Data
  public static void updateData()throws IOException{
    do{
      lagi = false;
      System.out.print("Masukkan Kode Barang : ");
      cari = sc.next();
      hasil = cariKode(dataBarang,cari);
      if(hasil == -1){
        System.out.println("Data " + cari + " Tidak Ditemukan !");
      }
      else{
        System.out.println("Apakah Anda Yakin Ingin Mengubah : ");
        System.out.println("Kode Barang : " + dataBarang[hasil][0]);
        System.out.println("Nama Barang : " + dataBarang[hasil][1]);
        System.out.print("[y/t] : ");
        pil = sc.next();
        if(pil.equalsIgnoreCase("y")){
          String simpanSementara = dataBarang[hasil][0];
          System.out.print("Kode Barang Baru : ");
          String kdbaru = sc.next();
          int idx = cariKode(dataBarang,cari);
          dataBarang[hasil][0] = "NULL";
          hasil = cariKode(dataBarang,kdbaru);          
          if(hasil == -1 && idx != -1){
            dataBarang[idx][0] = kdbaru.toUpperCase();
            System.out.print("Nama Barang baru : ");
            dataBarang[idx][1] = br.readLine(); 
            System.out.print("Harga Beli Baru  : ");
            dataBarang[idx][2] = sc.next(); 
            System.out.print("Harga Jual baru  : ");
            dataBarang[idx][3] = sc.next(); 
            System.out.println("DATA BARANG BERHASIL DI UBAH");
          }
          else{
            dataBarang[idx][0] = simpanSementara;
            System.out.println("Kode Barang Sudah Digunakan");
            do{
              System.out.print("Coba Lagi [y/t] : ");
              pil = sc.next();
              jawab = false;
              if(pil.equalsIgnoreCase("y")){
                lagi = true;
                jawab = true;
              }
              else if(pil.equalsIgnoreCase("t")){
                lagi = false;
                jawab = true;
              }
              else{
                System.out.println("PILIHAN TIDAK TERSEDIA!");
              }
            }while(jawab == false);
          }
        }
      }
    }while(lagi == true);
  }
  
  //Method Menghapus Data
  public static void deleteData(int hasil){
    String arr [][] = new String [dataBarang.length-1][4];
    
    do{
      System.out.println("Apakah Anda Yakin Ingin Menghapus : ");
      System.out.println("Kode Barang : " + dataBarang[hasil][0]);
      System.out.println("Nama Barang : " + dataBarang[hasil][1]);
      System.out.print("[y/t] : ");;
      pil = sc.next();
      
      if(pil.equalsIgnoreCase("y")){      
        for(int h=0;h<hasil;h++){
          arr[h][0] = dataBarang[h][0];
          arr[h][1] = dataBarang[h][1];
          arr[h][2] = dataBarang[h][2];
          arr[h][3] = dataBarang[h][3];
        }
        
        for(int k=hasil;k<arr.length;k++){
          arr[k][0] = dataBarang[k+1][0];
          arr[k][1] = dataBarang[k+1][1];
          arr[k][2] = dataBarang[k+1][2];
          arr[k][3] = dataBarang[k+1][3];
        }                           
        
        dataBarang = new String [arr.length][4];
        
        System.arraycopy(arr,0,dataBarang,0,arr.length); 
        System.out.println("DATA BARANG BERHASIL DI HAPUS");
        jawab = true;
      }
      else if(pil.equalsIgnoreCase("t")){
        jawab = true;
      }
      else{
        System.out.println("PILIHAN TIDAK TERSEDIA!");
      }
    }while(jawab == false);
  }
  
  //Mencetak Omset Penjualan
  public static void omsetPenjualan(){
    int totKotor = 0;
    int totModal = 0;
    int totomset = 0;
    System.out.println("---------------TOTAL PENJUALAN--------------");
    for(int a=0;a<transaksiBarang.size();a++){
      System.out.println(transaksiBarang.elementAt(a).elementAt(0) + " : Rp." + transaksiBarang.elementAt(a).elementAt(2));
      totKotor = totKotor + (int)transaksiBarang.elementAt(a).elementAt(2);
    }
    System.out.println("--------------------------------------------");
    System.out.println("OMSET PENJUALAN : Rp." + totKotor);   
    System.out.println();
    System.out.println("-----------------TOTAL MODAL----------------");
    for(int a=0;a<transaksiBarang.size();a++){
      System.out.println(transaksiBarang.elementAt(a).elementAt(0) + " : Rp." + transaksiBarang.elementAt(a).elementAt(3));
      totModal = totModal + (int)transaksiBarang.elementAt(a).elementAt(3);
    }
    int labaPenjualan = totKotor - totModal;
    System.out.println("--------------------------------------------");
    System.out.println("MODAL PENJUALAN : Rp." + totModal);
    System.out.println("============================================");
    System.out.println("LABA KOTOR PENJUALAN : Rp." + labaPenjualan);
    System.out.println("============================================");
  }
  
  //Program Utama
  public static void main(String [] args){
    
    int pilihan, i = 1;
    boolean succes = loopingLogin();
    keluar = false;
    
    try{
      if(succes == false){
        System.out.println("Maaf Anda Sudah 3 Kali Gagal, System Lock!");
      }
      else{    
        do{
          cetakMenu();
          pilihan = sc.nextInt();
          
          switch(pilihan){
            case 1 :
              inputTransaksi();                     
              break;
            case 2 :
              kembali = false;              
              do{
                menuMaintance();
                pilihan = sc.nextInt();
                switch(pilihan){
                  case 1 :
                    insertData();
                    break;
                  case 2 :
                    updateData();
                    break;
                  case 3 :               
                    System.out.print("Masukkan Kode Barang : ");
                    cari = sc.next();
                    hasil = cariKode(dataBarang,cari);
                    if(hasil == -1){
                      System.out.println("Data Barang " + cari + " Tidak Ditemukan !");
                    }
                    else{
                      deleteData(hasil);
                    }           
                    break;
                  case 4 :
                    kembali = true;
                    break;
                  default:
                    System.out.println("PILIHAN TIDAK TERSEDIA!");
                }
              }while(kembali == false);
              break;
            case 3 :
              viewPenjualan();
              break;
            case 4 :             
              kembal = false;
              do{
                menuView();
                pilihan = sc.nextInt();
                switch(pilihan){
                  case 1 :
                    viewDataBarang();
                    break;
                  case 2 :  
                    kembali = false;
                    do{
                      menuKategori();
                      pilihan = sc.nextInt();
                      switch(pilihan){
                        case 1 :
                          viewKategori("L");
                          break;
                        case 2 :
                          viewKategori("S");
                          break;
                        case 3 :
                          viewKategori("T");
                          break;
                        case 4 :
                          viewKategori("C");
                          break;
                        case 5:
                          kembali = true;
                          break;
                        default:
                          System.out.println("PILIHAN TIDAK TERSEDIA!");
                      }
                    }while(kembali == false);
                    break;
                  case 3:
                    kembal = true;
                    break;
                  default:
                    System.out.println("PILIHAN TIDAK TERSEDIA!");
                } 
              }while(kembal == false);
              break;
            case 5 :
              kembali = false;
              do{
                menuCari();
                pilihan = sc.nextInt();
                switch(pilihan){
                  case 1 :
                    System.out.print("Masukkan Kode Barang : ");
                    cari = sc.next();
                    cetakCariKode(cariKode(dataBarang,cari), cari);
                    break;
                  case 2 :
                    System.out.print("Masukkan Nama Barang : ");
                    cari = sc.next();
                    cariBarang(dataBarang,cari);
                    break;
                  case 3 :
                    kembali = true;
                    break;
                  default:
                    System.out.println("PILIHAN TIDAK TERSEDIA!");
                }
              }while(kembali == false);
              break;
            case 6 :
              omsetPenjualan();        
              break;
            case 7 :
              keluar = true;
              break; 
            default:
              System.out.println("PILIHAN TIDAK TERSEDIA!");
          }        
        }while(keluar == false);
      }      
    }
    catch(Exception e){
      System.out.println("**Inputan Anda Salah! SYSTEM EROR!**");
    }
  }
}

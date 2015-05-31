import java.io.*;
public class DbMhsApp{
  
  public static String [] nimx = {"13410100249",
    "14410100044",
    "14410100045",
    "14410100047",
    "14410100048",
    "14410100049",
    "14410100050",
    "14410100052",
    "14410100053",
    "14410100054",
    "14410100055",
    "14410100056",
    "14410100057",
    "14410100059",
    "14410100061",
    "14410100062",
    "14410100063",
    "14410100065",
    "14410100066",
    "14410100067",
    "14410100068",
    "14410100069",
    "14410100070",
    "14410100071",
    "14410100072",
    "14410100073",
    "14410100074",
    "14410100075",
    "14410100076",
    "14410100077",
    "14410100078",
    "14410100079",
    "14410100080",
    "14410100081",
    "14410100082",
    "14410100083"};
  
  public static String []daftarNama = {
    "Sunandar",
    "Nabil Perdana Putra",
    "Septian Agung Wibowo",
    "Alif Muhammad Asshiddiq",
    "Rendy Destara Firmanto",
    "Okta Adygantara",
    "Arda Fikri Saudi",
    "Ghivari Zakaria",
    "Januar Rosydi",
    "Luky Rahman",
    "Nestya Arum Damayanti",
    "Reinhard Kansai Rumbiak",
    "Komang Maha Saputra",
    "Bagus Irfandi",
    "Al Arif Rahmadika Putra Wicaksono",
    "Mohammad Nurrahman Bahtiar",
    "M. Fakhrizal Setyahadi",
    "Tedy Dwi Indrawan",
    "Galang Cahya Ganggawa",
    "Naufal As'Ad Taufiqurrahman",
    "Ahmad Iqbal Yunus",
    "Ahmad Badruz Zaman",
    "Firmansyah Rizkiawan Nugraha",
    "Dimas Setya Priambodo",
    "Rendra Pratama Putra",
    "Alifand Masrizky Putra Rosid",
    "Lani Nuralita Dian Pertiwi",
    "Arizky Vebby Widardo",
    "Harits Yulianta Pratama",
    "Christophorus Bimo Kurniawan Alpha Roosadi",
    "Wildan Harits Prasetyo",
    "Andri Pratama Putra",
    "Maritha Imelda Estyana Saputri",
    "Siti Sholikah",
    "Iqbal Hudzalfah Zahrani",
    "Muhammad Iqbal Alhabsyi"
  };
  public static void cariMhs (String[]nim,String cari){
    int i=0;
    int indeks = -1;
    do{
      if(daftarNama[i].toLowerCase().contains(cari.toLowerCase()) || nimx[i].toLowerCase().contains(cari.toLowerCase())  == true){
        System.out.println(nimx[i]+"\t"+daftarNama[i]);
      } 
      i++;
    }while((i<nim.length)&&(indeks == -1));
  } 
  
  public static int cariNim (String[]nim,String cari){
    int i=0;
    int indeks = -1;
    do{
      if(nim[i].equalsIgnoreCase(cari)){
        indeks = i;
      } 
      i++;
    }while((i<nim.length)&&(indeks == -1));
    return indeks;  
  }
  
  public static void main(String[]args)throws IOException{
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    boolean keluar = false;
    int hasil;
    String cari;
    String pil;
    
    do{
      System.out.println("1. Cari Data Mahasiswa by NIM");
      System.out.println("2. View Data Mahasiswa Filter by Nama");
      System.out.println("3. Delete Data Mahasiswa (by NIM)");
      System.out.println("4. View All Data Mahasiswa");
      System.out.println("5. Exit");
      System.out.print("Masukkan Pilihan : ");
      int pilihan = Integer.parseInt(br.readLine());
      switch(pilihan){
        case 1:
          System.out.print("Masukkan NIM : ");
          cari = br.readLine();
          hasil = cariNim(nimx,cari);
          if(hasil == -1){
            System.out.println("NIM " + cari + " Tidak Ketemu !");
          }
          else{
            System.out.println("NIM : " + cari + " Ada di Indeks :" + hasil);
            System.out.println("Nama : "+ daftarNama[hasil]);
          }
          System.out.println();
          break;
        case 2:
          System.out.print("Masukkan Nama : ");
          cari = br.readLine();            
          cariMhs(daftarNama,cari);
          System.out.println();          
          break;
        case 3 : 
          String arr [] = new String [nimx.length-1];
          String ayy[] = new String [daftarNama.length-1];
          System.out.print("Masukkan NIM yang Ingin Dihapus : ");
          cari = br.readLine();
          hasil = cariNim(nimx,cari);
          if(hasil == -1){
            System.out.println("NIM " + cari + " Tidak Ditemukan !");
          }
          else{
            System.out.print("Apakah Anda Yakin Ingin Menghapus " + nimx[hasil] +" " + daftarNama[hasil]+"[y/t] : ");
            pil = br.readLine();
            if(pil.equalsIgnoreCase("y")){
              for(int i=0;i<=hasil;i++){
                arr[i] = nimx[i];
                ayy[i] = daftarNama[i];
              }
              for(int k=hasil;k<arr.length;k++){
                arr[k] = nimx[k+1];
                ayy[k] = daftarNama[k+1];
              }
              
              nimx = new String[arr.length];
              daftarNama = new String[ayy.length];
              for(int j=0;j<nimx.length;j++){
                nimx[j] = arr[j];
                daftarNama[j] = ayy[j];
              }
            }
            
          }
          break;
        case 4 :
          for(int j=0;j<nimx.length;j++){         
            System.out.println(j + ". " + nimx[j] + "\t" + daftarNama[j]);
          }
          break;       
        case 5:
          keluar = true;
          break;
      }
    }
    while(keluar == false);    
  }
}

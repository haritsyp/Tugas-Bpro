import java.io.*;
public class DbMhsApp02{
  
  public static String [] nimMhs = {
    "13410100249",
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
  
  public static String user [][]  = {{"root","root"}};
  
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
  
  public static void cariMhs (String[]nim,String cari){
    int i=0;
    int indeks = -1;
    do{
      if(daftarNama[i].toLowerCase().contains(cari.toLowerCase()) == true){
        System.out.println(nimMhs[i]+"\t"+daftarNama[i]);
      } 
      i++;
    }while((i<nim.length)&&(indeks == -1));
  } 
  
  public static void cariAngkatan (String[]nim,String cari){
    int i=0;
    int indeks = -1;
    do{
      if(nimMhs[i].toLowerCase().contains(cari.toLowerCase())  == true){
        System.out.println(nimMhs[i]+"\t"+daftarNama[i]);
      } 
      i++;
    }while((i<nim.length)&&(indeks == -1));
  } 
  
  public static void main(String[]args)throws IOException{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int pilihan;
    String username;
    String password;
    int i=1;
    boolean masuk = false;
    boolean keluar = false;
    String cari;
    int hasil;
    String pil;
    String nimbaru,namabaru;
    
    do{
      System.out.println("PROGRAM LOGIN(" + i + ")");
      System.out.print("username : ");
      username = br.readLine();
      System.out.print("password : ");
      password = br.readLine();
      for(int j=0;j<user.length;j++){
        if(username.equals(user[j][0])&&password.equals(user[j][1])){
          i=4;
          masuk = true;
        }
      } 
      i++;
    }
    while(i<=3);
    
    
    if(masuk == true){
      do{
        System.out.println();
        System.out.println("1. Cari Data Mahasiswa by NIM");
        System.out.println("2. View Data Mahasiswa Filter by Nama");
        System.out.println("3. View Data Mahasiswa Filter by Angkatan"); 
        System.out.println("4. Delete Data Mahasiswa (by NIM)");
        System.out.println("5. Update Data Mahasiswa (by NIM)");
        System.out.println("6. Insert Data Mahasiswa");
        System.out.println("7. View All Data Mahasiswa");
        System.out.println("8. Exit");
        System.out.print("Masukkan pilihan : ");
        pilihan  = Integer.parseInt(br.readLine());
        switch(pilihan){
          case 1 : 
            System.out.print("NIM : ");
            cari = br.readLine();
            hasil = cariNim(nimMhs,cari);
            if(hasil == -1){
              System.out.println("NIM " + cari + " Tidak Terdaftar !");
            }
            else{
              System.out.println("NIM : " + cari + " Ada di Indeks :" + hasil);
              System.out.println("Nama : "+ daftarNama[hasil]);
            }
            break;
          case 2 :
            System.out.print("Masukkan Nama : ");
            cari = br.readLine();
            cariMhs(nimMhs,cari);
            break;
          case 3 :
            System.out.print("Masukkan Tahun Angkatan : ");
            cari = br.readLine();
            cariAngkatan(nimMhs,cari);
            break;
          case 4 :
            String arr [] = new String [nimMhs.length-1];
            String ayy[] = new String [daftarNama.length-1];
            System.out.print("Masukkan NIM yang Ingin Dihapus : ");
            cari = br.readLine();
            hasil = cariNim(nimMhs,cari);
            if(hasil == -1){
              System.out.println("NIM " + cari + " Tidak Ditemukan !");
            }
            else{
              System.out.print("Apakah Anda Yakin Ingin Menghapus " + nimMhs[hasil] +" " + daftarNama[hasil]+"[y/t] : ");
              pil = br.readLine();
              if(pil.equalsIgnoreCase("y")){
                for(int h=0;h<=hasil;h++){
                  arr[h] = nimMhs[h];
                  ayy[h] = daftarNama[h];
                }
                for(int k=hasil;k<arr.length;k++){
                  arr[k] = nimMhs[k+1];
                  ayy[k] = daftarNama[k+1];
                }                            
                nimMhs = new String [arr.length];
                daftarNama = new String [ayy.length];
                for(int j=0;j<arr.length;j++){
                  nimMhs[j] = arr[j];
                  daftarNama[j] = ayy[j];
                }               
              }           
            }
            break;
          case 5 :
            System.out.print("Masukkan NIM dari data yang ingin diubah : ");
            cari = br.readLine();
            hasil = cariNim(nimMhs,cari);
            if(hasil == -1){
              System.out.println("NIM " + cari + " Tidak Ditemukan !");
            }
            else{
              System.out.print("Apakah Anda Yakin Ingin Mengubah " + nimMhs[hasil] +" " + daftarNama[hasil]+"[y/t] : ");
              pil = br.readLine();
              if(pil.equalsIgnoreCase("y")){
                System.out.print("NIM baru : ");
                nimMhs[hasil] = br.readLine();
                System.out.print("Nama baru : ");
                daftarNama[hasil] = br.readLine(); 
              }
            }
            break;
          case 6 :
            String arr1 [] = new String [nimMhs.length];
            String ayy1 [] = new String [daftarNama.length];
            
            for(int y=0;y<nimMhs.length;y++){
              arr1[y] = nimMhs[y];
              ayy1[y] = daftarNama[y];
            }
            
            System.out.print("NIM : ");
            nimbaru = br.readLine();
            System.out.print("Nama : ");
            namabaru = br.readLine();
            
            nimMhs = new String[nimMhs.length+1];
            daftarNama = new String[daftarNama.length+1];
            nimMhs[nimMhs.length-1] = nimbaru;
            daftarNama[daftarNama.length-1] = namabaru;
            
            for(int x=0;x<nimMhs.length-1;x++){
              nimMhs[x] = arr1[x];
              daftarNama[x] = ayy1[x];
            }                       
            break;
          case  7 :
            for(int j=0;j<nimMhs.length;j++){         
            System.out.println(j + ". " + nimMhs[j] + "\t" + daftarNama[j]);
          }
            break;
          case 8:
            keluar = true;
            break;
        }
      }
      while(keluar == false);
    }   
  }  
}

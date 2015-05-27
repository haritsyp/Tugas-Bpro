import java.util.*;
public class SimpleSearch01{
  
  public static String [] nim = {"13410100249",
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
  
  public static int cariMhs (String[]nim,String cari){
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
  
  
  public static void main(String[]args){
    
    Scanner br=new Scanner(System.in);
    System.out.print("Masukkan NIM (atau exit untuk keluar) : ");
    String cari = br.next();
    int hasil = cariMhs(nim,cari);
    if(hasil == -1 || cari.equalsIgnoreCase("exit")){
      System.out.print("NIM " + cari + " Tidak Ketemu !");
    }
    else{
      System.out.println("NIM : " + cari + " Ada di Indeks :" + hasil);
      System.out.println("Nama : "+ daftarNama[hasil]);
    }
  }  
}

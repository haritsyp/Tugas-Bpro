import java.util.*;

public class PuzzleKata{
  
  public static String getRandom(String kata){  
    
    //array untuk membagi karakter
    char [] ar = new char [kata.length()];    
    for(int i=0;i<kata.length();i++){
      ar[i] = kata.charAt(i);
    }   
    
    //deklarasi variabel
    int nilai;
    String katas="";
    char [] ac = new char [kata.length()];
    
    //perulangan untuk mengulang sampai karakter membentuk kata
    while(katas.length()!=kata.length()){      
      boolean sama = false;
      nilai = (int) (Math.random()*kata.length());           
      ac[nilai] = kata.charAt(nilai); //array untuk membandingkan karakter
      for(int k=0;k<kata.length();k++){        
        //proses membandingkan karakter
        if(ac[nilai] == ar[k]){
          ar[k] = 0;
          sama = true;
          break;
        }
      } 
      if(sama == true){
        katas = katas + ac[nilai];
      }
      else{
        continue;
      }
    }  
    //cetak kata
    return katas;
  }  
  
  public static void cetakGaris(int panjang){
    System.out.println();
    for(int i=0;i<panjang;i++){
      System.out.print("*");
    }
    System.out.println();
  }
  
  //Deklarasi Variabel
  public static void main(String[]args){
    Scanner br=new Scanner(System.in);
    String [] kata = {"break","double","while","system","string","boolean","float","false","array","switch","equals"};    
    int nilai;
    int soal; 
    int poin=0;
    
    //Memasukkan jumlah soal
    System.out.print("Masukkan jumlah soal :");
    soal=br.nextInt(); 
    String [] soalRandom = new String [soal];
    String [] benar = new String [soal];
    String [] pembetulan = new String [soal];
    String [] jawab = new String [soal];
    
    //Perulangan Soal
    for(int i=0;i<soal;i++){
      nilai = (int)(Math.random()*kata.length);
      soalRandom[i]=getRandom(kata[nilai]);
      System.out.print(i+1+".");
      System.out.print(soalRandom[i] + " : ");     
      jawab[i] = br.next();
      
      
      //Menentukan benar dan salah
      if(jawab[i].equalsIgnoreCase(kata[nilai])){
        poin = poin + 1;
        benar[i]="benar";
        pembetulan[i]="-";
      }
      else{
        benar[i]="salah";
        pembetulan[i]=kata[nilai];
        
      }
    }
    
    //Output Jawaban dan Pembenaram
    cetakGaris(73);
    System.out.print("No KUNCI\t\tJAWABAN\t\tSTATUS\t\tPEMBETULAN");
    cetakGaris(73);
    for(int x=0;x<soal;x++){
      System.out.println(x+1+". "+soalRandom[x]+"\t\t"+jawab[x]+"\t\t"+benar[x]+"\t\t"+pembetulan[x]+"\t");
    }
    cetakGaris(73);
    float score = poin*100/soal;
    System.out.println("NILAI ANDA : "+score);
  }
}

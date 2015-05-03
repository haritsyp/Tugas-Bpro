import java.io.*;

public class DaftarIsi{
  
  //method cetak titik
  public static void hasil(String babs,int nomer){
    System.out.print(babs);
    for (int i=0;i<100-(babs.length());i++){
      System.out.print(".");
    }
    System.out.print(nomer);
    System.out.println();
  }
  
  public static void main(String[]args)throws Exception
  {        
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    //Memasukkan jumlah bab
    System.out.print("Masukkan jumlah bab : ");
    int jumlah=Integer.parseInt(br.readLine());
    
    //Deklarasi Variabel
    String babs[]=new String[jumlah];
    int nomer[]=new int[jumlah];
    
    //Perulangan untuk memasukkan judul dan halaman
    for (int i=0;i<jumlah;i++){
      int x=i+1;
      System.out.print("Masukkan judul bab "+x+" : ");
      babs[i]=br.readLine();
      
      System.out.print("Masukkan halaman bab "+x+" : ");
      nomer[i]=Integer.parseInt(br.readLine());
    }
    
    //Output cetak bab
    for (int i=0;i<jumlah;i++){
      int y=i+1;
      System.out.print("BAB "+y+" : ");
      hasil(babs[i],nomer[i]);
    }  
    
  } 
  
}

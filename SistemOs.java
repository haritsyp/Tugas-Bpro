import java.io.*;
public class SistemOs {
  public static void main (String [] args)throws IOException{
  
   int blackberry=0;
   int ios=0;
   int windows=0;
   int android=0;

  String[]os={"Android","Android","Android","Android","Android","IOS","Blackberry","Windows",
           "Android","IOS","IOS","Blackberry"};
  String[]nama={"Naufal","Yanuar","Nur","Dimas","Arizky","Reinhard","Arda","Rendy","Alifan","Egen","Bagus","Rendra"};
  
  System.out.println("Survey Sistem Operasi");
  
  for(int baris=0;baris<12;baris++)
  {
    System.out.println(nama[baris]+"\t : "+os[baris]);
  }
  
  System.out.println();
  
  for (int i=0;i<12;i++){
    if (os[i].equalsIgnoreCase("Blackberry")){
       blackberry+=1;}
    else
   {
      if(os[i].equalsIgnoreCase("IOS")){
        ios+=1;}
      else
      {
        if(os[i].equalsIgnoreCase("Android")){
          android+=1;}
        else if (os[i].equalsIgnoreCase("Windows")){
          windows+=1;}
        else {System.exit(0);}
      }
    }
  }
      System.out.println("Pengguna OS Balckberry Sebanyak : "+blackberry);
      System.out.println("Pengguna OS IOS Sebanyak : "+ios);
      System.out.println("Pengguna OS Android Sebanyak : "+android);
      System.out.println("Pengguna OS Windows Phone Sebanyak : "+windows);
      
      int max=blackberry;
      String simpanmax="Blackberry";
      for(int k=0;k<4;k++)
      {
        if (ios>max)
        {
          max=ios;
          simpanmax="IOS";
        }
        else if(android>max)
        {
          max=android;
          simpanmax="Android";
        }
         else if(windows>max)
        {
          max=windows;
          simpanmax="Windows";
        }
      }
      
       int min=blackberry;
      String simpanmin="Blackberry";
      for(int k=0;k<4;k++)
      {
        if (ios<min)
        {
          min=ios;
          simpanmin="IOS";
        }
        else if(android<min)
        {
          min=android;
          simpanmin="Android";
        }
         else if(windows<min)
        {
          min=windows;
          simpanmin="Windows";
        }
      }
      
      System.out.println();
      System.out.println("OS Terbanyak adalah : "+simpanmax);
      System.out.println("OS Terbanyak adalah : "+simpanmin);
         
  } 
}


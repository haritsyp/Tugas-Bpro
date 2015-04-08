import java.util.*;
public class BelajarPenjumlahan
{
  public static void main(String[]args)
  {
    Scanner br=new Scanner(System.in);
    
    int soal;
    int bilangan;
    int jawaban;
    int total=0;
    int count=1;
    
    System.out.print("Masukkan jumlah soal :");
    soal=br.nextInt();
    
    while (count<=soal)
    {
       double bilx=Math.random()*10;
       double bily=Math.random()*10;
       bilangan =(int) bilx + (int) bily;
       System.out.print(count + "." + " " +(int) bilx + "+" + (int)bily + "=");
       jawaban=br.nextInt();
       if (bilangan==jawaban){
         total=total+10;
       }
       count++;
     }
    System.out.print("Nilai Anda =" +" "+total);
  }
}
                     
    

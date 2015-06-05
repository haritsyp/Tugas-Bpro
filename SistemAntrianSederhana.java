import java.util.*;
public class SistemAntrianSederhana{
  public static Scanner sc = new Scanner(System.in);
  public static LinkedList<AntrianPasien> antrian = new LinkedList<AntrianPasien>();
  
  public static void addAntrian(AntrianPasien ap){
    antrian.add(ap);
  }
  
  public static void add(int no, String nama, String alamat){
    AntrianPasien p1 = new AntrianPasien();
    p1.no = no;
    p1.nama = nama;
    p1.alamat = alamat;
    addAntrian(p1);
  }
  
  public static AntrianPasien panggilPasien(){
    return antrian.remove();
  }
  
  public static void viewPanggil(){
    System.out.println("Nomor Antrian   : " +  antrian.getFirst().no);
    System.out.println("Silahkan Masuk  : " +  antrian.getFirst().nama);
    System.out.println("Alamat          : " +  antrian.getFirst().alamat);
  }
  
  public static void viewAll(){
    for(int i=0;i<antrian.size();i++){
      System.out.println(antrian.get(i).no + "\t" + antrian.get(i).nama + "\t\t" +
                         antrian.get(i).alamat);
    }
  }
  
  public static void cetakMenu(){
    System.out.println("------------------SISTEM ANTRIAN SEDERHANA------------------");
    System.out.println("------[1]TAMBAH PASIEN [2]PANGGIL PASIEN [3]LIHAT DATA------");
    System.out.println("----------------------------[4]EXIT-------------------------");
    System.out.print("Masukkan Pilihan Anda [1-4] : "); 
  }
  
  public static void main(String[]args){
    
    boolean keluar = false;
    AntrianPasien p1 = new AntrianPasien();
    int i=1;
    
    do{
      cetakMenu();
      int pilihan = sc.nextInt();
      switch(pilihan){
        case 1 : 
          System.out.println("No Antrian " + i);
          p1.no = i;
          System.out.print("Nama : ");
          p1.nama = sc.next();
          System.out.print("Alamat : ");
          p1.alamat = sc.next();
          add(p1.no,p1.nama,p1.alamat);
          i++;        
          break;
        case 2 :     
          viewPanggil();
          panggilPasien();
          break;
        case 3:
          viewAll();
          break;
        case 4 :
          keluar = true;
          break;
      }
    }while(keluar == false);  
  } 
}

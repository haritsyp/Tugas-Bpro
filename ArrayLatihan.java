public class ArrayLatihan{
  public static void main(String[]args){
    int []dRandom = new int[20];
    int total=0;
    int rata;
    int i=0;
    while(i<20){
    double bil=Math.random()*100;
    dRandom[i]= (int)bil;   
    System.out.println("ISI ARRAY KE [" + i+"]=" +dRandom[i]  );
    total=total+dRandom[i];    
    i++;
    }
    int min;
    int max;
    
    min=dRandom[0];
    max=dRandom[0];
    for(i=0;i<dRandom.length;i++){
      if (min>dRandom[i]){
        min=dRandom[i];
      }
    }
    for(i=0;i<dRandom.length;i++){
      if (max<dRandom[i]){
        max=dRandom[i];
      }
    }
    rata=total/dRandom.length;
    System.out.println("Nilai Terendah : "+min);
    System.out.println("Nilai Tertinggi : "+max);
    System.out.println("Rata=rata : "+rata);
  }
}

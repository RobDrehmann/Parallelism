import java.util.Timer;
import java.util.TimerTask;
public class prime{
   public static double start  = 1000;
   public static double end = 1250;
   
   public static double end1 = 1500;
 
   public static double end2 = 1750;
   
   public static double end3 = 2000;
   public static double counter = 0;
   public static double counter1 = 0;
   public static double counter2 = 0;
   public static double counter3 = 0;
   public static boolean[] check1 = new boolean[4];
   public static boolean[] check2 = new boolean[4];
   public static boolean[] check3 = new boolean[4];
   public static boolean[] check = new boolean[4];
   public static int result1 = 0;
   public static int result2 = 0;
   public static int result3 = 0;
   public static int result4 = 0;
   public static void main(String[] args){
      thread1.start();
      thread2.start();
      thread3.start();
      thread4.start();
      checking();
      Timer timer = new Timer();
      timer.schedule(
         new TimerTask() { 
            @Override  
            public void run() {
             if(check[0]&&check[1]&&check[2]&&check[3]){
             timer.cancel();
                  System.out.println(result1+result2+result3+result4);
      }
      
      }

              
            
         },  1,1);
      
   }
   public static Thread thread1 = 
      new Thread() {
         public void run() {
         
            for(double i = start; i < end; i++){
               counter = 0;
               for(double j = 2; j < i; j++){
                  if((i/j)%1 == 0){
                     counter++;
                  }
               }
               if(counter == 0){
                  result1++;
               }
               counter = 0;
            }
            check[0] = true;
         }
      };
   public static Thread thread2 = 
      new Thread() {
         public void run() {
         
            for(double i = end; i < end1; i++){
               counter1 = 0;
               for(double j = 2; j < i; j++){
                  if((i/j)%1 == 0){
                     counter1++;
                  }
               }
               if(counter1 == 0){
                  result2++;
               }
               counter1 = 0;
            }
            check[1] = true;
         }
      };
   public static Thread thread3 = 
      new Thread() {
         public void run() {
            for(double i = end1; i < end2; i++){
               counter2 = 0;
               for(double j = 2; j < i; j++){
                  if((i/j)%1 == 0){
                     counter2++;
                  }
               }
               if(counter2 == 0){
                  result3++;         }
               counter2 = 0;
            }
            check[2] = true;
         }
      };

   public static Thread thread4 = 
      new Thread() {
         public void run() {
            for(double i = end2; i < end3; i++){
               counter3 = 0;
               for(double j = 2; j < i; j++){
                  if((i/j)%1 == 0){
                     counter3++;
                  }
               }
               if(counter3 == 0){
                  result4++;         }
               counter3 = 0;
            }
            check[3] = true;
           
            
         }
        
      };
      
      public static void checking(){
      
     if(check[0]&&check[1]&&check[2]&&check[3]){
      
      System.out.println(result1+result2+result3+result4);
      }
      
      }

}

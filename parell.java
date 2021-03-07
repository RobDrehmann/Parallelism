
public class parell {
public static int start = 0;
public static int middle = 5;
public static int end = 10;
  public static prime first = new prime();
   public static prime second = new prime();
    public static void main(String[] args){
    thread1.start();
    thread2.start();
    
  
   }
   public static Thread thread1 = new Thread() {
    public void run() {
    first.setvalue(start, middle-1);  
    first.compute();
    System.out.print(first.result);
    }
};

public static Thread thread2 = new Thread() {
    public void run() {
    second.setvalue(middle, end);
    second.compute1();
    System.out.print(second.result);
        
    }
};
}

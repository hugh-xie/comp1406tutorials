import java.util.Scanner;

public class hellohello{

  public static void main(String[] args){
    Scanner keyboardScanner;
    keyboardScanner = new Scanner(System.in);
    int num;
    do {
      System.out.print("Enter number of times to print value: ");
      num = keyboardScanner.nextInt();

      for(int i=0; i<num; i+=1){
        System.out.println("Hello, World!");
      }
    } while(num!=100);
  }

}

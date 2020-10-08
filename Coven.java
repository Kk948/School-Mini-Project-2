import java.util.Scanner;

public class Coven
{
  public static void main(String[] args)
  {
      Scanner Scan = new Scanner(System.in);

      System.out.println("what's your name young witch");
      String name=Scan.next();

      System.out.println("Would you like to join the Coven,young witch");
      String covenResp = Scan.next();
      
      

      System.out.println("Welcome to the Coven"+ name);

  }
}

import java.util.Scanner;

public class Main
{
  public static void main(String[] args) 
  {
    boolean fullMoon = true;
    int witch = 7;
    //There are 13 witches in the coven
    if (witch == 13 && fullMoon)
    {
      System.out.println("Let's the encantation begin");
    }
    else  if(fullMoon)
    {
        System.out.println("Some witches are missing from the coven");
        System.out.println("Let's brew some potions instead");
        for (int potions=0;potions < 6 ;potions++) {
          System.out.println("The Coven made "+ potions + " potions");
  }
    }
    else
      {
        System.out.println("The meeting is canceled today");

      }
      
     //Coven coven
      Scanner Scan = new Scanner(System.in);

      System.out.println("what's your name young witch");
      String name=Scan.next();

      System.out.println("Would you like to join the Coven,young witch");
      String covenResp = Scan.next();
      
      

      System.out.println("Welcome to the Coven"+ name);


  }
  
}
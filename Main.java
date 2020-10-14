import java.util.Scanner;

public class Main
{
  public static void main(String[] args) 
  {
    boolean fullMoon = true;
    int witch = 7;
    //There are 13 witches in the coven
    //The code states if the moon is full and there are 13 witches then the encantation will begin
    if (witch == 13 && fullMoon)
    {
      System.out.println("Let's the encantation begin");
    }
    else  if(fullMoon)
    // if there is only a full moon they'll brew some potions instead
    {
        System.out.println("Some witches are missing from the coven");
        System.out.println("Let's brew some potions instead");
        //The code prints out potions til the number 6
        for (int potions=0;potions < 6 ;potions++) {
          System.out.println("The Coven made "+ potions + " potions");
  }
    }
    //lastly if it doesn't meet the requirements then the metting is cancelled
    else
      {
        System.out.println("The meeting is canceled today");

      }
      
     //Coven coven
      Scanner Scan = new Scanner(System.in);
      Scanner input= new Scanner(System.in);

      System.out.println("What's your age?");
      int age = input.nextInt();

      System.out.println("What's your name young witch ?");
      String name=Scan.next();


      System.out.println("Would you like to join the Coven,young witch? ");
      String covenResp = Scan.next();
      
      System.out.println("Welcome to the Coven! "+ name);
      System.out.println(" We hope you'll have a great time with our other " + age + " year old witches!");

  }
  
}
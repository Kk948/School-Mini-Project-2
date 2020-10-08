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
        for (int potions=0;potions < 12;potions* 2) {
          System.out.println("The Coven made "+ potions + " potions");
  }
    }
    else
      {
        System.out.println("The meeting is canceled today");

      }
  }
}
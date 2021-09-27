class Hero
{
  private String name;
  private int hp, mp;

  public String toString() {
    return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
  }
}

public class sample1
{
  public static void main(String[] args) 
  {
    Hero hero = new Hero();
    System.out.println(hero.toString());
  }
}
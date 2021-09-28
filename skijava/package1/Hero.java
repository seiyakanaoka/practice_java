public class Hero {
  private String name;
  private int hp, mp;

  public Hero() {
    name = "";
    hp = 0;
    mp = 0;
    System.out.println("フィールドを初期化しました。");
  }

  public String toString() {
    return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")" ;
  }
  public String getName() {
    return this.name;
  }
  public void setName(String n) {
    this.name = n;
    System.out.println(this.name + "を設定しました。");
  }
  public int getHp() {
    return this.hp;
  }
  public void setHp(int h) {
    this.hp = h;
    System.out.println(this.hp + "を設定しました。");
  }
  public int getMp() {
    return this.mp;
  }
  public void setMp(int m) {
    this.mp = m;
    System.out.println(this.mp + "を設定しました。");
  }
}

public class SkiJava {
  public String name;
  private static int member;

  public SkiJava(String name) {
    this.name = name;
    member++;
    System.out.println(this.name + "さんをチームに加えました！");
  }

  public static void checkMB() {
    System.out.println("現在のメンバー数は" + member + "人です!");
  }
}

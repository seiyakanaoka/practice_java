public class StrongBox<E> {
  private E item;
  private E itemCount;
  private final KeyValues keyValues;
  private E ans;

  public StrongBox(KeyValues kv) {
    this.keyValues = kv;
    System.out.println(keyValues + "の鍵を受け取りました。");
  }

  public void put(E e) {
    this.item = e;
    System.out.println(this.item + "回セットしました。");
  }

  public void oyaPut(E i) {
    this.itemCount = i;
    System.out.println("大家さんが" + this.itemCount + "という上限をセットしました。");
  }

  public E get(E a) {
    switch (this.keyValues) {
      case PADLOCK:
        System.out.println(keyValues + "の鍵は施行回数" + itemCount + "回です。照合中です...");
        if (itemCount != this.item) {
          ans = null;
        } else {
          ans = a;
        }
      case BUTTON:
        System.out.println(keyValues + "の鍵は施行回数" + itemCount + "回です。照合中です...");
        if (itemCount != this.item) {
          ans = null;
        } else {
          ans = a;
        }
      case DIAL:
        System.out.println(keyValues + "の鍵は施行回数" + itemCount + "回です。照合中です...");
        if (itemCount != this.item) {
          ans = null;
        } else {
          ans = a;
        }
      default:
        System.out.println(keyValues + "の鍵は施行回数" + itemCount + "回です。照合中です...");
        if (itemCount != this.item) {
          ans = null;
        } else {
          ans = a;
        }
    }
    return ans;
  }

  public enum KeyValues {
    PADLOCK, BUTTON, DIAL, FINGER;
  }
}

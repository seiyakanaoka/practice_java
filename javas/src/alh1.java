class sample1
{
  public static void main(String[] args)
  {
    // ーーーーーーーーーーーー 課題1-1 ーーーーーーーーーーーー >>

    System.out.println("課題1-1 ： 1から100までの整数を全て足す計算プログラムを作成します。");
    int total1 = 0;

    for(int i = 0; i <= 100; i++){
      total1 += i;
    }

    System.out.println(total1);
    System.out.println("1から100までの整数を全て足す計算プログラムを終了します。");

    // ーーーーーーーーーーーー 課題1-1 ここまで ーーーーーーーーーーーー >>

    System.out.println();

    // ーーーーーーーーーーーー 課題1-2 ーーーーーーーーーーーー >>

    System.out.println("課題1-2 ： 2から100までの偶数のみを全て足す計算プログラムを作成します。");
    int total2 = 0;

    for(int i = 2; i <= 100; i++){
      if(i % 2 == 0) {
        total2 += i;
      }
    }

    System.out.println(total2);
    System.out.println("2から100までの偶数のみを全て足す計算プログラムを終了します。");

    // ーーーーーーーーーーーー 課題1-2 ここまで ーーーーーーーーーーーー >>
  }
}
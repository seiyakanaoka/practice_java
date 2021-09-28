// import java.util.ArrayList;

// class Hero
// {
//   private String name;
//   private int hp, mp;

//   public String toString() {
//     return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
//   }
// }

// public class sample1
// {
//   public static void main(String[] args) 
//   {
//     Hero hero = new Hero();
//     System.out.println(hero.toString());
//   }
// }

// class Account {
//   String accountNo;

//   public boolean equals(Object o) {
//     if (o == this) return true;
//     if (o == null) return false;
//     if (!(o instanceof Account)) return false;
//     Account r = (Account)o;
//     if (!this.accountNo.trim().equals(r.accountNo.trim())) {
//       return false;
//     }
//     return true;
//   }
// }

// class sample1 {
//   public static void main(String[] args) {
//     Account ac = new Account();

//   }
// }

// import java.util.*;
// import java.text.SimpleDateFormat;

// class sample1 {
//   public static void main(String[] args) throws Exception {
//     SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
//     List<Book> books = new ArrayList<>();

//     Book book1 = new Book();
//     Book book2 = new Book();
//     Book book3 = new Book();

//     book1.setTitle("Java入門");
//     System.out.println("タイトルを" + book1.getTitle() + "にしました。");
//     book1.setPublishDate(f.parse("2011/10/07"));
//     System.out.println("発行日を" + book1.getPublishData() + "にしました。");
//     book1.setComment("スッキリわかる");
//     System.out.println("コメントを" + book1.getComment() + "にしました。");

//     System.out.println();

//     book2.setTitle("Python入門");
//     System.out.println("タイトルを" + book2.getTitle() + "にしました。");
//     book2.setPublishDate(f.parse("2019/06/11"));
//     System.out.println("発行日を" + book2.getPublishData() + "にしました。");
//     book2.setComment("カレーが食べたくなる");
//     System.out.println("コメントを" + book2.getComment() + "にしました。");

//     System.out.println();

//     book3.setTitle("C言語入門");
//     System.out.println("タイトルを" + book3.getTitle() + "にしました。");
//     book3.setPublishDate(f.parse("2018/06/21"));
//     System.out.println("発行日を" + book3.getPublishData() + "にしました。");
//     book3.setComment("ポインタも自由自在");
//     System.out.println("コメントを" + book3.getComment() + "にしました。");

//     System.out.println();

//     books.add(book1);
//     books.add(book2);
//     books.add(book3);

//     Collections.sort(books, new TitleComparator());

//     System.out.println(books.toString());
//   }
// }

class sample1 {
  public static void main(String[] args) {
    Hero hero = new Hero();

    hero.setName("誠也");
    hero.setHp(100);
    hero.setMp(100);

    System.out.println();

    System.out.println(hero.getName());
    System.out.println(hero.getHp());
    System.out.println(hero.getMp());

    System.out.println();

    System.out.println(hero.toString());
  }
}
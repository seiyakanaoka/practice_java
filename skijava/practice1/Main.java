// import java.util.*;
// import java.text.SimpleDateFormat;

// public class Main {
//   public static void main(String[] args) throws Exception {
//     SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");

//     Book book1 = new Book();

//     book1.setTitle("こんにちわ");
//     book1.setPublishDate(f.parse("2017/01/01"));
//     book1.setComment("こんにちわ");
//     book1.getTitle();
//     book1.getPublishDate();
//     book1.getComment();

//     Book book2 = book1.clone();

//     book1.setTitle("こんにち");
//     book1.setPublishDate(f.parse("2017/01/11"));
//     book1.setComment("こんにち");
//     book1.getTitle();
//     book1.getPublishDate();
//     book1.getComment();

//     book2.getTitle();
//     book2.getPublishDate();
//     book2.getComment();

//     System.out.println(book1.toString());
//     System.out.println(book2.toString());
//   }
// }

public class Main {
  public static void main(String[] args) {
    Bank b1 = new Bank();
    Bank b2 = new Bank();

    b1.name = "ミナト";
    b1.adress = "東京都";
    b2.name = "ミナト";
    b2.adress = "東京都";
    System.out.println(b1.equals(b2));

    b2.adress = "埼玉県";
    System.out.println(b1.equals(b2));
  }
}

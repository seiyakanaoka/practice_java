import java.util.*;

public class Book implements Comparable<Book>, Cloneable {
  private String title;
  private Date publishDate;
  private String comment;

  public String toString() {
    return "好きな本のタイトルは" + this.title + "で、発効日は" + this.publishDate + "で、コメントは" + this.comment + "です。";
  }

  public boolean equals(Object o) {
    if (o == this) return true;
    if (o == null) return false;
    if (!(o instanceof Book)) return false;
    Book r = (Book)o;
    if (!this.title.trim().equals(r.title.trim())) {
      return false;
    }
    if (!this.comment.trim().equals(r.comment.trim())) {
      return false;
    }
    if (!this.publishDate.equals(r.publishDate)) {
      return false;
    }
    return true;
  }

  public int hashCode() {
    return Objects.hash(this.title, this.publishDate, this.comment);
  }

  public int compareTo(Book book) {
    return this.publishDate.compareTo(book.publishDate);
  }

  public Book clone() {
    Book result = new Book();
    result.title = this.title;
    result.publishDate = (Date)this.publishDate.clone();
    result.comment = this.comment;
    return result;
  }

  public void setTitle(String t) {
    this.title = t;
  }
  public void setPublishDate(Date d) {
    this.publishDate = d;
  }
  public void setComment(String c) {
    this.comment = c;
  }
  public String getTitle() {
    System.out.println(this.title + "をタイトルに設定しています。");
    return this.title;
  }
  public Date getPublishDate() {
    System.out.println(this.publishDate+ "を発行日に設定しています。");
    return this.publishDate;
  }
  public String getComment() {
    System.out.println(this.comment + "をコメントに設定しています。");
    return this.comment;
  }
}
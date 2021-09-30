// public class Account implements Comparable<Account> {
//   String accountNo;
//   int number;
//   int balance;

//   public Account() {
//     accountNo = "";
//     number = 0;
//     balance = 0;
//     System.out.println("「Accountクラス」の全フィールドを初期化しました。");
//   }

//   public String toString() {
//     return "【アカウントNo : " + this.accountNo + " | 口座番号 : " + this.number + " | 口座残高 : " + this.balance + "】";
//   }

//   public boolean equals(Object o) {
//     if (o == this)
//       return true;
//     if (o == null)
//       return false;
//     if (!(o instanceof Account))
//       return false;
//     Account r = (Account) o;
//     if (!this.accountNo.trim().equals(r.accountNo.trim())) {
//       return false;
//     }
//     return true;
//   }

//   public int compareTo(Account obj) {
//     if (this.number < obj.number) {
//       return -1;
//     }
//     if (this.number > obj.number) {
//       return 1;
//     }
//     return 0;
//   }

//   public String getAccountNo() {
//     return this.accountNo;
//   }

//   public void setAccountNo(String a) {
//     this.accountNo = a;
//     System.out.println(this.accountNo + "を設定しました。");
//   }

//   public int getNumber() {
//     return this.number;
//   }

//   public void setNumber(int n) {
//     this.number = n;
//     System.out.println(this.number + "を設定しました。");
//   }

//   public int getBalance() {
//     return this.balance;
//   }

//   public void setBalance(int b) {
//     this.balance = b;
//     System.out.println(this.balance + "を設定しました。");
//   }
// }

public class Account {
  private String accountNo;
  private int balance;
  private AccountType accountType;

  public Account() {
    accountNo = "";
    balance = 0;
    System.out.println("「Accountクラス」の全フィールドを初期化しました。");
  }

  public Account(String aNo, AccountType aType) {
    accountNo = aNo;
    accountType = aType;
    System.out.println("【口座番号 : " + accountNo + "】 【口座種別 : " + accountType + "】に設定致します。");
  }
  public enum AccountType {
    FUTSU, TOUZA, TEIKI;
  }

  public String toString() {
    return "【アカウントNo : " + this.accountNo + " | 口座残高 : " + this.balance + "】";
  }

  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (o == null)
      return false;
    if (!(o instanceof Account))
      return false;
    Account r = (Account) o;
    if (!this.accountNo.trim().equals(r.accountNo.trim())) {
      return false;
    }
    return true;
  }

  public String getAccountNo() {
    return this.accountNo;
  }

  public void setAccountNo(String a) {
    this.accountNo = a;
    System.out.println(this.accountNo + "を設定しました。");
  }

  public int getBalance() {
    return this.balance;
  }

  public void setBalance(int b) {
    this.balance = b;
    System.out.println(this.balance + "を設定しました。");
  }
}


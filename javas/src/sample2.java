// class sample2
// {
//   public static void main(String[] args)
//   {
//     System.out.println("こんにちわ");
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int i = 1;
//     String str = "*";

//     while(i <= 5) {
//       System.out.println(str);
//       str += "*";
//       i += 1;
//     }
//   }
// }

// 練習問題　復習

// class sample2
// {
//   public static void main(String[] args)
//   {
//     System.out.println("1~10までの偶数を出力します");

//     for(int i = 2; i <= 10; i += 2) {
//       System.out.println(i);
//     }
//   }
// }

// import java.io.*;

// class sample2
// {
//   public static void main(String[] args)  throws IOException
//   {
//     System.out.println("テストの点数を入力してください（0で終了）");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();
//     String str2 = br.readLine();
//     String str3 = br.readLine();
//     String str4 = br.readLine();
//     String str5 = br.readLine();
//     String str6 = br.readLine();

//     int num1 = Integer.parseInt(str1);
//     int num2 = Integer.parseInt(str2);
//     int num3 = Integer.parseInt(str3);
//     int num4 = Integer.parseInt(str4);
//     int num5 = Integer.parseInt(str5);

//     System.out.println("テストの合計点は" + (num1 + num2 + num3 + num4 + num5) + "です");

//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int i = 1;
//     String s = "*";
//     while(i < 6) {
//       System.out.println(s);
//       s += "*";
//       i += 1;
//     }
//   }
// }

import java.io.*;

class sample2
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("2以上の整数を入力してください");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int i = Integer.parseInt(str);
    if(i < 2 ) {
      System.out.println("2以上の整数を入力してください");
    }

    for(int num = 2; num < i; num++) {
      if(i % num == 0 || i % Math.sqrt(i) == 0) {
        System.out.println(i + "は素数ではありません");
        return;
      }
    }

    System.out.println(i + "は素数です");
  }
}


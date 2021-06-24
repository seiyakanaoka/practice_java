// class Sample1
// {
//   public static void main(String[] args)
//   {
//     System.out.println("ようこそJavaへ！");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     System.out.println("ようこそJavaへ！");
//     System.out.println("Javaをはじめましょう！");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     System.out.print("ようこそJavaへ！");
//     System.out.print("Javaをはじめましょう！");
//   }
// }

// class Sample3
// {
//   public static void main(String[] args)
//   {
//     System.out.println("A");
//     System.out.println("ようこそJavaへ！");
//     System.out.println(123);
//   }
// }

// class Sample3
// {
//   public static void main(String[] args)
//   {
//     System.out.println("円記号を\n表示します。:");
//     System.out.println("アポストロフィを表示します。");
//   }
// }

// class Sample3
// {
//   public static void main(String[] args)
//   {
//     System.out.println("8進数101の文字は\101です。");
//     System.out.println("16進数0061の文字は\u0061です。");
//   }
// }

// class Sample3
// {
//   public static void main(String[] args)
//   {
//     System.out.println(10);
//     System.out.println(010);
//     System.out.println(0x10);
//     System.out.println(0xF);
//   }
// }

// class Sample3
// {
//   public static void main(String[] args)
//   {
//     System.out.println(06);
//     System.out.println(0x6);
//     System.out.println(024);
//     System.out.println(0x14);
//     System.out.println(015);
//     System.out.println(0xd);
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     int num1, num2;
    
//     num1 = 3;

//     System.out.println("変数の値は" + num1 + "です。");

//     num2 = num1;

//     System.out.println("変数numの値を変更しました");
//     System.out.println("変数numの新しい値は" + num2 + "です。");
//   }
// }

import java.io.*;

class Sample1
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("文字列を入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    //入力された文字列を表すstrを利用する

    System.out.println(str + "が入力されました。");
  }
}


























































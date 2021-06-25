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

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("文字列を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     //入力された文字列を表すstrを利用する

//     System.out.println(str + "が入力されました。");
//   }
// }

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("整数を入力してください");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();

//     int num = Integer.parseInt(str);

//     System.out.println(num + "が入力されました。");
//   }
// }

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("整数を2つ入力してください");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();
//     String str2 = br.readLine();

//     int num1 = Integer.parseInt(str1);
//     int num2 = Integer.parseInt(str2);

//     System.out.println("最初に" + num1 + "が入力されました。");
//     System.out.println("次に" + num2 + "が入力されました。");
//   }
// }

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     System.out.println("身長と体重を入力してください。");

//     String str1 = br.readLine();
//     String str2 = br.readLine();

//     Double num1 = Double.parseDouble(str1);
//     Double num2 = Double.parseDouble(str2);

//     System.out.println("身長は" + num1 + "センチです。");
//     System.out.println("体重は" + num2 + "キロです。");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     System.out.println("1+2は" + (1 + 2) + "です。");
//     System.out.println("3*4は" + (3 * 4) + "です。");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     int num1 = 2;
//     int num2 = 3;
//     int sum = num1+num2;

//     System.out.println("変数num1の値は" + num1 + "です。");
//     System.out.println("変数num2の値は" + num2 + "です。");
//     System.out.println("num1+num2の値は" + sum + "です。");

//     num1 = num1 + 1;

//     System.out.println("変数num1の値に1を足すと" + num1 + "です。");
//   }
// }

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("整数を2つ入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//       String str1 = br.readLine();
//       String str2 = br.readLine();

//       int num1 = Integer.parseInt(str1);
//       int num2 = Integer.parseInt(str2);

//       System.out.println("足し算の結果は" + (num1 + num2) + "です。");
//   }
// }

// 四則演算---------------------------------------->>>>

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     int num1 = 10;
//     int num2 = 5;

//     System.out.println("num1とnum2にいろいろな演算を行います。");

//     System.out.println("num1+num2は" + (num1+num2) + "です。");
//     System.out.println("num1-num2は" + (num1-num2) + "です。");
//     System.out.println("num1*num2は" + (num1*num2) + "です。");
//     System.out.println("num1/num2は" + (num1/num2) + "です。");
//     System.out.println("num1%num2は" + (num1%num2) + "です。");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     int a = 0;
//     int b = 0;

//     b = a++;

//     System.out.println("代入後にインクリメントしたのでbの値は" + b + "です。");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     int a = 0;
//     int b = 0;

//     b = ++a;

//     System.out.println("代入前にインクリメントしたのでbの値は" + b + "です。");
//   }
// }

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("整数を3つ入力してください");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();
//     String str2 = br.readLine();
//     String str3 = br.readLine();

//     int sum = 0;
//     sum += Integer.parseInt(str1);
//     sum += Integer.parseInt(str2);
//     sum += Integer.parseInt(str3);

//     System.out.println("3つの数の合計は" + sum + "です。");
//   }
// }


















































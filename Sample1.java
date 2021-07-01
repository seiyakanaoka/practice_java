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

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     System.out.println("1+2は" + 1 + 2 + "です。");
//     System.out.println("3*4は" + 3 * 4 + "です。");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     int inum = 160;
//     System.out.println("身長は" + inum + "センチです。");

//     System.out.println("double型も変数に代入します。");
//     double dnum = inum;

//     System.out.println("身長は" + dnum + "センチです。");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     double dnum = 160.5;
//     System.out.println("身長は" + dnum + "センチです。");

//     System.out.println("int型の変数に代入します。");
//     int inum = (int)dnum;

//     System.out.println("身長は" + inum + "センチです。");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     int d = 2;
//     double pi = 3.14;

//     System.out.println("直径が" + d + "センチの円の");
//     System.out.println("円周は" + (d * pi) + "センチです。");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     int num1 = 5;
//     int num2 = 4;

//     double div = num1 / (double)num2;

//     System.out.println("5/4は" + div + "です。");
//   }
// }

// class Sample1
// {
//   public static void main(String[] args)
//   {
//     System.out.println(0-4);
//     System.out.println(3.14*2);
//     System.out.println(5/3);
//     System.out.println(30%7);
//     System.out.println((7+32)/5);
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

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("正方形の辺の長さを入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();

//     int num = 0;

//     num = Integer.parseInt(str);

//     System.out.println("正方形の面積は" + (num ** 2) + "です。");
//   }
// }

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("正三角形の高さと底辺を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();
//     String str2 = br.readLine();

//     double num1 = 0;
//     double num2 = 0;
//     int num3 = 2;

//     num1 = Integer.parseInt(str1);
//     num2 = Integer.parseInt(str2);

//     System.out.println("正方形の面積は" + ((num1 * num2) / num3) + "です。");
//   }
// }

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("科目1〜5の点数を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();
//     String str2 = br.readLine();
//     String str3 = br.readLine();
//     String str4 = br.readLine();
//     String str5 = br.readLine();

//     int num1 = 0;
//     int num2 = 0;
//     int num3 = 0;
//     int num4 = 0;
//     int num5 = 0;
//     int num6 = 5;

//     num1 = Integer.parseInt(str1);
//     num2 = Integer.parseInt(str2);
//     num3 = Integer.parseInt(str3);
//     num4 = Integer.parseInt(str4);
//     num5 = Integer.parseInt(str5);

//     System.out.println("5科目の合計点は" + (num1 + num2 + num3 + num4 + num5) + "です。");
//     System.out.println("5科目の平均点は" + (((double)num1 + num2 + num3 + num4 + num5) / num6) + "です。");
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

//       String str = br.readLine();
//       int res = Integer.parseInt(str);

//       if(res == 1) {
//         System.out.println("1が入力されました。");
//       }
//       else {
//         System.out.println("1以外が入力されました。");
//       }
        

//       System.out.println("処理を終了します。");
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

//       String str = br.readLine();
//       int res = Integer.parseInt(str);

//       if(res == 1) {
//         System.out.println("1が入力されました。");
//       }
//       else if(res == 2) {
//         System.out.println("2が入力されました。");
//       }
//       else {
//         System.out.println("1か2を入力してください。");
//       }        

//       System.out.println("処理を終了します。");
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
//     int res = Integer.parseInt(str);

//     switch(res) {
//       case 1:
//         System.out.println("1が入力されました。");
//         break;
//       case 2:
//         System.out.println("2が入力されました。");
//         break;
//       default:
//         System.out.println("1か2を入力してください。");
//         break;
//     }
//   }
// }

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("aかbを入力してください");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));
    
//     String str = br.readLine();
//     char res = str.charAt(0);

//     switch(res) {
//       case 'a':
//         System.out.println("aが入力されました。");
//         break;
//       case 'b':
//         System.out.println("bが入力されました。");
//         break;
//       default:
//         System.out.println("aかbを入力して下さい。");
//         break;
//     }
//   }
// }

// import java.io.*;

// class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("あなたは男性ですか？");
//     System.out.println("YまたはNを入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));
    
//     String str = br.readLine();
//     char res = str.charAt(0);

//     if(res == 'Y' || res == 'y') {
//       System.out.println("あなたは男性ですね。");
//     }
//     else if (res == 'N' || res == 'n') {
//       System.out.println("あなたは女性ですね。");
//     }
//     else {
//       System.out.println("YまたはNを入力してください。");
//     }
//   }
// }

// import java.io.*;

// public class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("何番目のコースにしますか？");
//     System.out.println("整数を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int res = Integer.parseInt(str);

//     char ans;
//     if(res == 1)
//       ans = 'A';
//     else
//       ans = 'B';

//     System.out.println(ans + "コースを選択しました。");
//   }
// }

// import java.io.*;

// public class Sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("何番目のコースにしますか？");
//     System.out.println("整数を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int res = Integer.parseInt(str);

//     char ans = (res == 1) ? 'A' : 'B';

//     System.out.println(ans + "コースを選択しました。");
//   }
// }











































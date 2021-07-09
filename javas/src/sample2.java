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

// import java.io.*;

// class sample2
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("2以上の整数を入力してください");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int i = Integer.parseInt(str);
//     if(i < 2 ) {
//       System.out.println("2以上の整数を入力してください");
//     }

//     for(int num = 2; num < i; num++) {
//       if(i % num == 0 || i % Math.sqrt(i) == 0) {
//         System.out.println(i + "は素数ではありません");
//         return;
//       }
//     }

//     System.out.println(i + "は素数です");
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int[] test;
//     test = new int[5];
//     test[0] = 80;
//     test[1] = 60;
//     test[2] = 22;
//     test[3] = 50;
//     test[4] = 75;

//     for(int i = 0; i < 5; i++) {
//       System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
//     }
//   }
// }

// import java.io.*;

// class sample2
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("テストの受験者数を入力してください。");
//     BufferedReader br =

//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int num = Integer.parseInt(str);

//     int[] test;
//     test = new int[num];

//     System.out.println("人数分の点数を入力してください。");

//     for(int i = 0; i < num; i++) {
//       str = br.readLine();
//       int tmp = Integer.parseInt(str);
//       test[i] = tmp;
//     }

//     for(int i = 0; i < num; i++) {
//       System.out.println((i + 1) + "番目の点数は" + test[i] + "です。");
//     }
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int[] test = {80, 60, 22, 50, 75};

//     for(int i = 0; i < 5; i++) {
//       System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
//     }
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int[] test1;
//     test1 = new int[3];

//     System.out.println("test1を宣言しました。");
//     System.out.println("配列要素を確保しました。");

//     test1[0] = 80;
//     test1[1] = 60;
//     test1[2] = 22;

//     int[] test2;
//     System.out.println("test2を宣言しました。");

//     test2 = test1;
//     System.out.println("test2にtest1をしました。");

//     for(int i = 0; i < 3; i++) {
//       System.out.println("test1がさす" + (i + 1) + "番目の人の点数は" + test1[i] + "です。");
//     }

//     for(int i = 0; i < 3; i++) {
//       System.out.println("test2がさす" + (i + 1) + "番目の人の点数は" + test2[i] + "です。");
//     }

//     test1[2] = 100;
//     System.out.println("test1がさす3番目の人の点数を変更します。");

//     for(int i = 0; i < 3; i++) {
//       System.out.println("test1がさす" + (i + 1) + "番目の人の点数は" + test1[i] + "です。");
//     }

//     for(int i = 0; i < 3; i++) {
//       System.out.println("test2がさす" + (i + 1) + "番目の人の点数は" + test2[i] + "です。");
//     }
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int[] test = {80, 60, 22, 50 ,75};

//     for(int i = 0; i < test.length; i++) {
//       System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
//     }

//     System.out.println("テストの受験者は" + test.length + "人です。");
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int[] test = {80, 60, 22, 50 ,75};

//     for(int i: test) {
//       System.out.println((i + 1) + "番目の人の点数は" + i + "です。");
//     }

//     System.out.println("テストの受験者は" + test.length + "人です。");
//   }
// }

// import java.io.*;

// class sample2
// {
//   public static void main(String[] args) throws IOException
//   {
//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     int[] test = new int[5];
//     System.out.println(test.length + "人の点数を入力してください");

//     for(int i = 0; i < test.length; i++) {
//       String str = br.readLine();
//       test[i] = Integer.parseInt(str);
//     }

//     for(int s = 0; s < test.length; s++) {
//       for(int t = s + 1; t < test.length; t++) {
//         if(test[t] > test[s]) {
//           int tmp = test[t];
//           test[t] = test[s];
//           test[s] = tmp;
//         }
//       }
//     }

//     for(int j = 0; j < test.length; j++) {
//       System.out.println((j + 1) + "番目の人の点数は" + test[j] + "です。");
//     }
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int[][] test;
//     test = new int[2][5];

//     test[0][0] = 80;
//     test[0][1] = 60;
//     test[0][2] = 22;
//     test[0][3] = 50;
//     test[0][4] = 75;
//     test[1][0] = 90;
//     test[1][1] = 55;
//     test[1][2] = 68;
//     test[1][3] = 72;
//     test[1][4] = 58;

//     for(int i = 0; i < 5; i++) {
//       System.out.println((i + 1) + "番目の人の国語の点数は" + test[0][i] + "です。");
//       System.out.println((i + 1) + "番目の人の算数の点数は" + test[1][i] + "です。");
//     }
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int[][] test = {{80, 60, 22, 50}, {90, 55, 68, 72}, {33, 75, 63}};

//     for(int i = 0; i < test.length; i++) {
//       System.out.println((i + 1) + "番目の配列の要素の長さは" + test[i].length + "です。");
//     }
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int[] test;
//     test = new int[6];

//     test[0] = 80;
//     test[1] = 60;
//     test[2] = 22;
//     test[3] = 50;
//     test[4] = 75;
//     test[5] = 100;

//     for(int i = 0; i < 6; i++) {
//       System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
//     }
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     int[] test = {80, 60, 22, 50, 75, 100};

//     for(int i = 0; i < 6; i++) {
//       System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
//     }
//   }
// }

// import java.io.*;

// class sample2
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("5人のテストのテストを入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));
    
//     int[] test = new int[5];

//     for(int i = 0; i < test.length; i++) {
//       String str = br.readLine();
//       test[i] = Integer.parseInt(str);
//     }

//     for(int i = 0; i < test.length; i++) {
//       System.out.println((i + 1) + "番目の人の点数は" + test[i] + "です。");
//     }

//     for(int s = 0; s < test.length; s++) {
//       for(int t = 1; t < test.length; t++) {
//         if(test[t] > test[s]) {
//           int tmp = test[s];
//           test[s] = test[t];
//           test[t] = tmp;
//         }
//       }
//     }
//     System.out.println("最高点は" + test[0] + "点です。");
//   }
// }

class Car
{
  int num;
  double gas;

  void show()
  {
    System.out.println("車の" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }

  void showCar()
  {
    System.out.println("これから車の情報を表示します。");
    show();
  }
}

class sample1
{
  public static void main(String[] args)
  {
    Car car1;
    car1 = new Car();

    car1.num = 1234;
    car1.gas = 20.5;

    car1.showCar();
  }
}

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

// class Car
// {
//   int num;
//   double gas;

//   void show()
//   {
//     System.out.println("車の" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }

//   void showCar()
//   {
//     System.out.println("これから車の情報を表示します。");
//     show();
//   }

//   void setNum(int n)
//   {
//     num = n;
//     System.out.println("車のナンバーを" + num + "にしました。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1;
//     car1 = new Car();

//     car1.num = 1234;
//     car1.gas = 20.5;

//     car1.showCar();
//   }
// }

// class Car
// {
//   int num;
//   double gas;

//   void setNum(int n)
//   {
//     num = n;
//     System.out.println("車のナンバーを" + num + "にしました。");
//   }

//   void setGas(double g)
//   {
//     gas = g;
//     System.out.println("ガソリン量を" + gas + "にしました。");
//   }

//   void show()
//   {
//     System.out.println("車の" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1;
//     car1 = new Car();

//     car1.setNum(1234);
//     car1.setGas(20.5);
//   }
// }

// class Car
// {
//   int num;
//   double gas;

//   void setNum(int n)
//   {
//     num = n;
//     System.out.println("車のナンバーを" + num + "にしました。");
//   }

//   void setGas(double g)
//   {
//     gas = g;
//     System.out.println("ガソリン量を" + gas + "にしました。");
//   }

//   void show()
//   {
//     System.out.println("車の" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1;
//     car1 = new Car();

//     int number = 1234;
//     double gasoline = 20.5;

//     car1.setNum(number);
//     car1.setGas(gasoline);
//   }
// }

// class Car {
//   int num;
//   double gas;

//   void setNumGas(int n, double g) {
//     num = n;
//     gas = g;
//     System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }

//   void show() {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1 {
//   public static void main(String[] args) {
//     Car car1 = new Car();

//     int number = 1234;
//     double gasoline = 20.5;

//     car1.setNumGas(number, gasoline);
//     car1.show();
//     // ⬆︎なぜこれで値がでくるのか？？？？？
//     // setNumGasのメソッドで、先にnumとgasの値をcar1に代入しているから
//     // ちなみに、先にshowを使うと「0」と判断され、setNumGasの後に記述するとちゃんと出てくる
//   }
// }


// class Car {
//   int num;
//   double gas;

//   int getNum()
//   {
//     System.out.println("ナンバーを調べました。");
//     return num;
//   }

//   double getGas()
//   {
//     System.out.println("ガソリン量を調べました。");
//     return gas;
//   }

//   void setNumGas(int n, double g)
//   {
//     num = n;
//     gas = g;

//     System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }

//   void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + num + "です。");
//   }
// }

// class sample1 {
//   public static void main(String[] args) {
//     Car car1 = new Car();

//     car1.setNumGas(1234, 20.5);

//     int number = car1.getNum();
//     double gasoline = car1.getGas();

//     System.out.println("サンプルから車を調べたところ");
//     System.out.println("ナンバーは" + number + "ガソリン量は" + gasoline + "でした。");
//   }
// }

// class Car
// {
//   int num;
//   double gas;

//   void setNumGas(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("車のナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }

//   void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + num + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1 = new Car();
//     car1.setNumGas(1234, 20.5);
//     car1.show();
//   }
// }

// class MyPoint
// {
//   int x;
//   int y;

//   void setX(int px)
//   {
//     System.out.println("X座標を設定しました。");
//     x = px;
//   }

//   void setY(int py)
//   {
//     System.out.println("Y座標を設定しました。");
//     y = py;
//   }

//   int getX()
//   {
//     System.out.println("X座標を取得しました。");
//     return x;
//   }

//   int getY()
//   {
//     System.out.println("Y座標を取得しました。");
//     return y;
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     MyPoint point = new MyPoint();

//     point.setX(10);
//     point.setY(15);

//     int xAxis = point.getX();
//     int yAxis = point.getY();

//     System.out.println("X,Y座標は、Xが" + xAxis + "Yが" + yAxis + "です。");
//   }
// }

// class Car
// {
//   private int num;
//   private double gas;

//   public void setNumGas(int n, double g)
//   {
//     if(g > 0 && g < 1000) {
//       num = n;
//       gas = g;
//       System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//     } else {
//       System.out.println(g + "は正しいガソリン量ではありません。");
//       System.out.println("ガソリン量を変更できませんでした。");
//     }
//   }

//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1 = new Car();

//     car1.setNumGas(1234, 20.5);
//     car1.show();

//     System.out.println("\n");

//     System.out.println("正しくないガソリン量(-10.0)を指定してみます。");

//     car1.setNumGas(1234, -10.0);
//     car1.show();
//   }
// }

// class Car
// {
//   private int num;
//   private double gas;

//   public void setCar(int n)
//   {
//     num = n;
//     System.out.println("ナンバーを" + num + "にしました。");
//   }

//   public void setCar(double g)
//   {
//     gas = g;
//     System.out.println("ガソリン量を" + gas + "にしました。");
//   }

//   public void setCar(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }

//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1 = new Car();

//     car1.setCar(1234, 20.5);
//     car1.show();

//     System.out.println("\n");

//     System.out.println("車のナンバーだけ変更します。");
//     car1.setCar(2345);
//     car1.show();

//     System.out.println("\n");

//     System.out.println("ガソリン量だけ変更します。");
//     car1.setCar(30.5);
//     car1.show();
//   }
// }

// class Car
// {
//   private int num;
//   private double gas;

//   public Car()
//   {
//     num = 0;
//     gas = 0.0;
//     System.out.println("車を作成しました。");
//   }

//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1 = new Car();

//     car1.show();
//   }
// }

// class Car
// {
//   private int num;
//   private double gas;

//   public Car()
//   {
//     num = 0;
//     gas = 0.0;
//     System.out.println("車を作成しました。");
//   }
//   public Car(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
//   }
//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1 = new Car();
//     car1.show();

//     System.out.println("");

//     Car car2 = new Car(1234, 20.5);
//     car2.show();
//   }
// }

// class Car
// {
//   private int num;
//   private double gas;

//   public Car()
//   {
//     num = 0;
//     gas = 0.0;
//     System.out.println("車を作成しました。");
//   }
//   public Car(int n, double g)
//   {
//     this();
//     num = n;
//     gas = g;
//     System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
//   }
//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1 = new Car();
//     car1.show();

//     System.out.println("");

//     Car car2 = new Car(1234, 20.5);
//     car2.show();
//   }
// }

// class Car
// {
//   private int num;
//   private double gas;

//   private Car()
//   {
//     num = 0;
//     gas = 0.0;
//     System.out.println("車を作成しました。");
//   }
//   public Car(int n, double g)
//   {
//     this();
//     num = n;
//     gas = g;
//     System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
//   }
//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     // Car car1 = new Car();
//     // car1.show();

//     System.out.println("");

//     Car car2 = new Car(1234, 20.5);
//     car2.show();
//   }
// }

// class Car
// {
//   private int num;
//   private double gas;

//   public Car()
//   {
//     num = 0;
//     gas = 0.0;
//     System.out.println("車を作成しました。");
//   }
//   public void setCar(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "の車を作成しました。");
//   }
//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1 = new Car();
//     car1.setCar(1234, 20.5);
//     car1.show();

//     System.out.println("");

//     Car car2 = new Car();
//     car2.setCar(4567, 30.5);
//     car2.show();
//   }
// }

// class Car
// {
//   public static int sum = 0;

//   private int num;
//   private double gas;

//   public Car()
//   {
//     num = 0;
//     gas = 0.0;
//     sum++;
//     System.out.println("車を作成しました。");
//   }

//   public void setCar(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "の車を作成しました。");
//   }

//   public static void showSum()
//   {
//     System.out.println("車は全部で" + sum + "台あります。");
//   }

//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car.showSum();

//     Car car1 = new Car();
//     car1.setCar(1234, 20.5);

//     Car.showSum();

//     System.out.println("");

//     Car car2 = new Car();
//     car2.setCar(4567, 30.5);
//     Car.showSum();
//   }
// }

// class Car
// {
//   public static int sum = 0;

//   private int num;
//   private double gas;

//   public Car()
//   {
//     num = 0;
//     gas = 0.0;
//     sum++;
//     System.out.println("車を作成しました。");
//   }

//   public void setCar(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "の車を作成しました。");
//   }

//   public static void showSum()
//   {
//     System.out.println("車は全部で" + sum + "台あります。");
//   }

//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car.showSum();

//     Car car1 = new Car();
//     car1.setCar(1234, 20.5);

//     Car.showSum();

//     System.out.println("");

//     Car car2 = new Car();
//     car2.setCar(4567, 30.5);
//     Car.showSum();
//   }
// }

class MyPoint
{
  private int x;
  private int y;

  public static int sum1 = 0;
  public static int sum2 = 0;

  public MyPoint()
  {
    System.out.println("値を初期化しました。");
    x = 0;
    y = 0;
    sum1 = x;
    sum2 = y;
  }

  public MyPoint(int px, int py)
  {
    if(px >= 0 && px <= 100) {
      x = px;
    }
    if(py >= 0 && py <= 100) {
      y = py;
    }

    sum1 = x;
    sum2 = y;

    System.out.println("それぞれ初期値を代入しました");
  }

  public void setX(int px){
    if(0 <= px && px <= 100) {
      x = px;
    System.out.println("X座標を設定しました。");
    } else {
    System.out.println("0~100の数値にしてください。");
    }

    sum1 = x;
  }

  public void setY(int py){
    if(py >= 0 && py <= 100) {
      y = py;
    System.out.println("Y座標を設定しました。");
    } else {
    System.out.println("0~100の数値にしてください。");
    }

    sum2 = y;
  }

  public int getX()
  {
    System.out.println("X座標を取得しました。");
    return x;
  }

  public int getY()
  {
    System.out.println("Y座標を取得しました。");
    return y;
  }

  public static void showSum()
  {
    System.out.println("現在の座標は、Xが" + sum1 + "とYが" + sum2 + "です");
  }
}

class sample1
{
  public static void main(String[] args)
  {
    MyPoint point1 = new MyPoint();
    MyPoint.showSum();

    System.out.println("");

    point1.setX(10);
    point1.setY(15);
    MyPoint.showSum();

    System.out.println("");

    point1.getX();
    point1.getY();
    MyPoint.showSum();

    System.out.println("");

    MyPoint point2 = new MyPoint(1, 3);
    MyPoint.showSum();

    System.out.println("");

    point2.setX(10);
    point2.setY(15);
    MyPoint.showSum();

    System.out.println("");

    point2.getX();
    point2.getY();
    MyPoint.showSum();
  }
}




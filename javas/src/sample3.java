// import java.nio.file.NotLinkException;

// class sample1
// {
//   public static void main(String arg[])
//   {
//     String str = "Hello";

//     char ch1 = str.charAt(0);
//     char ch2 = str.charAt(1);

//     int len = str.length();

//     System.out.println(str + "の1番目の文字は" + ch1 + "です。");
//     System.out.println(str + "の2番目の文字は" + ch2 + "です。");
//     System.out.println(str + "の長さは" + len + "です。");
//   }
// }

// import java.io.*;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("英字を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();

//     String stru = str.toUpperCase();
//     String strl = str.toLowerCase();

//     System.out.println("大文字に変換すると" + stru + "です。");
//     System.out.println("小文字に変換すると" + strl + "です。");
//   }
// }

// import java.io.*;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("文字列を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();

//     System.out.println("検索文字を入力してください。");

//     String str2 = br.readLine();
//     char ch = str2.charAt(0);

//     int num = str1.indexOf(ch);

//     if(num != -1) {
//       System.out.println(str1 + "の" + (num + 1) + "番目に「" + ch +"」が見つかりました。");
//     } else {
//       System.out.println(str1 + "に「" + ch + "」はありません。");
//     }
//   }
// }

// import java.io.*;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("FizzBuzzゲームを開始します。");
//     System.out.println("好きな数字を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int num = Integer.parseInt(str);

//     if(num % 3 == 0 && num % 5 == 0) {
//       System.out.println("FizzBuzz!");
//     } else if(num % 3 == 0) {
//       System.out.println("Fizz!");
//     } else if(num % 5 == 0) {
//       System.out.println("Buzz!");
//     } else {
//       System.out.println(num);
//     }

//     System.out.println("FizzBuzzゲームを終了します。");
//   }
// }

// import java.io.*;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("文字列を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();

//     System.out.println("追加する文字列を入力してください。");

//     String str2 = br.readLine();

//     StringBuffer sb = new StringBuffer(str1);
//     sb.append(str2);

//     System.out.println(str1 + "に" + str2 + "を追加すると" + sb + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {

//     int num1 = 10;
//     double num2 = 10.0;
//     System.out.println(num1 + (int)num2);
//   }
// }

// import java.io.*;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("整数を二つ入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();
//     String str2 = br.readLine();

//     int num1 = Integer.parseInt(str1);
//     int num2 = Integer.parseInt(str2);

//     int ans = Math.max(num1, num2);

//     System.out.println(num1 + "と" + num2 + "のうち大きい方は" + ans + "です。");
//   }
// }


// import java.io.*;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("整数を二つ入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     int ans = (int) (Math.random() * 6) + 1;

//     System.out.println( ans);
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
//     Car car1;
//     System.out.println("car1を宣言しました。");
//     car1 = new Car();
//     car1.setCar(1234, 20.5);

//     Car car2;
//     System.out.println("car2を宣言しました。");

//     car2 = car1;
//     System.out.println("car2にcar1を代入しました。");

//     System.out.println("car1がさす");
//     car1.show();
//     System.out.println("car2がさす");
//     car2.show();

//     System.out.println("car1がさす車に変更を加えます。");
//     car1.setCar(2345, 30.5);

//     System.out.println("car1がさす");
//     car1.show();
//     System.out.println("car2がさす");
//     car2.show();
//   }
// }

// import java.io.*;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("FizzBuzzゲーム開始。好きな数字を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));
    
//     String str = br.readLine();

//     int num = Integer.parseInt(str);

//     if(num % 3 == 0 && num % 15 == 0) {
//       System.out.println("FizzBuzz");
//     } else if(num % 3 == 0) {
//       System.out.println("Fizz");
//     } else if(num % 5 == 0) {
//       System.out.println("Buzz");
//     } else {
//       System.out.println(num);
//     }

//     System.out.println("ゲーム終了");
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
//     Car car1;
//     System.out.println("car1を宣言しました。");
//     car1 = new Car();
//     car1.setCar(1234, 20.5);

//     Car car2;
//     System.out.println("car2をしました。");

//     car2 = car1;
//     System.out.println("car2にcar1を代入しました。");

//     System.out.println("car1がさす");
//     car1.show();
//     System.out.println("car2がさす");
//     car2.show();

//     System.out.println("car1がさす車に変更を加えます。");
//     car1.setCar(2345, 30.5);

//     System.out.println("car1がさす");
//     car1.show();
//     System.out.println("car2がさす");
//     car2.show();
//   }
// }

// class Car
// {
//   private int num;
//   private double gas;
//   private String name;

//   public Car()
//   {
//     num = 0;
//     gas = 0.0;
//     name = "名無し";
//     System.out.println("車を作成しました。");
//   }

//   public void setCar(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }

//   public void setName(String nm)
//   {
//     name = nm;
//     System.out.println("名前を" + name + "にしました。");
//   }

//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//     System.out.println("名前は" + name + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1;
//     car1 = new Car();

//     car1.show();

//     int number = 1234;
//     double gasoline = 20.5;
//     String str = "1号車";

//     car1.setCar(number, gasoline);
//     car1.setName(str);

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
//     Car[] cars;
//     cars = new Car[3];

//     for(int i = 0; i < cars.length; i++) {
//       cars[i] = new Car();
//     }

//     cars[0].setCar(1234, 20.5);
//     cars[1].setCar(2345, 30.5);
//     cars[2].setCar(3456, 40.5);

//     for(int i = 0; i < cars.length; i++) {
//       cars[i].show();
//     }
//   }
// }

// import java.io.*;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("文字列を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
    
//     StringBuffer str1 = new StringBuffer(str);

//     str1.reverse();

//     System.out.println(str + "を逆にすると" + str1 + "です。");
//   }
// }

// import java.io.*;

// class sample1{
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("文字列を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();

//     System.out.println("挿入したい位置の数字を入力してください");

//     String str0 = br.readLine();
//     int num = Integer.parseInt(str0);

//     StringBuffer str2 = new StringBuffer(str1);
//     str2.insert(num, 'a');

//     System.out.println(str2);
//   }
// }


// import java.io.*;

// class sample1{
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("整数を２つを入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();
//     String str2 = br.readLine();

//     int num1 = Integer.parseInt(str1);
//     int num2 = Integer.parseInt(str2);

//     int ans = Math.min(num1, num2);

//     System.out.println(num1 + "と" + num2 + "で小さい数字は" + ans + "です。");
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
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }
//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class RacingCar extends Car
// {
//   private int course;

//   public RacingCar()
//   {
//     course = 0;
//     System.out.println("レーシングカーを作成しました。");
//   }
//   public void setCourse(int c)
//   {
//     course = c;
//     System.out.println("コース番号を" + course + "にしました。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     RacingCar rccar1;
//     rccar1 = new RacingCar();

//     rccar1.setCar(1234, 20.5);
//     rccar1.setCourse(5);
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

// class RacingCar extends Car
// {
//   private int course;

//   public RacingCar()
//   {
//     course = 0;
//     System.out.println("レーシングカーを作成しました。");
//   }
//   public RacingCar(int n, double g, int c)
//   {
//     super(n, g);
//     course = c;
//     System.out.println("コース番号" + course + "のレーシングカーを作成しました。");
//   }
//   public void setCourse(int c)
//   {
//     course = c;
//     System.out.println("コース番号を" + course + "にしました。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
//     RacingCar rccar2 = new RacingCar();
//   }
// }

// class Car
// {
//   protected int num;
//   protected double gas;

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
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }
//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class RacingCar extends Car
// {
//   private int course;

//   public RacingCar()
//   {
//     course = 0;
//     System.out.println("レーシングカーを作成しました。");
//   }
//   public void setCourse(int c)
//   {
//     course = c;
//     System.out.println("コース番号を" + course + "にしました。");
//   }
//   public void newShow()
//   {
//     System.out.println("レーシングカーのナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//     System.out.println("コース番号は" + course + "です。");
//   }
// }
// class sample1
// {
//   public static void main(String[] args)
//   {
//     RacingCar rccar1;
//     rccar1 = new RacingCar();
//     rccar1.newShow();
//   }
// }

// class Car
// {
//   protected int num;
//   protected double gas;

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
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }
//   public final void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class RacingCar extends Car
// {
//   private int course;

//   public RacingCar()
//   {
//     course = 0;
//     System.out.println("レーシングカーを作成しました。");
//   }
//   public void setCourse(int c)
//   {
//     course = c;
//     System.out.println("コース番号を" + course + "にしました。");
//   }
//   public void show()
//   {
//     System.out.println("レーシングカーのナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//     System.out.println("コース番号は" + course + "です。");
//   }
// }

// // class sample1
// // {
// //   public static void main(String[] args)
// //   {
// //     Car car1;
// //     car1 = new RacingCar();

// //     car1.setCar(1234, 20.5);

// //     car1.show();
// //   }
// // }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car[] cars;
//     cars = new Car[2];

//     cars[0] = new Car();
//     cars[0].setCar(1234, 20.5);

//     cars[1] = new RacingCar();
//     cars[1].setCar(4567, 30.5);

//     System.out.println();

//     for(int i = 0; i < cars.length; i++) {
//       cars[i].show();
//     }
//   }
// }

// class Car
// {
//   protected int num;
//   protected double gas;

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
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }
//   public String toString()
//   {
//     String str = "ナンバー:" + num + "ガソリン量:" + gas;
//     return str;
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1 = new Car();
//     car1.setCar(1234, 20.5);

//     System.out.println(car1);
//   }
// }

// class Car
// {
//   protected int num;
//   protected double gas;

//   public Car()
//   {
//     num = 0;
//     gas = 0.0;
//     System.out.println("車を作成しました。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car car1 = new Car();
//     Car car2 = new Car();

//     Car car3;
//     car3 = car1;

//     boolean bl1 = car1.equals(car2);
//     boolean bl2 = car1.equals(car3);

//     System.out.println("car1とcar2が同じか調べたところ" + bl1 + "でした。");
//     System.out.println("car1とcar3が同じか調べたところ" + bl2 + "でした。");
//   }
// }

// class Car
// {
//   protected int num;
//   protected double gas;

//   public Car()
//   {
//     num = 0;
//     gas = 0.0;
//     System.out.println("車を作成しました。");
//   }
// }

// class RacingCar extends Car
// {
//   private int course;

//   public RacingCar()
//   {
//     course = 0;
//     System.out.println("レーシングカーを作成しました。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car[] cars;
//     cars = new Car[2];

//     cars[0] = new Car();
//     cars[1] = new RacingCar();

//     for(int i = 0; i < cars.length; i++) {
//       Class cl = cars[i].getClass();
//       System.out.println((i + 1) + "番目のオブジェクトクラスは" + cl + "です。");
//     }
//   }
// }

// class Car
// {
//   protected int num;
//   protected double gas;
  
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
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }
//   public String toString()
//   {
//     String str = "ナンバー" + num + "ガソリン量" + gas + "の車";
//     return str;
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Car cars = new Car();

//     cars.setCar(1234, 20.5);
//     System.out.println(cars + "です。");
//   }
// }
// import java.util.ArrayList;
// import java.util.Arrays;




// class sample1
// {
//   public static void main(String[] args)
//   {
//     ArrayList<Integer> is = new ArrayList<Integer>();
//     ArrayList<Integer> inter = new ArrayList<Integer>();
//     int i = 1;
//     while (i <= 5) {
//       is.add(0 + i);
//       i += 1;
//     }
//     System.out.println(is);

//     inter = is;

//     System.out.println(is);
//     System.out.println(inter);
//   }
// }

class TestClass {

  // public TestClass() {
  //   System.out.println("TestClass始動");
  // }
  // メンバ変数
  public static String name = "Samurai";
  
  // メソッド
  public static String testMethod(){
      return "Engineer";
  }
}

// Main.java
class Main {

  public static void main(String[] args) {

      //メンバ変数を参照する
      String str1 = TestClass.name;
      
      //メソッドの呼出し
      String str2 = TestClass.testMethod();
      
      //結果を出力
      System.out.println(str1 + str2); // SamuraiEngineer
  }

}

// class Car {
//   public static int sum = 0;

//   private int num;
//   private double gas;

//   public Car() {
//     num = 0;
//     gas = 0.0;
//     sum++;
//     System.out.println("車を作成しました。");
//   }
//   public void setCar(int n, double g) {
//     num = n;
//     gas = g;
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }
//   public static void showSun() {
//     System.out.println("車は全部で" + sum + "台あります");
//   }
//   public void show() {
//     System.out.println("車のナンバーは" + num + "です");
//     System.out.println("ガソリン量は" + gas + "です");
//   }
// }

// class sample1 {
//   public static void man(String[] args) {
//     Car.showSum();

//     Car car1 = new Car();
//     car1.setCar(1234, 20.5);

//     Car.showSum();

//     Car car2 = new Car();
//     car2.setCar(4567, 30.5);

//     Car.showSum();
//   }
// }
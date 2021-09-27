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
//     System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
//   }

//   public static void showSum() {
//     System.out.println("車は全部で" + sum + "台あります。");
//   }

//   public void show() {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1 {
//   public static void main(String[] args) {
//     Car.showSum();

//     System.out.println();

//     Car car1 = new Car();
//     car1.setCar(1234, 20.5);
//     car1.show();

//     Car.showSum();

//     System.out.println();

//     Car car2 = new Car();
//     car2.setCar(4567, 30.5);
//     car2.show();

//     Car.showSum();
//   }
// }

// import java.io.*;

// class sample1 {
//   public static void main(String[] args) throws IOException {
//     System.out.println("これより、FizzBuzzゲームを開始します。");
//     System.out.println("好きな数字を入力してください。その値によって、出力が変わります。");

//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int num = Integer.parseInt(str);

//     if (num % 3 == 0 && num % 5 == 0) {
//       System.out.println("FizzBuzz!");
//     } else if (num % 3 == 0) {
//       System.out.println("Fizz!");
//     } else if (num % 5 == 0) {
//       System.out.println("Buzz!");
//     } else {
//       System.out.println(num);
//     }

//     System.out.println("FizzBuzzゲームを終了します。");
//   }
// }

// class sample1 {
//   public static void main(String[] args) {
//     System.out.println("これより、FizzBuzzゲームを開始します。");
//     System.out.println("1~100の数字の出力結果を表示します。");

//     for(int i = 1; i < 101; i++) {
//       if (i % 3 == 0 && i % 5 == 0) {
//         System.out.println("FizzBuzz!");
//       } else if (i % 3 == 0) {
//         System.out.println("Fizz!");
//       } else if (i % 5 == 0) {
//         System.out.println("Buzz!");
//       } else {
//         System.out.println(i);
//       }
//     }

//     System.out.println("FizzBuzzゲームを終了します。");
//   }
// }

// class sample1 {
//   public static void main(String[] args) {
//     System.out.println("アホのやつをやりやす！！見てね！！");

//     for (int i = 1; i <= 100; i++) {
//       String str = String.valueOf(i);
//       if (i % 3 == 0 || str.contains("3")) {
//         System.out.println("Aho");
//       } else {
//         System.out.println(i);
//       }
//     }
//   }
// }

// class sample1 {
//   public static void main(String[] args) {
//     for (int i = 1; i <= 100; i++) {
//       if (i == 1) {
//         continue;
//       }

//     }
//   }
// }

// import java.io.*;

// class sample1 {
//   public static void main(String[] args) throws IOException {
//     System.out.println("トリボナッチ数列を求めます。");
//     System.out.println("求めたい項の番数を入力してください。");
//     System.out.println("なお、３桁までは指定です。0、0、1となります");

//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     String str0 = br.readLine();
//     int ans = Integer.parseInt(str0);
//     int num1 = 0;
//     int num2 = 0;
//     int num3 = 1;

//     int[] toribo = new int[ans];
//     toribo[0] = num1;
//     toribo[1] = num2;
//     toribo[2] = num3;

//     System.out.println(num1);
//     System.out.println(num2);
//     System.out.println(num3);

//     for (int i = 0; i < ans - 3; i++) {
//       toribo[i + 3] = toribo[i] + toribo[i + 1] + toribo[i + 2];
//       System.out.println(toribo[i + 3]);
//     }

//     System.out.println("終了");
//   }
// }

// 素数判定

// import java.io.*;

// class getS {
//   private int ans;
//   private String outpt;

//   public getS() {
//     ans = 0;
//     System.out.println("素数判定プログラム開始");
//     System.out.println();
//     System.out.println();
//   }

//   public void getAns() {
//     for (int i = 1; i <= 100; i++) {
//       ans = 0;
//       if (i == 1) {
//         continue;
//       }
//       for (int x = 1; x <= Math.sqrt(i); x++) {
//         if (i % x == 0) {
//           ans += 1;
//         }
//       }
//       if (ans == 1) {
//         System.out.println(i + "は素数です。");
//       } else {
//         System.out.println(i + "は素数ではありません。");
//       }
//     }
//     System.out.println();
//     System.out.println();
//     System.out.println("素数判定プログラム終了");
//   }
// }

// class sample1 {
//   public static void main(String[] args) throws IOException {
//     getS sosu = new getS();

//     sosu.getAns();
//   }
// }

// import java.io.*;

// class FizzBuzz {
//   public void ansWer(int ans) {
//     if (ans % 3 == 0 && ans % 5 == 0) {
//       System.out.println("FizzBuzz");
//     } else if (ans % 3 == 0) {
//       System.out.println("Fizz");
//     } else if (ans % 5 == 0) {
//       System.out.println("Buzz");
//     } else {
//       System.out.println(ans);
//     }
//   }
// }

// class sample1 {
//   public static void main(String[] args) throws IOException {
//     System.out.println("これよりFizzBuzzゲームを開始します");
//     System.out.println("好きな数字を入力してください");

//     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int ans = Integer.parseInt(str);

//     FizzBuzz fizzbuzz = new FizzBuzz();
//     fizzbuzz.ansWer(ans);

//     System.out.println("FizzBuzzゲームを終了します");
//   }
// }

abstract class Vehicle {
  protected int speed;

  public void setSpeed(int s) {
    speed = s;
    System.out.println("速度を" + speed + "にしました。");
  }

  abstract void show();
}

class Car extends Vehicle {
  private int num;
  private double gas;

  public Car(int n, double g) {
    num = n;
    gas = g;
    System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
  }

  public void show() {
    System.out.println("車のナンバー" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
    System.out.println("速度は" + speed + "です。");
  }
}

class Plane extends Vehicle {
  private int flight;

  public Plane(int f) {
    flight = f;
    System.out.println("便" + flight + "の飛行機を作成しました。");
  }

  public void show() {
    System.out.println("飛行機の便は" + flight + "です。");
    System.out.println("速度は" + speed + "です。");
  }
}

class sample1 {
  public static void main(String[] args) {
    Vehicle[] vc;
    vc = new Vehicle[2];

    vc[0] = new Car(1234, 20.5);
    vc[0].setSpeed(60);

    System.out.println();

    vc[1] = new Plane(232);
    vc[1].setSpeed(500);

    System.out.println();

    for (int i = 0; i < vc.length; i++) {
      vc[i].show();
      System.out.println();
    }
  }
}
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

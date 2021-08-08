// FizzBuzz ------------------>

// import java.io.*;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("FizzBuzzゲームの開始");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int ans = Integer.parseInt(str);

//     if(ans % 3 == 0 && ans % 5 == 0) {
//       System.out.println("FizzBuzz");
//     } else if(ans % 3 == 0) {
//       System.out.println("Fizz");
//     } else if(ans % 5 == 0) {
//       System.out.println("Buzz");
//     } else {
//       System.out.println(ans);
//     }

//     System.out.println("FizzBuzzゲーム終了");
//   }
// }

// ループ ------------------>

// class sample1
// {
//   public static void main(String[] args)
//   {
//     for(int i = 0; i < 5; i++) {
//       System.out.println("Hello, World!!");
//     }
//   }
// }

//  素数判定  ------------------>

// import java.io.*;
// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("素数判定したい数値を入力してください");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int ans = Integer.parseInt(str);

//     int i = 1;
//     int count = 0;
//     while(i < ans) {
//       if(ans % i == 0) {
//         count += 1;
//       }
//       i += 1;
//     }

//     if(count == 1) {
//       System.out.println(ans + "は素数です。");
//     } else {
//       System.out.println(ans + "は素数ではありません。");
//     }
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     System.out.println("素数判定したい数値を入力してください");

//     int[] result = new int[100];
//     int x = 0;
//     for(int s = 2; s <= 100; s++) {
//       result[x] = s;
//       int i = 1;
//       int count = 0;
//       while(i < result[x]) {
//         if(result[x] % i == 0) {
//           count += 1;
//         }
//         i += 1;
//       }
//       if(count == 1) {
//         System.out.println(result[x] + "は素数です。");
//         x += 1;
//       } else {
//         System.out.println(result[x] + "は素数ではありません。");
//         x += 1;
//       }
//     }
//   }
// }

//  平方根を求める  ------------------>

// import java.io.*;
// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("平方根を求めてみる");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str = br.readLine();
//     int ans = Integer.parseInt(str);

//     System.out.println(Math.sqrt(ans));
//   }
// }


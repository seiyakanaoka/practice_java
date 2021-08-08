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

//  ------------------>

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
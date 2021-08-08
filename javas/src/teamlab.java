// チームラボプログラミングテスト

// 第１問 -------------------->

// class sample1
// {
//   public static void main(String[] args)
//   {
//     System.out.println("プログラムテストを開始します。");

//     int ans = 0;
//     int x = 1;
//     while(x < 100) {
//       ans += Math.pow(x, 4);
//       System.out.println(ans);
//       x += 1;
//     }
//     System.out.println();
//     System.out.println(ans);
//   }
// }

// 第2問 -------------------->

// import java.io.*;
// import java.util.Arrays;

// class sample1
// {
//   public static void main(String[] args) throws IOException
//   {
//     System.out.println("トリボナッチ配列をします。好きな数字を3つ、出力したい数を入力してください。");

//     BufferedReader br =
//       new BufferedReader(new InputStreamReader(System.in));

//     String str1 = br.readLine();
//     String str2 = br.readLine();
//     String str3 = br.readLine();
//     String str4 = br.readLine();

//     int a = Integer.parseInt(str1);
//     int b = Integer.parseInt(str2);
//     int c = Integer.parseInt(str3);
//     int d = Integer.parseInt(str4);

//     int[] ans = new int[d];
//     ans[0] = a;
//     ans[1] = b;
//     ans[2] = c;
//     for(int i = 0; i < (d - 3); i++) {
//       ans[3 + i] = ans[i] + ans[i + 1] + ans[i + 2];
//     }
//     System.out.println(Arrays.toString(ans));
//   }
// }

// 第3問 -------------------->


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




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

import java.io.*;

class sample1
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("英字を入力してください。");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();

    String stru = str.toUpperCase();
    String strl = str.toLowerCase();

    System.out.println("大文字に変換すると" + stru + "です。");
    System.out.println("小文字に変換すると" + strl + "です。");
  }
}




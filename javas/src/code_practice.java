import java.io.*;

class sample1
{
  public static void main(String[] args) throws IOException
  {
    System.out.println("FizzBuzzゲームの開始");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int ans = Integer.parseInt(str);

    if(ans % 3 == 0 && ans % 5 == 0) {
      System.out.println("FizzBuzz");
    } else if(ans % 3 == 0) {
      System.out.println("Fizz");
    } else if(ans % 5 == 0) {
      System.out.println("Buzz");
    } else {
      System.out.println(ans);
    }

    System.out.println("FizzBuzzゲーム終了");
  }
}
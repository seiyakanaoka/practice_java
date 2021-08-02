class FizzBuzz {
  public static void main(String[] args)
  {
    int i = 0;
    int loopCount = 100;
    int numFizz = 3;
    int numBuzz = 5;
    String strFizz = "Fizz";
    String strBuzz = "Buzz";

    for(i = 1; i <= loopCount; i++) {            // 問1 答え
      if(i % (numFizz * numBuzz) == 0) {         // 問2 答え
        System.out.println(strFizz + strBuzz);
      } else if(i % numFizz == 0) {              // 問3 答え
        System.out.println(strFizz);
      } else if(i % numBuzz == 0) {              // 問4 答え
        System.out.println(strBuzz);
      } else {
        System.out.println(i);
      }
    }
  }
}
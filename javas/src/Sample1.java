// class Sample1 {
//   public static void main(String[] args) {
//     int[] test = new int[5];

//     System.out.println("test[10]に値を代入します");

//     test[10] = 10;
//     System.out.println("test[10]に80を代入しました。");
//     System.out.println("無事終了しました。");
//   }
// }

// class Sample1 {
//   public static void main(String[] args) {
//     try {

//       int[] test = new int[5];

//       System.out.println("test[10]に値を代入します。");

//       test[10] = 80;
//       System.out.println("test[10]に80を代入しました。");

//     } catch (ArrayIndexOutOfBoundsException e) {

//       System.out.println("【例外発生】配列の要素を超えています。");

//     }
//     System.out.println("無事終了しました。");
//   }
// }


// class Sample1 {
//   public static void main(String[] args) {
//     try {

//       int[] test = new int[5];

//       System.out.println("test[10]に値を代入します。");

//       test[10] = 80;
//       System.out.println("test[10]に80を代入しました。");

//     } catch (ArrayIndexOutOfBoundsException e) {

//       System.out.println("【例外発生】配列の要素を超えています。");

//     } finally {
//       System.out.println("finallyブロックを通過しています。");
//     }
//     System.out.println("無事終了しました。");
//   }
// }


// class Sample1 {
//   public static void main(String[] args) {
//     try {

//       int[] test = new int[5];

//       System.out.println("test[10]に値を代入します。");

//       test[10] = 80;
//       System.out.println("test[10]に80を代入しました。");

//     } catch (ArrayIndexOutOfBoundsException e) {

//       System.out.println("【例外発生】配列の要素を超えています。");
//       System.out.println(e + "という例外が発生しました。");

//     } finally {
//       System.out.println("finallyブロックを通過しています。");
//     }
//     System.out.println("無事終了しました。");
//   }
// }

// class CarException extends Exception {
// }

// class Car {

//   private int num;
//   private double gas;

//   public Car() {
//     num = 0;
//     gas = 0.0;
//     System.out.println("車を作成しました。");
//   }
//   public void setCar(int n, double g) throws CarException {
//     if (g < 0) {
//       CarException e = new CarException();
//       throw e;
//     } else {
//       num = n;
//       gas = g;
//       System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//     }
//   }
//   public void show() {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class Sample1 {
//   public static void main (String[] args) {
    
//     Car car1 = new Car();
//     try {
//       car1.setCar(1234, -10.0);
//     } catch (CarException e) {
//       System.out.println("【例外発生】" + e + "が送出されました。");
//     }
//     car1.show();
//   }
// }

class CarException extends Exception {
}

class Car {

  private int num;
  private double gas;

  public Car() {
    num = 0;
    gas = 0.0;
    System.out.println("車を作成しました。");
  }
  public void setCar(int n, double g) throws CarException {
    if (g < 0) {
      CarException e = new CarException();
      throw e;
    } else {
      num = n;
      gas = g;
      System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
    }
  }
  public void show() {
    System.out.println("車のナンバーは" + num + "です。");
    System.out.println("ガソリン量は" + gas + "です。");
  }
}

class Sample1 {
  public static void main (String[] args) throws CarException {
    Car car1 = new Car();
    car1.setCar(1234, -10.0);
    car1.show();
  }
}
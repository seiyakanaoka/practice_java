// public class sample1
// {
//   public static void main(String[] args)
//   {
//     System.out.println("ようこそアプリケーションへ！");
//   }
// }

// import javafx.application.*;
// import javafx.stage.*;
// import javafx.scene.*;
// import javafx.scene.control.*;
// import javafx.scene.layout.*;

// public class sample1 extends Application
// {
//   public static void main(String[] args)
//   {
//     launch(args);
//   }
//   public void start(Stage stage)throws Exception
//   {
//     BorderPane bp = new BorderPane();
//     Scene sc = new Scene(bp, 300, 200);

//     stage.setScene(sc);
//     stage.setTitle("サンプル");
//     stage.show();
//   }
// }

// クラス方の変数に値を代入

// class Car {
//   private int num;
//   private double gas;

//   public Car() {
//     num = 0;
//     gas = 0.0;
//     System.out.println("車を作成しました。");
//   }
//   public void setCar(int n, double g) {
//     num = n;
//     gas = g;
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }
//   public void show() {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class sample1 {
//   public static void main(String[] args) {
//     Car car1;
//     System.out.println("car1を宣言しました。");
//     car1 = new Car();
//     car1.setCar(1234, 20.5);

//     System.out.println();

//     Car car2;
//     System.out.println("car2を宣言しました。");

//     System.out.println();

//     car2 = car1;
//     System.out.println("car2にcar1を代入しました。");

//     System.out.println();

//     System.out.println("car1がさす");
//     car1.show();

//     System.out.println();

//     System.out.println("car2がさす");
//     car2.show();

//     System.out.println();

//     System.out.println("car1がさす");
//     car2.setCar(2345, 30.5);

//     System.out.println();
//     car1.show();

//     System.out.println();
//     car2.show();
//   }
// }

// 二つのオブジェクトは同じ、つまり、car1 = car2　ということ

// class Car {
//   private int num;
//   private double gas;
//   private String name;

//   public Car() {
//     num = 0;
//     gas = 0.0;
//     name = "名無し";
//     System.out.println("車を作成しました。");
//   }
//   public void setCar(int n, double g) {
//     num = n;
//     gas = g;
//     System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//   }
//   public void setName(String nm) {
//     name = nm;
//     System.out.println("名前を" + name + "にしました。");
//   }
//   public void show() {
//     System.out.println("車のナンバーは" + num  + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//     System.out.println("名前は" + name + "です。");
//   }
// }

// class sample1 {
//   public static void main(String[] args) {
//     Car car1;
//     car1 = new Car();

//     System.out.println();

//     car1.show();

//     int number = 1234;
//     double gasoline = 20.5;
//     String str = "1号車";

//     System.out.println();

//     car1.setCar(number, gasoline);
//     car1.setName(str);

//     car1.show();
//   }
// }

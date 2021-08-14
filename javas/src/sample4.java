// abstract class Vehicle
// {
//   protected int speed;
//   public void setSpeed(int s)
//   {
//     speed = s;
//     System.out.println("速度を" + speed + "にしました。");
//   }
//   abstract void show();
// }

// class Car extends Vehicle
// {
//   private int num;
//   private double gas;

//   public Car(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
//   }
//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です");
//     System.out.println("ガソリン量は" + gas + "です");
//     System.out.println("速度は" + speed + "です");
//   }
// }

// class Plane extends Vehicle
// {
//   private int flight;

//   public Plane(int f)
//   {
//     flight = f;
//     System.out.println("便" + flight + "の飛行機を作成しました。");
//   }
//   public void show()
//   {
//     System.out.println("飛行機の便は" + flight + "です");
//     System.out.println("速度は" + speed + "です");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     Vehicle[] vc;
//     vc = new Vehicle[2];

//     vc[0] = new Car(1234, 20.5);
//     vc[0].setSpeed(60);

//     System.out.println();

//     vc[1] = new Plane(232);
//     vc[1].setSpeed(500);

//     System.out.println();

//     for(int i = 0; i < vc.length; i++) {
//       vc[i].show();
//     }
//   }
// }

// class sample2
// {
//   public static void main(String[] args)
//   {
//     Vehicle[] vc;
//     vc = new Vehicle[2];

//     vc[0] = new Car(1234, 20.5);
//     vc[1] = new Plane(232);

//     for(int i = 0; i < vc.length; i++) {
//       if(vc[i] instanceof Car)
//       System.out.println((i + 1) + "番目のオブジェクトはCarクラスです。");
//       else
//         System.out.println((i + 1) + "番目のオブジェクトはCarクラスではありません。");
//     }
//   }
// }

// interface iVehicle
// {
//   void show();
// }

// class Car implements iVehicle
// {
//   private int num;
//   private double gas;

//   public Car(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
//   }
//   public void show()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
// }

// class Plane implements iVehicle
// {
//   private int flight;

//   public Plane(int f)
//   {
//     flight = f;
//     System.out.println("便" + flight + "の飛行機を作成しました。");
//   }
//   public void show()
//   {
//     System.out.println("飛行機の便は" + flight + "です。");
//   }
// }

// class sample1
// {
//   public static void main(String[] args)
//   {
//     iVehicle[] ivc;
//     ivc = new iVehicle[2];

//     ivc[0] = new Car(1234, 20.5);
//     ivc[1] = new Plane(232);

//     for(int i = 0; i < ivc.length; i++)
//     {
//       ivc[i].show();
//     }
//   }
// }

// interface iVehicle
// {
//   void vShow();
// }

// interface iMaterial
// {
//   void mShow();
// }

// class Car implements iVehicle, iMaterial
// {
//   private int num;
//   private double gas;

//   public Car(int n, double g)
//   {
//     num = n;
//     gas = g;
//     System.out.println("ナンバー" + num + "ガソリン量" + gas + "の車を作成しました。");
//   }
//   public void vShow()
//   {
//     System.out.println("車のナンバーは" + num + "です。");
//     System.out.println("ガソリン量は" + gas + "です。");
//   }
//   public void mShow()
//   {
//     System.out.println("車の材料は鉄です。");
//   }
// }
// class sample1
// {
//   public static void main(String [] args)
//   {
    // Car car1 = new Car(1234, 20.5);
    // car1.vShow();
    // car1.mShow();
//   }
// }

// class sample1
// {
//     public static void main(String[] args)
//     {
//         int[] test;
//         test = new int[5];
//         System.out.println("test[10]に値を代入します。");

//         test[10] = 80;
//         System.out.println("test[10]に80を代入しました。");
//         System.out.println("無事終了しました。");
//     }
// }

// class sample1
// {
//     public static void main(String[] args)
//     {
//         try{
//             int[] test;
//             test = new int[5];

//             System.out.println("test[10]に値を代入します。");

//             test[10] = 80;
//             System.out.println("test[10]に80を代入しました。");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("配列の要素を超えています。");
//         }
//         System.out.println("無事終了しました。");
//     }
// }

// class sample1
// {
//     public static void main(String[] args)
//     {
//         try{
//             int[] test;
//             test = new int[5];

//             System.out.println("test[10]に値を代入します。");

//             test[10] = 80;
//             System.out.println("test[10]に80を代入しました。");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("配列の要素を超えています。");
//         }
//         finally{
//             System.out.println("最後に必ずこの処理をします。");
//         }
//         System.out.println("無事終了しました。");
//     }
// }


// class sample1
// {
//     public static void main(String[] args)
//     {
//         try{
//             int[] test;
//             test = new int[5];

//             System.out.println("test[10]に値を代入します。");

//             test[10] = 80;
//             System.out.println("test[10]に80を代入しました。");
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("配列の要素を超えています。");
//             System.out.println(e + "という例外が発生しました。");
//         }
//         System.out.println("無事終了しました。");
//     }
// }

// class CarException extends Exception
// {
// }

// class Car
// {
//     private int num;
//     private double gas;

//     public Car()
//     {
//         num = 0;
//         gas = 0.0;
//         System.out.println("車を作成しました。");
//     }
//     public void setCar(int n, double g) throws CarException
//     {
//         if(g < 0){
//             CarException e = new CarException();
//             throw e;
//         }
//         else {
//             num = n;
//             gas = g;
//             System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//         }
//     }
//     public void show()
//     {
//         System.out.println("車のナンバーは" + num + "です。");
//         System.out.println("ガソリン量は" + gas + "です。");
//     }
// }

// class sample1
// {
//     public static void main(String[] args)
//     {
//         Car car1 = new Car();
//         try {
//             car1.setCar(1234, -10.0);
//         }
//         catch(CarException e) {
//             System.out.println(e + "が送出されました");
//         }
//         car1.show();
//     }
// }


// class CarException extends Exception
// {
// }

// class Car
// {
//     private int num;
//     private double gas;

//     public Car()
//     {
//         num = 0;
//         gas = 0.0;
//         System.out.println("車を作成しました。");
//     }
//     public void setCar(int n, double g) throws CarException
//     {
//         if(g < 0){
//             CarException e = new CarException();
//             throw e;
//         }
//         else {
//             num = n;
//             gas = g;
//             System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
//         }
//     }
//     public void show()
//     {
//         System.out.println("車のナンバーは" + num + "です。");
//         System.out.println("ガソリン量は" + gas + "です。");
//     }
// }

// class sample1
// {
//     public static void main(String[] args)
//     throws CarException
//     {
//         Car car1 = new Car();
//         car1.setCar(1234, -10.0);
//         car1.show();
//     }
// }

// import java.io.*;

// class sample1
// {
//     public static void main(String[] args)
//     {
//         try{
//             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));

//             pw.println("Hello!");
//             pw.println("Goodbye!");
//             System.out.println("ファイルに書き込みました。");

//             pw.close();
//         }
//         catch(IOException e){
//             System.out.println("入出力エラーです。");
//         }
//     }
// }

// import java.io.*;

// class sample1
// {
//     public static void main(String[] args)
//     {
//         try{
//             BufferedReader br =
//                 new BufferedReader(new FileReader("test1.txt"));

//             String str1 = br.readLine();
//             String str2 = br.readLine();

//             System.out.println("ファイルに書き込まれている2つの文字列は");
//             System.out.println(str1 + "です。");
//             System.out.println(str2 + "です。");

//             br.close();
//         }
//         catch(IOException e) {
//             System.out.println("入出力エラーです。");
//         }
//     }
// }

// import java.io.*;

// class sample1
// {
//     public static void main(String[] args)
//     {
//         try{
//             BufferedReader br =
//                 new BufferedReader(new FileReader("test2.txt"));

//                 int[] test = new int[8];
//                 String str;

//             for(int i = 0; i < test.length; i++) {
//                 str = br.readLine();
//                 test[i] = Integer.parseInt(str);
//             }

//             int max = test[0];
//             int min = test[0];
//             for(int i = 0; i < test.length; i++) {
//                 if(max < test[i])
//                     max = test[i];
//                 if(min > test[i])
//                     min = test[i];
//                 System.out.println(test[i]);
//             }

//             System.out.println("最高点は" + max + "です。");
//             System.out.println("最低点は" + min + "です。");

//             br.close();
//         }
//         catch(IOException e) {
//             System.out.println("入出力エラーです。");
//         }
//     }
// }

// import java.io.*;

// class sample1
// {
//     public static void main(String[] args)
//     {
//         if(args.length != 1) {
//             System.out.println("ファイル名を正しく指定してください。");
//             System.exit(1);
//         }
//         try{
//             BufferedReader br =
//                 new BufferedReader(new FileReader(args[0]));
            
//             String str;
//             while((str = br.readLine()) != null) {
//                 System.out.println(str);
//             }
//             br.close();
//         }
//         catch(IOException e) {
//             System.out.println("入出力エラーです。");
//         }
//     }
// }

// import java.io.*;

// class sample1
// {
//     public static void main(String[] args)
//     {
//         if(args.length != 1) {
//             System.out.println("ファイル名を正しく入力してください。");
//             System.exit(1);
//         }
//         try{
//             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));

//             pw.println("A long time ago,");
//             pw.println("There was a little girl");
//             System.out.println("ファイルに書き込みました。");

//             pw.close();

//             BufferedReader br =
//                 new BufferedReader(new FileReader(args[0]));

//             String str;
//             while((str =br.readLine()) != null) {
//                 System.out.println(str);
//             }
//             br.close();
//         }
//         catch(IOException e){
//             System.out.println("入出力エラーです。");
//         }
//     }
// }

// class Car extends Thread
// {
//     private String name;

//     public Car(String nm)
//     {
//         name = nm;
//     }
//     public void run()
//     {
//         for(int i = 0; i < 5; i++)
//         {
//             try{
//                 sleep(1000);
//                 System.out.println(name + "の処理をしています。");
//             }
//             catch(InterruptedException e){}
//         }
//     }
// }

// class sample1
// {
//     public static void main(String[] args)
//     {
//         Car car1 = new Car("1号車");
//         car1.start();

//         Car car2 = new Car("2号車");
//         car2.start();

//         for(int i = 0; i < 5; i++)
//         {
//             System.out.println("main()の処理をしています。");
//         }
//     }
// }

// class Car extends Thread
// {
//     private String name;

//     public Car(String nm)
//     {
//         name = nm;
//     }
//     public void run()
//     {
//         for(int i = 0; i < 5; i++)
//         {
//            System.out.println(name + "の処理をしています。");
//         }
//     }
// }


// class sample1
// {
//     public static void main(String[] args)
//     {
//         Car car1 = new Car("1号車");
//         car1.start();

//         for(int i = 0; i < 5; i++)
//         {
//             try{
//                 Thread.sleep(1000);
//                 System.out.println("main()の処理をしています。");
//             }
//             catch(InterruptedException e){}
//         }
//     }
// }

// class Car extends Thread
// {
//     private String name;

//     public Car(String nm)
//     {
//         name = nm;
//     }
//     public void run()
//     {
//         for(int i = 0; i < 5; i++)
//         {
//            System.out.println(name + "の処理をしています。");
//         }
//     }
// }


// class sample1
// {
//     public static void main(String[] args)
//     {
//         Car car1 = new Car("1号車");
//         car1.start();

//         try{
//             car1.join();
//         }
//         catch(InterruptedException e){}
//         System.out.println("main()の処理を終わります。");
//     }
// }

// class Car implements Runnable
// {
//     private String name;

//     public Car(String nm)
//     {
//         name = nm;
//     }
//     public void run()
//     {
//         for(int i = 0; i < 5; i++)
//         {
//             System.out.println(name + "の処理をしています。");
//         }
//     }
// }

// class sample1
// {
//     public static void main(String[] args)
//     {
//         Car car1 = new Car("1号車");
//         Thread th1 = new Thread(car1);
//         th1.start();

//         for(int i = 0; i < 5; i++)
//         {
//             System.out.println("main()の処理をしています。");
//         }
//     }
// }

class Company
{
    private int sum = 0;
    public synchronized void add(int a)
    {
        int tmp = sum;
        System.out.println("現在、合計金額は" + tmp + "円です。");
        System.out.println(a + "円稼ぎました。");
        tmp = tmp + a;
        System.out.println("合計金額を" + tmp + "円にします。");
        sum = tmp;
    }
}

class Driver extends Thread
{
    private Company comp;
    public Driver(Company c)
    {
        comp = c;
    }
    public void run()
    {
        for(int i = 0; i < 3; i++)
        {
            comp.add(50);
        }
    }
}

class sample1
{
    public static void main(String[] args)
    {
        Company cmp = new Company();

        Driver drv1 = new Driver(cmp);
        drv1.start();

        Driver drv2 = new Driver(cmp);
        drv2.start();
    }
}
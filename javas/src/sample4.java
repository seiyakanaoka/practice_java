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


class CarException extends Exception
{
}

class Car
{
    private int num;
    private double gas;

    public Car()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }
    public void setCar(int n, double g) throws CarException
    {
        if(g < 0){
            CarException e = new CarException();
            throw e;
        }
        else {
            num = n;
            gas = g;
            System.out.println("ナンバーを" + num + "にガソリン量を" + gas + "にしました。");
        }
    }
    public void show()
    {
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }
}

class sample1
{
    public static void main(String[] args)
    throws CarException
    {
        Car car1 = new Car();
        car1.setCar(1234, -10.0);
        car1.show();
    }
}
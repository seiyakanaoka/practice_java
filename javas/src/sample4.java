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

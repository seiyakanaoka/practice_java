// class Sample {
//   public static int num = 0;

//   public Sample() {
//     num++;
//     System.out.println("「public static int num」に値を代入しました。");
//     System.out.println("現在" + num + "個です");
//   }
// }

// class practice {
//   public static void main(String[] args) {
//     Sample s1 = new Sample();
//     Sample s2 = new Sample();
//   }
// }

// import java.util.*;

// class Main {
//   public static Optional<String> decorate(String s, char c) {
//     String r;
//     if (s == null || s.length() == 0) {
//       r = null;
//     } else {
//       r = c + s + c;
//     }
//     return Optional.ofNullable(r);
//   }
//   public static void main(String[] args) {
//     Optional<String> s = decorate("", '*');
//     System.out.println(s.orElse("nullのため処理できません"));

//     Optional<String> a = decorate("a", '*');
//     System.out.println(a.orElse("nullのため処理できません"));
//   }
// }

// import java.util.function.*;

// class Main {
//   public static void main(String[] args) {
//     FuncList funcList = new FuncList();

//     IntPredicate iP = x -> {return (x % 2 == 1); };
//     Func2 func2 = (point, name) -> {return name + "さんは" + (point > 65 ? "合格" : "不合格");};

//     boolean a = iP.test(1);
//     System.out.println(a);

//     String b = func2.call(80, "誠也");
//     System.out.println(b);
//   }
// }


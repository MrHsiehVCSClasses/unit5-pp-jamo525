package u5pp;

class Main {
  public static void main(String[] args) {  
    Dice critical = new Dice(12, 15, "red");
    System.out.println(critical);

    Card pokerFace = new Card("hearts", "queen");
    pokerFace.changeSuit("diamonds");
    pokerFace.changeValue("9");
    System.out.println(pokerFace);

    System.out.println(MyMath.abs(-5));
    System.out.println(MyMath.abs(600.0));
    System.out.println(MyMath.pow(2.5, 4));
    System.out.println(MyMath.perfectSqrt(25));
    System.out.println(MyMath.perfectSqrt(13));
  }
}
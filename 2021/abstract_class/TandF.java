public class TandF extends Club {
  // Track and field club
  public TandF(String name) {
    super(name); // 部活名
  }

  public void practice() {
    System.out.println("TandF.practice");
    System.out.println("ウォームアップ");
    System.out.println("インターバル");
    System.out.println("筋肉トレーニング");
  }
}

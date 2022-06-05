public class Baseball extends Club {
  public Baseball(String name) {
    super(name); // 部活名
  }

  public void practice() {
    System.out.println("Baseball.practice");
    System.out.println("ウォームアップ");
    System.out.println("ランニング");
    System.out.println("キャッチボール");
  }
}

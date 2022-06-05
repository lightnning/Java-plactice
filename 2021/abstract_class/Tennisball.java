public class Tennisball extends Club {
  public Tennisball(String name) {
    super(name); // 部活名
  }

  public void practice() {
    System.out.println("Tennisball.practice");
    System.out.println("ウォームアップ");
    System.out.println("素振り");
    System.out.println("打ち合い");
  }
}

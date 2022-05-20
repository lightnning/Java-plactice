import java.util.*;

public class Cleric {
  String name;
  int hp = 30;
  final int MAX_HP = 50;
  int mp = 10;
  final int MAX_MP = 10;
  
  public void selfAid() {
    System.out.println(this.name + "はセルフエイドを唱えた！");
    this.hp = this.MAX_HP;
    this.mp -= 5;
    System.out.println("HPが最大まで回復した");
    System.out.println("MPが5ポイント減少した");

  }

  public void pray(int sec) {
    System.out.println(this.name + "は" + sec + "秒間、祈った！");

    // 論理上の回復量を計算する
    int recover = new Random().nextInt(3) + sec;

    // 回復量を計算する
    int recoverActual = Math.min(this.MAX_MP - this.mp, recover);

    this.mp += recoverActual;
    System.out.println("recoverは " + recover + " だった");
    System.out.println("MPが " + recoverActual + " 回復した");
  }

  public void status() {
    System.out.println("現在のhp= " + this.hp);
    System.out.println("現在のmp= " + this.mp);
    
  }
}

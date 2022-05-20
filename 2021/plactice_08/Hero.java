public class Hero {
  String name;
  int hp;

  public void sleep() {

    try {
      Thread.sleep(3000);
    } catch (Exception e) {
      
    }

    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
    System.out.println(this.name + "のHPは、100");
    try {
      Thread.sleep(3000);
    } catch (Exception e) {
     
    }
    
  }
  public void sit(int sec) {
    this.hp += sec;

    try {
      Thread.sleep(3000);
    } catch (Exception e) {
      
    }

    System.out.println
    (this.name +"は、" + sec + "秒座った！");
    try {
      Thread.sleep(3000);
      
      }
      catch (InterruptedException e){
      // System.out.println("割り込み発生");
      }
    System.out.println("HPが" + sec + "ポイント回復した！");
    
  }
  public void slip() {
    this.hp -= 5;

    try {
      Thread.sleep(3000);
    } catch (Exception e) {
      
    }

    System.out.println
    (this.name +"は、" + "転んだ！");

    try {
      Thread.sleep(3000);
      System.out.println("5のダメージ");
    } catch (Exception e) {
      
    }
    
  }
  public void run() {
    try {
      Thread.sleep(3000);
    } catch (Exception e) {
      
    }

    System.out.println
    (this.name + "は、逃げ出した！");
    try {
      Thread.sleep(3000);
      System.out.println("GAMEOVER");
      System.out.println
    ("最終HPは" + this.hp + "でした！");
    } catch (Exception e) {
    }
    
  }

}


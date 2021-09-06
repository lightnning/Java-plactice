public class Thief {
  String name;
  int hp;
  int mp;

    public Thief(String name, int hp, int mp){
      this.name = name;
      this.hp = hp;
      this.mp = mp;
      
    }
    public Thief(String name, int hp) {
      this(name, hp, 5);
    }
    public Thief(String name) {
      this(name, 40);
    }
    public void say() {
      System.out.println("名前は" + this.name);
      System.out.println("HPは" + this.hp);
      System.out.println("MPは" + this.mp);    
    }


}

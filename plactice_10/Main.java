public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero();
    Matango m1 = new Matango();
    SuperHero sh = new SuperHero();
    h1.attack(m1);
    m1.run();
    sh.attack(m1);
    sh.fly();
    sh.land();
    h1.slip();
    h1.run();
    sh.run();
    
    
  }
  
}

public class Main {
  public static void main(String[] args) {
    Cleric h = new Cleric();
    h.name = "タナカ";

    h.status();
    h.selfAid();
    h.status();
    h.pray(50);
    h.status();
    
  }
  
  
}

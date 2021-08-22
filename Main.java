public class Main {
  

  public static void introduceOneself(){
    String name = "Tomoya Kobayashi";
    int old = 54;
    float height = 176;
    char eto = '羊';
    System.out.println("私の名前は " + name + " です");
    System.out.println("年齢は " + old + " で、身長は " + height + " です");
    System.out.println("干支は " + eto + " になります");
    
  }

  // charと、Javaで文字列を表すクラスのStringは、お互いに違ったモノ同士です。
  // charは一文字を表す数字なのに対して、JavaのStringは0文字以上の文字が集まったモノで、
  // Stringクラスのインスタンスです。

  public static void main(String[] args) { //argとはargumentの略で、引数という意味
    introduceOneself();
  }
  }
public class Main {
  

  public static void email(String title, String address, String text){
    title = "こんにちわ";
    address = "aaa@gmal.com";
    text = "メールを送ります";

    System.out.println(address + " に、以下のメールを送信しました");
    System.out.println("件名： " + title);
    System.out.println("本文: " + text);

    
  }

  // charと、Javaで文字列を表すクラスのStringは、お互いに違ったモノ同士です。
  // charは一文字を表す数字なのに対して、JavaのStringは0文字以上の文字が集まったモノで、
  // Stringクラスのインスタンスです。

  public static void main(String[] args) { //argとはargumentの略で、引数という意味
    email("aaa","bbb","ccc");
  }
  }
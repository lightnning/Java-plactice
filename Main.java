public class Main {
  

  public static void email(String title, String address, String text){
    title = "こんにちわ";
    address = "aaa@gmal.com";
    text = "メールを送ります";

    System.out.println(address + " に、以下のメールを送信しました");
    System.out.println("件名： " + title);
    System.out.println("本文: " + text);    
  }

  public static void email(String address, String text){
    address = "aaa@gmal.com";
    text = "メールを送ります";

    System.out.println(address + " に、以下のメールを送信しました");
    System.out.println("件名: 無題");
    System.out.println("本文: " + text);    
  }


  public static void main(String[] args) { //argとはargumentの略で、引数という意味
    String address = "aaa@gmal.com";
    String text = "メールを送ります";

    email(address, text);
  }
  }
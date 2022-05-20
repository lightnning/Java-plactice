public class Book extends TangibleAsset {
  String isbn;
  private String name;
  // コンストラクタ
  public Book
      (String name, int price, String color, Stirng isbn) {
    super(name, price, color);
    this.isbn = isbn;
  }
  // メソッド
  public String getIsbn() {return this.isbn;}
}

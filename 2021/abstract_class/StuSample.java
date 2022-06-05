public class StuSample {
  public static void main(String[] args) {
    TandF taf = new TandF("陸上競技部");
    Football fb = new Football("サッカー部");
    Swim sw = new Swim("水泳部");
    Baseball bb = new Baseball("野球部");
    Tennisball tb = new Tennisball("テニス部");


    Student stu1 = new Student("田原", taf);
    stu1.display();
    stu1.practice();

    Student stu2 = new Student("桜井", fb);
    stu2.display();
    stu2.practice();

    Student stu3 = new Student("水原", sw);
    stu3.display();
    stu3.practice();
    
    Student stu4 = new Student("岩木", bb);
    stu4.display();
    stu4.practice();

    Student stu5 = new Student("岩木", tb);
    stu5.display();
    stu5.practice();

  }
}

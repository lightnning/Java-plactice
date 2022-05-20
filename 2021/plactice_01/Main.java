public class Main {
  

  public static double calcTriangleArea(double bottom, double height){

    double area = (bottom * height) / 2;
    return area;
      
  }

  public static double calcCircleArea(double redius){
    
    double area = redius * redius * 3.14;
    return area;
      
  }

  


  public static void main(String[] args) { //argとはargumentの略で、引数という意味

    System.out.println(calcTriangleArea(10, 5));
    System.out.println(calcCircleArea(5));
  }
  }
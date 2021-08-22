public class Main {
  public static int add(int x, int y){
    int ans = x + y;
    return ans;
  }

  public static void printArray(int[] array){
    for (int element : array) {
      System.out.println(element);
    }
  }
  public static void main(String[] args) {
      int[] array = {1, 2, 3};
      printArray(array);
    }
  }
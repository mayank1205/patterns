public class NumberPyramid {
  public static void main(String args[]) {
    int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        // System.out.print(j); // to print different numbers in a row
        System.out.print(i);// to print same number in a row
      }
      System.out.println();
    }
  }
}

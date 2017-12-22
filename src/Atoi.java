public class Atoi {
  /*
   * @param str: A string
   * @return: An integer
   */
  final static int INT_MAX = 2147483647;
  final static int INT_MIN = -2147483648;
  public int atoi(String str) {
    int sign = 1;
    if(str.charAt(0) == '-'){
      str = str.substring(1);
      sign = -1;
    }
    return null;
  }
}

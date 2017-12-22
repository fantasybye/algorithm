public class TrailingZeros {
  /*
   * @param n: An integer
   * @return: An integer, denote the number of trailing zeros in n!
   */
  public long trailingZeros(long n) {
    // write your code here, try to do it without arithmetic operators.
    long m = n/5;
    long count = 0;
    while(m != 0) {
      count += m;
      m = m/5;
    }
    return count;
  }
}
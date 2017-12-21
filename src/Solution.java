public class Solution {
  /*
   * @param : An integer
   * @param : An integer
   * @return: The sum of a and b
   */
  public int aplusb(int a, int b) {
    int[] ato2 = to2(a);
    int[] bto2 = to2(b);
    int[] sumto2 = new int[34];
    for(int i = 0; i < 34; i += 1) {
      sumto2[i] = 0;
    }
    for(int i = 0; i < 33; i += 1 ) {
      sumto2[i] = (ato2[i] ^ bto2[i]) ^ sumto2[i];
      if(ato2[i] == 1 && bto2[i] == 1) {
        sumto2[i+1] = 1;
      }
    }
    return to10(sumto2);
  }

  /*
  * @param : An integer
  * @return: n in binary system
  */
  private int[] to2(int n) {
    int[] nto2 = new int[33];
    for(int i = 0; i < 33; i += 1) {
      nto2[i] = 0;
    }
    int j = 0;
    int m = n > 0 ? n : -n;
    while(m != 0) {
      nto2[j] = m % 2;
      m = m / 2;
      j += 1;
    }
    if (n < 0) {
      for(int i = 0; i < 33; i += 1) {
        nto2[i] = ~nto2[i];
      }
    }
    return nto2;
  }

  /*
  * @param : An integer
  * @return: n in decimal system
  */
  private int to10(int[] n) {
    int result = 0;
    for(int i = 0; i < 33; i += 1) {
      result += n[i] * Math.pow(2, i);
    }
    if(n[33] == 1) {
      result = -result;
    }
    return result;
  }
};

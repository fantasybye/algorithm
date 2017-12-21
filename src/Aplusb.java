/**
 * 给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
 * @author frank
 * 2017-12-21
 * 进位a&b << 1, 不考虑进位的加和 a^b, 没有进位的加和 a|b
 * 如果运算不产生进位，用a|b计算
 * 如果产生进位，计算a^b和进位a&b<<1的和
 * 递归
 */

public class Aplusb {
  /*
   * @param : An integer
   * @param : An integer
   * @return: The sum of a and b
   */
  public int aplusb(int a, int b) {
    if ((a&b) == 0)
      return a|b;
    return aplusb(a^b, (a&b) << 1);
  }
}

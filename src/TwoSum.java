import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoSum {
  /*
    * @param numbers: An array of Integer
    * @param target: target = numbers[index1] + numbers[index2]
    * @return: [index1 + 1, index2 + 1] (index1 < index2)
    */
  public int[] twoSum(int[] numbers, int target) {
    int i = 0;
    while (i < numbers.length - 1) {
      for(int j = i + 1; j < numbers.length; j ++) {
        if((numbers[i] + numbers[j]) == target)
          return new int[]{i, j};
      }
      i ++;
    }
    return null;
  }
}

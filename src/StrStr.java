public class StrStr {
  /*
   * @param source: source string to be scanned.
   * @param target: target string containing the sequence of characters to match
   * @return: a index to the first occurrence of target in source, or -1  if target is not part of source.
   */
  public int strStr(String source, String target) {
      int result = -1;
      if(source == null || target == null) {
        return -1;
      }
      if(target.equals("")){
        return 0;
      }
      char[] sourceArray = source.toCharArray();
      char[] targetArray = target.toCharArray();
      for(int i = 0; i < sourceArray.length; i++) {
        if(sourceArray[i] == targetArray[0]){
          result = i;
          if((i + targetArray.length) > sourceArray.length){
            result = -1;
            continue;
          }
          for(int j = 0; j < targetArray.length; j++) {
            if (targetArray[j] != sourceArray[i + j]){
              result = -1;
            }
          }
          if(result != -1){
            return result;
          }
        }
      }
      return result;
  }
}

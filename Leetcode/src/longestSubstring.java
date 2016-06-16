/*
给定一个字符串，找到最长的包含最多k个不同字符的子串，输出最长子串的长度即可。

Example：
给出字符串”eceba”，k = 2
输出答案3，最长包含最多2个不同字符的子串为”ece”
*/

public class longestSubstring {
    /**
     * @param s : A string
     * @return : The length of the longest substring
     *           that contains at most k distinct characters.
     */
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
          // write your code here
      int maxLen = 0;

      // Key: letter; value: the number of occurrences.
      Map<Character, Integer> map = new HashMap<Character, Integer>();
      int i, j = 0;
      char c;
      for (i = 0; i < s.length(); i++) {
        while (j < s.length()) {
          c = s.charAt(j);
          if (map.containsKey(c)) {
            map.put(c, map.get(c) + 1);
          } else {
            if(map.size() ==k)
              break;
            map.put(c, 1);
          }
          j++;
        }

        maxLen = Math.max(maxLen, j - i);
        c = s.charAt(i);
        if(map.containsKey(c)){
          int count = map.get(c);
          if (count > 1) {
            map.put(c, count - 1);
          } else {
            map.remove(c);
          }
        }
      }
      return maxLen;
  }
}

import java.util.HashMap;

class Solution {
    public static char mostFrequentChar(String s) {
      int max = 0;
      char mostFrequent = ' ';
      HashMap<Character, Integer> map = new HashMap<Character, Integer>();

      for(int i = 0; i < s.length(); i++){
          char cur = s.charAt(i);
          map.put(cur, map.getOrDefault(cur, 0) + 1);
      }
      for(int i = 0; i < s.length(); i++){
          int frequency = map.get(s.charAt(i));
          char cur = s.charAt(i);
          if(frequency > max){
              max = frequency;
              mostFrequent = cur;
          }
      }
      return mostFrequent;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
        System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
        System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
        System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
        System.out.println(Solution.mostFrequentChar("missisiipps")); // -> 'i'
    }

  }

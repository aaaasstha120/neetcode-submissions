class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            char ch1=t.charAt(i);

            int count1=countS.getOrDefault(ch,0);
            count1=count1+1;
            countS.put(ch,count1);
            int count2=countT.getOrDefault(ch1,0);
            count2=count2+1;
            countT.put(ch1,count2);
        }
        return countS.equals(countT);
    }
}

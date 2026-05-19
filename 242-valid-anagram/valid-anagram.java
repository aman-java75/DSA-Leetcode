class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        List<Character> list = new ArrayList<>();

        for(char st : s.toCharArray()){
            list.add(st);
        }

        for(char st : t.toCharArray()){
            if(list.contains(st)){
                list.remove(Character.valueOf(st));
            }
        }

        if(list.isEmpty()) return true;
        return false;
    }
}
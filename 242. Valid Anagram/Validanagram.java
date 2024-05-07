class Validanagram {
  public boolean isAnagram(String s, String t) {
      int[] letterCount = new int[26];
      if(s.length() != t.length()) return false;
      for(int i = 0; i < s.length(); i++) {
          letterCount[s.charAt(i) - 'a']++;
      }
      for(int i = 0; i < t.length(); i++) {
          letterCount[t.charAt(i) - 'a']--;
      }
      for(int i = 0; i < 26; i++) {
          if(letterCount[i] != 0) return false;
      }
      return true;
  }
}

//Validanagram v = new Validanagram();
//System.out.println(v.isAnagram("tar", "rat"));
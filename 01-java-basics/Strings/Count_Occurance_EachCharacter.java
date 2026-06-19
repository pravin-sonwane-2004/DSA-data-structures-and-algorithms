class Count_Occurance_Each_Character {
  void main() {
    String s = "praaaavin";
    int arr [] = new int[26];
    for(int i=0;i<s.length();i++) {
          arr[s.charAt(i) - 'a']++; 
    }
    for(int i=0;i<26;i++) {
      if(arr[i]>0) {
        char c = (char) (i + 'a');
        IO.println(c + "  " + arr[i]);
      }
      // IO.println(arr[i]);
    }
    //find non repeating characters
    IO.println("---------------------------------------------------");
    for(int i=0;i<26;i++) {
      if(arr[i]<2 && arr[i]>0) {
        char c = (char) (i+'a');
        IO.println(c);
      }
    }
  }
}
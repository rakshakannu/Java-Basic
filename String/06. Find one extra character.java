// given two strings, find the one extra character that is present in one of the strings
// the characters in the string can be in any order

// method - 1 
// sorting

 char FindExtra(String s1, String s2)
 {
  char a1[] = s1.toCharArray();
  Arrays.sort(a1);
  
  char a2[] = s2.toCharArray();
  Arrays.sort(a2);
  
  int n =s1.length();
  for(int i0;i<n;i++)
    if(a1[i]!=a2[i])
      return a2[i];
      
  return a2[n];
 }
 
 // method - 2
 
 
 // method - 3

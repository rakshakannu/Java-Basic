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
// counting
// assumption: only lowercase letters

char FindExtra(String s1, String s2)
{
 int count[] = new int[26]; // an array of size 256 can be created if the string will contain all ASCII characters.
 int n1 = s1.length();
 for(int i=0;i<n1;i++)
 {
  count[s1.charAt(i)-'a']++; // increment value in count array
  count[s2.charAt(i)-'a']--; // decrement value in count array
 }
 
 count[s2.charAt(i)-'a']++ // the last extra character in the longer string
 
 for(int i=0;i<n;i++)
 {
  if(count[i]==1)
   return (char)(i+'a');
 }
 
 return 0;
}

// method - 3
// using bitwise XOR operator
// BEST METHOD OF ALL

// 0 ^ 'a' = a
// 'a' ^ 'a' = 0

char findExtra(String s1, String s2)
{
 int res=0;
 int n1 = s1.length();
 for(int i=0;i<n1;i++)
 {
  res = res ^ s1.charAt(i) ^ s2.charAt(i);
 }
 
 res = res ^ s2.charAt(n);
 return (char)(res);
}

// time: theta(n)
// space: theta(1)

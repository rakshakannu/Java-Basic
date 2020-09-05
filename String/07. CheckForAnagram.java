// we need to check if they are permutations of each other or not

// naive solution
// sort the strings, if they are anagram, they will become identical

boolean arrAnagram(String s1, String s2)
{
  if(s1.length()!=s2.length())
    return false;
  
  char a1[] = s1.toCharArray();
  Arrays.sort(a1);
  s1 = new String(a1);
  
  char a2[] = s2.toCharArray();
  Arrays.sort(a2);
  s2 = new String(a2);
  
  return s1.equals(s2);
}

// time: n(logn)

// efficient solution
// time: linear

// use characters as indexes in an array

package org.example.twoPointers;

/*
Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

Example 2:

Input: s = "tab a cat"

Output: false
Explanation: "tabacat" is not a palindrome.

Constraints:

1 <= s.length <= 1000
s is made up of only printable ASCII characters.
 */
public class validPalindrome {

    public static boolean isPalindrome(String s){
        boolean resp = true;
        //Input: s = "Was it a car or a cat I saw?"
        //remove spaces and non-alphanumeric characters
        String lowerCaseS = s.toLowerCase();
        String noSpacesS = lowerCaseS.replaceAll("\\s", "");
        String noAlphaNumericS = noSpacesS.replaceAll("[^a-zA-Z0-9]","");
        char[] arrayS = noAlphaNumericS.toCharArray();
        //System.out.println(Arrays.toString(arrayS));
        //System.out.println(arrayS.length/2);
        //arrayS ={was,it,a,car,or,a,cat,i,saw}
        int middle = arrayS.length/2;
        int i;
        int j = middle-1;
        if(arrayS.length%2 == 0){//even
            for (i=middle;i<arrayS.length;i++){
                if(arrayS[i]==arrayS[j]){
                    j--;
                }else{
                    return false;
                }
            }
        }else{//odd
            for(i=middle;i< arrayS.length-1;i++){
                if(arrayS[i+1]==arrayS[j]){
                    j--;
                }else{
                    return false;
                }

            }
        }


        return resp;
    }

//Two Pointers Solution
    public boolean isPalindromeV2(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++; r--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }
}

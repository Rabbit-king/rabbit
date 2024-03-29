package second;

public class second_add {

}
class Solut {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left<right){
            char lc = chars[left];
            char rc = chars[right];
            if(!(isNum(lc)||isLower(lc)||isUpper(lc))){
                left++;
                continue;
            }
            if(!(isNum(rc)||isLower(rc)||isUpper(rc))){
                right--;
                continue;
            }
            if(isLower(rc)){
                rc -= 32;
            }
            if(isLower(lc)){
                lc -= 32;
            }
            if(rc != lc){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public boolean isNum(char c){
        return c>=48 && c<=57;
    }

    public boolean isLower(char c){
        return c>=97 && c<=122;
    }

    public boolean isUpper(char c){
        return c>=65 && c<=90;
    }
}

//以上是耗时1ms的算法

//耗时2ms的算法
//class Solution {
//public boolean isPalindrome(String s) {
//        int left = 0;
//        int right = s.length() - 1;
//        while (left < right){
//            while (left < right && !Character.isLetterOrDigit(s.charAt(left))){
//                left++;
//            }
//            while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
//                right--;
//            }
//            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
//                return false;
//            }
//            left++;
//            right--;
//        }
//        return true;
//    }
//}
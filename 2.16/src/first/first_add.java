package first;

public class first_add {

}
class Solut {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        //�����һ�о�ֱ�����
        
        int len = s.length();
        //�ַ�������
        
        int dRows = (numRows - 1) * 2;
        
        int l = (len - 1) / dRows;
        char[] cArr = new char[len];
        //�ַ�����
        
        int k = 0;
        for (int i=0; i<=l; i++) {
            cArr[k++] = s.charAt(i * dRows);
        }
        
        for (int j=1; j<numRows-1; j++) {
            for (int i=0; i<l; i++) {
                cArr[k++] = s.charAt(i * dRows + j);
                cArr[k++] = s.charAt(i * dRows + dRows - j);
            }
            if (l * dRows + j < len) {
                cArr[k++] = s.charAt(l * dRows + j);
            }
            if (l * dRows + dRows - j < len) {
                cArr[k++] = s.charAt(l * dRows + dRows - j);
            }
        }
        for (int i=0; i<l; i++) {
            cArr[k++] = s.charAt(i * dRows + numRows - 1);
        }
        if (l * dRows + numRows - 1 < len) {
            cArr[k++] = s.charAt(l * dRows + numRows - 1);
        }
        return String.valueOf(cArr);
    }
}
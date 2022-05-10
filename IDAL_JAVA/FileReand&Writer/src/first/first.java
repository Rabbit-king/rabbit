package first;

import java.io.*;

public class first {
    public static void main(String[] args) {
        File f = new File("H:\\Important_file\\Hive\\实验课\\sisth\\emp.txt");
        File f1 = new File("H:\\Important_file\\Hive\\实验课\\sisth\\emp1.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
            String s = null;
            String[] sa;
            while ((s = br.readLine()) != null) {
                sa = s.split("\t");
                for(int i=0;i<8;i++){
                    int index=0;
                    String sb="";
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


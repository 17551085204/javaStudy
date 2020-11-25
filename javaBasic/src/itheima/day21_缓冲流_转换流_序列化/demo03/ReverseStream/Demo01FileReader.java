package itheima.day21_缓冲流_转换流_序列化.demo03.ReverseStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
    FileReader可以读取IDE默认编码格式(UTF-8)的文件
    FileReader读取系统默认编码(中文GBK)会产生乱码���
 */
public class Demo01FileReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new FileReader("c.txt")));
        int len = 0;

        while((len = br.read())!=-1){
            System.out.print((char)len);
        }

//        while (br.readLine()!=null){
//            String line =br.readLine();
//            System.out.println(line);
//        }


        br.close();
    }
}

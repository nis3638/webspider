package client;/* *
* @Title: ${file_name} 
* @Package ${package_name} 
* @Description: ${todo} 
* @author jazzy Zhao  
* @date ${date} ${time} 
* @dep R&D GDT Co.,Ltd.
* @version V1.0 
*/

import Spider.FirstSpider;
import org.springframework.stereotype.Component;

import java.io.*;
import java.net.URL;

public class Client {
    public static void main(String args[]){
        String outpath = "d:\\abc.txt";
        String url = "http://www.jav28.com/cn/";
        //String path = "d:/111.txt";
        char[] b = new char[2];
        File outFile = new File(outpath);
        FileWriter fos = null;
        InputStream fis = null;
        InputStreamReader isr = null;
        FirstSpider firstSpider = null;
        try {
            firstSpider = new FirstSpider(url,outpath);
            /*
            fos=new FileWriter(outFile);
            fis=new FileInputStream(path);
            isr=new InputStreamReader(fis,"GBK");
            int i;
            while((i=isr.read(b))!=-1){
            //System.out.println((char)i);
            System.out.println(b);
            }
            */

            firstSpider.geneContents();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            System.out.println("out over");
        }
    }


    public boolean comparefile(File file_a,File file_b){
        boolean r = false;

        return r;
    }
}

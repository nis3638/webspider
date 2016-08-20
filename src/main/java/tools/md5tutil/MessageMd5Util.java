package tools.md5tutil;/* *
* @Title: ${file_name} 
* @Package ${package_name} 
* @Description: Md5相关工具类
* @author jazzy Zhao  
* @date ${date} ${time} 
* @dep R&D GDT Co.,Ltd.
* @version V1.0 
*/

import java.io.*;
import java.security.MessageDigest;

public class MessageMd5Util {
    public MessageDigest getMd() {
        return md;
    }

    public void setMd(MessageDigest md) {
        this.md = md;
    }

    MessageDigest md ;

    public static String geneMd5(String  file){
        return null;
    }
    public static String geneMd5(File file){
        FileInputStream fis = null;
        byte[] b = new byte[256];
        try {
            fis = new FileInputStream(file);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

}

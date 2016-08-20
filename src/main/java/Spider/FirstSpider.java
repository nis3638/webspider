package Spider;/* *
* @Title: the first spider
* @Package ${package_name} 
* @Description: ${todo} 
* @author jazzy Zhao  
* @date ${date} ${time} 
* @dep R&D GDT Co.,Ltd.
* @version V1.0 
*/

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class FirstSpider {
    public String fetchUrl;// 抓取的url
    public String storagePath;// 文件存储地址

    public String getFetchUrl() {
        return fetchUrl;
    }

    public void setFetchUrl(String fetchUrl) {
        this.fetchUrl = fetchUrl;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public FirstSpider() {
    }

    public FirstSpider(String fetchUrl, String storagePath) {
        this.fetchUrl = fetchUrl;
        this.storagePath = storagePath;
    }
    public void geneContents() throws IOException {
        geneContents(null, null) ;
    }
    public void geneContents(String fetchUrl, String path) throws IOException {
         if (fetchUrl==null) {
             fetchUrl = getFetchUrl();
         }
        if(path == null){
            path = getStoragePath();
        }
        int readnum = 0;
        int len = 0;
        File file = new File(path);
        URL url = new URL(fetchUrl);
        FileOutputStream fos = null;
        InputStream is = null;
        try {
            fos = new FileOutputStream(file);
            byte[] b = new byte[12];
            is = url.openStream();
            while (((len = is.read(b)) != -1)) {
                fos.write(b);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            fos.flush();
            fos.close();
            is.close();
        }


        /*for(;readnum!=-1;readnum=readnum+256){

        }*/


    }
}

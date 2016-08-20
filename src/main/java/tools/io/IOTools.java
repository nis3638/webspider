package tools.io;/* *
* @Title: ${file_name} 
* @Package ${package_name} 
* @Description: ${todo} 
* @author jazzy Zhao  
* @date ${date} ${time} 
* @dep R&D GDT Co.,Ltd.
* @version V1.0 
*/

import com.sun.javafx.scene.control.skin.VirtualFlow;
import tools.StringUtils.StringUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IOTools implements IioTools{
    AVFileNameFilter av;

    public AVFileNameFilter getAv() {
        return av;
    }

    public void setAv(AVFileNameFilter av) {
        this.av = av;
    }

    @Override
    public List<String> showFilesInDir(String dir) {
        File file = new File(dir);
        if(file.isFile()){
            return new ArrayList<String>();
        }

        File[] all_file_name = file.listFiles();
        //遍历所有file对象

        // 如果是文件夹，跳出调用

        List list = listFileAllPath4FileName(all_file_name);
        return list;
    }

    //遍历文件夹下符合
    public List<File> listFileAllPath(File[] args){
        //args.forEach(file->);
        List<File> f_lst = new ArrayList<>();
        for(File f:args){
            if (f.isDirectory()) listFileAllPath(f.listFiles());
            else {
                if (av.accept(f,f.getName())) f_lst.add(f);
            }
        }
        return f_lst;
    }


    //遍历文件夹下符合
    public List<String> listFileAllPath4FileName(File[] args){
        //args.forEach(file->);
        List<String> f_lst = new ArrayList<>();
        if (args==null||args.length==0) return f_lst;
        for(File f:args){
            if (f.isDirectory())
                f_lst.addAll(listFileAllPath4FileName(f.listFiles()));
            else {
                if (av.accept(f,f.getName())) f_lst.add(f.getPath().toString()+"/"+f.getName());
            }
        }
        return f_lst;
    }

}

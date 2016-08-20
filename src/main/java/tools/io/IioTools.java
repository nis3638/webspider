package tools.io;/* *
* @Title: ${file_name} 
* @Package ${package_name} 
* @Description: ${todo} 
* @author jazzy Zhao  
* @date ${date} ${time} 
* @dep R&D GDT Co.,Ltd.
* @version V1.0 
*/

import java.util.List;

public interface IioTools {
    /**
     * 返回指定路径下的文件名称
     * @param dir 文件夹路径
     * @return 文件夹下文件名称
     */
    public List<String> showFilesInDir(String dir);
}

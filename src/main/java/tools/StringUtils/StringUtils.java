package tools.StringUtils;/* *
* @Title: String 工具类
* @Package ${package_name} 
* @Description: ${todo} 
* @author jazzy Zhao  
* @date ${date} ${time} 
* @dep R&D GDT Co.,Ltd.
* @version V1.0 
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {

    /**
     * String array 2 string string.
     *
     * @param args the args
     * @return the string
     */
    public static String StringArray2String(String[] args){
        StringBuffer sb = new StringBuffer();
        List<String> list = Arrays.asList(args);
        list.forEach(b ->  sb.append(b+"\n") );
        //System.out.println(sb.toString());
        return sb.toString();
    }
}

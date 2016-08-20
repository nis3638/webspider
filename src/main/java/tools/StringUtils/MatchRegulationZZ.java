package tools.StringUtils;/* *
* @Title: ${file_name} 
* @Package ${package_name} 
* @Description: 正则表达式
* @author jazzy Zhao  
* @date ${date} ${time} 
* @dep R&D GDT Co.,Ltd.
* @version V1.0 
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchRegulationZZ implements  IMatchRegulation{
    private String reg=".*\\.(mkv|avi|mp4)$";

    public String getReg() {
        return reg;
    }

    public void setReg(String reg) {
        this.reg = reg;
    }

    @Override
    public boolean matchRegulation(String matchs) {
        //String  reg = "";
        Pattern pattern = Pattern.compile(reg,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(matchs);
        return matcher.matches();
    }
}

package tools.StringUtils;/* *
* @Title: ${file_name} 
* @Package ${package_name} 
* @Description: 匹配规则
* @author jazzy Zhao  
* @date ${date} ${time} 
* @dep R&D GDT Co.,Ltd.
* @version V1.0 
*/

/**
 * The interface Match regulation.
 */
public interface IMatchRegulation
{
    /**
     * Match regulation boolean.
     * 匹配方法
     * @param matchs the matchs 要匹配的源字符
     * @param reg    the reg  匹配规则
     * @return the boolean
     */
    public boolean matchRegulation(String matchs);
}

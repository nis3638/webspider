package tools.io;/* *
* @Title: ${file_name} 
* @Package ${package_name} 
* @Description: ${todo} 
* @author jazzy Zhao  
* @date ${date} ${time} 
* @dep R&D GDT Co.,Ltd.
* @version V1.0 
*/

import tools.StringUtils.IMatchRegulation;

import java.io.File;
import java.io.FilenameFilter;

public  class AVFileNameFilter  implements FilenameFilter{
    private String endwith;
    IMatchRegulation imr;
    /**
     * 对于文件夹的处理方式
     * */
    private IioTools iotools;

    public IioTools getIotools() {
        return iotools;
    }

    public void setIotools(IioTools iotools) {
        this.iotools = iotools;
    }

    AVFileNameFilter(String endwith){
        this.endwith = endwith;
    }

    public AVFileNameFilter() {
    }

    public IMatchRegulation getImr() {
        return imr;
    }

    public void setImr(IMatchRegulation imr) {
        this.imr = imr;
    }

    @Override
    public boolean accept(File dir, String name) {
        String path = new StringBuffer(dir.getPath()).append("\\").append(name).toString();
        File file = new File(path);
        if (file.isDirectory())
        {
                return false;
        }
       // if (dir.getName().matches())
        if(this.getImr().matchRegulation(name)){
            //system.out.println(dir.getPath());
            return true;
        }

        return false;
    }
}

import tools.StringUtils.IMatchRegulation;
import tools.StringUtils.MatchRegulationZZ;
import tools.io.AVFileNameFilter;
import tools.io.IOTools;

import java.util.List;

import static tools.StringUtils.StringUtils.StringArray2String;

public class IOClient {

    public static void main(String[] args){
        String path = "F://";
        IOTools ioTools = new IOTools();
        AVFileNameFilter av = new AVFileNameFilter();
        MatchRegulationZZ mr = new MatchRegulationZZ();
        mr.setReg(".*\\.(mkv|avi|mp4|wmv)$");
        av.setImr(mr);
        ioTools.setAv(av);
        List<String> list = ioTools.showFilesInDir(path);
        String[] filenames =  list.toArray(new String[99999]);
        System.out.println(StringArray2String(filenames));



    }
    public void test(){
        SingleClass sc = new SingleClass("aaa");

    }

    class  ThreadA implements Runnable{

        @Override
        public void run() {
            System.out.println("aaaaaa");

        }
    }

    private class SingleClass {
        private SingleClass b ;

        public SingleClass getB() {
            return b;
        }

        private void setB(SingleClass b) {
            this.b = new SingleClass("bb");
        }

        private SingleClass(String aa){
            System.out.println(" aa object "+aa);
        }
    }
}

/**
 * Created by chengxiao on 2016/11/30.
 */
public class Demo {
    public static void main(String []args) throws Exception {
        exec();
        //Arrays.sort();
    }
    public static void exec() throws Exception {
        try{
            String str = null;
            String[] strs = str.split(",");
        }catch (Exception e){

            e.printStackTrace();
            throw e;
        }finally {
            foo();
        }

    }
    public static void foo(){
        System.out.println("主函数执行中");
    }
}

import java.util.ArrayList;

//什么是注解
@SuppressWarnings("all")
public class test01 extends Object {

    //@Override重写的注解
    @Override
    public String toString() {
        return super.toString();
    }
    //@Deprecated不推荐程序员使用，但是可以使用，或者存在   更好的方式
    @Deprecated
    public static void test(){
    System.out.println("Deprecated");
    }
    public void test02{
        List list = new ArrayList();
    }

    public  static void main(String[] args){
        test();
    }

}

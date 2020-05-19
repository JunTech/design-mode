package top.juntech.singleton;

/**
 * @author juntech
 * @version ${version}
 * @date 2020/5/19 11:04
 * @ClassName 类名
 * @Descripe 描述
 */
public class InnerClassSingleton {
    public static void main(String[] args) {

    }
}

class InnerClass {
    //准备静态内部类
    private static class InnerClassHolder {
        private static InnerClass innerClass = new InnerClass();
    }
//    私有构造器
    private InnerClass() {

    }
//    公有方法
    public static InnerClass getInstance(){
        return InnerClassHolder.innerClass;
    }
}

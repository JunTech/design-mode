package top.juntech.singleton;

/**
 * @author juntech
 * @version ${version}
 * @date 2020/5/19 10:42
 * @ClassName 类名
 * @Descripe 描述
 */
public class LazySingleton {
    public static void main(String[] args) {
/*        SingletonDemo singletonDemo1 = SingletonDemo.getInstance();
        SingletonDemo singletonDemo2 = SingletonDemo.getInstance();*/
        new Thread(()->{
            SingletonDemo singletonDemo1 = SingletonDemo.getInstance();
            System.out.println(singletonDemo1);
        }).start();

        new Thread(()->{
            SingletonDemo singletonDemo2 = SingletonDemo.getInstance();
            System.out.println(singletonDemo2);
        }).start();

    }
}


class SingletonDemo{
    //静态初始化对象实例
    private static volatile SingletonDemo singletonDemo;
    //私有化构造器
    private SingletonDemo(){

    }
    //暴露一个静态公有的getInstance方法
    public static SingletonDemo getInstance(){
        if(singletonDemo==null){
            synchronized (SingletonDemo.class){
                if(singletonDemo==null){
                    singletonDemo = new SingletonDemo();
                }
            }
        }
        return singletonDemo;
    }
}

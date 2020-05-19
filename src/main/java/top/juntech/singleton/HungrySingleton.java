package top.juntech.singleton;

/**
 * @author juntech
 * @version ${version}
 * @date 2020/5/19 10:56
 * @ClassName 类名
 * @Descripe 单例模式 ---饿汉
 */
public class HungrySingleton {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            HungrySingletonDemo instance = HungrySingletonDemo.getInstance();
            System.out.println(instance);
        });
        Thread t2 = new Thread(()->{
            HungrySingletonDemo instance1 = HungrySingletonDemo.getInstance();
            System.out.println(instance1);
        });
       t1.start();
       t2.start();
    }
}


class HungrySingletonDemo{
    //实例化
    private static HungrySingletonDemo instance = new HungrySingletonDemo();

    //构造器私有化
    private HungrySingletonDemo(){

    }

    //公有获取实例的方法
    public static HungrySingletonDemo getInstance(){
        return instance;
    }
}

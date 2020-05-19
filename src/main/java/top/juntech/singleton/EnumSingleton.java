package top.juntech.singleton;

/**
 * @author juntech
 * @version ${version}
 * @date 2020/5/19 11:13
 * @ClassName 类名
 * @Descripe 描述
 */
public enum EnumSingleton {
    INSTANCE;

    public void print(){
        System.out.println(this.hashCode());
    }
}

class EnumTest{
    public static void main(String[] args) {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton singleton2 = EnumSingleton.INSTANCE;
        System.out.println(singleton==singleton2);
    }
}

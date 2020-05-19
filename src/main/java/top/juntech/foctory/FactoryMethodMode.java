package top.juntech.foctory;

/**
 * @author juntech
 * @version ${version}
 * @date 2020/5/19 11:21
 * @ClassName 类名
 * @Descripe 描述
 */
public class FactoryMethodMode {
    public static void main(String[] args) {
        Application application = new CreateA();
        Product product = application.getObject();
        product.method();
    }
}


interface Product{
    public void method();
}


class ProductA implements Product{

    @Override
    public void method() {
        System.out.println("product A");
    }
}

class ProductB implements Product{

    @Override
    public void method() {
        System.out.println("product B");
    }
}

class SimpleFactory{

    public static Product createProduct(String type){
        if(type.equals("0")){
            return new ProductA();
        }else if(type.equals("1")){
            return new ProductB();
        }else {
            return null;
        }
    }
}


abstract class Application{
    abstract Product createProduct();

    Product getObject(){
        Product product = createProduct();

        return product;
    }
}


class CreateA extends Application{

    @Override
    Product createProduct() {
        return new ProductA();
    }

}

class CreateB extends Application{

    @Override
    Product createProduct() {
        return new ProductB();
    }

}

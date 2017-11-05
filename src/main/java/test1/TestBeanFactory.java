package test1;


public class TestBeanFactory {

    public static TestBean getInstance(String name){
        return new TestBean(name);
    }

    public static TestBean getInstance(){
        return new TestBean();
    }

    public TestBean getInstance1(String name){
        return new TestBean(name + " in instance 1");
    }
}

package test1;


public class TestBean {
    private String name;

    public TestBean(){
        this.name = "no name";
    }

    public TestBean(String name){
        this.name = name;
    }

    public void sayName(){
        System.out.println(name);
    }
}

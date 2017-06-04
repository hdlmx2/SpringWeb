package cn.hdlmx.spring.struts2.bean;

public class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("my name is:" + name);
    }
}

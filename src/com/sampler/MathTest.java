package com.sampler;

public class MathTest {
    public String sayHello()
    {
        return "Hello";
    }
    public String sayHelloToPerson(String s)
    {
        if(s == null || s.equals(""))
            s = "nobody";
        return (new StringBuilder()).append("Hello ").append(s).toString();
    }
    public int sum(int a,int b)
    {
        return a+b;
    }

    public static void main(String args[]){
        MathTest math = new MathTest();
        System.out.println(math.sum(1, 2));
    }

}

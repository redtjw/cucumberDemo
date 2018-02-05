package com.xiniu.futurehis.cucumbertest.action;

/**
 * @Author wb-tjw362524
 * @Description
 * @Date 10:54 2018/2/5
 */
public class Calculator {
    private int num1;
    private int num2;
    private int total;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void calculate(){
        total = num1+num2;
    }
}

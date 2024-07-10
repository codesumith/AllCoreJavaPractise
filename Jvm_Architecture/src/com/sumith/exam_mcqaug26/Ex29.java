package com.sumith.exam_mcqaug26;
class Demo {
    public void display(String num1) {
        System.out.println("String==>" + num1);
    }
}

class Test3 extends Demo{
    public void display(Object num1) {
        System.out.println("Object==>" + num1);
    }
}
public class Ex29
{
    public static void main(String[] args) {
        Test3 test = new Test3();
        test.display(null);
    }
}
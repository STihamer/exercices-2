package second_part.ex9;

import second_part.ex7.Student;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

//https://www.hackerrank.com/challenges/java-reflection-attributes/problem?isFullScreen=true
public class Main {
    public static void main(String[] args) {
        Students student = new Students();
        Class c = student.getClass();
        Method[] methods = c.getDeclaredMethods();
        System.out.println(methods.length);


        ArrayList<String> methodList = new ArrayList<>();
        for(int i = 0; i < methods.length; i++){
            methodList.add(methods[i].toString());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}

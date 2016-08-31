package jp.techacademy.takumi.fukushima.javalog;

import android.util.Log;

public class Human extends Animal implements Thinkable{

    String hobby;

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say(){
        Log.d("javatest", "「私の名前は" + name + "で、年は" + String.valueOf(age) + "歳です。」");
    }

    public void think(){
        Log.d("javatest", "「私は、" + hobby + "について考える」");
    }
}

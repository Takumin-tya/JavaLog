package jp.techacademy.takumi.fukushima.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //人間作成
        Human human = new Human("太郎", 24, "バイク");
        //喋る
        human.say();
        //考える
        human.think();

    }

}

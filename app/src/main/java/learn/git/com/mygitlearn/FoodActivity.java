package learn.git.com.mygitlearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dowork();
        goodwork();
        System.out.print("我是张三的食品");
    }


    private void dowork() {
    }
    private void goodwork() {
        System.out.println("hello world");
        System.out.println("zhaoliu");
    }
}

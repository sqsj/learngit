package learn.git.com.mygitlearn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dowork();
        goodwork();
    }


    private void dowork() {
    }
    private void goodwork() {
        System.out.println("hello world");
        System.out.println("we are zhangsan");
    }
}

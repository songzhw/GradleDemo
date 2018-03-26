package ca.six.dependencies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ca.six.lib.Bean;
import de.greenrobot.event.EventBus;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bean bean = new Bean();
        EventBus eventBus = EventBus.getDefault();
    }
}

/*
1.
compile project(path: ':lib')
app可以使用lib中才导入了的EventBus

2.

 */

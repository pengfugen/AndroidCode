package pfg.com.androidcode;

import android.app.Activity;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {

    private static String TAG = "MainActivity";

    Button btn;
    Button camera_basic, camera_raw, camera_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(btnListener);
        LogTool.logd(TAG, "onCreate===========");

    }

    BtnOnClickListener btnListener = new BtnOnClickListener();

    private class BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.btn) {
                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                startActivity(intent);
            }
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogTool.logd(TAG, "onPause===========");
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogTool.logd(TAG, "onStop===========");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogTool.logd(TAG, "onDestroy===========");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogTool.logd(TAG, "onNewIntent intent = "+intent);
    }
}

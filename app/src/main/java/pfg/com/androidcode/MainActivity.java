package pfg.com.androidcode;

import android.app.Activity;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import pfg.com.server.PlayVideoActivity;

public class MainActivity extends Activity {

    private static String TAG = "MainActivity";

    Button btn;
    Button camera_basic, camera_raw, camera_video, play_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(btnListener);

        camera_basic = (Button) findViewById(R.id.camera_basic);
        camera_basic.setOnClickListener(btnListener);

        camera_raw = (Button) findViewById(R.id.camera_raw);
        camera_raw.setOnClickListener(btnListener);

        camera_video = (Button) findViewById(R.id.camera_video);
        camera_video.setOnClickListener(btnListener);

        play_video = (Button) findViewById(R.id.play_video);
        play_video.setOnClickListener(btnListener);
        LogTool.logd(TAG, "onCreate===========");

    }

    BtnOnClickListener btnListener = new BtnOnClickListener();

    private class BtnOnClickListener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.btn) {
                Intent intent = new Intent(MainActivity.this, ActivityB.class);
                startActivity(intent);
            } else if (v.getId() == R.id.camera_basic) {
                Intent intent = new Intent(MainActivity.this, Camera2BasicActivity.class);
                startActivity(intent);
            } else if(v.getId() == R.id.camera_raw) {
                Intent intent = new Intent(MainActivity.this, Camera2RawActivity.class);
                startActivity(intent);
            } else if(v.getId() == R.id.camera_video) {
                Intent intent = new Intent(MainActivity.this, Camera2VideoActivity.class);
                startActivity(intent);
            } else if(v.getId() == R.id.play_video) {
                Intent intent = new Intent(MainActivity.this, PlayVideoActivity.class);
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

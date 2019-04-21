package pfg.com.androidcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by FPENG3 on 2019/4/20.
 */

public class ActivityBase extends Activity {
    protected String TAG = this.getClass().getSimpleName();

    protected Button btn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn = (Button) findViewById(R.id.btn);
        btn.setText(TAG);
        LogTool.logd(TAG, "onCreate===========");
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

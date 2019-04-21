package pfg.com.androidcode;

import android.app.Activity;
import android.os.Bundle;

import pfg.com.androidcode.camera2raw.Camera2RawFragment;

/**
 * Created by FPENG3 on 2019/4/16.
 */

public class Camera2RawActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        if (null == savedInstanceState) {
            getFragmentManager().beginTransaction()
                    .replace(R.id.container, Camera2RawFragment.newInstance())
                    .commit();
        }
    }
}

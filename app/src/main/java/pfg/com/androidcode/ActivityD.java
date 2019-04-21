package pfg.com.androidcode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by FPENG3 on 2019/4/20.
 */

public class ActivityD extends ActivityBase {
    //private static String TAG = "ActivityD";
    //Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityD.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }


}

package pfg.com.server;

import android.app.Activity;
import android.os.Bundle;
import android.view.SurfaceView;

import pfg.com.androidcode.R;

public class PlayVideoActivity extends Activity {
    private SurfaceView mSurfaceView;
    private Server mServer;
    private VideoDecoder mVideoDecoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_video);
        mSurfaceView = (SurfaceView) findViewById(R.id.surfaceView1);
        mServer = Server.getInstance();
        mVideoDecoder = new VideoDecoder(mSurfaceView.getHolder().getSurface(),
                mServer);
        mVideoDecoder.start();
    }
}

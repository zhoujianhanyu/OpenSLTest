
package com.pzhao.opensltest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.nio.ByteBuffer;

public class MainActivity extends Activity implements OnClickListener {
    private Button start;
    private Button pause;
    private Button mute;
    private Button unmute; 
    private Button stop;
    private boolean isPause=true;
    public ByteBuffer buffer;
    public WriteThread thread;
    private static String URI_PCM = "/storage/emulated/0/DCIM/ye.wav";  
    static {
        System.loadLibrary("OpenSLTest");
   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=(Button)findViewById(R.id.uri_start);
        pause=(Button)findViewById(R.id.pause);
        mute=(Button)findViewById(R.id.mute);
        unmute=(Button)findViewById(R.id.unmute);
        stop=(Button)findViewById(R.id.stop);
        buffer=ByteBuffer.allocateDirect(480);
        thread=new WriteThread(this);
        
        createEngine(buffer);
        setJniEnv();
        
        start.setOnClickListener(this);
        pause.setOnClickListener(this);
        mute.setOnClickListener(this);
        unmute.setOnClickListener(this);
        stop.setOnClickListener(this);

    }
    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        switch(arg0.getId()){
            case R.id.uri_start:
                createAudioPlayer();
                thread.start();
                break;
            case R.id.pause:
                isPause=!isPause;
                setPlayingUriAudioPlayer(isPause);
                break;
            case R.id.mute:
                setMuteUriAudioPlayer(true);
                break;
            case R.id.unmute:
                setMuteUriAudioPlayer(false);
                break;
            case R.id.stop:
                thread.isRuning=false;
                break;
        }
        
    }
    
    protected void onDestroy() {  
        super.onDestroy();  
        thread.isRuning=false;
    } 
    
    private void fromJni(int i){
        Log.d("OpenSLTest", "from Jni "+i);
    }
    
    /** Native methods, implemented in jni folder */  
    private native void setJniEnv();
    
    public static native void createEngine(ByteBuffer buffer); 
    
    public static native boolean checkWrite();
    
    public static native void write();
  
    public static native boolean createAudioPlayer();

    public static native void setPlayingUriAudioPlayer(boolean isPlaying);

    public static native void setMuteUriAudioPlayer(boolean mute);
  
    public static native void shutdown();
   

}

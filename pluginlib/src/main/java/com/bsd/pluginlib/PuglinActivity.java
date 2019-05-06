package com.bsd.pluginlib;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class PuglinActivity extends Activity implements IPlugin {
    private int mFrom = FROM_INTERNAL;
    //插件的上下文
    private Activity mProxyAtivity;

    @Override
    public void attach(Activity proxyActivity) {
        this.mProxyAtivity = proxyActivity;
    }

    @Override
    public void onCreate(Bundle saveInstanceState) {
        if(saveInstanceState!=null){
            mFrom = saveInstanceState.getInt("FROM");
        }
        if(mFrom==FROM_INTERNAL){
            super.onCreate(saveInstanceState);
        }
    }

    @Override
    public void setContentView(int layoutResID) {
        if(mFrom == FROM_INTERNAL) {
            super.setContentView(layoutResID);
        }else{
            mProxyAtivity.setContentView(layoutResID);
        }
    }

    @Override
    public void onStart() {
        if(mFrom == FROM_INTERNAL){
            super.onStart();
        }
    }

    @Override
    public void onRestart() {
        if(mFrom == FROM_INTERNAL){
            super.onRestart();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(mFrom == FROM_INTERNAL){
            super.onActivityResult(requestCode,resultCode,data);
        }
    }

    @Override
    public void onResume() {
        if(mFrom == FROM_INTERNAL){
            super.onResume();
        }
    }

    @Override
    public void onPause() {
        if(mFrom == FROM_INTERNAL){
            super.onPause();
        }
    }

    @Override
    public void onStop() {
        if(mFrom == FROM_INTERNAL){
            super.onStop();
        }
    }

    @Override
    public void onDestory() {
        if(mFrom == FROM_INTERNAL){
            super.onDestroy();
        }
    }
}

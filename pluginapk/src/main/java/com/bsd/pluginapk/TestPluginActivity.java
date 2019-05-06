package com.bsd.pluginapk;

import android.os.Bundle;

import com.bsd.pluginlib.PuglinActivity;

public class TestPluginActivity extends PuglinActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plugin_test);
    }
}

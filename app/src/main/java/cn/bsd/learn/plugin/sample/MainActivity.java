package cn.bsd.learn.plugin.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bsd.pluginlib.PluginManager;
import com.bsd.pluginlib.ProxyActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PluginManager.getInstance().init(this);
        findViewById(R.id.jiazai).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apkPath = Utils.copyAssetAndWrite(MainActivity.this, "plugin.apk");
                //加载apk
                PluginManager.getInstance().loadAPk(apkPath);
            }
        });
        findViewById(R.id.tiaozhuan).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //指定跳转的类名
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, ProxyActivity.class);
                intent.putExtra("className","com.bsd.pluginapk.TestPluginActivity");
                startActivity(intent);
            }
        });
    }
}

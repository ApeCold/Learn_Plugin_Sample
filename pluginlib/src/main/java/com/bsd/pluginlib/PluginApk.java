package com.bsd.pluginlib;

import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;

import dalvik.system.DexClassLoader;

//插件apk信息的实体对象
public class PluginApk {
    public PackageInfo mPackageInfo;
    public DexClassLoader mDexClassLoader;
    public AssetManager mAssetManager;
    public Resources mResources;

    public PluginApk(PackageInfo mPackageInfo, DexClassLoader mDexClassLoader, Resources mResources) {
        this.mPackageInfo = mPackageInfo;
        this.mDexClassLoader = mDexClassLoader;
        this.mAssetManager = mResources.getAssets();
        this.mResources = mResources;
    }
}

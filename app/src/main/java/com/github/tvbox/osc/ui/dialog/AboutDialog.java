package com.github.tvbox.osc.ui.dialog;

import android.content.Context;

import android.widget.TextView;

import androidx.annotation.NonNull;

import com.github.tvbox.osc.R;

import com.github.tvbox.osc.BuildConfig;

import org.jetbrains.annotations.NotNull;

public class AboutDialog extends BaseDialog {
    private TextView appVersion;

    public AboutDialog(@NonNull @NotNull Context context) {
        super(context);
        setContentView(R.layout.dialog_about);
        appVersion = findViewById(R.id.appVersion);
        appVersion.setText(String.format("本软件只提供聚合展示功能，所有资源来自网上, 软件不参与任何制作, 上传, 储存, 下载等内容. 软件仅供学习参考, 请于安装后24小时内删除。\n\n当前版本:" + BuildConfig.VERSION_NAME));
    }
}

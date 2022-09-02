package com.github.tvbox.osc.ui.dialog;

import android.content.Context;

import android.widget.TextView;

import androidx.annotation.NonNull;

import com.github.tvbox.osc.R;

import org.jetbrains.annotations.NotNull;

public class AboutDialog extends BaseDialog {
    private TextView appVersion;

    public AboutDialog(@NonNull @NotNull Context context) {
        super(context);
        setContentView(R.layout.dialog_about);
        appVersion = findViewById(R.id.appVersion);
        appVersion.setText(String.format("Version:" + BuildConfig.VERSION_NAME));
    }
}

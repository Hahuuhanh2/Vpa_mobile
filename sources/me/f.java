package me;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;

/* compiled from: RemindDialog */
public final class f extends Dialog implements View.OnClickListener {
    public f(Context context, String str) {
        super(context, R$style.Picture_Theme_Dialog);
        setContentView(R$layout.ps_remind_dialog);
        ((TextView) findViewById(R$id.tv_content)).setText(str);
        ((TextView) findViewById(R$id.btnOk)).setOnClickListener(this);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R$style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }

    public final void onClick(View view) {
        if (view.getId() == R$id.btnOk) {
            dismiss();
        }
    }
}

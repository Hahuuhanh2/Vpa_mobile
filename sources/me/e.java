package me;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.WindowManager;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;

/* compiled from: PictureLoadingDialog */
public final class e extends Dialog {
    public e(Context context) {
        super(context, R$style.Picture_Theme_AlertDialog);
        setCancelable(true);
        setCanceledOnTouchOutside(false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.ps_alert_dialog);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setWindowAnimations(R$style.PictureThemeDialogWindowStyle);
        getWindow().setAttributes(attributes);
    }
}

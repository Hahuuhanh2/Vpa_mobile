package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$style;

/* compiled from: TooltipPopup */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1214a;

    /* renamed from: b  reason: collision with root package name */
    public final View f1215b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f1216c;

    /* renamed from: d  reason: collision with root package name */
    public final WindowManager.LayoutParams f1217d;

    /* renamed from: e  reason: collision with root package name */
    public final Rect f1218e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final int[] f1219f = new int[2];

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1220g = new int[2];

    public s0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1217d = layoutParams;
        this.f1214a = context;
        View inflate = LayoutInflater.from(context).inflate(R$layout.abc_tooltip, (ViewGroup) null);
        this.f1215b = inflate;
        this.f1216c = (TextView) inflate.findViewById(R$id.message);
        layoutParams.setTitle(s0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R$style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}

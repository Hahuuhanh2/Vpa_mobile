package c4;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import n4.f;

/* compiled from: LPaint */
public final class a extends Paint {
    public a() {
    }

    public final void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = f.f13512a;
            setColor((Math.max(0, Math.min(255, i10)) << 24) | (color & 16777215));
            return;
        }
        PointF pointF2 = f.f13512a;
        super.setAlpha(Math.max(0, Math.min(255, i10)));
    }

    public final void setTextLocales(LocaleList localeList) {
    }

    public a(int i10) {
        super(i10);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(PorterDuff.Mode mode, int i10) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
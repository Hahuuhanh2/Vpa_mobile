package d5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import h.a;
import l.c;
import m1.e;

/* compiled from: DrawableDecoderCompat */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f8747a = true;

    public static Drawable a(Context context, Context context2, int i10, Resources.Theme theme) {
        Context context3;
        try {
            if (f8747a) {
                if (theme != null) {
                    context3 = new c(context2, theme);
                } else {
                    context3 = context2;
                }
                return a.a(context3, i10);
            }
        } catch (NoClassDefFoundError unused) {
            f8747a = false;
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return k1.a.getDrawable(context2, i10);
            }
            throw e10;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal<TypedValue> threadLocal = e.f13062a;
        return e.a.a(resources, i10, theme);
    }
}

package i1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.R$drawable;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: NotificationCompat */
public abstract class s {

    /* renamed from: a  reason: collision with root package name */
    public p f10994a;

    /* compiled from: NotificationCompat */
    public static class a {
        public static void a(RemoteViews remoteViews, int i10, int i11, float f10) {
            remoteViews.setTextViewTextSize(i10, i11, f10);
        }

        public static void b(RemoteViews remoteViews, int i10, int i11, int i12, int i13, int i14) {
            remoteViews.setViewPadding(i10, i11, i12, i13, i14);
        }
    }

    public void a(Bundle bundle) {
        String e10 = e();
        if (e10 != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", e10);
        }
    }

    public abstract void b(t tVar);

    public final Bitmap c(IconCompat iconCompat, int i10, int i11) {
        int i12;
        Object obj;
        Resources resources;
        Context context = this.f10994a.f10970a;
        if (iconCompat.f2120a == 2 && (obj = iconCompat.f2121b) != null) {
            String str = (String) obj;
            if (str.contains(":")) {
                String str2 = str.split(":", -1)[1];
                String str3 = str2.split("/", -1)[0];
                String str4 = str2.split("/", -1)[1];
                String str5 = str.split(":", -1)[0];
                if (!"0_resource_name_obfuscated".equals(str4)) {
                    String d10 = iconCompat.d();
                    if ("android".equals(d10)) {
                        resources = Resources.getSystem();
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(d10, 8192);
                            if (applicationInfo != null) {
                                resources = packageManager.getResourcesForApplication(applicationInfo);
                            }
                        } catch (PackageManager.NameNotFoundException unused) {
                            String.format("Unable to find pkg=%s for icon", new Object[]{d10});
                        }
                        resources = null;
                    }
                    int identifier = resources.getIdentifier(str4, str3, str5);
                    if (iconCompat.f2124e != identifier) {
                        iconCompat.f2124e = identifier;
                    }
                }
            }
        }
        Drawable e10 = IconCompat.a.e(IconCompat.a.f(iconCompat, context), context);
        if (i11 == 0) {
            i12 = e10.getIntrinsicWidth();
        } else {
            i12 = i11;
        }
        if (i11 == 0) {
            i11 = e10.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i12, i11, Bitmap.Config.ARGB_8888);
        e10.setBounds(0, 0, i12, i11);
        if (i10 != 0) {
            e10.mutate().setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        e10.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public final Bitmap d(int i10, int i11, int i12, int i13) {
        int i14 = R$drawable.notification_icon_background;
        if (i13 == 0) {
            i13 = 0;
        }
        Context context = this.f10994a.f10970a;
        PorterDuff.Mode mode = IconCompat.f2119k;
        context.getClass();
        Bitmap c10 = c(IconCompat.b(context.getResources(), context.getPackageName(), i14), i13, i11);
        Canvas canvas = new Canvas(c10);
        Drawable mutate = this.f10994a.f10970a.getResources().getDrawable(i10).mutate();
        mutate.setFilterBitmap(true);
        int i15 = (i11 - i12) / 2;
        int i16 = i12 + i15;
        mutate.setBounds(i15, i15, i16, i16);
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
        mutate.draw(canvas);
        return c10;
    }

    public abstract String e();

    public RemoteViews f() {
        return null;
    }

    public void g() {
    }

    public void h() {
    }

    public final void i(p pVar) {
        if (this.f10994a != pVar) {
            this.f10994a = pVar;
            if (pVar != null) {
                pVar.f(this);
            }
        }
    }
}

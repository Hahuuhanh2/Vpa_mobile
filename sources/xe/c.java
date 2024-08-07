package xe;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;

/* compiled from: DensityUtil */
public final class c {
    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getApplicationContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int b(Context context, String str) {
        float f10;
        try {
            int identifier = Resources.getSystem().getIdentifier(str, "dimen", "android");
            if (identifier <= 0) {
                return 0;
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
            int dimensionPixelSize2 = Resources.getSystem().getDimensionPixelSize(identifier);
            if (dimensionPixelSize2 >= dimensionPixelSize) {
                return dimensionPixelSize2;
            }
            float f11 = (((float) dimensionPixelSize) * Resources.getSystem().getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
            if (f11 >= 0.0f) {
                f10 = f11 + 0.5f;
            } else {
                f10 = f11 - 0.5f;
            }
            return (int) f10;
        } catch (Resources.NotFoundException unused) {
            return 0;
        }
    }

    @TargetApi(14)
    public static int c(Context context) {
        String str;
        boolean z10 = true;
        if (context.getResources().getConfiguration().orientation != 1) {
            z10 = false;
        }
        if (!h(context)) {
            return 0;
        }
        if (z10) {
            str = "navigation_bar_height";
        } else {
            str = "navigation_bar_height_landscape";
        }
        return b(context, str);
    }

    public static int d(Context context) {
        Point point = new Point();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static int e(Context context) {
        Point point = new Point();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRealSize(point);
        return point.x;
    }

    public static int f(Context context) {
        int i10;
        int d10 = d(context);
        if (h(context)) {
            i10 = c(context) + g(context);
        } else {
            i10 = g(context);
        }
        return d10 - i10;
    }

    public static int g(Context context) {
        int i10;
        int i11;
        float f10;
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            try {
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                i11 = system.getDimensionPixelSize(identifier);
                if (i11 < dimensionPixelSize) {
                    float f11 = (((float) dimensionPixelSize) * system.getDisplayMetrics().density) / context.getResources().getDisplayMetrics().density;
                    if (f11 >= 0.0f) {
                        f10 = f11 + 0.5f;
                    } else {
                        f10 = f11 - 0.5f;
                    }
                    i11 = (int) f10;
                }
            } catch (Exception unused) {
                Resources system2 = Resources.getSystem();
                i10 = system2.getDimensionPixelSize(system2.getIdentifier("status_bar_height", "dimen", "android"));
            }
        } else {
            i11 = 0;
        }
        i10 = i11;
        if (i10 == 0) {
            return a(context, 26.0f);
        }
        return i10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[Catch:{ all -> 0x0062 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x007b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean h(android.content.Context r9) {
        /*
            boolean r0 = r9 instanceof android.app.Activity
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.app.Activity r9 = (android.app.Activity) r9
            android.view.Window r0 = r9.getWindow()
            android.view.View r0 = r0.getDecorView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            r3 = r1
        L_0x0017:
            r4 = 1
            if (r3 >= r2) goto L_0x0043
            android.view.View r5 = r0.getChildAt(r3)
            int r6 = r5.getId()
            r7 = -1
            if (r6 == r7) goto L_0x0040
            android.content.res.Resources r7 = r9.getResources()     // Catch:{ Exception -> 0x002e }
            java.lang.String r6 = r7.getResourceEntryName(r6)     // Catch:{ Exception -> 0x002e }
            goto L_0x0030
        L_0x002e:
            java.lang.String r6 = ""
        L_0x0030:
            java.lang.String r7 = "navigationBarBackground"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0040
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x0040
            r2 = r4
            goto L_0x0044
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x0017
        L_0x0043:
            r2 = r1
        L_0x0044:
            if (r2 == 0) goto L_0x009c
            java.lang.String r2 = "unknown"
            java.lang.String r3 = android.os.Build.BRAND     // Catch:{ all -> 0x0055 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0055 }
            if (r5 != 0) goto L_0x0055
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x0055 }
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0062 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0062 }
            if (r6 != 0) goto L_0x0062
            java.lang.String r2 = r5.toLowerCase()     // Catch:{ all -> 0x0062 }
        L_0x0062:
            java.lang.String[] r5 = pe.c.f14171a
            r6 = r1
        L_0x0065:
            if (r6 >= r4) goto L_0x007b
            r7 = r5[r6]
            boolean r8 = r3.contains(r7)
            if (r8 != 0) goto L_0x0079
            boolean r7 = r2.contains(r7)
            if (r7 == 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            int r6 = r6 + 1
            goto L_0x0065
        L_0x0079:
            r2 = r4
            goto L_0x007c
        L_0x007b:
            r2 = r1
        L_0x007c:
            if (r2 == 0) goto L_0x0092
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 >= r3) goto L_0x0092
            android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ Exception -> 0x0092 }
            java.lang.String r2 = "navigationbar_hide_bar_enabled"
            int r9 = android.provider.Settings.Global.getInt(r9, r2)     // Catch:{ Exception -> 0x0092 }
            if (r9 != 0) goto L_0x0091
            r1 = r4
        L_0x0091:
            return r1
        L_0x0092:
            int r9 = r0.getSystemUiVisibility()
            r9 = r9 & 2
            if (r9 != 0) goto L_0x009b
            r1 = r4
        L_0x009b:
            r2 = r1
        L_0x009c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.c.h(android.content.Context):boolean");
    }
}

package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.appcompat.R$style;

/* compiled from: ContextThemeWrapper */
public final class c extends ContextWrapper {

    /* renamed from: f  reason: collision with root package name */
    public static Configuration f12565f;

    /* renamed from: a  reason: collision with root package name */
    public int f12566a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f12567b;

    /* renamed from: c  reason: collision with root package name */
    public LayoutInflater f12568c;

    /* renamed from: d  reason: collision with root package name */
    public Configuration f12569d;

    /* renamed from: e  reason: collision with root package name */
    public Resources f12570e;

    /* compiled from: ContextThemeWrapper */
    public static class a {
        public static Context a(c cVar, Configuration configuration) {
            return cVar.createConfigurationContext(configuration);
        }
    }

    public c() {
        super((Context) null);
    }

    public final void a(Configuration configuration) {
        if (this.f12570e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.f12569d == null) {
            this.f12569d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        boolean z10;
        if (this.f12567b == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f12567b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f12567b.setTo(theme);
            }
        }
        this.f12567b.applyStyle(this.f12566a, true);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.equals(f12565f) != false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f12570e
            if (r0 != 0) goto L_0x0038
            android.content.res.Configuration r0 = r3.f12569d
            if (r0 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0025
            android.content.res.Configuration r1 = f12565f
            if (r1 != 0) goto L_0x001c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            f12565f = r1
        L_0x001c:
            android.content.res.Configuration r1 = f12565f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0025
            goto L_0x0032
        L_0x0025:
            android.content.res.Configuration r0 = r3.f12569d
            android.content.Context r0 = l.c.a.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f12570e = r0
            goto L_0x0038
        L_0x0032:
            android.content.res.Resources r0 = super.getResources()
            r3.f12570e = r0
        L_0x0038:
            android.content.res.Resources r0 = r3.f12570e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.c.getResources():android.content.res.Resources");
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f12568c == null) {
            this.f12568c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f12568c;
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f12567b;
        if (theme != null) {
            return theme;
        }
        if (this.f12566a == 0) {
            this.f12566a = R$style.Theme_AppCompat_Light;
        }
        b();
        return this.f12567b;
    }

    public final void setTheme(int i10) {
        if (this.f12566a != i10) {
            this.f12566a = i10;
            b();
        }
    }

    public c(Context context, int i10) {
        super(context);
        this.f12566a = i10;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f12567b = theme;
    }
}

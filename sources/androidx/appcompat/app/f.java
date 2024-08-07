package androidx.appcompat.app;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import androidx.appcompat.app.q;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import s1.j;
import v0.d;

/* compiled from: AppCompatDelegate */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static q.a f428a = new q.a(new q.b());

    /* renamed from: b  reason: collision with root package name */
    public static int f429b = -100;

    /* renamed from: c  reason: collision with root package name */
    public static j f430c = null;

    /* renamed from: d  reason: collision with root package name */
    public static j f431d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Boolean f432e = null;

    /* renamed from: f  reason: collision with root package name */
    public static boolean f433f = false;

    /* renamed from: n  reason: collision with root package name */
    public static final d<WeakReference<f>> f434n = new d<>();

    /* renamed from: o  reason: collision with root package name */
    public static final Object f435o = new Object();

    /* renamed from: p  reason: collision with root package name */
    public static final Object f436p = new Object();

    /* compiled from: AppCompatDelegate */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* compiled from: AppCompatDelegate */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static boolean k(Context context) {
        int i10;
        if (f432e == null) {
            try {
                int i11 = AppLocalesMetadataHolderService.f420a;
                if (Build.VERSION.SDK_INT >= 24) {
                    i10 = AppLocalesMetadataHolderService.a.a() | 128;
                } else {
                    i10 = 640;
                }
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, AppLocalesMetadataHolderService.class), i10).metaData;
                if (bundle != null) {
                    f432e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                f432e = Boolean.FALSE;
            }
        }
        return f432e.booleanValue();
    }

    public static void r(f fVar) {
        synchronized (f435o) {
            Iterator<WeakReference<f>> it = f434n.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next().get();
                if (fVar2 == fVar || fVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public Context d(Context context) {
        return context;
    }

    public abstract <T extends View> T e(int i10);

    public Context f() {
        return null;
    }

    public abstract MenuInflater g();

    public abstract ActionBar h();

    public abstract void i();

    public abstract void j();

    public abstract void l(Configuration configuration);

    public abstract void m();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract void q();

    public abstract boolean s(int i10);

    public abstract void t(int i10);

    public abstract void u(View view);

    public abstract void v(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void w(Toolbar toolbar);

    public void x(int i10) {
    }

    public abstract void y(CharSequence charSequence);
}

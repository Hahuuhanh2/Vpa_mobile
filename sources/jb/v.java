package jb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import lb.a;
import m9.d;
import oa.c;

/* compiled from: DeviceCacheManager */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final a f11863c = a.d();

    /* renamed from: d  reason: collision with root package name */
    public static v f11864d;

    /* renamed from: a  reason: collision with root package name */
    public volatile SharedPreferences f11865a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f11866b;

    public v(ExecutorService executorService) {
        this.f11866b = executorService;
    }

    public static Context a() {
        try {
            d.d();
            d d10 = d.d();
            d10.a();
            return d10.f13218a;
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final synchronized void b(Context context) {
        if (this.f11865a == null && context != null) {
            this.f11866b.execute(new c(1, this, context));
        }
    }

    public final void c(long j10, String str) {
        if (this.f11865a == null) {
            b(a());
            if (this.f11865a == null) {
                return;
            }
        }
        this.f11865a.edit().putLong(str, j10).apply();
    }

    public final void d(String str, double d10) {
        if (this.f11865a == null) {
            b(a());
            if (this.f11865a == null) {
                return;
            }
        }
        this.f11865a.edit().putLong(str, Double.doubleToRawLongBits(d10)).apply();
    }

    public final void e(String str, String str2) {
        if (this.f11865a == null) {
            b(a());
            if (this.f11865a == null) {
                return;
            }
        }
        if (str2 == null) {
            this.f11865a.edit().remove(str).apply();
        } else {
            this.f11865a.edit().putString(str, str2).apply();
        }
    }

    public final void f(String str, boolean z10) {
        if (this.f11865a == null) {
            b(a());
            if (this.f11865a == null) {
                return;
            }
        }
        this.f11865a.edit().putBoolean(str, z10).apply();
    }
}

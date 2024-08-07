package androidx.work;

import al.g0;
import android.os.Build;
import java.util.concurrent.ExecutorService;
import o3.k;
import o3.r;
import o3.s;
import p3.c;

/* compiled from: Configuration.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f3741a = g0.r(false);

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f3742b = g0.r(true);

    /* renamed from: c  reason: collision with root package name */
    public final j7.a f3743c = new j7.a();

    /* renamed from: d  reason: collision with root package name */
    public final r f3744d;

    /* renamed from: e  reason: collision with root package name */
    public final k f3745e;

    /* renamed from: f  reason: collision with root package name */
    public final c f3746f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3747g;

    /* renamed from: h  reason: collision with root package name */
    public final int f3748h;

    /* renamed from: i  reason: collision with root package name */
    public final int f3749i;

    /* renamed from: j  reason: collision with root package name */
    public final int f3750j;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* compiled from: Configuration.kt */
    public static final class C0035a {
    }

    /* compiled from: Configuration.kt */
    public interface b {
        a a();
    }

    public a(C0035a aVar) {
        int i10;
        int i11 = s.f13702a;
        this.f3744d = new r();
        this.f3745e = k.f13685b;
        this.f3746f = new c();
        this.f3747g = 4;
        this.f3748h = Integer.MAX_VALUE;
        if (Build.VERSION.SDK_INT == 23) {
            i10 = 10;
        } else {
            i10 = 20;
        }
        this.f3750j = i10;
        this.f3749i = 8;
    }
}

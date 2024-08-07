package lb;

import java.util.Locale;

/* compiled from: AndroidLogger */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f12899c;

    /* renamed from: a  reason: collision with root package name */
    public final b f12900a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12901b = false;

    public a() {
        b bVar;
        synchronized (b.class) {
            if (b.f12902b == null) {
                b.f12902b = new b(0);
            }
            bVar = b.f12902b;
        }
        this.f12900a = bVar;
    }

    public static a d() {
        if (f12899c == null) {
            synchronized (a.class) {
                if (f12899c == null) {
                    f12899c = new a();
                }
            }
        }
        return f12899c;
    }

    public final void a() {
        if (this.f12901b) {
            this.f12900a.getClass();
        }
    }

    public final void b(String str, Object... objArr) {
        if (this.f12901b) {
            b bVar = this.f12900a;
            String.format(Locale.ENGLISH, str, objArr);
            bVar.getClass();
        }
    }

    public final void c(String str, Object... objArr) {
        if (this.f12901b) {
            b bVar = this.f12900a;
            String.format(Locale.ENGLISH, str, objArr);
            bVar.getClass();
        }
    }

    public final void e(String str, Object... objArr) {
        if (this.f12901b) {
            b bVar = this.f12900a;
            String.format(Locale.ENGLISH, str, objArr);
            bVar.getClass();
        }
    }

    public final void f() {
        if (this.f12901b) {
            this.f12900a.getClass();
        }
    }

    public final void g(String str, Object... objArr) {
        if (this.f12901b) {
            b bVar = this.f12900a;
            String.format(Locale.ENGLISH, str, objArr);
            bVar.getClass();
        }
    }
}

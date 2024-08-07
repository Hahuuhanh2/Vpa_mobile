package ej;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import hj.b;
import ng.i;
import ng.j;
import p3.l0;

/* compiled from: ActivityComponentManager */
public final class a implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public volatile j f20072a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f20073b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Activity f20074c;

    /* renamed from: d  reason: collision with root package name */
    public final c f20075d;

    /* renamed from: ej.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityComponentManager */
    public interface C0277a {
        i b();
    }

    public a(Activity activity) {
        this.f20074c = activity;
        this.f20075d = new c((ComponentActivity) activity);
    }

    public final Object a() {
        String str;
        if (!(this.f20074c.getApplication() instanceof b)) {
            StringBuilder q10 = android.support.v4.media.a.q("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
            if (Application.class.equals(this.f20074c.getApplication().getClass())) {
                str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                StringBuilder q11 = android.support.v4.media.a.q("Found: ");
                q11.append(this.f20074c.getApplication().getClass());
                str = q11.toString();
            }
            q10.append(str);
            throw new IllegalStateException(q10.toString());
        }
        i b10 = ((C0277a) l0.X(C0277a.class, this.f20075d)).b();
        Activity activity = this.f20074c;
        b10.getClass();
        activity.getClass();
        b10.getClass();
        return new j(b10.f21572a, b10.f21573b);
    }

    public final Object d() {
        if (this.f20072a == null) {
            synchronized (this.f20073b) {
                if (this.f20072a == null) {
                    this.f20072a = (j) a();
                }
            }
        }
        return this.f20072a;
    }
}

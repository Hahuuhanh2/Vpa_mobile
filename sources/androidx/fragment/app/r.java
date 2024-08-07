package androidx.fragment.app;

import al.g0;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;

/* compiled from: FragmentHostCallback */
public abstract class r<E> extends o {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f2697b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f2698c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f2699d;

    /* renamed from: e  reason: collision with root package name */
    public final w f2700e = new w();

    public r(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f2697b = fragmentActivity;
        g0.D(fragmentActivity, "context == null");
        this.f2698c = fragmentActivity;
        this.f2699d = handler;
    }

    public abstract void J(PrintWriter printWriter, String[] strArr);

    public abstract FragmentActivity K();

    public abstract LayoutInflater L();

    public abstract boolean M(String str);

    public abstract void N();
}

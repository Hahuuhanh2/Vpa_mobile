package y6;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import g7.a;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class v0 implements ServiceConnection, y0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17595a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public int f17596b = 2;

    /* renamed from: c  reason: collision with root package name */
    public boolean f17597c;

    /* renamed from: d  reason: collision with root package name */
    public IBinder f17598d;

    /* renamed from: e  reason: collision with root package name */
    public final u0 f17599e;

    /* renamed from: f  reason: collision with root package name */
    public ComponentName f17600f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ x0 f17601g;

    public v0(x0 x0Var, u0 u0Var) {
        this.f17601g = x0Var;
        this.f17599e = u0Var;
    }

    public final void a(String str, Executor executor) {
        boolean z10;
        this.f17596b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            x0 x0Var = this.f17601g;
            a aVar = x0Var.f17608g;
            Context context = x0Var.f17606e;
            boolean c10 = aVar.c(context, str, this.f17599e.a(context), this, 4225, executor);
            this.f17597c = c10;
            if (c10) {
                this.f17601g.f17607f.sendMessageDelayed(this.f17601g.f17607f.obtainMessage(1, this.f17599e), this.f17601g.f17610i);
            } else {
                this.f17596b = 2;
                try {
                    x0 x0Var2 = this.f17601g;
                    x0Var2.f17608g.b(x0Var2.f17606e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f17601g.f17605d) {
            this.f17601g.f17607f.removeMessages(1, this.f17599e);
            this.f17598d = iBinder;
            this.f17600f = componentName;
            for (ServiceConnection onServiceConnected : this.f17595a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f17596b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f17601g.f17605d) {
            this.f17601g.f17607f.removeMessages(1, this.f17599e);
            this.f17598d = null;
            this.f17600f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f17595a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f17596b = 2;
        }
    }
}

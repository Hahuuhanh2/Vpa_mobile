package androidx.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;

/* compiled from: MediaBrowserServiceCompat */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f2867a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f2868b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f2869c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f2870d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f2871e;

    public a(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, int i10, int i11, Bundle bundle) {
        this.f2871e = hVar;
        this.f2867a = jVar;
        this.f2868b = str;
        this.f2869c = i10;
        this.f2870d = i11;
    }

    public final void run() {
        MediaBrowserServiceCompat.this.f2851b.remove(((MediaBrowserServiceCompat.j) this.f2867a).a());
        MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
        String str = this.f2868b;
        int i10 = this.f2869c;
        int i11 = this.f2870d;
        new HashMap();
        if (Build.VERSION.SDK_INT >= 28) {
            new p(str, i10, i11);
        }
        MediaBrowserServiceCompat.this.getClass();
        MediaBrowserServiceCompat.this.a();
        MediaBrowserServiceCompat.this.getClass();
        Class<a> cls = a.class;
        try {
            MediaBrowserServiceCompat.j jVar = (MediaBrowserServiceCompat.j) this.f2867a;
            jVar.getClass();
            Message obtain = Message.obtain();
            obtain.what = 2;
            obtain.arg1 = 2;
            obtain.setData((Bundle) null);
            jVar.f2865a.send(obtain);
        } catch (RemoteException unused) {
        }
    }
}

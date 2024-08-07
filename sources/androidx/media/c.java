package androidx.media;

import al.g0;
import android.os.Bundle;
import android.os.IBinder;
import android.support.v4.media.a;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MediaBrowserServiceCompat */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.i f2874a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f2875b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ IBinder f2876c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Bundle f2877d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ MediaBrowserServiceCompat.h f2878e;

    public c(MediaBrowserServiceCompat.h hVar, MediaBrowserServiceCompat.j jVar, String str, IBinder iBinder, Bundle bundle) {
        this.f2878e = hVar;
        this.f2874a = jVar;
        this.f2875b = str;
        this.f2876c = iBinder;
        this.f2877d = bundle;
    }

    public final void run() {
        MediaBrowserServiceCompat.b orDefault = MediaBrowserServiceCompat.this.f2851b.getOrDefault(((MediaBrowserServiceCompat.j) this.f2874a).a(), null);
        if (orDefault != null) {
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            String str = this.f2875b;
            F f10 = this.f2876c;
            Bundle bundle = this.f2877d;
            mediaBrowserServiceCompat.getClass();
            List<v1.c> list = orDefault.f2855c.get(str);
            if (list == null) {
                list = new ArrayList<>();
            }
            for (v1.c cVar : list) {
                if (f10 == cVar.f16012a && g0.u(bundle, (Bundle) cVar.f16013b)) {
                    return;
                }
            }
            list.add(new v1.c(f10, bundle));
            orDefault.f2855c.put(str, list);
            if (bundle == null) {
                mediaBrowserServiceCompat.b();
            } else {
                mediaBrowserServiceCompat.b();
            }
            StringBuilder q10 = a.q("onLoadChildren must call detach() or sendResult() before returning for package=");
            q10.append(orDefault.f2853a);
            q10.append(" id=");
            q10.append(str);
            throw new IllegalStateException(q10.toString());
        }
    }
}

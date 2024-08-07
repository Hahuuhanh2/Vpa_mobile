package android.support.v4.media.session;

import android.os.IBinder;
import android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21;
import android.support.v4.media.session.a;
import java.lang.ref.WeakReference;

/* compiled from: MediaControllerCompat */
public abstract class c implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public MediaControllerCompat$MediaControllerImplApi21.a f259a;

    /* compiled from: MediaControllerCompat */
    public static class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<c> f260a;

        public a(c cVar) {
            this.f260a = new WeakReference<>(cVar);
        }
    }

    /* compiled from: MediaControllerCompat */
    public static class b extends a.C0006a {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<c> f261a;

        public b(c cVar) {
            this.f261a = new WeakReference<>(cVar);
        }
    }

    public c() {
        new g(new a(this));
    }

    public final void binderDied() {
    }
}

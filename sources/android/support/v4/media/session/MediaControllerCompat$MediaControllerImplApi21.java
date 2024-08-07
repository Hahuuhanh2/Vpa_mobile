package android.support.v4.media.session;

import android.content.Context;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import s1.d;

public class MediaControllerCompat$MediaControllerImplApi21 {

    /* renamed from: a  reason: collision with root package name */
    public final MediaController f225a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f226b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f227c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public HashMap<c, a> f228d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    public final MediaSessionCompat.Token f229e;

    public static class ExtraBinderRequestResultReceiver extends ResultReceiver {

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<MediaControllerCompat$MediaControllerImplApi21> f230a;

        public ExtraBinderRequestResultReceiver(MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21) {
            super((Handler) null);
            this.f230a = new WeakReference<>(mediaControllerCompat$MediaControllerImplApi21);
        }

        public final void onReceiveResult(int i10, Bundle bundle) {
            MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.f230a.get();
            if (mediaControllerCompat$MediaControllerImplApi21 != null && bundle != null) {
                synchronized (mediaControllerCompat$MediaControllerImplApi21.f226b) {
                    mediaControllerCompat$MediaControllerImplApi21.f229e.f236b = b.a.m(d.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                    MediaSessionCompat.Token token = mediaControllerCompat$MediaControllerImplApi21.f229e;
                    bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                    token.getClass();
                    mediaControllerCompat$MediaControllerImplApi21.a();
                }
            }
        }
    }

    public static class a extends c.b {
        public a(c cVar) {
            super(cVar);
        }

        public final void d() {
            throw new AssertionError();
        }

        public final void f() {
            throw new AssertionError();
        }

        public final void l() {
            throw new AssertionError();
        }

        public final void p() {
            throw new AssertionError();
        }

        public final void q() {
            throw new AssertionError();
        }

        public final void s() {
            throw new AssertionError();
        }
    }

    public MediaControllerCompat$MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
        this.f229e = token;
        MediaController mediaController = new MediaController(context, (MediaSession.Token) token.f235a);
        this.f225a = mediaController;
        if (token.f236b == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    public final void a() {
        if (this.f229e.f236b != null) {
            Iterator it = this.f227c.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                a aVar = new a(cVar);
                this.f228d.put(cVar, aVar);
                cVar.f259a = aVar;
                try {
                    this.f229e.f236b.g(aVar);
                } catch (RemoteException unused) {
                }
            }
            this.f227c.clear();
        }
    }
}

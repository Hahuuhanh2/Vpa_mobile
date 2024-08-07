package androidx.camera.core;

import android.media.Image;
import androidx.camera.core.d;
import c0.k0;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ForwardingImageProxy */
public abstract class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1282a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final d f1283b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f1284c = new HashSet();

    /* compiled from: ForwardingImageProxy */
    public interface a {
        void a(d dVar);
    }

    public b(d dVar) {
        this.f1283b = dVar;
    }

    public int b() {
        return this.f1283b.b();
    }

    public int c() {
        return this.f1283b.c();
    }

    public void close() {
        HashSet hashSet;
        this.f1283b.close();
        synchronized (this.f1282a) {
            hashSet = new HashSet(this.f1284c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this);
        }
    }

    public final void d(a aVar) {
        synchronized (this.f1282a) {
            this.f1284c.add(aVar);
        }
    }

    public k0 f0() {
        return this.f1283b.f0();
    }

    public final int getFormat() {
        return this.f1283b.getFormat();
    }

    public final d.a[] l() {
        return this.f1283b.l();
    }

    public final Image r0() {
        return this.f1283b.r0();
    }
}

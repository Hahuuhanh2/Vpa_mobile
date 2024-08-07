package b5;

import android.graphics.Bitmap;
import b5.l;
import b5.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import o5.d;
import s4.h;
import s4.j;
import u4.u;
import v4.b;
import v4.c;

/* compiled from: StreamBitmapDecoder */
public final class x implements j<InputStream, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final l f4081a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4082b;

    /* compiled from: StreamBitmapDecoder */
    public static class a implements l.b {

        /* renamed from: a  reason: collision with root package name */
        public final v f4083a;

        /* renamed from: b  reason: collision with root package name */
        public final d f4084b;

        public a(v vVar, d dVar) {
            this.f4083a = vVar;
            this.f4084b = dVar;
        }

        public final void a(Bitmap bitmap, c cVar) {
            IOException iOException = this.f4084b.f13739b;
            if (iOException != null) {
                if (bitmap != null) {
                    cVar.d(bitmap);
                }
                throw iOException;
            }
        }

        public final void b() {
            v vVar = this.f4083a;
            synchronized (vVar) {
                vVar.f4075c = vVar.f4073a.length;
            }
        }
    }

    public x(l lVar, b bVar) {
        this.f4081a = lVar;
        this.f4082b = bVar;
    }

    public final u a(Object obj, int i10, int i11, h hVar) {
        boolean z10;
        v vVar;
        d dVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof v) {
            z10 = false;
            vVar = (v) inputStream;
        } else {
            vVar = new v(inputStream, this.f4082b);
            z10 = true;
        }
        ArrayDeque arrayDeque = d.f13737c;
        synchronized (arrayDeque) {
            dVar = (d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new d();
        }
        d dVar2 = dVar;
        dVar2.f13738a = vVar;
        o5.j jVar = new o5.j(dVar2);
        a aVar = new a(vVar, dVar2);
        try {
            l lVar = this.f4081a;
            d a10 = lVar.a(new r.b(lVar.f4041c, jVar, lVar.f4042d), i10, i11, hVar, aVar);
            dVar2.f13739b = null;
            dVar2.f13738a = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar2);
            }
            if (z10) {
                vVar.h();
            }
            return a10;
        } catch (Throwable th2) {
            dVar2.f13739b = null;
            dVar2.f13738a = null;
            ArrayDeque arrayDeque2 = d.f13737c;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar2);
                if (z10) {
                    vVar.h();
                }
                throw th2;
            }
        }
    }

    public final boolean b(Object obj, h hVar) {
        InputStream inputStream = (InputStream) obj;
        this.f4081a.getClass();
        return true;
    }
}

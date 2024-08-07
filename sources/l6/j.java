package l6;

import android.content.Context;
import c0.q0;
import c0.r;
import f6.h;
import f6.p;
import f6.s;
import g6.b;
import g6.e;
import g6.m;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import m6.c;
import m6.d;
import n6.a;
import v.f0;

/* compiled from: Uploader */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12743a;

    /* renamed from: b  reason: collision with root package name */
    public final e f12744b;

    /* renamed from: c  reason: collision with root package name */
    public final d f12745c;

    /* renamed from: d  reason: collision with root package name */
    public final n f12746d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f12747e;

    /* renamed from: f  reason: collision with root package name */
    public final a f12748f;

    /* renamed from: g  reason: collision with root package name */
    public final o6.a f12749g;

    /* renamed from: h  reason: collision with root package name */
    public final o6.a f12750h;

    /* renamed from: i  reason: collision with root package name */
    public final c f12751i;

    public j(Context context, e eVar, d dVar, n nVar, Executor executor, a aVar, o6.a aVar2, o6.a aVar3, c cVar) {
        this.f12743a = context;
        this.f12744b = eVar;
        this.f12745c = dVar;
        this.f12746d = nVar;
        this.f12747e = executor;
        this.f12748f = aVar;
        this.f12749g = aVar2;
        this.f12750h = aVar3;
        this.f12751i = cVar;
    }

    public final void a(s sVar, int i10) {
        b bVar;
        boolean z10;
        boolean z11;
        s sVar2 = sVar;
        m a10 = this.f12744b.a(sVar.b());
        new b(1, 0);
        long j10 = 0;
        while (((Boolean) this.f12748f.h(new f0(2, this, sVar2))).booleanValue()) {
            Iterable<m6.j> iterable = (Iterable) this.f12748f.h(new b0.e(4, this, sVar2));
            if (iterable.iterator().hasNext()) {
                if (a10 == null) {
                    j6.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", sVar2);
                    bVar = new b(3, -1);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (m6.j a11 : iterable) {
                        arrayList.add(a11.a());
                    }
                    if (sVar.c() != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        a aVar = this.f12748f;
                        c cVar = this.f12751i;
                        Objects.requireNonNull(cVar);
                        i6.a aVar2 = (i6.a) aVar.h(new q0(cVar, 7));
                        h.a aVar3 = new h.a();
                        aVar3.f9996f = new HashMap();
                        aVar3.f9994d = Long.valueOf(this.f12749g.a());
                        aVar3.f9995e = Long.valueOf(this.f12750h.a());
                        aVar3.d("GDT_CLIENT_METRICS");
                        c6.b bVar2 = new c6.b("proto");
                        aVar2.getClass();
                        va.h hVar = p.f10018a;
                        hVar.getClass();
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            hVar.a(aVar2, byteArrayOutputStream);
                        } catch (IOException unused) {
                        }
                        aVar3.c(new f6.m(bVar2, byteArrayOutputStream.toByteArray()));
                        arrayList.add(a10.b(aVar3.b()));
                    }
                    bVar = a10.a(new g6.a(arrayList, sVar.c()));
                }
                if (bVar.f10375a == 2) {
                    this.f12748f.h(new h(this, (Iterable) iterable, sVar, j10));
                    this.f12746d.b(sVar2, i10 + 1, true);
                    return;
                }
                this.f12748f.h(new f0(3, this, iterable));
                int i11 = bVar.f10375a;
                if (i11 == 1) {
                    j10 = Math.max(j10, bVar.f10376b);
                    if (sVar.c() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        this.f12748f.h(new q0(this, 6));
                    }
                } else if (i11 == 4) {
                    HashMap hashMap = new HashMap();
                    for (m6.j a12 : iterable) {
                        String g2 = a12.a().g();
                        if (!hashMap.containsKey(g2)) {
                            hashMap.put(g2, 1);
                        } else {
                            hashMap.put(g2, Integer.valueOf(((Integer) hashMap.get(g2)).intValue() + 1));
                        }
                    }
                    this.f12748f.h(new r(5, this, hashMap));
                }
            } else {
                return;
            }
        }
        this.f12748f.h(new i((Object) this, j10, (Object) sVar2));
    }
}

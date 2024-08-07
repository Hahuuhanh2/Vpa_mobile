package androidx.emoji2.text;

import al.g0;
import android.graphics.Typeface;
import android.util.SparseArray;
import l2.d;
import m2.b;

/* compiled from: MetadataRepo */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final b f2417a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f2418b;

    /* renamed from: c  reason: collision with root package name */
    public final a f2419c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f2420d;

    /* compiled from: MetadataRepo */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f2421a;

        /* renamed from: b  reason: collision with root package name */
        public d f2422b;

        public a() {
            this(1);
        }

        public final void a(d dVar, int i10, int i11) {
            a aVar;
            int a10 = dVar.a(i10);
            SparseArray<a> sparseArray = this.f2421a;
            if (sparseArray == null) {
                aVar = null;
            } else {
                aVar = sparseArray.get(a10);
            }
            if (aVar == null) {
                aVar = new a();
                this.f2421a.put(dVar.a(i10), aVar);
            }
            if (i11 > i10) {
                aVar.a(dVar, i10 + 1, i11);
            } else {
                aVar.f2422b = dVar;
            }
        }

        public a(int i10) {
            this.f2421a = new SparseArray<>(i10);
        }
    }

    public h(Typeface typeface, b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        this.f2420d = typeface;
        this.f2417a = bVar;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f13086a;
            i10 = bVar.f13087b.getInt(bVar.f13087b.getInt(i13) + i13);
        } else {
            i10 = 0;
        }
        this.f2418b = new char[(i10 * 2)];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f13086a;
            i11 = bVar.f13087b.getInt(bVar.f13087b.getInt(i14) + i14);
        } else {
            i11 = 0;
        }
        for (int i15 = 0; i15 < i11; i15++) {
            d dVar = new d(this, i15);
            m2.a c10 = dVar.c();
            int a12 = c10.a(4);
            if (a12 != 0) {
                i12 = c10.f13087b.getInt(a12 + c10.f13086a);
            } else {
                i12 = 0;
            }
            Character.toChars(i12, this.f2418b, i15 * 2);
            if (dVar.b() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.y("invalid metadata codepoint length", z10);
            this.f2419c.a(dVar, 0, dVar.b() - 1);
        }
    }
}

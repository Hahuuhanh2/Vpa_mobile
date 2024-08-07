package com.google.protobuf;

import com.google.protobuf.k;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import tc.a0;
import tc.c;
import tc.k;

/* compiled from: LazyStringArrayList */
public final class n extends c<String> implements k, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f7923b;

    static {
        new n(10).f7887a = false;
    }

    public n(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public final void add(int i10, Object obj) {
        g();
        this.f7923b.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final k.c b(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f7923b);
            return new n((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final List<?> c() {
        return Collections.unmodifiableList(this.f7923b);
    }

    public final void clear() {
        g();
        this.f7923b.clear();
        this.modCount++;
    }

    public final tc.k d() {
        if (this.f7887a) {
            return new a0(this);
        }
        return this;
    }

    public final Object e(int i10) {
        return this.f7923b.get(i10);
    }

    public final Object get(int i10) {
        String str;
        Object obj = this.f7923b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            Charset charset = k.f7917a;
            if (cVar.size() == 0) {
                str = "";
            } else {
                str = cVar.p(charset);
            }
            if (cVar.m()) {
                this.f7923b.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, k.f7917a);
            boolean z10 = false;
            if (e0.f7900a.b(bArr, 0, bArr.length) == 0) {
                z10 = true;
            }
            if (z10) {
                this.f7923b.set(i10, str);
            }
        }
        return str;
    }

    public final void j(c cVar) {
        g();
        this.f7923b.add(cVar);
        this.modCount++;
    }

    public final Object remove(int i10) {
        g();
        Object remove = this.f7923b.remove(i10);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof c)) {
            return new String((byte[]) remove, k.f7917a);
        }
        c cVar = (c) remove;
        cVar.getClass();
        Charset charset = k.f7917a;
        if (cVar.size() == 0) {
            return "";
        }
        return cVar.p(charset);
    }

    public final Object set(int i10, Object obj) {
        g();
        Object obj2 = this.f7923b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof c)) {
            return new String((byte[]) obj2, k.f7917a);
        }
        c cVar = (c) obj2;
        cVar.getClass();
        Charset charset = k.f7917a;
        if (cVar.size() == 0) {
            return "";
        }
        return cVar.p(charset);
    }

    public final int size() {
        return this.f7923b.size();
    }

    public n(ArrayList<Object> arrayList) {
        this.f7923b = arrayList;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        g();
        if (collection instanceof tc.k) {
            collection = ((tc.k) collection).c();
        }
        boolean addAll = this.f7923b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }
}

package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p;
import j9.b0;
import j9.c;
import j9.j;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList */
public final class s extends c<String> implements j, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f7421b;

    static {
        new s(10).f7333a = false;
    }

    public s(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public final void add(int i10, Object obj) {
        g();
        this.f7421b.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final p.c b(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f7421b);
            return new s((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final List<?> c() {
        return Collections.unmodifiableList(this.f7421b);
    }

    public final void clear() {
        g();
        this.f7421b.clear();
        this.modCount++;
    }

    public final j d() {
        if (this.f7333a) {
            return new b0(this);
        }
        return this;
    }

    public final Object e(int i10) {
        return this.f7421b.get(i10);
    }

    public final Object get(int i10) {
        String str;
        Object obj = this.f7421b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            Charset charset = p.f7415a;
            if (cVar.size() == 0) {
                str = "";
            } else {
                str = cVar.t(charset);
            }
            if (cVar.o()) {
                this.f7421b.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, p.f7415a);
            boolean z10 = false;
            if (i0.f7397a.c(bArr, 0, bArr.length) == 0) {
                z10 = true;
            }
            if (z10) {
                this.f7421b.set(i10, str);
            }
        }
        return str;
    }

    public final void h(c cVar) {
        g();
        this.f7421b.add(cVar);
        this.modCount++;
    }

    public final Object remove(int i10) {
        g();
        Object remove = this.f7421b.remove(i10);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof c)) {
            return new String((byte[]) remove, p.f7415a);
        }
        c cVar = (c) remove;
        cVar.getClass();
        Charset charset = p.f7415a;
        if (cVar.size() == 0) {
            return "";
        }
        return cVar.t(charset);
    }

    public final Object set(int i10, Object obj) {
        g();
        Object obj2 = this.f7421b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof c)) {
            return new String((byte[]) obj2, p.f7415a);
        }
        c cVar = (c) obj2;
        cVar.getClass();
        Charset charset = p.f7415a;
        if (cVar.size() == 0) {
            return "";
        }
        return cVar.t(charset);
    }

    public final int size() {
        return this.f7421b.size();
    }

    public s(ArrayList<Object> arrayList) {
        this.f7421b = arrayList;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        g();
        if (collection instanceof j) {
            collection = ((j) collection).c();
        }
        boolean addAll = this.f7421b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }
}

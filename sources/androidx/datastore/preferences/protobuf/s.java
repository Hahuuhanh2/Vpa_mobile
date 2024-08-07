package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.p;
import j2.c;
import j2.i;
import j2.x;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: LazyStringArrayList */
public final class s extends c<String> implements i, RandomAccess {

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f2324b;

    static {
        new s(10).f2231a = false;
    }

    public s(int i10) {
        this((ArrayList<Object>) new ArrayList(i10));
    }

    public final void add(int i10, Object obj) {
        g();
        this.f2324b.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final p.c b(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.f2324b);
            return new s((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final List<?> c() {
        return Collections.unmodifiableList(this.f2324b);
    }

    public final void clear() {
        g();
        this.f2324b.clear();
        this.modCount++;
    }

    public final i d() {
        if (this.f2231a) {
            return new x(this);
        }
        return this;
    }

    public final Object e(int i10) {
        return this.f2324b.get(i10);
    }

    public final Object get(int i10) {
        String str;
        Object obj = this.f2324b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            cVar.getClass();
            Charset charset = p.f2318a;
            if (cVar.size() == 0) {
                str = "";
            } else {
                str = cVar.p(charset);
            }
            if (cVar.n()) {
                this.f2324b.set(i10, str);
            }
        } else {
            byte[] bArr = (byte[]) obj;
            str = new String(bArr, p.f2318a);
            boolean z10 = false;
            if (l0.f2303a.c(bArr, 0, bArr.length) == 0) {
                z10 = true;
            }
            if (z10) {
                this.f2324b.set(i10, str);
            }
        }
        return str;
    }

    public final void k(c cVar) {
        g();
        this.f2324b.add(cVar);
        this.modCount++;
    }

    public final Object remove(int i10) {
        g();
        Object remove = this.f2324b.remove(i10);
        this.modCount++;
        if (remove instanceof String) {
            return (String) remove;
        }
        if (!(remove instanceof c)) {
            return new String((byte[]) remove, p.f2318a);
        }
        c cVar = (c) remove;
        cVar.getClass();
        Charset charset = p.f2318a;
        if (cVar.size() == 0) {
            return "";
        }
        return cVar.p(charset);
    }

    public final Object set(int i10, Object obj) {
        g();
        Object obj2 = this.f2324b.set(i10, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        if (!(obj2 instanceof c)) {
            return new String((byte[]) obj2, p.f2318a);
        }
        c cVar = (c) obj2;
        cVar.getClass();
        Charset charset = p.f2318a;
        if (cVar.size() == 0) {
            return "";
        }
        return cVar.p(charset);
    }

    public final int size() {
        return this.f2324b.size();
    }

    public s(ArrayList<Object> arrayList) {
        this.f2324b = arrayList;
    }

    public final boolean addAll(int i10, Collection<? extends String> collection) {
        g();
        if (collection instanceof i) {
            collection = ((i) collection).c();
        }
        boolean addAll = this.f2324b.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }
}

package androidx.camera.core.impl;

import androidx.camera.core.impl.u;
import c0.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: UseCaseAttachState */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap f1410a = new LinkedHashMap();

    /* compiled from: UseCaseAttachState */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final u f1411a;

        /* renamed from: b  reason: collision with root package name */
        public final x<?> f1412b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f1413c = false;

        /* renamed from: d  reason: collision with root package name */
        public boolean f1414d = false;

        public a(u uVar, x<?> xVar) {
            this.f1411a = uVar;
            this.f1412b = xVar;
        }
    }

    public w(String str) {
    }

    public final u.f a() {
        u.f fVar = new u.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1410a.entrySet()) {
            a aVar = (a) entry.getValue();
            if (aVar.f1413c) {
                fVar.a(aVar.f1411a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        p0.a("UseCaseAttachState");
        return fVar;
    }

    public final Collection<u> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1410a.entrySet()) {
            if (((a) entry.getValue()).f1413c) {
                arrayList.add(((a) entry.getValue()).f1411a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final Collection<x<?>> c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f1410a.entrySet()) {
            if (((a) entry.getValue()).f1413c) {
                arrayList.add(((a) entry.getValue()).f1412b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final boolean d(String str) {
        if (!this.f1410a.containsKey(str)) {
            return false;
        }
        return ((a) this.f1410a.get(str)).f1413c;
    }

    public final void e(String str) {
        if (this.f1410a.containsKey(str)) {
            a aVar = (a) this.f1410a.get(str);
            aVar.f1414d = false;
            if (!aVar.f1413c) {
                this.f1410a.remove(str);
            }
        }
    }

    public final void f(String str, u uVar, x<?> xVar) {
        if (this.f1410a.containsKey(str)) {
            a aVar = new a(uVar, xVar);
            a aVar2 = (a) this.f1410a.get(str);
            aVar.f1413c = aVar2.f1413c;
            aVar.f1414d = aVar2.f1414d;
            this.f1410a.put(str, aVar);
        }
    }
}

package ca;

import fb.m;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.Executor;
import wa.b;
import wa.c;
import wa.d;

/* compiled from: EventBus */
public final class n implements d, c {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4647a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public ArrayDeque f4648b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f4649c;

    public n(Executor executor) {
        this.f4649c = executor;
    }

    public final synchronized void a(Executor executor, b bVar) {
        Class<m9.b> cls = m9.b.class;
        synchronized (this) {
            executor.getClass();
            if (!this.f4647a.containsKey(cls)) {
                this.f4647a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f4647a.get(cls)).put(bVar, executor);
        }
    }

    public final void b(m mVar) {
        a(this.f4649c, mVar);
    }
}

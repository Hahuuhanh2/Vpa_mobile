package com.google.protobuf;

import tc.c0;

/* compiled from: MapEntryLite */
public final class q<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f7929a;

    /* renamed from: b  reason: collision with root package name */
    public final K f7930b = "";

    /* renamed from: c  reason: collision with root package name */
    public final V f7931c;

    /* compiled from: MapEntryLite */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final c0 f7932a;

        /* renamed from: b  reason: collision with root package name */
        public final K f7933b = "";

        /* renamed from: c  reason: collision with root package name */
        public final c0 f7934c;

        /* renamed from: d  reason: collision with root package name */
        public final V f7935d;

        public a(c0.a aVar, c0 c0Var, Object obj) {
            this.f7932a = aVar;
            this.f7934c = c0Var;
            this.f7935d = obj;
        }
    }

    public q(c0.a aVar, c0 c0Var, Object obj) {
        this.f7929a = new a<>(aVar, c0Var, obj);
        this.f7931c = obj;
    }

    public static <K, V> int a(a<K, V> aVar, K k10, V v2) {
        return h.b(aVar.f7934c, 2, v2) + h.b(aVar.f7932a, 1, k10);
    }
}

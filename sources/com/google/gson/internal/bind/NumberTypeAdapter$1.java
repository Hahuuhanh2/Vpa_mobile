package com.google.gson.internal.bind;

import bc.h;
import bc.u;
import bc.v;
import gc.a;

class NumberTypeAdapter$1 implements v {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f7754a;

    public NumberTypeAdapter$1(d dVar) {
        this.f7754a = dVar;
    }

    public final <T> u<T> a(h hVar, a<T> aVar) {
        if (aVar.f10437a == Number.class) {
            return this.f7754a;
        }
        return null;
    }
}

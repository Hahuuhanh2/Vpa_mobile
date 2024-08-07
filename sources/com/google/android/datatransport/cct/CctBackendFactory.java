package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import d6.b;
import g6.d;
import g6.h;
import g6.m;

@Keep
public class CctBackendFactory implements d {
    public m create(h hVar) {
        return new b(hVar.a(), hVar.d(), hVar.c());
    }
}

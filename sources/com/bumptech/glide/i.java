package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: GlideExperiments */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, Object> f4935a;

    /* compiled from: GlideExperiments */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f4936a = new HashMap();
    }

    public i(a aVar) {
        this.f4935a = Collections.unmodifiableMap(new HashMap(aVar.f4936a));
    }
}

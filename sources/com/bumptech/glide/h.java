package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import k5.f;
import k5.g;
import u4.m;
import v4.b;

/* compiled from: GlideContext */
public final class h extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final a f4924k = new a();

    /* renamed from: a  reason: collision with root package name */
    public final b f4925a;

    /* renamed from: b  reason: collision with root package name */
    public final Registry f4926b;

    /* renamed from: c  reason: collision with root package name */
    public final lb.b f4927c;

    /* renamed from: d  reason: collision with root package name */
    public final b.a f4928d;

    /* renamed from: e  reason: collision with root package name */
    public final List<f<Object>> f4929e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, m<?, ?>> f4930f;

    /* renamed from: g  reason: collision with root package name */
    public final m f4931g;

    /* renamed from: h  reason: collision with root package name */
    public final i f4932h;

    /* renamed from: i  reason: collision with root package name */
    public final int f4933i;

    /* renamed from: j  reason: collision with root package name */
    public g f4934j;

    public h(Context context, v4.b bVar, Registry registry, lb.b bVar2, c cVar, v0.b bVar3, List list, m mVar, i iVar, int i10) {
        super(context.getApplicationContext());
        this.f4925a = bVar;
        this.f4926b = registry;
        this.f4927c = bVar2;
        this.f4928d = cVar;
        this.f4929e = list;
        this.f4930f = bVar3;
        this.f4931g = mVar;
        this.f4932h = iVar;
        this.f4933i = i10;
    }
}

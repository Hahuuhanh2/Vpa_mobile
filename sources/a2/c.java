package a2;

import android.content.Context;
import android.view.LayoutInflater;

/* compiled from: ResourceCursorAdapter */
public abstract class c extends a {

    /* renamed from: o  reason: collision with root package name */
    public int f76o;

    /* renamed from: p  reason: collision with root package name */
    public int f77p;

    /* renamed from: q  reason: collision with root package name */
    public LayoutInflater f78q;

    @Deprecated
    public c(Context context, int i10) {
        super(context);
        this.f77p = i10;
        this.f76o = i10;
        this.f78q = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}

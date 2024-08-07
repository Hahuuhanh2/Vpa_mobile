package com.google.android.material.internal;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.internal.x;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;
import w1.w0;

/* compiled from: ViewUtils */
public final class w implements x.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f6506a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f6507b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f6508c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ x.b f6509d;

    public w(boolean z10, boolean z11, boolean z12, BottomAppBar.c cVar) {
        this.f6506a = z10;
        this.f6507b = z11;
        this.f6508c = z12;
        this.f6509d = cVar;
    }

    public final w0 a(View view, w0 w0Var, x.c cVar) {
        if (this.f6506a) {
            cVar.f6515d = w0Var.b() + cVar.f6515d;
        }
        boolean g2 = x.g(view);
        if (this.f6507b) {
            if (g2) {
                cVar.f6514c = w0Var.c() + cVar.f6514c;
            } else {
                cVar.f6512a = w0Var.c() + cVar.f6512a;
            }
        }
        if (this.f6508c) {
            if (g2) {
                cVar.f6512a = w0Var.d() + cVar.f6512a;
            } else {
                cVar.f6514c = w0Var.d() + cVar.f6514c;
            }
        }
        int i10 = cVar.f6512a;
        int i11 = cVar.f6513b;
        int i12 = cVar.f6514c;
        int i13 = cVar.f6515d;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.e.k(view, i10, i11, i12, i13);
        x.b bVar = this.f6509d;
        if (bVar != null) {
            return bVar.a(view, w0Var, cVar);
        }
        return w0Var;
    }
}

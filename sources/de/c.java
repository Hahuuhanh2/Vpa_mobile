package de;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.kizitonwose.calendar.view.internal.g;
import m9.b;
import sk.j;
import zd.f;

/* compiled from: WeekViewHolder.kt */
public final class c extends RecyclerView.a0 {

    /* renamed from: u  reason: collision with root package name */
    public final View f8960u;

    /* renamed from: v  reason: collision with root package name */
    public final View f8961v;

    /* renamed from: w  reason: collision with root package name */
    public final g<f> f8962w;

    /* renamed from: x  reason: collision with root package name */
    public b f8963x;

    /* renamed from: y  reason: collision with root package name */
    public b f8964y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ViewGroup viewGroup, View view, View view2, g<f> gVar, be.g<b> gVar2, be.g<b> gVar3) {
        super(viewGroup);
        j.f(viewGroup, "rootLayout");
        j.f(gVar, "weekHolder");
        this.f8960u = view;
        this.f8961v = view2;
        this.f8962w = gVar;
    }
}

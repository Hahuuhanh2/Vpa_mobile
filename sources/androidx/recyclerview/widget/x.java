package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: SnapHelper */
public abstract class x extends RecyclerView.o {

    /* renamed from: a  reason: collision with root package name */
    public RecyclerView f3303a;

    /* renamed from: b  reason: collision with root package name */
    public Scroller f3304b;

    /* renamed from: c  reason: collision with root package name */
    public final a f3305c = new a();

    /* compiled from: SnapHelper */
    public class a extends RecyclerView.q {

        /* renamed from: a  reason: collision with root package name */
        public boolean f3306a = false;

        public a() {
        }

        public final void a(int i10, RecyclerView recyclerView) {
            if (i10 == 0 && this.f3306a) {
                this.f3306a = false;
                x.this.f();
            }
        }

        public final void b(RecyclerView recyclerView, int i10, int i11) {
            if (i10 != 0 || i11 != 0) {
                this.f3306a = true;
            }
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3303a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                a aVar = this.f3305c;
                ArrayList arrayList = recyclerView2.f2989r0;
                if (arrayList != null) {
                    arrayList.remove(aVar);
                }
                this.f3303a.setOnFlingListener((RecyclerView.o) null);
            }
            this.f3303a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f3303a.j(this.f3305c);
                this.f3303a.setOnFlingListener(this);
                this.f3304b = new Scroller(this.f3303a.getContext(), new DecelerateInterpolator());
                f();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.m mVar, View view);

    public RecyclerView.v c(RecyclerView.m mVar) {
        if (!(mVar instanceof RecyclerView.v.b)) {
            return null;
        }
        return new y(this, this.f3303a.getContext());
    }

    @SuppressLint({"UnknownNullness"})
    public abstract View d(RecyclerView.m mVar);

    @SuppressLint({"UnknownNullness"})
    public abstract int e(RecyclerView.m mVar, int i10, int i11);

    public final void f() {
        RecyclerView.m layoutManager;
        View d10;
        RecyclerView recyclerView = this.f3303a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (d10 = d(layoutManager)) != null) {
            int[] b10 = b(layoutManager, d10);
            int i10 = b10[0];
            if (i10 != 0 || b10[1] != 0) {
                this.f3303a.m0(i10, b10[1], false);
            }
        }
    }
}

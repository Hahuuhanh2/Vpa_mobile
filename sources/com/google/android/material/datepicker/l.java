package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import v1.c;

/* compiled from: MaterialCalendar */
public final class l extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f6178a = f0.i((Calendar) null);

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f6179b = f0.i((Calendar) null);

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ j f6180c;

    public l(j jVar) {
        this.f6180c = jVar;
    }

    public final void e(Canvas canvas, RecyclerView recyclerView) {
        int i10;
        int i11;
        if ((recyclerView.getAdapter() instanceof h0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            h0 h0Var = (h0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (c cVar : this.f6180c.f6165g0.s()) {
                F f10 = cVar.f16012a;
                if (!(f10 == null || cVar.f16013b == null)) {
                    this.f6178a.setTimeInMillis(((Long) f10).longValue());
                    this.f6179b.setTimeInMillis(((Long) cVar.f16013b).longValue());
                    int i12 = this.f6178a.get(1) - h0Var.f6159d.f6166h0.f6075a.f6099c;
                    int i13 = this.f6179b.get(1) - h0Var.f6159d.f6166h0.f6075a.f6099c;
                    View B = gridLayoutManager.B(i12);
                    View B2 = gridLayoutManager.B(i13);
                    int i14 = gridLayoutManager.N;
                    int i15 = i12 / i14;
                    int i16 = i13 / i14;
                    for (int i17 = i15; i17 <= i16; i17++) {
                        View B3 = gridLayoutManager.B(gridLayoutManager.N * i17);
                        if (B3 != null) {
                            int top = B3.getTop() + ((a) this.f6180c.f6170l0.f6123d).f6110a.top;
                            int bottom = B3.getBottom() - ((a) this.f6180c.f6170l0.f6123d).f6110a.bottom;
                            if (i17 != i15 || B == null) {
                                i10 = 0;
                            } else {
                                i10 = (B.getWidth() / 2) + B.getLeft();
                            }
                            if (i17 != i16 || B2 == null) {
                                i11 = recyclerView.getWidth();
                            } else {
                                i11 = (B2.getWidth() / 2) + B2.getLeft();
                            }
                            canvas.drawRect((float) i10, (float) top, (float) i11, (float) bottom, (Paint) this.f6180c.f6170l0.f6127h);
                        }
                    }
                }
            }
        }
    }
}

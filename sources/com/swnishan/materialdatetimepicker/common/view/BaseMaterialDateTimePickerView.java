package com.swnishan.materialdatetimepicker.common.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.swnishan.materialdatetimepicker.common.LowFlingRecyclerView;
import gg.b;
import java.util.Iterator;
import java.util.List;
import rk.l;
import sk.j;

/* compiled from: BaseMaterialDateTimePickerView.kt */
public abstract class BaseMaterialDateTimePickerView extends ConstraintLayout {
    public float A = 0.7f;

    /* renamed from: x  reason: collision with root package name */
    public long f19337x = 300;

    /* renamed from: y  reason: collision with root package name */
    public long f19338y = 1000;

    /* renamed from: z  reason: collision with root package name */
    public float f19339z = 0.3f;

    /* compiled from: BaseMaterialDateTimePickerView.kt */
    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f19340a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f19341b;

        public a(View view, float f10) {
            this.f19340a = view;
            this.f19341b = f10;
        }

        public final void run() {
            this.f19340a.setAlpha(this.f19341b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseMaterialDateTimePickerView(Context context) {
        super(context);
        j.f(context, "context");
    }

    public static int s(fg.a aVar, List list, eg.a aVar2) {
        j.f(aVar, "adapter");
        j.f(list, "list");
        int c10 = aVar.c() / 2;
        int size = c10 % list.size();
        int abs = Math.abs(aVar2.getIndex() - size);
        if (aVar2.getIndex() > size) {
            return c10 + abs;
        }
        return c10 - abs;
    }

    public static /* synthetic */ void setFadeAnimation$default(BaseMaterialDateTimePickerView baseMaterialDateTimePickerView, long j10, long j11, float f10, float f11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                j10 = baseMaterialDateTimePickerView.f19337x;
            }
            long j12 = j10;
            if ((i10 & 2) != 0) {
                j11 = baseMaterialDateTimePickerView.f19338y;
            }
            long j13 = j11;
            if ((i10 & 4) != 0) {
                f10 = baseMaterialDateTimePickerView.f19339z;
            }
            float f12 = f10;
            if ((i10 & 8) != 0) {
                f11 = baseMaterialDateTimePickerView.A;
            }
            baseMaterialDateTimePickerView.setFadeAnimation(j12, j13, f12, f11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setFadeAnimation");
    }

    public static int t(m mVar, LowFlingRecyclerView lowFlingRecyclerView) {
        j.f(mVar, "$this$getSnapPosition");
        View d10 = mVar.d(lowFlingRecyclerView.getLayoutManager());
        if (d10 != null) {
            return RecyclerView.M(d10);
        }
        return 0;
    }

    public static void u(List list, long j10, float f10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.animate().alpha(f10).setDuration(j10).withEndAction(new a(view, f10)).start();
        }
    }

    public final float getFadeInAlpha$materialdatetimepicker_release() {
        return this.f19339z;
    }

    public final long getFadeInDuration$materialdatetimepicker_release() {
        return this.f19337x;
    }

    public final float getFadeOutAlpha$materialdatetimepicker_release() {
        return this.A;
    }

    public final long getFadeOutDuration$materialdatetimepicker_release() {
        return this.f19338y;
    }

    public final void q(LowFlingRecyclerView lowFlingRecyclerView, l lVar) {
        lowFlingRecyclerView.f3002y.add(new gg.a(this));
        lowFlingRecyclerView.j(new b(this, lVar));
    }

    public abstract void r(RecyclerView recyclerView, long j10, float f10);

    public final void setFadeAnimation(long j10, long j11, float f10, float f11) {
        this.f19337x = j10;
        this.f19338y = j11;
        this.f19339z = f10;
        this.A = f11;
    }

    public final void setFadeInAlpha$materialdatetimepicker_release(float f10) {
        this.f19339z = f10;
    }

    public final void setFadeInDuration$materialdatetimepicker_release(long j10) {
        this.f19337x = j10;
    }

    public final void setFadeOutAlpha$materialdatetimepicker_release(float f10) {
        this.A = f10;
    }

    public final void setFadeOutDuration$materialdatetimepicker_release(long j10) {
        this.f19338y = j10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseMaterialDateTimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseMaterialDateTimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
    }
}

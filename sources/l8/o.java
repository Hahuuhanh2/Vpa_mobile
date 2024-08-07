package l8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import k8.a;
import l8.p;

/* compiled from: ShapePath */
public final class o extends p.f {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List f12862c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Matrix f12863d;

    public o(ArrayList arrayList, Matrix matrix) {
        this.f12862c = arrayList;
        this.f12863d = matrix;
    }

    public final void a(Matrix matrix, a aVar, int i10, Canvas canvas) {
        for (p.f a10 : this.f12862c) {
            a10.a(this.f12863d, aVar, i10, canvas);
        }
    }
}

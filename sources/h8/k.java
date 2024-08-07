package h8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import h8.b;

/* compiled from: DrawingDelegate */
public abstract class k<S extends b> {

    /* renamed from: a  reason: collision with root package name */
    public S f10667a;

    /* renamed from: b  reason: collision with root package name */
    public j f10668b;

    public k(S s10) {
        this.f10667a = s10;
    }

    public abstract void a(Canvas canvas, Rect rect, float f10);

    public abstract void b(Canvas canvas, Paint paint, float f10, float f11, int i10);

    public abstract void c(Canvas canvas, Paint paint);

    public abstract int d();

    public abstract int e();
}

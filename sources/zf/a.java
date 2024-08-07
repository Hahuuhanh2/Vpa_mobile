package zf;

import ag.b;
import ag.c;
import ag.d;
import ag.e;
import ag.f;
import android.graphics.Canvas;
import android.graphics.Paint;

/* compiled from: Drawer */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public ag.a f23602a;

    /* renamed from: b  reason: collision with root package name */
    public b f23603b;

    /* renamed from: c  reason: collision with root package name */
    public b f23604c;

    /* renamed from: d  reason: collision with root package name */
    public f f23605d;

    /* renamed from: e  reason: collision with root package name */
    public b f23606e;

    /* renamed from: f  reason: collision with root package name */
    public c f23607f;

    /* renamed from: g  reason: collision with root package name */
    public e f23608g;

    /* renamed from: h  reason: collision with root package name */
    public b f23609h;

    /* renamed from: i  reason: collision with root package name */
    public d f23610i;

    /* renamed from: j  reason: collision with root package name */
    public d f23611j;

    /* renamed from: k  reason: collision with root package name */
    public int f23612k;

    /* renamed from: l  reason: collision with root package name */
    public int f23613l;

    /* renamed from: m  reason: collision with root package name */
    public int f23614m;

    public a(yf.a aVar) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f23602a = new ag.a(paint, aVar);
        this.f23603b = new b(paint, aVar, 0);
        this.f23604c = new b(paint, aVar, 1);
        this.f23605d = new f(paint, aVar);
        this.f23606e = new b(paint, aVar, 1);
        this.f23607f = new c(paint, aVar);
        this.f23608g = new e(paint, aVar);
        this.f23609h = new b(paint, aVar, 0);
        this.f23610i = new d(paint, aVar, 1);
        this.f23611j = new d(paint, aVar, 0);
    }

    public final void a(Canvas canvas, boolean z10) {
        Paint paint;
        if (this.f23603b != null) {
            ag.a aVar = this.f23602a;
            int i10 = this.f23612k;
            int i11 = this.f23613l;
            int i12 = this.f23614m;
            yf.a aVar2 = (yf.a) aVar.f17387b;
            float f10 = (float) aVar2.f23507c;
            int i13 = aVar2.f23513i;
            float f11 = aVar2.f23514j;
            int i14 = aVar2.f23516l;
            int i15 = aVar2.f23515k;
            int i16 = aVar2.f23522r;
            vf.f a10 = aVar2.a();
            if ((a10 == vf.f.SCALE && !z10) || (a10 == vf.f.SCALE_DOWN && z10)) {
                f10 *= f11;
            }
            if (i10 != i16) {
                i14 = i15;
            }
            if (a10 != vf.f.FILL || i10 == i16) {
                paint = (Paint) aVar.f17386a;
            } else {
                paint = aVar.f18951c;
                paint.setStrokeWidth((float) i13);
            }
            paint.setColor(i14);
            canvas.drawCircle((float) i11, (float) i12, f10, paint);
        }
    }
}

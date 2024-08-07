package ag;

import android.graphics.Canvas;
import android.graphics.Paint;
import uf.d;
import uf.e;
import y0.h;
import yf.a;

/* compiled from: ColorDrawer */
public final class b extends h {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18952c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Paint paint, a aVar, int i10) {
        super((Object) paint, (Object) aVar);
        this.f18952c = i10;
    }

    public void o(Canvas canvas, tf.a aVar, int i10, int i11) {
        yf.b bVar = yf.b.HORIZONTAL;
        switch (this.f18952c) {
            case 0:
                if (aVar instanceof uf.b) {
                    uf.b bVar2 = (uf.b) aVar;
                    a aVar2 = (a) this.f17387b;
                    int i12 = aVar2.f23515k;
                    int i13 = aVar2.f23516l;
                    ((Paint) this.f17386a).setColor(i12);
                    canvas.drawCircle((float) i10, (float) i11, (float) aVar2.f23507c, (Paint) this.f17386a);
                    ((Paint) this.f17386a).setColor(i13);
                    if (((a) this.f17387b).b() == bVar) {
                        canvas.drawCircle((float) bVar2.f23028a, (float) bVar2.f23029b, (float) bVar2.f23030c, (Paint) this.f17386a);
                        return;
                    } else {
                        canvas.drawCircle((float) bVar2.f23029b, (float) bVar2.f23028a, (float) bVar2.f23030c, (Paint) this.f17386a);
                        return;
                    }
                } else {
                    return;
                }
            default:
                if (aVar instanceof e) {
                    int i14 = ((e) aVar).f23037a;
                    a aVar3 = (a) this.f17387b;
                    int i15 = aVar3.f23515k;
                    int i16 = aVar3.f23516l;
                    int i17 = aVar3.f23507c;
                    ((Paint) this.f17386a).setColor(i15);
                    float f10 = (float) i10;
                    float f11 = (float) i11;
                    float f12 = (float) i17;
                    canvas.drawCircle(f10, f11, f12, (Paint) this.f17386a);
                    ((Paint) this.f17386a).setColor(i16);
                    if (((a) this.f17387b).b() == bVar) {
                        canvas.drawCircle((float) i14, f11, f12, (Paint) this.f17386a);
                        return;
                    } else {
                        canvas.drawCircle(f10, (float) i14, f12, (Paint) this.f17386a);
                        return;
                    }
                } else {
                    return;
                }
        }
    }

    public void p(Canvas canvas, tf.a aVar, int i10, int i11, int i12) {
        switch (this.f18952c) {
            case 0:
                if (aVar instanceof uf.a) {
                    uf.a aVar2 = (uf.a) aVar;
                    a aVar3 = (a) this.f17387b;
                    float f10 = (float) aVar3.f23507c;
                    int i13 = aVar3.f23516l;
                    int i14 = aVar3.f23522r;
                    int i15 = aVar3.f23523s;
                    int i16 = aVar3.f23524t;
                    if (aVar3.f23517m) {
                        if (i10 == i15) {
                            i13 = aVar2.f23026a;
                        } else if (i10 == i14) {
                            i13 = aVar2.f23027b;
                        }
                    } else if (i10 == i14) {
                        i13 = aVar2.f23026a;
                    } else if (i10 == i16) {
                        i13 = aVar2.f23027b;
                    }
                    ((Paint) this.f17386a).setColor(i13);
                    canvas.drawCircle((float) i11, (float) i12, f10, (Paint) this.f17386a);
                    return;
                }
                return;
            default:
                if (aVar instanceof d) {
                    d dVar = (d) aVar;
                    a aVar4 = (a) this.f17387b;
                    float f11 = (float) aVar4.f23507c;
                    int i17 = aVar4.f23516l;
                    int i18 = aVar4.f23522r;
                    int i19 = aVar4.f23523s;
                    int i20 = aVar4.f23524t;
                    if (aVar4.f23517m) {
                        if (i10 == i19) {
                            f11 = (float) dVar.f23035c;
                            i17 = dVar.f23026a;
                        } else if (i10 == i18) {
                            f11 = (float) dVar.f23036d;
                            i17 = dVar.f23027b;
                        }
                    } else if (i10 == i18) {
                        f11 = (float) dVar.f23035c;
                        i17 = dVar.f23026a;
                    } else if (i10 == i20) {
                        f11 = (float) dVar.f23036d;
                        i17 = dVar.f23027b;
                    }
                    ((Paint) this.f17386a).setColor(i17);
                    canvas.drawCircle((float) i11, (float) i12, f11, (Paint) this.f17386a);
                    return;
                }
                return;
        }
    }
}

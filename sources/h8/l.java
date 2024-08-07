package h8;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.provider.Settings;
import h8.b;

/* compiled from: IndeterminateDrawable */
public final class l<S extends b> extends j {

    /* renamed from: s  reason: collision with root package name */
    public k<S> f10669s;

    /* renamed from: t  reason: collision with root package name */
    public m.b f10670t;

    public l(Context context, b bVar, k<S> kVar, m.b bVar2) {
        super(context, bVar);
        this.f10669s = kVar;
        kVar.f10668b = this;
        this.f10670t = bVar2;
        bVar2.f13020a = this;
    }

    public final void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            k<S> kVar = this.f10669s;
            Rect bounds = getBounds();
            float b10 = b();
            kVar.f10667a.a();
            kVar.a(canvas, bounds, b10);
            this.f10669s.c(canvas, this.f10665p);
            int i10 = 0;
            while (true) {
                m.b bVar = this.f10670t;
                int[] iArr = (int[]) bVar.f13022c;
                if (i10 < iArr.length) {
                    k<S> kVar2 = this.f10669s;
                    Paint paint = this.f10665p;
                    float[] fArr = (float[]) bVar.f13021b;
                    int i11 = i10 * 2;
                    kVar2.b(canvas, paint, fArr[i11], fArr[i11 + 1], iArr[i10]);
                    i10++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public final boolean f(boolean z10, boolean z11, boolean z12) {
        boolean f10 = super.f(z10, z11, z12);
        if (!isRunning()) {
            this.f10670t.c();
        }
        a aVar = this.f10659c;
        ContentResolver contentResolver = this.f10657a.getContentResolver();
        aVar.getClass();
        Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (z10 && z12) {
            this.f10670t.i();
        }
        return f10;
    }

    public final int getIntrinsicHeight() {
        return this.f10669s.d();
    }

    public final int getIntrinsicWidth() {
        return this.f10669s.e();
    }
}

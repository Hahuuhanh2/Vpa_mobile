package ag;

import android.graphics.Paint;
import y0.h;

/* compiled from: BasicDrawer */
public final class a extends h {

    /* renamed from: c  reason: collision with root package name */
    public Paint f18951c;

    public a(Paint paint, yf.a aVar) {
        super((Object) paint, (Object) aVar);
        Paint paint2 = new Paint();
        this.f18951c = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.f18951c.setAntiAlias(true);
        this.f18951c.setStrokeWidth((float) aVar.f23513i);
    }
}

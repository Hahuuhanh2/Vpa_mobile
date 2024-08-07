package y5;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* compiled from: PagePart */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public int f17527a;

    /* renamed from: b  reason: collision with root package name */
    public int f17528b;

    /* renamed from: c  reason: collision with root package name */
    public Bitmap f17529c;

    /* renamed from: d  reason: collision with root package name */
    public RectF f17530d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f17531e;

    /* renamed from: f  reason: collision with root package name */
    public int f17532f;

    public a(int i10, int i11, Bitmap bitmap, RectF rectF, boolean z10, int i12) {
        this.f17527a = i10;
        this.f17528b = i11;
        this.f17529c = bitmap;
        this.f17530d = rectF;
        this.f17531e = z10;
        this.f17532f = i12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (aVar.f17528b != this.f17528b || aVar.f17527a != this.f17527a) {
            return false;
        }
        RectF rectF = aVar.f17530d;
        float f10 = rectF.left;
        RectF rectF2 = this.f17530d;
        if (f10 == rectF2.left && rectF.right == rectF2.right && rectF.top == rectF2.top && rectF.bottom == rectF2.bottom) {
            return true;
        }
        return false;
    }
}

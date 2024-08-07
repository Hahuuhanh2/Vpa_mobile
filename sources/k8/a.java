package k8;

import android.graphics.Paint;
import android.graphics.Path;
import n1.d;

/* compiled from: ShadowRenderer */
public final class a {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f12050i = new int[3];

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f12051j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f12052k = new int[4];

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f12053l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f12054a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f12055b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f12056c;

    /* renamed from: d  reason: collision with root package name */
    public int f12057d;

    /* renamed from: e  reason: collision with root package name */
    public int f12058e;

    /* renamed from: f  reason: collision with root package name */
    public int f12059f;

    /* renamed from: g  reason: collision with root package name */
    public final Path f12060g = new Path();

    /* renamed from: h  reason: collision with root package name */
    public final Paint f12061h;

    public a() {
        Paint paint = new Paint();
        this.f12061h = paint;
        this.f12054a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f12055b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f12056c = new Paint(paint2);
    }

    public final void a(int i10) {
        this.f12057d = d.d(i10, 68);
        this.f12058e = d.d(i10, 20);
        this.f12059f = d.d(i10, 0);
        this.f12054a.setColor(this.f12057d);
    }
}

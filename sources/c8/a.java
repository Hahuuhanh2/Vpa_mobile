package c8;

import android.content.Context;
import android.graphics.Color;
import com.google.android.material.R$attr;
import i8.b;
import n1.d;

/* compiled from: ElevationOverlayProvider */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f4585f = ((int) Math.round(5.1000000000000005d));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f4586a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4587b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4588c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4589d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4590e;

    public a(Context context) {
        boolean b10 = b.b(context, R$attr.elevationOverlayEnabled, false);
        int B = m9.b.B(context, R$attr.elevationOverlayColor, 0);
        int B2 = m9.b.B(context, R$attr.elevationOverlayAccentColor, 0);
        int B3 = m9.b.B(context, R$attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f4586a = b10;
        this.f4587b = B;
        this.f4588c = B2;
        this.f4589d = B3;
        this.f4590e = f10;
    }

    public final int a(int i10, float f10) {
        boolean z10;
        float f11;
        int i11;
        if (!this.f4586a) {
            return i10;
        }
        if (d.d(i10, 255) == this.f4589d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return i10;
        }
        float f12 = this.f4590e;
        if (f12 <= 0.0f || f10 <= 0.0f) {
            f11 = 0.0f;
        } else {
            f11 = Math.min(((((float) Math.log1p((double) (f10 / f12))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        int alpha = Color.alpha(i10);
        int K = m9.b.K(f11, d.d(i10, 255), this.f4587b);
        if (f11 > 0.0f && (i11 = this.f4588c) != 0) {
            K = d.c(d.d(i11, f4585f), K);
        }
        return d.d(K, alpha);
    }
}

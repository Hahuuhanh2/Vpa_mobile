package m5;

import android.graphics.drawable.Drawable;

/* compiled from: DrawableCrossFadeFactory */
public final class a implements e<Drawable> {

    /* renamed from: a  reason: collision with root package name */
    public final int f13135a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13136b;

    /* renamed from: c  reason: collision with root package name */
    public b f13137c;

    public a(int i10, boolean z10) {
        this.f13135a = i10;
        this.f13136b = z10;
    }

    public final d a(s4.a aVar) {
        if (aVar == s4.a.MEMORY_CACHE) {
            return c.f13140a;
        }
        if (this.f13137c == null) {
            this.f13137c = new b(this.f13135a, this.f13136b);
        }
        return this.f13137c;
    }
}

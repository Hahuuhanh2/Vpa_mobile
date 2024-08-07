package androidx.appcompat.widget;

/* compiled from: RtlSpacingHelper */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public int f1095a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f1096b = 0;

    /* renamed from: c  reason: collision with root package name */
    public int f1097c = Integer.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public int f1098d = Integer.MIN_VALUE;

    /* renamed from: e  reason: collision with root package name */
    public int f1099e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1100f = 0;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1101g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1102h = false;

    public final void a(int i10, int i11) {
        this.f1097c = i10;
        this.f1098d = i11;
        this.f1102h = true;
        if (this.f1101g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f1095a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f1096b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f1095a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f1096b = i11;
        }
    }
}

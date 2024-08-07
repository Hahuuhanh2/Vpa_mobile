package j$.time.temporal;

public final /* synthetic */ class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18265a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f18266b;

    public /* synthetic */ l(int i10, int i11) {
        this.f18265a = i11;
        this.f18266b = i10;
    }

    public final Temporal t(Temporal temporal) {
        switch (this.f18265a) {
            case 0:
                int i10 = this.f18266b;
                int m10 = temporal.m(a.DAY_OF_WEEK);
                if (m10 == i10) {
                    return temporal;
                }
                int i11 = m10 - i10;
                return temporal.d((long) (i11 >= 0 ? 7 - i11 : -i11), ChronoUnit.DAYS);
            default:
                int i12 = this.f18266b;
                int m11 = temporal.m(a.DAY_OF_WEEK);
                if (m11 == i12) {
                    return temporal;
                }
                int i13 = i12 - m11;
                return temporal.g((long) (i13 >= 0 ? 7 - i13 : -i13), ChronoUnit.DAYS);
        }
    }
}

package v9;

import j7.a;

/* compiled from: RetryManager */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final a f16109a = new a();

    /* renamed from: b  reason: collision with root package name */
    public long f16110b = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f16111c = -1;

    public final void a(int i10) {
        boolean z10;
        this.f16110b++;
        if (i10 == 400 || i10 == 404) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.f16109a.getClass();
            this.f16111c = System.currentTimeMillis() + 86400000;
            return;
        }
        double d10 = (double) this.f16110b;
        this.f16109a.getClass();
        this.f16111c = Math.min((long) (Math.pow(2.0d, d10 * ((Math.random() * 0.5d) + 1.0d)) * 1000.0d), 14400000) + System.currentTimeMillis();
    }
}

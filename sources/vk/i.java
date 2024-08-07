package vk;

import java.util.Iterator;

/* compiled from: Progressions.kt */
public class i implements Iterable<Long> {

    /* renamed from: a  reason: collision with root package name */
    public final long f23343a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23344b;

    /* renamed from: c  reason: collision with root package name */
    public final long f23345c;

    public i(long j10, long j11) {
        this.f23343a = j10;
        if (j10 < j11) {
            long j12 = j11 % 1;
            long j13 = j10 % 1;
            long j14 = ((j12 < 0 ? j12 + 1 : j12) - (j13 < 0 ? j13 + 1 : j13)) % 1;
            j11 -= j14 < 0 ? j14 + 1 : j14;
        }
        this.f23344b = j11;
        this.f23345c = 1;
    }

    public final Iterator iterator() {
        return new j(this.f23343a, this.f23344b, this.f23345c);
    }
}

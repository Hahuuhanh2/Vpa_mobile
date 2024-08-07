package vk;

import fk.y;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
public final class j extends y {

    /* renamed from: a  reason: collision with root package name */
    public final long f23346a;

    /* renamed from: b  reason: collision with root package name */
    public final long f23347b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23348c;

    /* renamed from: d  reason: collision with root package name */
    public long f23349d;

    public j(long j10, long j11, long j12) {
        this.f23346a = j12;
        this.f23347b = j11;
        boolean z10 = true;
        if (j12 <= 0 ? j10 < j11 : j10 > j11) {
            z10 = false;
        }
        this.f23348c = z10;
        this.f23349d = !z10 ? j11 : j10;
    }

    public final boolean hasNext() {
        return this.f23348c;
    }

    public final long nextLong() {
        long j10 = this.f23349d;
        if (j10 != this.f23347b) {
            this.f23349d = this.f23346a + j10;
        } else if (this.f23348c) {
            this.f23348c = false;
        } else {
            throw new NoSuchElementException();
        }
        return j10;
    }
}

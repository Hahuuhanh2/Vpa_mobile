package vk;

import fk.x;
import java.util.NoSuchElementException;

/* compiled from: ProgressionIterators.kt */
public final class g extends x {

    /* renamed from: a  reason: collision with root package name */
    public final int f23338a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23339b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f23340c;

    /* renamed from: d  reason: collision with root package name */
    public int f23341d;

    public g(int i10, int i11, int i12) {
        this.f23338a = i12;
        this.f23339b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f23340c = z10;
        this.f23341d = !z10 ? i11 : i10;
    }

    public final boolean hasNext() {
        return this.f23340c;
    }

    public final int nextInt() {
        int i10 = this.f23341d;
        if (i10 != this.f23339b) {
            this.f23341d = this.f23338a + i10;
        } else if (this.f23340c) {
            this.f23340c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i10;
    }
}

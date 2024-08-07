package a1;

import android.support.v4.media.a;
import java.util.Arrays;

/* compiled from: SolverVariable */
public final class g implements Comparable<g> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f54a;

    /* renamed from: b  reason: collision with root package name */
    public int f55b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f56c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f57d = 0;

    /* renamed from: e  reason: collision with root package name */
    public float f58e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f59f = false;

    /* renamed from: n  reason: collision with root package name */
    public float[] f60n = new float[9];

    /* renamed from: o  reason: collision with root package name */
    public float[] f61o = new float[9];

    /* renamed from: p  reason: collision with root package name */
    public int f62p;

    /* renamed from: q  reason: collision with root package name */
    public b[] f63q = new b[16];

    /* renamed from: r  reason: collision with root package name */
    public int f64r = 0;

    /* renamed from: s  reason: collision with root package name */
    public int f65s = 0;

    public g(int i10) {
        this.f62p = i10;
    }

    public final void b(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f64r;
            if (i10 >= i11) {
                b[] bVarArr = this.f63q;
                if (i11 >= bVarArr.length) {
                    this.f63q = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f63q;
                int i12 = this.f64r;
                bVarArr2[i12] = bVar;
                this.f64r = i12 + 1;
                return;
            } else if (this.f63q[i10] != bVar) {
                i10++;
            } else {
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i10 = this.f64r;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f63q[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f63q;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f64r--;
                return;
            }
            i11++;
        }
    }

    public final int compareTo(Object obj) {
        return this.f55b - ((g) obj).f55b;
    }

    public final void i() {
        this.f62p = 5;
        this.f57d = 0;
        this.f55b = -1;
        this.f56c = -1;
        this.f58e = 0.0f;
        this.f59f = false;
        int i10 = this.f64r;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f63q[i11] = null;
        }
        this.f64r = 0;
        this.f65s = 0;
        this.f54a = false;
        Arrays.fill(this.f61o, 0.0f);
    }

    public final void j(d dVar, float f10) {
        this.f58e = f10;
        this.f59f = true;
        int i10 = this.f64r;
        this.f56c = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f63q[i11].h(dVar, this, false);
        }
        this.f64r = 0;
    }

    public final void k(d dVar, b bVar) {
        int i10 = this.f64r;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f63q[i11].i(dVar, bVar, false);
        }
        this.f64r = 0;
    }

    public final String toString() {
        StringBuilder q10 = a.q("");
        q10.append(this.f55b);
        return q10.toString();
    }
}

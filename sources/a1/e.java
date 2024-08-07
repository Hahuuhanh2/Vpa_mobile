package a1;

import v1.d;

/* compiled from: Pools */
public class e implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f45a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f46b;

    /* renamed from: c  reason: collision with root package name */
    public int f47c;

    public e(int i10, int i11) {
        this.f45a = i11;
        if (i11 != 1) {
            if (i11 == 2) {
                this.f46b = new byte[i10];
                this.f47c = 0;
            } else if (i10 > 0) {
                this.f46b = new Object[i10];
            } else {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
        } else if (i10 > 0) {
            this.f46b = new Object[i10];
        } else {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    public boolean a(Object obj) {
        int i10;
        boolean z10;
        switch (this.f45a) {
            case 0:
                int i11 = this.f47c;
                Object[] objArr = (Object[]) this.f46b;
                if (i11 >= objArr.length) {
                    return false;
                }
                objArr[i11] = obj;
                this.f47c = i11 + 1;
                return true;
            default:
                int i12 = 0;
                while (true) {
                    i10 = this.f47c;
                    if (i12 >= i10) {
                        z10 = false;
                    } else if (((Object[]) this.f46b)[i12] == obj) {
                        z10 = true;
                    } else {
                        i12++;
                    }
                }
                if (!z10) {
                    Object[] objArr2 = (Object[]) this.f46b;
                    if (i10 >= objArr2.length) {
                        return false;
                    }
                    objArr2[i10] = obj;
                    this.f47c = i10 + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }

    public Object b() {
        switch (this.f45a) {
            case 0:
                int i10 = this.f47c;
                if (i10 <= 0) {
                    return null;
                }
                int i11 = i10 - 1;
                Object[] objArr = (Object[]) this.f46b;
                Object obj = objArr[i11];
                objArr[i11] = null;
                this.f47c = i11;
                return obj;
            default:
                int i12 = this.f47c;
                if (i12 <= 0) {
                    return null;
                }
                int i13 = i12 - 1;
                Object[] objArr2 = (Object[]) this.f46b;
                Object obj2 = objArr2[i13];
                objArr2[i13] = null;
                this.f47c = i13;
                return obj2;
        }
    }
}

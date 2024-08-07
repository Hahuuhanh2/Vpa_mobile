package j$.util.concurrent;

class q {

    /* renamed from: a  reason: collision with root package name */
    m[] f18437a;

    /* renamed from: b  reason: collision with root package name */
    m f18438b = null;

    /* renamed from: c  reason: collision with root package name */
    p f18439c;

    /* renamed from: d  reason: collision with root package name */
    p f18440d;

    /* renamed from: e  reason: collision with root package name */
    int f18441e;

    /* renamed from: f  reason: collision with root package name */
    int f18442f;

    /* renamed from: g  reason: collision with root package name */
    int f18443g;

    /* renamed from: h  reason: collision with root package name */
    final int f18444h;

    q(m[] mVarArr, int i10, int i11, int i12) {
        this.f18437a = mVarArr;
        this.f18444h = i10;
        this.f18441e = i11;
        this.f18442f = i11;
        this.f18443g = i12;
    }

    /* access modifiers changed from: package-private */
    public final m f() {
        m mVar;
        m[] mVarArr;
        int length;
        int i10;
        p pVar;
        m mVar2 = this.f18438b;
        if (mVar2 != null) {
            mVar2 = mVar2.f18432d;
        }
        while (mVar == null) {
            if (this.f18442f >= this.f18443g || (mVarArr = this.f18437a) == null || (length = mVarArr.length) <= (i10 = this.f18441e) || i10 < 0) {
                this.f18438b = null;
                return null;
            }
            m m10 = ConcurrentHashMap.m(mVarArr, i10);
            if (m10 == null || m10.f18429a >= 0) {
                mVar = m10;
            } else if (m10 instanceof h) {
                this.f18437a = ((h) m10).f18422e;
                p pVar2 = this.f18440d;
                if (pVar2 != null) {
                    this.f18440d = pVar2.f18436d;
                } else {
                    pVar2 = new p();
                }
                pVar2.f18435c = mVarArr;
                pVar2.f18433a = length;
                pVar2.f18434b = i10;
                pVar2.f18436d = this.f18439c;
                this.f18439c = pVar2;
                mVar = null;
            } else {
                mVar = m10 instanceof r ? ((r) m10).f18448f : null;
            }
            if (this.f18439c != null) {
                while (true) {
                    pVar = this.f18439c;
                    if (pVar == null) {
                        break;
                    }
                    int i11 = this.f18441e;
                    int i12 = pVar.f18433a;
                    int i13 = i11 + i12;
                    this.f18441e = i13;
                    if (i13 < length) {
                        break;
                    }
                    this.f18441e = pVar.f18434b;
                    this.f18437a = pVar.f18435c;
                    pVar.f18435c = null;
                    p pVar3 = pVar.f18436d;
                    pVar.f18436d = this.f18440d;
                    this.f18439c = pVar3;
                    this.f18440d = pVar;
                    length = i12;
                }
                if (pVar == null) {
                    int i14 = this.f18441e + this.f18444h;
                    this.f18441e = i14;
                    if (i14 >= length) {
                        int i15 = this.f18442f + 1;
                        this.f18442f = i15;
                        this.f18441e = i15;
                    }
                }
            } else {
                int i16 = i10 + this.f18444h;
                this.f18441e = i16;
                if (i16 >= length) {
                    int i17 = this.f18442f + 1;
                    this.f18442f = i17;
                    this.f18441e = i17;
                }
            }
        }
        this.f18438b = mVar;
        return mVar;
    }
}

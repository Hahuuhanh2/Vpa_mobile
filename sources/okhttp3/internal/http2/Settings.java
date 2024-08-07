package okhttp3.internal.http2;

/* compiled from: Settings.kt */
public final class Settings {

    /* renamed from: a  reason: collision with root package name */
    public int f22529a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f22530b = new int[10];

    /* compiled from: Settings.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i10) {
            this();
        }
    }

    static {
        new Companion(0);
    }

    public final int a() {
        if ((this.f22529a & 128) != 0) {
            return this.f22530b[7];
        }
        return 65535;
    }

    public final void b(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f22530b;
            if (i10 < iArr.length) {
                this.f22529a = (1 << i10) | this.f22529a;
                iArr[i10] = i11;
            }
        }
    }
}

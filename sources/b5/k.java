package b5;

import s4.g;

/* compiled from: DownsampleStrategy */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final e f4025a = new e();

    /* renamed from: b  reason: collision with root package name */
    public static final c f4026b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final d f4027c;

    /* renamed from: d  reason: collision with root package name */
    public static final f f4028d = new f();

    /* renamed from: e  reason: collision with root package name */
    public static final d f4029e;

    /* renamed from: f  reason: collision with root package name */
    public static final g<k> f4030f;

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f4031g = true;

    /* compiled from: DownsampleStrategy */
    public static class a extends k {
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            int min = Math.min(i11 / i13, i10 / i12);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class b extends k {
        public final int a(int i10, int i11, int i12, int i13) {
            return 1;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i11) / ((float) i13), ((float) i10) / ((float) i12)));
            int i14 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i14 = 0;
            }
            return 1.0f / ((float) (max << i14));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class c extends k {
        public final int a(int i10, int i11, int i12, int i13) {
            if (b(i10, i11, i12, i13) == 1.0f) {
                return 2;
            }
            return k.f4025a.a(i10, i11, i12, i13);
        }

        public final float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, k.f4025a.b(i10, i11, i12, i13));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class d extends k {
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            return Math.max(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class e extends k {
        public final int a(int i10, int i11, int i12, int i13) {
            if (k.f4031g) {
                return 2;
            }
            return 1;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            if (k.f4031g) {
                return Math.min(((float) i12) / ((float) i10), ((float) i13) / ((float) i11));
            }
            int max = Math.max(i11 / i13, i10 / i12);
            if (max == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(max));
        }
    }

    /* compiled from: DownsampleStrategy */
    public static class f extends k {
        public final int a(int i10, int i11, int i12, int i13) {
            return 2;
        }

        public final float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }
    }

    static {
        new a();
        new b();
        d dVar = new d();
        f4027c = dVar;
        f4029e = dVar;
        f4030f = g.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
    }

    public abstract int a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);
}

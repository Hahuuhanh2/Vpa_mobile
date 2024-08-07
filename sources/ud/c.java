package ud;

/* compiled from: DataMask */
public enum c {
    ;

    /* 'enum' modifier removed */
    /* compiled from: DataMask */
    public static class a extends c {
        public a() {
            super("DATA_MASK_000", 0);
        }

        public final boolean b(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: DataMask */
    public static class b extends c {
        public b() {
            super("DATA_MASK_001", 1);
        }

        public final boolean b(int i10, int i11) {
            return (i10 & 1) == 0;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: ud.c$c  reason: collision with other inner class name */
    /* compiled from: DataMask */
    public static class C0208c extends c {
        public C0208c() {
            super("DATA_MASK_010", 2);
        }

        public final boolean b(int i10, int i11) {
            if (i11 % 3 == 0) {
                return true;
            }
            return false;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: DataMask */
    public static class d extends c {
        public d() {
            super("DATA_MASK_011", 3);
        }

        public final boolean b(int i10, int i11) {
            if ((i10 + i11) % 3 == 0) {
                return true;
            }
            return false;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: DataMask */
    public static class e extends c {
        public e() {
            super("DATA_MASK_100", 4);
        }

        public final boolean b(int i10, int i11) {
            if ((((i11 / 3) + (i10 / 2)) & 1) == 0) {
                return true;
            }
            return false;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: DataMask */
    public static class f extends c {
        public f() {
            super("DATA_MASK_101", 5);
        }

        public final boolean b(int i10, int i11) {
            if ((i10 * i11) % 6 == 0) {
                return true;
            }
            return false;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: DataMask */
    public static class g extends c {
        public g() {
            super("DATA_MASK_110", 6);
        }

        public final boolean b(int i10, int i11) {
            if ((i10 * i11) % 6 < 3) {
                return true;
            }
            return false;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: DataMask */
    public static class h extends c {
        public h() {
            super("DATA_MASK_111", 7);
        }

        public final boolean b(int i10, int i11) {
            if (((((i10 * i11) % 3) + i10 + i11) & 1) == 0) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: public */
    c() {
        throw null;
    }

    public abstract boolean b(int i10, int i11);
}

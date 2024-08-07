package sb;

/* compiled from: StorageUnit */
public enum i {
    ;
    

    /* renamed from: a  reason: collision with root package name */
    public long f14724a;

    /* 'enum' modifier removed */
    /* compiled from: StorageUnit */
    public final class a extends i {
        public a() {
            super("TERABYTES", 0, 1099511627776L);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: StorageUnit */
    public final class b extends i {
        public b() {
            super("GIGABYTES", 1, 1073741824);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: StorageUnit */
    public final class c extends i {
        public c() {
            super("MEGABYTES", 2, 1048576);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: StorageUnit */
    public final class d extends i {
        public d() {
            super("KILOBYTES", 3, 1024);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: StorageUnit */
    public final class e extends i {
        public e() {
            super("BYTES", 4, 1);
        }
    }

    /* access modifiers changed from: public */
    i(long j10) {
        this.f14724a = j10;
    }
}

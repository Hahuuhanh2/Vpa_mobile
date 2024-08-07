package tc;

/* compiled from: WireFormat */
public enum c0 {
    INT64(r5, 0);
    

    /* renamed from: a  reason: collision with root package name */
    public final d0 f14969a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14970b;

    /* 'enum' modifier removed */
    /* compiled from: WireFormat */
    public final class a extends c0 {
        public a() {
            super("STRING", 8, d0.STRING, 2);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: WireFormat */
    public final class b extends c0 {
        public b(d0 d0Var) {
            super("GROUP", 9, d0Var, 3);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: WireFormat */
    public final class c extends c0 {
        public c(d0 d0Var) {
            super("MESSAGE", 10, d0Var, 2);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: WireFormat */
    public final class d extends c0 {
        public d(d0 d0Var) {
            super("BYTES", 11, d0Var, 2);
        }
    }

    /* access modifiers changed from: public */
    c0(d0 d0Var, int i10) {
        this.f14969a = d0Var;
        this.f14970b = i10;
    }
}

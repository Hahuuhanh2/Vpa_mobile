package j2;

/* compiled from: WireFormat */
public enum z {
    ;
    

    /* renamed from: a  reason: collision with root package name */
    public final a0 f11539a;

    /* renamed from: b  reason: collision with root package name */
    public final int f11540b;

    /* 'enum' modifier removed */
    /* compiled from: WireFormat */
    public static class a extends z {
        public a() {
            super("STRING", 8, a0.STRING, 2);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: WireFormat */
    public static class b extends z {
        public b(a0 a0Var) {
            super("GROUP", 9, a0Var, 3);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: WireFormat */
    public static class c extends z {
        public c(a0 a0Var) {
            super("MESSAGE", 10, a0Var, 2);
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: WireFormat */
    public static class d extends z {
        public d(a0 a0Var) {
            super("BYTES", 11, a0Var, 2);
        }
    }

    /* access modifiers changed from: public */
    z(a0 a0Var, int i10) {
        this.f11539a = a0Var;
        this.f11540b = i10;
    }
}

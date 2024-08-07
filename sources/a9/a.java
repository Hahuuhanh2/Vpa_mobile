package a9;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: TinkFipsUtil */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final Logger f114a = Logger.getLogger(a.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f115b = new AtomicBoolean(false);

    /* renamed from: a9.a$a  reason: collision with other inner class name */
    /* compiled from: TinkFipsUtil */
    public enum C0003a {
        ;

        /* 'enum' modifier removed */
        /* renamed from: a9.a$a$a  reason: collision with other inner class name */
        /* compiled from: TinkFipsUtil */
        public final class C0004a extends C0003a {
            public C0004a() {
                super("ALGORITHM_NOT_FIPS", 0);
            }

            public final boolean b() {
                return !a.a();
            }
        }

        /* 'enum' modifier removed */
        /* renamed from: a9.a$a$b */
        /* compiled from: TinkFipsUtil */
        public final class b extends C0003a {
            public b() {
                super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            }

            public final boolean b() {
                Boolean bool;
                if (a.a()) {
                    try {
                        bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke((Object) null, new Object[0]);
                    } catch (Exception unused) {
                        a.f114a.info("Conscrypt is not available or does not support checking for FIPS build.");
                        bool = Boolean.FALSE;
                    }
                    if (bool.booleanValue()) {
                        return true;
                    }
                    return false;
                }
                return true;
            }
        }

        /* access modifiers changed from: public */
        C0003a() {
            throw null;
        }

        public abstract boolean b();
    }

    public static boolean a() {
        if (f115b.get()) {
            return true;
        }
        return false;
    }
}

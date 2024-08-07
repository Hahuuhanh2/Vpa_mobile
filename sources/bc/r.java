package bc;

import com.google.gson.JsonParseException;
import dc.o;
import f0.b0;
import java.math.BigDecimal;

/* compiled from: ToNumberPolicy */
public enum r implements s {
    ;

    /* 'enum' modifier removed */
    /* compiled from: ToNumberPolicy */
    public final class a extends r {
        public a() {
            super("DOUBLE", 0);
        }

        public final Number b(hc.a aVar) {
            return Double.valueOf(aVar.S());
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: ToNumberPolicy */
    public final class b extends r {
        public b() {
            super("LAZILY_PARSED_NUMBER", 1);
        }

        public final Number b(hc.a aVar) {
            return new o(aVar.g0());
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: ToNumberPolicy */
    public final class c extends r {
        public c() {
            super("LONG_OR_DOUBLE", 2);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:4|5|(2:12|13)(1:11)) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
            throw new com.google.gson.stream.MalformedJsonException("JSON forbids NaN and infinities: " + r2 + "; at path " + r7.E());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
            r0 = f0.b0.w("Cannot parse ", r1, "; at path ");
            r0.append(r7.E());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
            throw new com.google.gson.JsonParseException(r0.toString(), r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:?, code lost:
            r2 = java.lang.Double.valueOf(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r2.isInfinite() != false) goto L_0x001f;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Number b(hc.a r7) {
            /*
                r6 = this;
                java.lang.String r0 = "; at path "
                java.lang.String r1 = r7.g0()
                long r2 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x000f }
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch:{ NumberFormatException -> 0x000f }
                return r7
            L_0x000f:
                java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x0045 }
                boolean r3 = r2.isInfinite()     // Catch:{ NumberFormatException -> 0x0045 }
                if (r3 != 0) goto L_0x001f
                boolean r3 = r2.isNaN()     // Catch:{ NumberFormatException -> 0x0045 }
                if (r3 == 0) goto L_0x0023
            L_0x001f:
                boolean r3 = r7.f10712b     // Catch:{ NumberFormatException -> 0x0045 }
                if (r3 == 0) goto L_0x0024
            L_0x0023:
                return r2
            L_0x0024:
                com.google.gson.stream.MalformedJsonException r3 = new com.google.gson.stream.MalformedJsonException     // Catch:{ NumberFormatException -> 0x0045 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0045 }
                r4.<init>()     // Catch:{ NumberFormatException -> 0x0045 }
                java.lang.String r5 = "JSON forbids NaN and infinities: "
                r4.append(r5)     // Catch:{ NumberFormatException -> 0x0045 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0045 }
                r4.append(r0)     // Catch:{ NumberFormatException -> 0x0045 }
                java.lang.String r2 = r7.E()     // Catch:{ NumberFormatException -> 0x0045 }
                r4.append(r2)     // Catch:{ NumberFormatException -> 0x0045 }
                java.lang.String r2 = r4.toString()     // Catch:{ NumberFormatException -> 0x0045 }
                r3.<init>(r2)     // Catch:{ NumberFormatException -> 0x0045 }
                throw r3     // Catch:{ NumberFormatException -> 0x0045 }
            L_0x0045:
                r2 = move-exception
                com.google.gson.JsonParseException r3 = new com.google.gson.JsonParseException
                java.lang.String r4 = "Cannot parse "
                java.lang.StringBuilder r0 = f0.b0.w(r4, r1, r0)
                java.lang.String r7 = r7.E()
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r3.<init>(r7, r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: bc.r.c.b(hc.a):java.lang.Number");
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: ToNumberPolicy */
    public final class d extends r {
        public d() {
            super("BIG_DECIMAL", 3);
        }

        public final Number b(hc.a aVar) {
            String g02 = aVar.g0();
            try {
                return new BigDecimal(g02);
            } catch (NumberFormatException e10) {
                StringBuilder w9 = b0.w("Cannot parse ", g02, "; at path ");
                w9.append(aVar.E());
                throw new JsonParseException(w9.toString(), e10);
            }
        }
    }

    /* access modifiers changed from: public */
    r() {
        throw null;
    }
}

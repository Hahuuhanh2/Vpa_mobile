package c3;

import android.annotation.SuppressLint;
import sk.j;

/* compiled from: SimpleSQLiteQuery.kt */
public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public final String f4554a;

    /* renamed from: c3.a$a  reason: collision with other inner class name */
    /* compiled from: SimpleSQLiteQuery.kt */
    public static final class C0049a {
        @SuppressLint({"SyntheticAccessor"})
        public static void a(d dVar, Object[] objArr) {
            long j10;
            if (objArr != null) {
                int length = objArr.length;
                int i10 = 0;
                while (i10 < length) {
                    byte[] bArr = objArr[i10];
                    i10++;
                    if (bArr == null) {
                        dVar.m0(i10);
                    } else if (bArr instanceof byte[]) {
                        dVar.M(i10, bArr);
                    } else if (bArr instanceof Float) {
                        dVar.w(i10, (double) ((Number) bArr).floatValue());
                    } else if (bArr instanceof Double) {
                        dVar.w(i10, ((Number) bArr).doubleValue());
                    } else if (bArr instanceof Long) {
                        dVar.H(i10, ((Number) bArr).longValue());
                    } else if (bArr instanceof Integer) {
                        dVar.H(i10, (long) ((Number) bArr).intValue());
                    } else if (bArr instanceof Short) {
                        dVar.H(i10, (long) ((Number) bArr).shortValue());
                    } else if (bArr instanceof Byte) {
                        dVar.H(i10, (long) ((Number) bArr).byteValue());
                    } else if (bArr instanceof String) {
                        dVar.p(i10, (String) bArr);
                    } else if (bArr instanceof Boolean) {
                        if (((Boolean) bArr).booleanValue()) {
                            j10 = 1;
                        } else {
                            j10 = 0;
                        }
                        dVar.H(i10, j10);
                    } else {
                        throw new IllegalArgumentException("Cannot bind " + bArr + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                }
            }
        }
    }

    public a(String str) {
        j.f(str, "query");
        this.f4554a = str;
    }

    public final void d(d dVar) {
    }

    public final String h() {
        return this.f4554a;
    }
}

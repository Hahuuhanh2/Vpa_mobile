package x2;

import c3.d;
import c3.e;
import ek.i;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import sk.j;

/* compiled from: RoomSQLiteQuery.kt */
public final class p implements e, d {

    /* renamed from: p  reason: collision with root package name */
    public static final TreeMap<Integer, p> f16980p = new TreeMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f16981a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f16982b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f16983c;

    /* renamed from: d  reason: collision with root package name */
    public final double[] f16984d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f16985e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[][] f16986f;

    /* renamed from: n  reason: collision with root package name */
    public final int[] f16987n;

    /* renamed from: o  reason: collision with root package name */
    public int f16988o;

    public p(int i10) {
        this.f16981a = i10;
        int i11 = i10 + 1;
        this.f16987n = new int[i11];
        this.f16983c = new long[i11];
        this.f16984d = new double[i11];
        this.f16985e = new String[i11];
        this.f16986f = new byte[i11][];
    }

    public static final p i(int i10, String str) {
        TreeMap<Integer, p> treeMap = f16980p;
        synchronized (treeMap) {
            Map.Entry<Integer, p> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                p value = ceilingEntry.getValue();
                value.f16982b = str;
                value.f16988o = i10;
                return value;
            }
            i iVar = i.f20112a;
            p pVar = new p(i10);
            pVar.f16982b = str;
            pVar.f16988o = i10;
            return pVar;
        }
    }

    public final void H(int i10, long j10) {
        this.f16987n[i10] = 2;
        this.f16983c[i10] = j10;
    }

    public final void M(int i10, byte[] bArr) {
        this.f16987n[i10] = 5;
        this.f16986f[i10] = bArr;
    }

    public final void close() {
    }

    public final void d(d dVar) {
        int i10 = this.f16988o;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = this.f16987n[i11];
                if (i12 == 1) {
                    dVar.m0(i11);
                } else if (i12 == 2) {
                    dVar.H(i11, this.f16983c[i11]);
                } else if (i12 == 3) {
                    dVar.w(i11, this.f16984d[i11]);
                } else if (i12 == 4) {
                    String str = this.f16985e[i11];
                    if (str != null) {
                        dVar.p(i11, str);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (i12 == 5) {
                    byte[] bArr = this.f16986f[i11];
                    if (bArr != null) {
                        dVar.M(i11, bArr);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                if (i11 != i10) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    public final String h() {
        String str = this.f16982b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void m0(int i10) {
        this.f16987n[i10] = 1;
    }

    public final void p(int i10, String str) {
        j.f(str, "value");
        this.f16987n[i10] = 4;
        this.f16985e[i10] = str;
    }

    public final void q() {
        TreeMap<Integer, p> treeMap = f16980p;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f16981a), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                j.e(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
            i iVar = i.f20112a;
        }
    }

    public final void w(int i10, double d10) {
        this.f16987n[i10] = 3;
        this.f16984d[i10] = d10;
    }
}

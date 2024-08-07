package kd;

import cd.b;
import java.util.Set;
import java.util.regex.Pattern;
import uc.a;
import uc.l;

/* compiled from: OneDimensionalCodeWriter */
public abstract class r implements l {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f12499a = Pattern.compile("[0-9]+");

    public static int a(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    public static void b(String str) {
        if (!f12499a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }

    public final b e(String str, a aVar) {
        if (!str.isEmpty()) {
            Set f10 = f();
            if (f10 == null || f10.contains(aVar)) {
                int d10 = d();
                boolean[] c10 = c(str);
                int length = c10.length;
                int i10 = d10 + length;
                int max = Math.max(500, i10);
                int max2 = Math.max(1, 500);
                int i11 = max / i10;
                int i12 = (max - (length * i11)) / 2;
                b bVar = new b(max, max2);
                int i13 = 0;
                while (i13 < length) {
                    if (c10[i13]) {
                        bVar.j(i12, 0, i11, max2);
                    }
                    i13++;
                    i12 += i11;
                }
                return bVar;
            }
            throw new IllegalArgumentException("Can only encode " + f10 + ", but got " + aVar);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public abstract Set f();
}

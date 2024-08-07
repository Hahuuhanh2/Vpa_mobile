package nd;

import cd.a;
import com.google.zxing.NotFoundException;

/* compiled from: AI013x0x1xDecoder */
public final class e extends h {

    /* renamed from: c  reason: collision with root package name */
    public final String f13570c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13571d;

    public e(a aVar, String str, String str2) {
        super(aVar);
        this.f13570c = str2;
        this.f13571d = str;
    }

    public final String a() {
        if (this.f13572a.f4688b == 84) {
            StringBuilder sb2 = new StringBuilder();
            b(8, sb2);
            f(sb2, 48, 20);
            int c10 = this.f13573b.c(68, 16);
            if (c10 != 38400) {
                sb2.append('(');
                sb2.append(this.f13570c);
                sb2.append(')');
                int i10 = c10 % 32;
                int i11 = c10 / 32;
                int i12 = (i11 % 12) + 1;
                int i13 = i11 / 12;
                if (i13 / 10 == 0) {
                    sb2.append('0');
                }
                sb2.append(i13);
                if (i12 / 10 == 0) {
                    sb2.append('0');
                }
                sb2.append(i12);
                if (i10 / 10 == 0) {
                    sb2.append('0');
                }
                sb2.append(i10);
            }
            return sb2.toString();
        }
        throw NotFoundException.f7967c;
    }

    public final void d(int i10, StringBuilder sb2) {
        sb2.append('(');
        sb2.append(this.f13571d);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    public final int e(int i10) {
        return i10 % 100000;
    }
}

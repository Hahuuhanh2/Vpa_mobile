package j$.time.format;

import j$.time.b;
import j$.time.e;

final class m implements C0353g {

    /* renamed from: a  reason: collision with root package name */
    private final C0353g f18164a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18165b;

    /* renamed from: c  reason: collision with root package name */
    private final char f18166c;

    m(C0353g gVar, int i10, char c10) {
        this.f18164a = gVar;
        this.f18165b = i10;
        this.f18166c = c10;
    }

    public final boolean m(A a10, StringBuilder sb2) {
        int length = sb2.length();
        if (!this.f18164a.m(a10, sb2)) {
            return false;
        }
        int length2 = sb2.length() - length;
        if (length2 <= this.f18165b) {
            for (int i10 = 0; i10 < this.f18165b - length2; i10++) {
                sb2.insert(length, this.f18166c);
            }
            return true;
        }
        throw new e("Cannot print as output of " + length2 + " characters exceeds pad width of " + this.f18165b);
    }

    public final int n(x xVar, CharSequence charSequence, int i10) {
        boolean l10 = xVar.l();
        if (i10 > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        } else if (i10 == charSequence.length()) {
            return ~i10;
        } else {
            int i11 = this.f18165b + i10;
            if (i11 > charSequence.length()) {
                if (l10) {
                    return ~i10;
                }
                i11 = charSequence.length();
            }
            int i12 = i10;
            while (i12 < i11 && xVar.b(charSequence.charAt(i12), this.f18166c)) {
                i12++;
            }
            int n10 = this.f18164a.n(xVar, charSequence.subSequence(0, i11), i12);
            return (n10 == i11 || !l10) ? n10 : ~(i10 + i12);
        }
    }

    public final String toString() {
        String str;
        StringBuilder b10 = b.b("Pad(");
        b10.append(this.f18164a);
        b10.append(",");
        b10.append(this.f18165b);
        if (this.f18166c == ' ') {
            str = ")";
        } else {
            StringBuilder b11 = b.b(",'");
            b11.append(this.f18166c);
            b11.append("')");
            str = b11.toString();
        }
        b10.append(str);
        return b10.toString();
    }
}

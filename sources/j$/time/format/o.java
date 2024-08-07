package j$.time.format;

import java.text.ParsePosition;
import java.util.HashSet;
import java.util.Iterator;

class o {

    /* renamed from: a  reason: collision with root package name */
    protected String f18167a;

    /* renamed from: b  reason: collision with root package name */
    protected String f18168b;

    /* renamed from: c  reason: collision with root package name */
    protected char f18169c;

    /* renamed from: d  reason: collision with root package name */
    protected o f18170d;

    /* renamed from: e  reason: collision with root package name */
    protected o f18171e;

    private o(String str, String str2, o oVar) {
        this.f18167a = str;
        this.f18168b = str2;
        this.f18170d = oVar;
        this.f18169c = str.length() == 0 ? 65535 : this.f18167a.charAt(0);
    }

    /* synthetic */ o(String str, String str2, o oVar, int i10) {
        this(str, str2, oVar);
    }

    private boolean b(String str, String str2) {
        int i10 = 0;
        while (i10 < str.length() && i10 < this.f18167a.length() && c(str.charAt(i10), this.f18167a.charAt(i10))) {
            i10++;
        }
        if (i10 != this.f18167a.length()) {
            o e10 = e(this.f18167a.substring(i10), this.f18168b, this.f18170d);
            this.f18167a = str.substring(0, i10);
            this.f18170d = e10;
            if (i10 < str.length()) {
                this.f18170d.f18171e = e(str.substring(i10), str2, (o) null);
                this.f18168b = null;
            } else {
                this.f18168b = str2;
            }
            return true;
        } else if (i10 < str.length()) {
            String substring = str.substring(i10);
            for (o oVar = this.f18170d; oVar != null; oVar = oVar.f18171e) {
                if (c(oVar.f18169c, substring.charAt(0))) {
                    return oVar.b(substring, str2);
                }
            }
            o e11 = e(substring, str2, (o) null);
            e11.f18171e = this.f18170d;
            this.f18170d = e11;
            return true;
        } else {
            this.f18168b = str2;
            return true;
        }
    }

    public static o f(x xVar) {
        return xVar.k() ? new o("", (String) null, (o) null) : new n();
    }

    public static o g(HashSet hashSet, x xVar) {
        o f10 = f(xVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            f10.b(str, str);
        }
        return f10;
    }

    public final void a(String str, String str2) {
        b(str, str2);
    }

    /* access modifiers changed from: protected */
    public boolean c(char c10, char c11) {
        return c10 == c11;
    }

    public final String d(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!h(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f18167a.length() + index;
        o oVar = this.f18170d;
        if (oVar != null && length2 != length) {
            while (true) {
                if (!c(oVar.f18169c, charSequence.charAt(length2))) {
                    oVar = oVar.f18171e;
                    if (oVar == null) {
                        break;
                    }
                } else {
                    parsePosition.setIndex(length2);
                    String d10 = oVar.d(charSequence, parsePosition);
                    if (d10 != null) {
                        return d10;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f18168b;
    }

    /* access modifiers changed from: protected */
    public o e(String str, String str2, o oVar) {
        return new o(str, str2, oVar);
    }

    /* access modifiers changed from: protected */
    public boolean h(CharSequence charSequence, int i10, int i11) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f18167a, i10);
        }
        int length = this.f18167a.length();
        if (length > i11 - i10) {
            return false;
        }
        int i12 = 0;
        while (true) {
            int i13 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i14 = i12 + 1;
            int i15 = i10 + 1;
            if (!c(this.f18167a.charAt(i12), charSequence.charAt(i10))) {
                return false;
            }
            i10 = i15;
            length = i13;
            i12 = i14;
        }
    }
}

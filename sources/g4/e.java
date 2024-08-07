package g4;

import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    public static final e f10359c = new e("COMPOSITION");

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f10360a;

    /* renamed from: b  reason: collision with root package name */
    public f f10361b;

    public e(String... strArr) {
        this.f10360a = Arrays.asList(strArr);
    }

    public final boolean a(int i10, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (i10 >= this.f10360a.size()) {
            return false;
        }
        if (i10 == this.f10360a.size() - 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = this.f10360a.get(i10);
        if (!str2.equals("**")) {
            if (str2.equals(str) || str2.equals("*")) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z10) {
                if (i10 != this.f10360a.size() - 2) {
                    return false;
                }
                List<String> list = this.f10360a;
                if (!list.get(list.size() - 1).equals("**")) {
                    return false;
                }
            }
            if (z12) {
                return true;
            }
            return false;
        }
        if (z10 || !this.f10360a.get(i10 + 1).equals(str)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            if (i10 != this.f10360a.size() - 2) {
                if (i10 != this.f10360a.size() - 3) {
                    return false;
                }
                List<String> list2 = this.f10360a;
                if (!list2.get(list2.size() - 1).equals("**")) {
                    return false;
                }
            }
            return true;
        } else if (z10) {
            return true;
        } else {
            int i11 = i10 + 1;
            if (i11 < this.f10360a.size() - 1) {
                return false;
            }
            return this.f10360a.get(i11).equals(str);
        }
    }

    public final int b(int i10, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        if (!this.f10360a.get(i10).equals("**")) {
            return 1;
        }
        if (i10 != this.f10360a.size() - 1 && this.f10360a.get(i10 + 1).equals(str)) {
            return 2;
        }
        return 0;
    }

    public final boolean c(int i10, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        if (i10 >= this.f10360a.size()) {
            return false;
        }
        if (this.f10360a.get(i10).equals(str) || this.f10360a.get(i10).equals("**") || this.f10360a.get(i10).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean d(int i10, String str) {
        if (!"__container".equals(str) && i10 >= this.f10360a.size() - 1 && !this.f10360a.get(i10).equals("**")) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f10360a.equals(eVar.f10360a)) {
            return false;
        }
        f fVar = this.f10361b;
        f fVar2 = eVar.f10361b;
        if (fVar != null) {
            return fVar.equals(fVar2);
        }
        if (fVar2 == null) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f10360a.hashCode() * 31;
        f fVar = this.f10361b;
        if (fVar != null) {
            i10 = fVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }

    public final String toString() {
        boolean z10;
        StringBuilder q10 = a.q("KeyPath{keys=");
        q10.append(this.f10360a);
        q10.append(",resolved=");
        if (this.f10361b != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        q10.append(z10);
        q10.append('}');
        return q10.toString();
    }

    public e(e eVar) {
        this.f10360a = new ArrayList(eVar.f10360a);
        this.f10361b = eVar.f10361b;
    }
}

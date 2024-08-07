package yk;

import ek.e;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: Strings.kt */
public final class i extends k implements p<CharSequence, Integer, e<? extends Integer, ? extends Integer>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ char[] f23597a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f23598b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(char[] cArr, boolean z10) {
        super(2);
        this.f23597a = cArr;
        this.f23598b = z10;
    }

    public final Object invoke(Object obj, Object obj2) {
        CharSequence charSequence = (CharSequence) obj;
        int intValue = ((Number) obj2).intValue();
        j.f(charSequence, "$this$$receiver");
        int T0 = l.T0(intValue, charSequence, this.f23598b, this.f23597a);
        if (T0 < 0) {
            return null;
        }
        return new e(Integer.valueOf(T0), 1);
    }
}

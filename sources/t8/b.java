package t8;

import java.util.Arrays;

/* compiled from: MoreObjects */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f14906a;

    /* renamed from: b  reason: collision with root package name */
    public final C0196b f14907b;

    /* renamed from: c  reason: collision with root package name */
    public C0196b f14908c;

    /* compiled from: MoreObjects */
    public static final class a extends C0196b {
    }

    /* renamed from: t8.b$b  reason: collision with other inner class name */
    /* compiled from: MoreObjects */
    public static class C0196b {

        /* renamed from: a  reason: collision with root package name */
        public String f14909a;

        /* renamed from: b  reason: collision with root package name */
        public Object f14910b;

        /* renamed from: c  reason: collision with root package name */
        public C0196b f14911c;
    }

    public b(String str) {
        C0196b bVar = new C0196b();
        this.f14907b = bVar;
        this.f14908c = bVar;
        this.f14906a = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.f14906a);
        sb2.append('{');
        C0196b bVar = this.f14907b.f14911c;
        String str = "";
        while (bVar != null) {
            Object obj = bVar.f14910b;
            boolean z10 = bVar instanceof a;
            sb2.append(str);
            String str2 = bVar.f14909a;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append(deepToString, 1, deepToString.length() - 1);
            }
            bVar = bVar.f14911c;
            str = ", ";
        }
        sb2.append('}');
        return sb2.toString();
    }
}

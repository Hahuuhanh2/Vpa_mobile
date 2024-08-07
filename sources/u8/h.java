package u8;

import t8.b;
import u8.i;

/* compiled from: MapMaker */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public i.m f15330a;

    public final i.m a() {
        i.m mVar = this.f15330a;
        i.m.a aVar = i.m.f15362a;
        if (mVar != null) {
            return mVar;
        }
        return aVar;
    }

    public final String toString() {
        boolean z10;
        boolean z11;
        b bVar = new b(h.class.getSimpleName());
        i.m mVar = this.f15330a;
        if (mVar != null) {
            String obj = mVar.toString();
            int length = obj.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                char charAt = obj.charAt(i10);
                if (charAt < 'A' || charAt > 'Z') {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    char[] charArray = obj.toCharArray();
                    while (i10 < length) {
                        char c10 = charArray[i10];
                        if (c10 < 'A' || c10 > 'Z') {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            charArray[i10] = (char) (c10 ^ ' ');
                        }
                        i10++;
                    }
                    obj = String.valueOf(charArray);
                } else {
                    i10++;
                }
            }
            b.C0196b bVar2 = new b.C0196b();
            bVar.f14908c.f14911c = bVar2;
            bVar.f14908c = bVar2;
            bVar2.f14910b = obj;
            bVar2.f14909a = "keyStrength";
        }
        return bVar.toString();
    }
}

package vc;

import java.util.Map;
import uc.g;
import uc.h;
import vl.d;

/* compiled from: AztecReader */
public final class b implements g {
    public final h a(d dVar) {
        return b(dVar, (Map<uc.b, ?>) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: uc.j[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f A[LOOP:0: B:29:0x005d->B:30:0x005f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final uc.h b(vl.d r9, java.util.Map<uc.b, ?> r10) {
        /*
            r8 = this;
            xc.a r0 = new xc.a
            cd.b r9 = r9.e()
            r0.<init>(r9)
            r9 = 0
            r1 = 0
            vc.a r2 = r0.a(r9)     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            java.lang.Object r3 = r2.f17387b     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            uc.j[] r3 = (uc.j[]) r3     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            wc.a r4 = new wc.a     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4.<init>()     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            cd.e r2 = r4.a(r2)     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004f
            r1 = 1
            vc.a r0 = r0.a(r1)     // Catch:{ NotFoundException -> 0x0047, FormatException -> 0x0045 }
            java.lang.Object r1 = r0.f17387b     // Catch:{ NotFoundException -> 0x0047, FormatException -> 0x0045 }
            r4 = r1
            uc.j[] r4 = (uc.j[]) r4     // Catch:{ NotFoundException -> 0x0047, FormatException -> 0x0045 }
            wc.a r1 = new wc.a     // Catch:{ NotFoundException -> 0x0047, FormatException -> 0x0045 }
            r1.<init>()     // Catch:{ NotFoundException -> 0x0047, FormatException -> 0x0045 }
            cd.e r1 = r1.a(r0)     // Catch:{ NotFoundException -> 0x0047, FormatException -> 0x0045 }
            goto L_0x004f
        L_0x0045:
            r9 = move-exception
            goto L_0x0048
        L_0x0047:
            r9 = move-exception
        L_0x0048:
            if (r2 != 0) goto L_0x004e
            if (r3 == 0) goto L_0x004d
            throw r3
        L_0x004d:
            throw r9
        L_0x004e:
            throw r2
        L_0x004f:
            r5 = r4
            if (r10 == 0) goto L_0x0067
            uc.b r0 = uc.b.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r10 = r10.get(r0)
            uc.k r10 = (uc.k) r10
            if (r10 == 0) goto L_0x0067
            int r0 = r5.length
        L_0x005d:
            if (r9 >= r0) goto L_0x0067
            r2 = r5[r9]
            r10.a(r2)
            int r9 = r9 + 1
            goto L_0x005d
        L_0x0067:
            uc.h r9 = new uc.h
            java.lang.String r3 = r1.f4702b
            byte[] r4 = r1.f4701a
            uc.a r6 = uc.a.AZTEC
            java.lang.System.currentTimeMillis()
            r7 = 0
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.List<byte[]> r10 = r1.f4703c
            if (r10 == 0) goto L_0x0080
            uc.i r0 = uc.i.BYTE_SEGMENTS
            r9.b(r0, r10)
        L_0x0080:
            java.lang.String r10 = r1.f4704d
            if (r10 == 0) goto L_0x0089
            uc.i r0 = uc.i.ERROR_CORRECTION_LEVEL
            r9.b(r0, r10)
        L_0x0089:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.b.b(vl.d, java.util.Map):uc.h");
    }

    public final void reset() {
    }
}

package x2;

import android.graphics.SurfaceTexture;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.SurfaceHolder;
import c7.c;
import c7.h;
import c7.l;
import c7.o;
import c7.q;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.TaskCompletionSource;
import ed.a;
import ed.b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import pd.d;
import w6.m;

/* compiled from: InvalidationLiveDataContainer.kt */
public class g implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16903a;

    /* renamed from: b  reason: collision with root package name */
    public Object f16904b;

    /* renamed from: c  reason: collision with root package name */
    public Object f16905c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f16903a = i10;
        this.f16904b = obj;
        this.f16905c = obj2;
    }

    public final void a(int[] iArr, String str) {
        ((List) this.f16904b).add(iArr);
        ((List) this.f16905c).add(str);
    }

    public final void accept(Object obj, Object obj2) {
        switch (this.f16903a) {
            case 3:
                o oVar = new o((TaskCompletionSource) obj2);
                h hVar = (h) ((q) obj).getService();
                Parcel zaa = hVar.zaa();
                zac.zae(zaa, oVar);
                zac.zae(zaa, (c) this.f16905c);
                hVar.zac(6, zaa);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                h hVar2 = (h) ((q) obj).getService();
                Parcel zaa2 = hVar2.zaa();
                zac.zae(zaa2, lVar);
                zac.zad(zaa2, (ApiFeatureRequest) this.f16905c);
                hVar2.zac(1, zaa2);
                return;
        }
    }

    public final void b(int[] iArr, int i10) {
        if (i10 != 0) {
            int length = iArr.length - i10;
            if (length > 0) {
                if (i10 >= ((List) this.f16905c).size()) {
                    List list = (List) this.f16905c;
                    b bVar = (b) list.get(list.size() - 1);
                    for (int size = ((List) this.f16905c).size(); size <= i10; size++) {
                        a aVar = (a) this.f16904b;
                        bVar = bVar.f(new b(aVar, new int[]{1, aVar.f9347a[(size - 1) + aVar.f9353g]}));
                        ((List) this.f16905c).add(bVar);
                    }
                }
                b bVar2 = (b) ((List) this.f16905c).get(i10);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                b g2 = new b((a) this.f16904b, iArr2).g(i10, 1);
                if (!g2.f9354a.equals(bVar2.f9354a)) {
                    throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
                } else if (!bVar2.d()) {
                    b bVar3 = g2.f9354a.f9349c;
                    int b10 = g2.f9354a.b(bVar2.c(bVar2.f9355b.length - 1));
                    b bVar4 = g2;
                    while (bVar4.f9355b.length - 1 >= bVar2.f9355b.length - 1 && !bVar4.d()) {
                        int[] iArr3 = bVar4.f9355b;
                        int length2 = (iArr3.length - 1) - (bVar2.f9355b.length - 1);
                        int c10 = g2.f9354a.c(bVar4.c(iArr3.length - 1), b10);
                        b g10 = bVar2.g(length2, c10);
                        bVar3 = bVar3.a(g2.f9354a.a(length2, c10));
                        bVar4 = bVar4.a(g10);
                    }
                    int[] iArr4 = bVar4.f9355b;
                    int length3 = i10 - iArr4.length;
                    for (int i11 = 0; i11 < length3; i11++) {
                        iArr[length + i11] = 0;
                    }
                    System.arraycopy(iArr4, 0, iArr, length + length3, iArr4.length);
                } else {
                    throw new IllegalArgumentException("Divide by 0");
                }
            } else {
                throw new IllegalArgumentException("No data bytes provided");
            }
        } else {
            throw new IllegalArgumentException("No error correction bytes");
        }
    }

    public final d c(int i10) {
        d dVar;
        d dVar2;
        d dVar3 = ((d[]) this.f16905c)[d(i10)];
        if (dVar3 != null) {
            return dVar3;
        }
        for (int i11 = 1; i11 < 5; i11++) {
            int d10 = d(i10) - i11;
            if (d10 >= 0 && (dVar2 = ((d[]) this.f16905c)[d10]) != null) {
                return dVar2;
            }
            int d11 = d(i10) + i11;
            d[] dVarArr = (d[]) this.f16905c;
            if (d11 < dVarArr.length && (dVar = dVarArr[d11]) != null) {
                return dVar;
            }
        }
        return null;
    }

    public final int d(int i10) {
        return i10 - ((pd.c) this.f16904b).f14153h;
    }

    public final synchronized void e() {
        if (((List) this.f16904b).isEmpty()) {
            a(new int[]{0, 19}, "US/CA");
            a(new int[]{30, 39}, "US");
            a(new int[]{60, 139}, "US/CA");
            a(new int[]{300, 379}, "FR");
            a(new int[]{380}, "BG");
            a(new int[]{383}, "SI");
            a(new int[]{385}, "HR");
            a(new int[]{387}, "BA");
            a(new int[]{400, 440}, "DE");
            a(new int[]{450, 459}, "JP");
            a(new int[]{460, 469}, "RU");
            a(new int[]{471}, "TW");
            a(new int[]{474}, "EE");
            a(new int[]{475}, "LV");
            a(new int[]{476}, "AZ");
            a(new int[]{477}, "LT");
            a(new int[]{478}, "UZ");
            a(new int[]{479}, "LK");
            a(new int[]{480}, "PH");
            a(new int[]{481}, "BY");
            a(new int[]{482}, "UA");
            a(new int[]{484}, "MD");
            a(new int[]{485}, "AM");
            a(new int[]{486}, "GE");
            a(new int[]{487}, "KZ");
            a(new int[]{489}, "HK");
            a(new int[]{490, 499}, "JP");
            a(new int[]{500, 509}, "GB");
            a(new int[]{520}, "GR");
            a(new int[]{528}, "LB");
            a(new int[]{529}, "CY");
            a(new int[]{531}, "MK");
            a(new int[]{535}, "MT");
            a(new int[]{539}, "IE");
            a(new int[]{540, 549}, "BE/LU");
            a(new int[]{560}, "PT");
            a(new int[]{569}, "IS");
            a(new int[]{570, 579}, "DK");
            a(new int[]{590}, "PL");
            a(new int[]{594}, "RO");
            a(new int[]{599}, "HU");
            a(new int[]{600, 601}, "ZA");
            a(new int[]{603}, "GH");
            a(new int[]{608}, "BH");
            a(new int[]{609}, "MU");
            a(new int[]{611}, "MA");
            a(new int[]{613}, "DZ");
            a(new int[]{616}, "KE");
            a(new int[]{618}, "CI");
            a(new int[]{619}, "TN");
            a(new int[]{621}, "SY");
            a(new int[]{622}, "EG");
            a(new int[]{624}, "LY");
            a(new int[]{625}, "JO");
            a(new int[]{626}, "IR");
            a(new int[]{627}, "KW");
            a(new int[]{628}, "SA");
            a(new int[]{629}, "AE");
            a(new int[]{640, 649}, "FI");
            a(new int[]{690, 695}, "CN");
            a(new int[]{700, 709}, "NO");
            a(new int[]{729}, "IL");
            a(new int[]{730, 739}, "SE");
            a(new int[]{740}, "GT");
            a(new int[]{741}, "SV");
            a(new int[]{742}, "HN");
            a(new int[]{743}, "NI");
            a(new int[]{744}, "CR");
            a(new int[]{745}, "PA");
            a(new int[]{746}, "DO");
            a(new int[]{750}, "MX");
            a(new int[]{754, 755}, "CA");
            a(new int[]{759}, "VE");
            a(new int[]{760, 769}, "CH");
            a(new int[]{770}, "CO");
            a(new int[]{773}, "UY");
            a(new int[]{775}, "PE");
            a(new int[]{777}, "BO");
            a(new int[]{779}, "AR");
            a(new int[]{780}, "CL");
            a(new int[]{784}, "PY");
            a(new int[]{785}, "PE");
            a(new int[]{786}, "EC");
            a(new int[]{789, 790}, "BR");
            a(new int[]{800, 839}, "IT");
            a(new int[]{840, 849}, "ES");
            a(new int[]{850}, "CU");
            a(new int[]{858}, "SK");
            a(new int[]{859}, "CZ");
            a(new int[]{860}, "YU");
            a(new int[]{865}, "MN");
            a(new int[]{867}, "KP");
            a(new int[]{868, 869}, "TR");
            a(new int[]{870, 879}, "NL");
            a(new int[]{880}, "KR");
            a(new int[]{885}, "TH");
            a(new int[]{888}, "SG");
            a(new int[]{890}, "IN");
            a(new int[]{893}, "VN");
            a(new int[]{896}, "PK");
            a(new int[]{899}, "ID");
            a(new int[]{900, 919}, "AT");
            a(new int[]{930, 939}, "AU");
            a(new int[]{940, 949}, "AZ");
            a(new int[]{955}, "MY");
            a(new int[]{958}, "MO");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r11 = this;
            int r0 = r11.f16903a
            switch(r0) {
                case 9: goto L_0x000a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = super.toString()
            return r0
        L_0x000a:
            java.util.Formatter r0 = new java.util.Formatter
            r0.<init>()
            java.lang.Object r1 = r11.f16905c     // Catch:{ all -> 0x005c }
            pd.d[] r1 = (pd.d[]) r1     // Catch:{ all -> 0x005c }
            int r2 = r1.length     // Catch:{ all -> 0x005c }
            r3 = 0
            r4 = r3
            r5 = r4
        L_0x0017:
            if (r4 >= r2) goto L_0x0054
            r6 = r1[r4]     // Catch:{ all -> 0x005c }
            r7 = 1
            if (r6 != 0) goto L_0x002f
            java.lang.String r6 = "%3d:    |   %n"
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x005c }
            int r8 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x005c }
            r7[r3] = r5     // Catch:{ all -> 0x005c }
            r0.format(r6, r7)     // Catch:{ all -> 0x005c }
            r5 = r8
            goto L_0x0051
        L_0x002f:
            java.lang.String r8 = "%3d: %3d|%3d%n"
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ all -> 0x005c }
            int r10 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x005c }
            r9[r3] = r5     // Catch:{ all -> 0x005c }
            int r5 = r6.f14159e     // Catch:{ all -> 0x005c }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x005c }
            r9[r7] = r5     // Catch:{ all -> 0x005c }
            r5 = 2
            int r6 = r6.f14158d     // Catch:{ all -> 0x005c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x005c }
            r9[r5] = r6     // Catch:{ all -> 0x005c }
            r0.format(r8, r9)     // Catch:{ all -> 0x005c }
            r5 = r10
        L_0x0051:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0054:
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x005c }
            r0.close()
            return r1
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0067:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.g.toString():java.lang.String");
    }

    public g(IBinder iBinder) {
        this.f16903a = 2;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f16904b = new Messenger(iBinder);
            this.f16905c = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f16905c = new zzd(iBinder);
            this.f16904b = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            }
            throw new RemoteException();
        }
    }

    public g(int i10) {
        this.f16903a = i10;
        if (i10 == 7) {
            this.f16904b = new ArrayList();
            this.f16905c = new ArrayList();
        } else if (i10 != 8) {
            this.f16904b = new HashMap();
            this.f16905c = new HashMap();
        } else {
            this.f16904b = new int[4];
            this.f16905c = new StringBuilder();
        }
    }

    public g(SurfaceHolder surfaceHolder) {
        this.f16903a = 11;
        if (surfaceHolder != null) {
            this.f16904b = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    public g(SurfaceTexture surfaceTexture) {
        this.f16903a = 11;
        if (surfaceTexture != null) {
            this.f16905c = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public g(pd.c cVar) {
        this.f16903a = 9;
        this.f16904b = new pd.c(cVar);
        this.f16905c = new d[((cVar.f14154i - cVar.f14153h) + 1)];
    }

    public g(a aVar) {
        this.f16903a = 6;
        this.f16904b = aVar;
        ArrayList arrayList = new ArrayList();
        this.f16905c = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public g(za.b bVar) {
        this.f16903a = 5;
        this.f16905c = DesugarCollections.synchronizedMap(new HashMap());
        this.f16904b = bVar;
    }
}

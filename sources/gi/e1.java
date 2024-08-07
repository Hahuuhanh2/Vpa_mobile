package gi;

import al.d0;
import com.vpa.daugia.module.profile.ui.activity.VerifyActivity;
import ik.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.e;
import kk.i;
import rk.p;

@e(c = "com.vpa.daugia.module.profile.ui.activity.VerifyActivity$upload$1", f = "VerifyActivity.kt", l = {186}, m = "invokeSuspend")
/* compiled from: VerifyActivity.kt */
public final class e1 extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public List f20365a;

    /* renamed from: b  reason: collision with root package name */
    public VerifyActivity f20366b;

    /* renamed from: c  reason: collision with root package name */
    public Iterator f20367c;

    /* renamed from: d  reason: collision with root package name */
    public File f20368d;

    /* renamed from: e  reason: collision with root package name */
    public int f20369e;

    /* renamed from: f  reason: collision with root package name */
    public int f20370f;

    /* renamed from: n  reason: collision with root package name */
    public int f20371n;

    /* renamed from: o  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f20372o;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ VerifyActivity f20373p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e1(ArrayList<String> arrayList, VerifyActivity verifyActivity, d<? super e1> dVar) {
        super(2, dVar);
        this.f20372o = arrayList;
        this.f20373p = verifyActivity;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new e1(this.f20372o, this.f20373p, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0091 A[Catch:{ Exception -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b A[Catch:{ Exception -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a8 A[Catch:{ Exception -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab A[Catch:{ Exception -> 0x00bb }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r14.f20371n
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 != r3) goto L_0x0022
            int r1 = r14.f20370f
            int r4 = r14.f20369e
            java.io.File r5 = r14.f20368d
            java.util.Iterator r6 = r14.f20367c
            com.vpa.daugia.module.profile.ui.activity.VerifyActivity r7 = r14.f20366b
            java.util.List r8 = r14.f20365a
            p3.l0.Q0(r15)     // Catch:{ Exception -> 0x001f }
            r9 = r5
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r14
            goto L_0x007a
        L_0x001f:
            r15 = r14
            r1 = r4
            goto L_0x0040
        L_0x0022:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L_0x002a:
            p3.l0.Q0(r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList<java.lang.String> r1 = r14.f20372o
            com.vpa.daugia.module.profile.ui.activity.VerifyActivity r4 = r14.f20373p
            r5 = 0
            java.util.Iterator r1 = r1.iterator()
            r8 = r15
            r6 = r1
            r7 = r4
            r1 = r5
            r15 = r14
        L_0x0040:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00c3
            java.lang.Object r4 = r6.next()
            int r5 = r1 + 1
            if (r1 < 0) goto L_0x00bf
            java.lang.String r4 = (java.lang.String) r4
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x00bd }
            r9.<init>(r4)     // Catch:{ Exception -> 0x00bd }
            kf.g r4 = kf.g.f12554a     // Catch:{ Exception -> 0x00bd }
            android.content.Context r10 = r7.getApplicationContext()     // Catch:{ Exception -> 0x00bd }
            java.lang.String r11 = "getApplicationContext(...)"
            sk.j.e(r10, r11)     // Catch:{ Exception -> 0x00bd }
            r15.f20365a = r8     // Catch:{ Exception -> 0x00bd }
            r15.f20366b = r7     // Catch:{ Exception -> 0x00bd }
            r15.f20367c = r6     // Catch:{ Exception -> 0x00bd }
            r15.f20368d = r9     // Catch:{ Exception -> 0x00bd }
            r15.f20369e = r5     // Catch:{ Exception -> 0x00bd }
            r15.f20370f = r1     // Catch:{ Exception -> 0x00bd }
            r15.f20371n = r3     // Catch:{ Exception -> 0x00bd }
            java.lang.Object r4 = r4.a(r10, r9, r15)     // Catch:{ Exception -> 0x00bd }
            if (r4 != r0) goto L_0x0075
            return r0
        L_0x0075:
            r13 = r0
            r0 = r15
            r15 = r4
            r4 = r1
            r1 = r13
        L_0x007a:
            java.io.File r15 = (java.io.File) r15     // Catch:{ Exception -> 0x00bb }
            okhttp3.RequestBody$Companion r10 = okhttp3.RequestBody.f22115a     // Catch:{ Exception -> 0x00bb }
            java.lang.String r11 = "<this>"
            sk.j.f(r15, r11)     // Catch:{ Exception -> 0x00bb }
            android.webkit.MimeTypeMap r11 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ Exception -> 0x00bb }
            java.lang.String r12 = fk.h.s0(r15)     // Catch:{ Exception -> 0x00bb }
            java.lang.String r11 = r11.getMimeTypeFromExtension(r12)     // Catch:{ Exception -> 0x00bb }
            if (r11 == 0) goto L_0x009b
            okhttp3.MediaType$Companion r12 = okhttp3.MediaType.f22026e     // Catch:{ Exception -> 0x00bb }
            r12.getClass()     // Catch:{ Exception -> 0x00bb }
            okhttp3.MediaType r11 = okhttp3.MediaType.Companion.b(r11)     // Catch:{ Exception -> 0x00bb }
            goto L_0x009c
        L_0x009b:
            r11 = r2
        L_0x009c:
            r10.getClass()     // Catch:{ Exception -> 0x00bb }
            okhttp3.RequestBody$Companion$asRequestBody$1 r10 = new okhttp3.RequestBody$Companion$asRequestBody$1     // Catch:{ Exception -> 0x00bb }
            r10.<init>(r15, r11)     // Catch:{ Exception -> 0x00bb }
            okhttp3.MultipartBody$Part$Companion r15 = okhttp3.MultipartBody.Part.f22046c     // Catch:{ Exception -> 0x00bb }
            if (r4 != 0) goto L_0x00ab
            java.lang.String r4 = "frontImage"
            goto L_0x00ad
        L_0x00ab:
            java.lang.String r4 = "backImage"
        L_0x00ad:
            java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x00bb }
            r15.getClass()     // Catch:{ Exception -> 0x00bb }
            okhttp3.MultipartBody$Part r15 = okhttp3.MultipartBody.Part.Companion.b(r4, r9, r10)     // Catch:{ Exception -> 0x00bb }
            r8.add(r15)     // Catch:{ Exception -> 0x00bb }
        L_0x00bb:
            r15 = r0
            r0 = r1
        L_0x00bd:
            r1 = r5
            goto L_0x0040
        L_0x00bf:
            j7.a.x0()
            throw r2
        L_0x00c3:
            int r0 = r8.size()
            if (r0 <= r3) goto L_0x00e4
            com.vpa.daugia.module.profile.ui.activity.VerifyActivity r15 = r15.f20373p
            int r0 = com.vpa.daugia.module.profile.ui.activity.VerifyActivity.f19818a0
            androidx.lifecycle.d0 r15 = r15.R
            java.lang.Object r15 = r15.getValue()
            com.vpa.daugia.module.profile.ui.ProfileViewModel r15 = (com.vpa.daugia.module.profile.ui.ProfileViewModel) r15
            al.d0 r0 = p3.l0.d0(r15)
            gl.b r1 = al.r0.f19085b
            fi.a r3 = new fi.a
            r3.<init>(r15, r8, r2)
            r15 = 2
            p3.l0.j0(r0, r1, r3, r15)
        L_0x00e4:
            ek.i r15 = ek.i.f20112a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: gi.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

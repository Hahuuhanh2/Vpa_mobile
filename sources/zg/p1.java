package zg;

import al.d0;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import ik.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.e;
import kk.i;
import rk.p;

@e(c = "com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity$upload$1", f = "StepThreePersonalActivity.kt", l = {408}, m = "invokeSuspend")
/* compiled from: StepThreePersonalActivity.kt */
public final class p1 extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public List f23703a;

    /* renamed from: b  reason: collision with root package name */
    public Iterator f23704b;

    /* renamed from: c  reason: collision with root package name */
    public File f23705c;

    /* renamed from: d  reason: collision with root package name */
    public int f23706d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ ArrayList<String> f23707e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ StepThreePersonalActivity f23708f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p1(ArrayList<String> arrayList, StepThreePersonalActivity stepThreePersonalActivity, d<? super p1> dVar) {
        super(2, dVar);
        this.f23707e = arrayList;
        this.f23708f = stepThreePersonalActivity;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new p1(this.f23707e, this.f23708f, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075 A[Catch:{ Exception -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007f A[Catch:{ Exception -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d A[SYNTHETIC] */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r10.f23706d
            r2 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            java.io.File r1 = r10.f23705c
            java.util.Iterator r3 = r10.f23704b
            java.util.List r4 = r10.f23703a
            p3.l0.Q0(r11)     // Catch:{ Exception -> 0x002c }
            r5 = r1
            r1 = r0
            r0 = r10
            goto L_0x005e
        L_0x0016:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001e:
            p3.l0.Q0(r11)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList<java.lang.String> r11 = r10.f23707e
            java.util.Iterator r3 = r11.iterator()
        L_0x002c:
            r11 = r10
        L_0x002d:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x009d
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x002d }
            r5.<init>(r1)     // Catch:{ Exception -> 0x002d }
            kf.g r1 = kf.g.f12554a     // Catch:{ Exception -> 0x002d }
            com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity r6 = r11.f23708f     // Catch:{ Exception -> 0x002d }
            android.content.Context r6 = r6.getApplicationContext()     // Catch:{ Exception -> 0x002d }
            java.lang.String r7 = "getApplicationContext(...)"
            sk.j.e(r6, r7)     // Catch:{ Exception -> 0x002d }
            r11.f23703a = r4     // Catch:{ Exception -> 0x002d }
            r11.f23704b = r3     // Catch:{ Exception -> 0x002d }
            r11.f23705c = r5     // Catch:{ Exception -> 0x002d }
            r11.f23706d = r2     // Catch:{ Exception -> 0x002d }
            java.lang.Object r1 = r1.a(r6, r5, r11)     // Catch:{ Exception -> 0x002d }
            if (r1 != r0) goto L_0x005a
            return r0
        L_0x005a:
            r9 = r0
            r0 = r11
            r11 = r1
            r1 = r9
        L_0x005e:
            java.io.File r11 = (java.io.File) r11     // Catch:{ Exception -> 0x009a }
            okhttp3.RequestBody$Companion r6 = okhttp3.RequestBody.f22115a     // Catch:{ Exception -> 0x009a }
            java.lang.String r7 = "<this>"
            sk.j.f(r11, r7)     // Catch:{ Exception -> 0x009a }
            android.webkit.MimeTypeMap r7 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ Exception -> 0x009a }
            java.lang.String r8 = fk.h.s0(r11)     // Catch:{ Exception -> 0x009a }
            java.lang.String r7 = r7.getMimeTypeFromExtension(r8)     // Catch:{ Exception -> 0x009a }
            if (r7 == 0) goto L_0x007f
            okhttp3.MediaType$Companion r8 = okhttp3.MediaType.f22026e     // Catch:{ Exception -> 0x009a }
            r8.getClass()     // Catch:{ Exception -> 0x009a }
            okhttp3.MediaType r7 = okhttp3.MediaType.Companion.b(r7)     // Catch:{ Exception -> 0x009a }
            goto L_0x0080
        L_0x007f:
            r7 = 0
        L_0x0080:
            r6.getClass()     // Catch:{ Exception -> 0x009a }
            okhttp3.RequestBody$Companion$asRequestBody$1 r6 = new okhttp3.RequestBody$Companion$asRequestBody$1     // Catch:{ Exception -> 0x009a }
            r6.<init>(r11, r7)     // Catch:{ Exception -> 0x009a }
            okhttp3.MultipartBody$Part$Companion r11 = okhttp3.MultipartBody.Part.f22046c     // Catch:{ Exception -> 0x009a }
            java.lang.String r7 = "file"
            java.lang.String r5 = r5.getName()     // Catch:{ Exception -> 0x009a }
            r11.getClass()     // Catch:{ Exception -> 0x009a }
            okhttp3.MultipartBody$Part r11 = okhttp3.MultipartBody.Part.Companion.b(r7, r5, r6)     // Catch:{ Exception -> 0x009a }
            r4.add(r11)     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            r11 = r0
            r0 = r1
            goto L_0x002d
        L_0x009d:
            com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity r11 = r11.f23708f
            int r0 = com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity.f19534a0
            com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel r11 = r11.T()
            r11.j(r4)
            ek.i r11 = ek.i.f20112a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: zg.p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

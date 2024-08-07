package je;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.w;
import com.luck.picture.lib.R$anim;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.basic.PictureSelectorSupporterActivity;
import com.luck.picture.lib.basic.PictureSelectorTransparentActivity;
import com.luck.picture.lib.entity.LocalMedia;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import me.d;
import me.e;
import me.f;
import p3.l0;
import re.a;
import te.b;
import te.c;
import w1.d0;
import w1.q0;
import we.b;
import xe.i;
import xe.j;

/* compiled from: PictureCommonFragment */
public abstract class h extends Fragment {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ int f11873n0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public c f11874e0;

    /* renamed from: f0  reason: collision with root package name */
    public b f11875f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f11876g0 = 1;

    /* renamed from: h0  reason: collision with root package name */
    public a f11877h0;

    /* renamed from: i0  reason: collision with root package name */
    public ke.a f11878i0;

    /* renamed from: j0  reason: collision with root package name */
    public e f11879j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f11880k0;

    /* renamed from: l0  reason: collision with root package name */
    public f f11881l0;

    /* renamed from: m0  reason: collision with root package name */
    public Context f11882m0;

    static {
        Class<h> cls = h.class;
    }

    @SuppressLint({"StringFormatInvalid"})
    public static String r0(int i10, Context context, String str) {
        if (j7.a.Z(str)) {
            return context.getString(R$string.ps_message_video_max_num, new Object[]{String.valueOf(i10)});
        } else if (j7.a.U(str)) {
            return context.getString(R$string.ps_message_audio_max_num, new Object[]{String.valueOf(i10)});
        } else {
            return context.getString(R$string.ps_message_max_num, new Object[]{String.valueOf(i10)});
        }
    }

    public void A0(LocalMedia localMedia) {
    }

    public void B0() {
    }

    public void C0() {
        if (!j7.a.T(m())) {
            this.f11878i0.getClass();
            this.f11878i0.getClass();
            z0();
        }
    }

    public final void D0() {
        this.f11878i0.getClass();
    }

    public final void E0(ArrayList<LocalMedia> arrayList) {
        if (i.a()) {
            this.f11878i0.getClass();
        }
        if (i.a()) {
            this.f11878i0.getClass();
        }
        if (this.f11878i0.f12541x) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                LocalMedia localMedia = arrayList.get(i10);
                localMedia.H = true;
                localMedia.f8075d = localMedia.f8073b;
            }
        }
        o0();
    }

    public void F0(LocalMedia localMedia, boolean z10) {
    }

    /* JADX WARNING: type inference failed for: r4v18, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void G(int r8, int r9, android.content.Intent r10) {
        /*
            r7 = this;
            super.G(r8, r9, r10)
            android.content.Context r0 = r7.p0()
            boolean r1 = com.luck.picture.lib.service.ForegroundService.f8129b     // Catch:{ Exception -> 0x0016 }
            if (r1 == 0) goto L_0x001a
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0016 }
            java.lang.Class<com.luck.picture.lib.service.ForegroundService> r2 = com.luck.picture.lib.service.ForegroundService.class
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x0016 }
            r0.stopService(r1)     // Catch:{ Exception -> 0x0016 }
            goto L_0x001a
        L_0x0016:
            r0 = move-exception
            r0.printStackTrace()
        L_0x001a:
            java.lang.String r0 = ""
            r1 = 909(0x38d, float:1.274E-42)
            r2 = -1
            if (r9 != r2) goto L_0x013f
            if (r8 != r1) goto L_0x002d
            je.g r8 = new je.g
            r8.<init>(r7, r10)
            we.b.b(r8)
            goto L_0x018a
        L_0x002d:
            r9 = 696(0x2b8, float:9.75E-43)
            if (r8 != r9) goto L_0x0036
            r7.x0(r10)
            goto L_0x018a
        L_0x0036:
            r9 = 69
            if (r8 != r9) goto L_0x018a
            ke.a r8 = r7.f11878i0
            java.util.ArrayList r8 = r8.b()
            int r9 = r8.size()     // Catch:{ Exception -> 0x0121 }
            java.lang.String r1 = "customExtraData"
            r3 = 0
            java.lang.String r4 = "com.yalantis.ucrop.OutputUri"
            java.lang.String r5 = "output"
            r6 = 1
            if (r9 != r6) goto L_0x00aa
            java.lang.Object r9 = r8.get(r3)     // Catch:{ Exception -> 0x0121 }
            com.luck.picture.lib.entity.LocalMedia r9 = (com.luck.picture.lib.entity.LocalMedia) r9     // Catch:{ Exception -> 0x0121 }
            android.os.Parcelable r5 = r10.getParcelableExtra(r5)     // Catch:{ Exception -> 0x0121 }
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ Exception -> 0x0121 }
            if (r5 != 0) goto L_0x0063
            android.os.Parcelable r4 = r10.getParcelableExtra(r4)     // Catch:{ Exception -> 0x0121 }
            r5 = r4
            android.net.Uri r5 = (android.net.Uri) r5     // Catch:{ Exception -> 0x0121 }
        L_0x0063:
            if (r5 == 0) goto L_0x0069
            java.lang.String r0 = r5.getPath()     // Catch:{ Exception -> 0x0121 }
        L_0x0069:
            r9.f8077f = r0     // Catch:{ Exception -> 0x0121 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0121 }
            if (r0 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r6 = r3
        L_0x0073:
            r9.f8083s = r6     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = "com.yalantis.ucrop.ImageWidth"
            int r0 = r10.getIntExtra(r0, r2)     // Catch:{ Exception -> 0x0121 }
            r9.B = r0     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = "com.yalantis.ucrop.ImageHeight"
            int r0 = r10.getIntExtra(r0, r2)     // Catch:{ Exception -> 0x0121 }
            r9.C = r0     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = "com.yalantis.ucrop.OffsetX"
            int r0 = r10.getIntExtra(r0, r3)     // Catch:{ Exception -> 0x0121 }
            r9.D = r0     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = "com.yalantis.ucrop.OffsetY"
            int r0 = r10.getIntExtra(r0, r3)     // Catch:{ Exception -> 0x0121 }
            r9.E = r0     // Catch:{ Exception -> 0x0121 }
            java.lang.String r0 = "com.yalantis.ucrop.CropAspectRatio"
            r2 = 0
            float r0 = r10.getFloatExtra(r0, r2)     // Catch:{ Exception -> 0x0121 }
            r9.F = r0     // Catch:{ Exception -> 0x0121 }
            java.lang.String r10 = r10.getStringExtra(r1)     // Catch:{ Exception -> 0x0121 }
            r9.M = r10     // Catch:{ Exception -> 0x0121 }
            java.lang.String r10 = r9.f8077f     // Catch:{ Exception -> 0x0121 }
            r9.f8080p = r10     // Catch:{ Exception -> 0x0121 }
            goto L_0x0130
        L_0x00aa:
            java.lang.String r9 = r10.getStringExtra(r5)     // Catch:{ Exception -> 0x0121 }
            boolean r0 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x0121 }
            if (r0 == 0) goto L_0x00b8
            java.lang.String r9 = r10.getStringExtra(r4)     // Catch:{ Exception -> 0x0121 }
        L_0x00b8:
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ Exception -> 0x0121 }
            r10.<init>(r9)     // Catch:{ Exception -> 0x0121 }
            int r9 = r10.length()     // Catch:{ Exception -> 0x0121 }
            int r0 = r8.size()     // Catch:{ Exception -> 0x0121 }
            if (r9 != r0) goto L_0x0130
            r9 = r3
        L_0x00c8:
            int r0 = r8.size()     // Catch:{ Exception -> 0x0121 }
            if (r9 >= r0) goto L_0x0130
            java.lang.Object r0 = r8.get(r9)     // Catch:{ Exception -> 0x0121 }
            com.luck.picture.lib.entity.LocalMedia r0 = (com.luck.picture.lib.entity.LocalMedia) r0     // Catch:{ Exception -> 0x0121 }
            org.json.JSONObject r2 = r10.optJSONObject(r9)     // Catch:{ Exception -> 0x0121 }
            java.lang.String r4 = "outPutPath"
            java.lang.String r4 = r2.optString(r4)     // Catch:{ Exception -> 0x0121 }
            r0.f8077f = r4     // Catch:{ Exception -> 0x0121 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0121 }
            if (r4 != 0) goto L_0x00e8
            r4 = r6
            goto L_0x00e9
        L_0x00e8:
            r4 = r3
        L_0x00e9:
            r0.f8083s = r4     // Catch:{ Exception -> 0x0121 }
            java.lang.String r4 = "imageWidth"
            int r4 = r2.optInt(r4)     // Catch:{ Exception -> 0x0121 }
            r0.B = r4     // Catch:{ Exception -> 0x0121 }
            java.lang.String r4 = "imageHeight"
            int r4 = r2.optInt(r4)     // Catch:{ Exception -> 0x0121 }
            r0.C = r4     // Catch:{ Exception -> 0x0121 }
            java.lang.String r4 = "offsetX"
            int r4 = r2.optInt(r4)     // Catch:{ Exception -> 0x0121 }
            r0.D = r4     // Catch:{ Exception -> 0x0121 }
            java.lang.String r4 = "offsetY"
            int r4 = r2.optInt(r4)     // Catch:{ Exception -> 0x0121 }
            r0.E = r4     // Catch:{ Exception -> 0x0121 }
            java.lang.String r4 = "aspectRatio"
            double r4 = r2.optDouble(r4)     // Catch:{ Exception -> 0x0121 }
            float r4 = (float) r4     // Catch:{ Exception -> 0x0121 }
            r0.F = r4     // Catch:{ Exception -> 0x0121 }
            java.lang.String r2 = r2.optString(r1)     // Catch:{ Exception -> 0x0121 }
            r0.M = r2     // Catch:{ Exception -> 0x0121 }
            java.lang.String r2 = r0.f8077f     // Catch:{ Exception -> 0x0121 }
            r0.f8080p = r2     // Catch:{ Exception -> 0x0121 }
            int r9 = r9 + 1
            goto L_0x00c8
        L_0x0121:
            r9 = move-exception
            r9.printStackTrace()
            android.content.Context r10 = r7.p0()
            java.lang.String r9 = r9.getMessage()
            xe.k.a(r10, r9)
        L_0x0130:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r8)
            r7.j0()
            r7.k0()
            r7.E0(r9)
            goto L_0x018a
        L_0x013f:
            r2 = 96
            if (r9 != r2) goto L_0x0163
            if (r10 == 0) goto L_0x014e
            java.lang.String r8 = "com.yalantis.ucrop.Error"
            java.io.Serializable r8 = r10.getSerializableExtra(r8)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            goto L_0x0155
        L_0x014e:
            java.lang.Throwable r8 = new java.lang.Throwable
            java.lang.String r9 = "image crop error"
            r8.<init>(r9)
        L_0x0155:
            if (r8 == 0) goto L_0x018a
            android.content.Context r9 = r7.p0()
            java.lang.String r8 = r8.getMessage()
            xe.k.a(r9, r8)
            goto L_0x018a
        L_0x0163:
            if (r9 != 0) goto L_0x018a
            if (r8 != r1) goto L_0x0181
            ke.a r8 = r7.f11878i0
            java.lang.String r8 = r8.E
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x018a
            android.content.Context r8 = r7.p0()
            ke.a r9 = r7.f11878i0
            java.lang.String r9 = r9.E
            xe.g.b(r8, r9)
            ke.a r8 = r7.f11878i0
            r8.E = r0
            goto L_0x018a
        L_0x0181:
            r9 = 1102(0x44e, float:1.544E-42)
            if (r8 != r9) goto L_0x018a
            java.lang.String[] r8 = te.b.f15023a
            r7.t0(r8)
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: je.h.G(int, int, android.content.Intent):void");
    }

    public final void G0() {
        ke.a aVar = this.f11878i0;
        int i10 = aVar.f12517a;
        if (i10 == 0) {
            aVar.getClass();
            d dVar = new d();
            dVar.f13284u0 = new d(this);
            dVar.f13285v0 = new e(this);
            dVar.n0(o(), "PhotoItemSelectedDialog");
        } else if (i10 == 1) {
            String[] strArr = b.f15024b;
            D0();
            this.f11878i0.getClass();
            te.a b10 = te.a.b();
            d dVar2 = new d(this);
            b10.getClass();
            te.a.d(this, strArr, dVar2);
        } else if (i10 == 2) {
            String[] strArr2 = b.f15024b;
            D0();
            this.f11878i0.getClass();
            te.a b11 = te.a.b();
            f fVar = new f(this);
            b11.getClass();
            te.a.d(this, strArr2, fVar);
        } else if (i10 == 3) {
            throw new NullPointerException(qe.f.class.getSimpleName() + " interface needs to be implemented for recording");
        }
    }

    public final void H0(LocalMedia localMedia) {
        if (!j7.a.T(m())) {
            List<Fragment> H = m().G().H();
            for (int i10 = 0; i10 < H.size(); i10++) {
                Fragment fragment = H.get(i10);
                if (fragment instanceof h) {
                    ((h) fragment).A0(localMedia);
                }
            }
        }
    }

    public final void I(Context context) {
        u0();
        this.f11878i0.getClass();
        ie.a.a().getClass();
        if (this.f11878i0.V == null) {
            ie.a.a().getClass();
        }
        this.f11878i0.getClass();
        this.f11878i0.getClass();
        this.f11878i0.getClass();
        this.f11878i0.getClass();
        if (this.f11878i0.O) {
            ie.a.a().getClass();
        }
        this.f11878i0.getClass();
        super.I(context);
        this.f11882m0 = context;
        Fragment fragment = this.B;
        if (fragment instanceof b) {
            this.f11875f0 = (b) fragment;
        } else if (context instanceof b) {
            this.f11875f0 = (b) context;
        }
    }

    public final void I0() {
        if (!j7.a.T(m())) {
            List<Fragment> H = m().G().H();
            for (int i10 = 0; i10 < H.size(); i10++) {
                Fragment fragment = H.get(i10);
                if (fragment instanceof h) {
                    ((h) fragment).w0();
                }
            }
        }
    }

    public final void J0() {
        try {
            if (!j7.a.T(m()) && !this.f11879j0.isShowing()) {
                this.f11879j0.show();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public Animation K(boolean z10, int i10, int i11) {
        Animation animation;
        Animation loadAnimation;
        ve.a d10 = this.f11878i0.U.d();
        if (z10) {
            if (d10.f16187a != 0) {
                animation = AnimationUtils.loadAnimation(p0(), d10.f16187a);
            } else {
                animation = AnimationUtils.loadAnimation(p0(), R$anim.ps_anim_alpha_enter);
            }
            this.f11880k0 = animation.getDuration();
        } else {
            if (d10.f16188b != 0) {
                loadAnimation = AnimationUtils.loadAnimation(p0(), d10.f16188b);
            } else {
                loadAnimation = AnimationUtils.loadAnimation(p0(), R$anim.ps_anim_alpha_exit);
            }
            y0();
        }
        return animation;
    }

    public final void K0(String str) {
        if (!j7.a.T(m())) {
            try {
                f fVar = this.f11881l0;
                if (fVar == null || !fVar.isShowing()) {
                    f fVar2 = new f(p0(), str);
                    this.f11881l0 = fVar2;
                    fVar2.show();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (q0() != 0) {
            return layoutInflater.inflate(q0(), viewGroup, false);
        }
        return super.L(layoutInflater, viewGroup, bundle);
    }

    public void M() {
        this.J = true;
    }

    public final void R(int i10, String[] strArr, int[] iArr) {
        if (this.f11874e0 != null) {
            te.a b10 = te.a.b();
            c cVar = this.f11874e0;
            b10.getClass();
            boolean z10 = false;
            if (iArr.length > 0) {
                int length = iArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = true;
                        break;
                    } else if (iArr[i11] != 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            if (z10) {
                cVar.a();
            } else {
                cVar.b();
            }
            this.f11874e0 = null;
        }
    }

    public void W(View view, Bundle bundle) {
        this.f11878i0 = ke.b.a().b();
        xe.d.b(view.getContext());
        this.f11878i0.getClass();
        this.f11878i0.getClass();
        this.f11879j0 = new e(p0());
        if (!j7.a.T(m())) {
            m().setRequestedOrientation(this.f11878i0.f12523f);
        }
        ke.a aVar = this.f11878i0;
        if (aVar.f12538u) {
            l0 b10 = aVar.U.b();
            FragmentActivity c02 = c0();
            b10.getClass();
            Window window = c02.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(0);
            window.getDecorView();
            window.getDecorView().setSystemUiVisibility(1280);
            View childAt = ((ViewGroup) window.findViewById(16908290)).getChildAt(0);
            if (childAt != null) {
                childAt.setFitsSystemWindows(false);
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.h.c(childAt);
            }
        }
        View e02 = e0();
        e02.setFocusableInTouchMode(true);
        e02.requestFocus();
        e02.setOnKeyListener(new c(this));
        this.f11878i0.getClass();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v13, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v26, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v27, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v28, resolved type: android.database.Cursor} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v29, resolved type: android.database.Cursor} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x023c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0271, code lost:
        if (r0.isRecycled() == false) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0112, code lost:
        if (r5 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011c, code lost:
        if (r5 != null) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011e, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0129, code lost:
        if (r6[0].longValue() != 0) goto L_0x0130;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012b, code lost:
        r7 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0130, code lost:
        r7 = r6[0].longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0136, code lost:
        r4.f8072a = r7;
        r4.K = r6[1].longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0234, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        r0.printStackTrace();
        r0 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x023c A[Catch:{ Exception -> 0x023e, all -> 0x023c }, ExcHandler: all (th java.lang.Throwable), PHI: r5 
      PHI: (r5v25 android.graphics.Bitmap) = (r5v20 android.graphics.Bitmap), (r5v26 android.graphics.Bitmap), (r5v26 android.graphics.Bitmap) binds: [B:91:0x0207, B:95:0x022b, B:98:0x0235] A[DONT_GENERATE, DONT_INLINE], Splitter:B:91:0x0207] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0145  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.luck.picture.lib.entity.LocalMedia i0(java.lang.String r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            android.content.Context r3 = r19.p0()
            com.luck.picture.lib.entity.LocalMedia r4 = new com.luck.picture.lib.entity.LocalMedia
            r4.<init>()
            boolean r0 = j7.a.S(r20)
            if (r0 == 0) goto L_0x0021
            java.io.File r0 = new java.io.File
            android.net.Uri r5 = android.net.Uri.parse(r20)
            java.lang.String r5 = xe.h.d(r3, r5)
            r0.<init>(r5)
            goto L_0x0026
        L_0x0021:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
        L_0x0026:
            r4.f8073b = r2
            java.lang.String r5 = r0.getAbsolutePath()
            r4.f8074c = r5
            java.lang.String r5 = r0.getName()
            r4.I = r5
            java.lang.String r5 = r0.getAbsolutePath()
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            java.io.File r5 = r6.getParentFile()
            if (r5 == 0) goto L_0x004c
            java.io.File r5 = r6.getParentFile()
            java.lang.String r5 = r5.getName()
            goto L_0x004e
        L_0x004c:
            java.lang.String r5 = "Camera"
        L_0x004e:
            r4.J = r5
            java.lang.String r5 = r0.getAbsolutePath()
            java.lang.String r5 = xe.g.e(r5)
            r4.f8086v = r5
            long r5 = r0.length()
            r4.G = r5
            long r5 = r0.lastModified()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            r4.L = r5
            java.lang.String r5 = r0.getAbsolutePath()
            java.lang.String r6 = "Android/data/"
            boolean r6 = r5.contains(r6)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 1
            if (r6 != 0) goto L_0x0149
            java.lang.String r6 = "data/user/"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0084
            goto L_0x0149
        L_0x0084:
            java.lang.String r0 = r4.f8074c
            java.lang.String r5 = "%"
            r6 = 2
            java.lang.Long[] r6 = new java.lang.Long[r6]
            java.lang.Long r12 = java.lang.Long.valueOf(r7)
            r6[r10] = r12
            r6[r11] = r12
            java.lang.String r12 = "_data like ?"
            java.lang.String[] r15 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            r13.<init>()     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            r13.append(r5)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            r13.append(r0)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            r13.append(r5)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            r15[r10] = r0     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            r5 = 30
            if (r0 < r5) goto L_0x00b3
            r0 = r11
            goto L_0x00b4
        L_0x00b3:
            r0 = r10
        L_0x00b4:
            java.lang.String r5 = "external"
            if (r0 == 0) goto L_0x00cb
            java.lang.String r0 = "_id DESC"
            android.os.Bundle r0 = xe.g.a(r12, r15, r11, r10, r0)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            android.content.ContentResolver r12 = r3.getContentResolver()     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            android.net.Uri r5 = android.provider.MediaStore.Files.getContentUri(r5)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            android.database.Cursor r0 = r12.query(r5, (java.lang.String[]) null, r0, (android.os.CancellationSignal) null)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            goto L_0x00e0
        L_0x00cb:
            java.lang.String r18 = "_id DESC limit 1 offset 0"
            android.content.ContentResolver r13 = r3.getContentResolver()     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            android.net.Uri r14 = android.provider.MediaStore.Files.getContentUri(r5)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
            r0 = 0
            r5 = r15
            r15 = r0
            r16 = r12
            r17 = r5
            android.database.Cursor r0 = r13.query(r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0117, all -> 0x0115 }
        L_0x00e0:
            r5 = r0
            if (r5 == 0) goto L_0x0112
            int r0 = r5.getCount()     // Catch:{ Exception -> 0x0110 }
            if (r0 <= 0) goto L_0x0112
            boolean r0 = r5.moveToFirst()     // Catch:{ Exception -> 0x0110 }
            if (r0 == 0) goto L_0x0112
            java.lang.String r0 = "_id"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ Exception -> 0x0110 }
            long r12 = r5.getLong(r0)     // Catch:{ Exception -> 0x0110 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0110 }
            r6[r10] = r0     // Catch:{ Exception -> 0x0110 }
            java.lang.String r0 = "bucket_id"
            int r0 = r5.getColumnIndex(r0)     // Catch:{ Exception -> 0x0110 }
            long r12 = r5.getLong(r0)     // Catch:{ Exception -> 0x0110 }
            java.lang.Long r0 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0110 }
            r6[r11] = r0     // Catch:{ Exception -> 0x0110 }
            goto L_0x0112
        L_0x0110:
            r0 = move-exception
            goto L_0x0119
        L_0x0112:
            if (r5 == 0) goto L_0x0121
            goto L_0x011e
        L_0x0115:
            r0 = move-exception
            goto L_0x0143
        L_0x0117:
            r0 = move-exception
            r5 = r9
        L_0x0119:
            r0.printStackTrace()     // Catch:{ all -> 0x0141 }
            if (r5 == 0) goto L_0x0121
        L_0x011e:
            r5.close()
        L_0x0121:
            r0 = r6[r10]
            long r12 = r0.longValue()
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0130
            long r7 = java.lang.System.currentTimeMillis()
            goto L_0x0136
        L_0x0130:
            r0 = r6[r10]
            long r7 = r0.longValue()
        L_0x0136:
            r4.f8072a = r7
            r0 = r6[r11]
            long r5 = r0.longValue()
            r4.K = r5
            goto L_0x0160
        L_0x0141:
            r0 = move-exception
            r9 = r5
        L_0x0143:
            if (r9 == 0) goto L_0x0148
            r9.close()
        L_0x0148:
            throw r0
        L_0x0149:
            long r5 = java.lang.System.currentTimeMillis()
            r4.f8072a = r5
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L_0x015e
            java.lang.String r0 = r0.getName()
            int r0 = r0.hashCode()
            long r7 = (long) r0
        L_0x015e:
            r4.K = r7
        L_0x0160:
            java.lang.String r0 = r4.f8086v
            boolean r0 = j7.a.Z(r0)
            if (r0 == 0) goto L_0x0179
            oe.b r0 = xe.g.g(r3, r2)
            int r3 = r0.f13867a
            r4.f8090z = r3
            int r3 = r0.f13868b
            r4.A = r3
            long r5 = r0.f13869c
            r4.f8081q = r5
            goto L_0x0196
        L_0x0179:
            java.lang.String r0 = r4.f8086v
            boolean r0 = j7.a.U(r0)
            if (r0 == 0) goto L_0x018a
            oe.b r0 = xe.g.c(r3, r2)
            long r5 = r0.f13869c
            r4.f8081q = r5
            goto L_0x0196
        L_0x018a:
            oe.b r0 = xe.g.d(r3, r2)
            int r3 = r0.f13867a
            r4.f8090z = r3
            int r0 = r0.f13868b
            r4.A = r0
        L_0x0196:
            ke.a r0 = r1.f11878i0
            int r0 = r0.f12517a
            r4.f8087w = r0
            boolean r0 = xe.i.a()
            if (r0 == 0) goto L_0x01ab
            boolean r0 = j7.a.S(r20)
            if (r0 != 0) goto L_0x01ab
            r4.f8080p = r2
            goto L_0x01ad
        L_0x01ab:
            r4.f8080p = r9
        L_0x01ad:
            ke.a r0 = r1.f11878i0
            boolean r0 = r0.M
            if (r0 == 0) goto L_0x02a4
            java.lang.String r0 = r4.f8086v
            boolean r0 = j7.a.Y(r0)
            if (r0 == 0) goto L_0x02a4
            android.content.Context r0 = r19.p0()
            int r3 = xe.a.b(r0, r2)     // Catch:{ Exception -> 0x0278, all -> 0x0274 }
            if (r3 <= 0) goto L_0x0263
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0278, all -> 0x0274 }
            r5.<init>()     // Catch:{ Exception -> 0x0278, all -> 0x0274 }
            r5.inJustDecodeBounds = r11     // Catch:{ Exception -> 0x0278, all -> 0x0274 }
            boolean r6 = j7.a.S(r20)     // Catch:{ Exception -> 0x0278, all -> 0x0274 }
            if (r6 == 0) goto L_0x01de
            android.net.Uri r6 = android.net.Uri.parse(r20)     // Catch:{ Exception -> 0x0278, all -> 0x0274 }
            java.io.InputStream r6 = m9.b.N(r0, r6)     // Catch:{ Exception -> 0x0278, all -> 0x0274 }
            android.graphics.BitmapFactory.decodeStream(r6, r9, r5)     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            goto L_0x01e2
        L_0x01de:
            android.graphics.BitmapFactory.decodeFile(r2, r5)     // Catch:{ Exception -> 0x0278, all -> 0x0274 }
            r6 = r9
        L_0x01e2:
            int r7 = r5.outWidth     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            int r8 = r5.outHeight     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            int r7 = xe.a.a(r7, r8)     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            r5.inSampleSize = r7     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            r5.inJustDecodeBounds = r10     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            boolean r7 = j7.a.S(r20)     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            if (r7 == 0) goto L_0x0201
            android.net.Uri r7 = android.net.Uri.parse(r20)     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            java.io.InputStream r6 = m9.b.N(r0, r7)     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r6, r9, r5)     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
            goto L_0x0205
        L_0x0201:
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r2, r5)     // Catch:{ Exception -> 0x025e, all -> 0x0259 }
        L_0x0205:
            if (r5 == 0) goto L_0x0254
            android.graphics.Matrix r15 = new android.graphics.Matrix     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            r15.<init>()     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            float r3 = (float) r3     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            r15.postRotate(r3)     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            int r13 = r5.getWidth()     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            int r14 = r5.getHeight()     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            r11 = 0
            r12 = 0
            r16 = 1
            r10 = r5
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            boolean r3 = j7.a.S(r20)     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            if (r3 == 0) goto L_0x0240
            android.net.Uri r2 = android.net.Uri.parse(r20)     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ Exception -> 0x0234, all -> 0x023c }
            java.io.OutputStream r0 = r0.openOutputStream(r2)     // Catch:{ Exception -> 0x0234, all -> 0x023c }
            goto L_0x0239
        L_0x0234:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            r0 = r9
        L_0x0239:
            java.io.FileOutputStream r0 = (java.io.FileOutputStream) r0     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            goto L_0x0245
        L_0x023c:
            r0 = move-exception
            goto L_0x0250
        L_0x023e:
            r0 = move-exception
            goto L_0x0252
        L_0x0240:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x023e, all -> 0x023c }
            r0.<init>(r2)     // Catch:{ Exception -> 0x023e, all -> 0x023c }
        L_0x0245:
            r2 = r0
            xe.a.c(r5, r2)     // Catch:{ Exception -> 0x024d, all -> 0x024a }
            goto L_0x0255
        L_0x024a:
            r0 = move-exception
            r9 = r2
            goto L_0x0250
        L_0x024d:
            r0 = move-exception
            r9 = r2
            goto L_0x0252
        L_0x0250:
            r2 = r9
            goto L_0x025c
        L_0x0252:
            r2 = r9
            goto L_0x0261
        L_0x0254:
            r2 = r9
        L_0x0255:
            r9 = r5
            r0 = r9
            r9 = r6
            goto L_0x0265
        L_0x0259:
            r0 = move-exception
            r2 = r9
            r5 = r2
        L_0x025c:
            r9 = r6
            goto L_0x0292
        L_0x025e:
            r0 = move-exception
            r2 = r9
            r5 = r2
        L_0x0261:
            r9 = r6
            goto L_0x027b
        L_0x0263:
            r0 = r9
            r2 = r0
        L_0x0265:
            xe.h.a(r9)
            xe.h.a(r2)
            if (r0 == 0) goto L_0x02a4
            boolean r2 = r0.isRecycled()
            if (r2 != 0) goto L_0x02a4
            goto L_0x028d
        L_0x0274:
            r0 = move-exception
            r2 = r9
            r5 = r2
            goto L_0x0292
        L_0x0278:
            r0 = move-exception
            r2 = r9
            r5 = r2
        L_0x027b:
            r0.printStackTrace()     // Catch:{ all -> 0x0291 }
            xe.h.a(r9)
            xe.h.a(r2)
            if (r5 == 0) goto L_0x02a4
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L_0x02a4
            r0 = r5
        L_0x028d:
            r0.recycle()
            goto L_0x02a4
        L_0x0291:
            r0 = move-exception
        L_0x0292:
            xe.h.a(r9)
            xe.h.a(r2)
            if (r5 == 0) goto L_0x02a3
            boolean r2 = r5.isRecycled()
            if (r2 != 0) goto L_0x02a3
            r5.recycle()
        L_0x02a3:
            throw r0
        L_0x02a4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: je.h.i0(java.lang.String):com.luck.picture.lib.entity.LocalMedia");
    }

    public final boolean j0() {
        this.f11878i0.getClass();
        return false;
    }

    public final boolean k0() {
        this.f11878i0.getClass();
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0108 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0109  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l0(com.luck.picture.lib.entity.LocalMedia r7, boolean r8) {
        /*
            r6 = this;
            ke.a r0 = r6.f11878i0
            r0.getClass()
            java.lang.String r0 = r7.f8086v
            ke.a r1 = r6.f11878i0
            r1.b()
            ke.a r1 = r6.f11878i0
            r1.getClass()
            ke.a r1 = r6.f11878i0
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> r2 = r1.X
            int r2 = r2.size()
            r3 = 0
            if (r2 <= 0) goto L_0x0027
            java.util.ArrayList<com.luck.picture.lib.entity.LocalMedia> r1 = r1.X
            java.lang.Object r1 = r1.get(r3)
            com.luck.picture.lib.entity.LocalMedia r1 = (com.luck.picture.lib.entity.LocalMedia) r1
            java.lang.String r1 = r1.f8086v
            goto L_0x0029
        L_0x0027:
            java.lang.String r1 = ""
        L_0x0029:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r4 = 1
            if (r2 == 0) goto L_0x0031
            goto L_0x003b
        L_0x0031:
            int r1 = j7.a.K(r1)
            int r2 = j7.a.K(r0)
            if (r1 != r2) goto L_0x003d
        L_0x003b:
            r1 = r4
            goto L_0x003e
        L_0x003d:
            r1 = r3
        L_0x003e:
            if (r1 == 0) goto L_0x00ef
            ke.a r1 = r6.f11878i0
            r1.getClass()
            ke.a r1 = r6.f11878i0
            r1.getClass()
            boolean r1 = j7.a.Z(r0)
            r2 = 2
            if (r1 == 0) goto L_0x008c
            ke.a r1 = r6.f11878i0
            int r5 = r1.f12524g
            if (r5 != r2) goto L_0x007d
            int r2 = r1.f12526i
            if (r2 <= 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            int r2 = r1.f12525h
        L_0x005e:
            r1.f12526i = r2
            if (r8 != 0) goto L_0x007d
            int r1 = r1.a()
            ke.a r2 = r6.f11878i0
            int r2 = r2.f12526i
            if (r1 < r2) goto L_0x007d
            android.content.Context r1 = r6.p0()
            ke.a r2 = r6.f11878i0
            int r2 = r2.f12526i
            java.lang.String r0 = r0(r2, r1, r0)
            r6.K0(r0)
            goto L_0x00fd
        L_0x007d:
            if (r8 != 0) goto L_0x0084
            ke.a r0 = r6.f11878i0
            r0.getClass()
        L_0x0084:
            if (r8 != 0) goto L_0x00ed
            ke.a r0 = r6.f11878i0
            r0.getClass()
            goto L_0x00ed
        L_0x008c:
            boolean r1 = j7.a.U(r0)
            if (r1 == 0) goto L_0x00c7
            ke.a r1 = r6.f11878i0
            int r5 = r1.f12524g
            if (r5 != r2) goto L_0x00b8
            if (r8 != 0) goto L_0x00b8
            java.util.ArrayList r1 = r1.b()
            int r1 = r1.size()
            ke.a r2 = r6.f11878i0
            int r2 = r2.f12525h
            if (r1 < r2) goto L_0x00b8
            android.content.Context r1 = r6.p0()
            ke.a r2 = r6.f11878i0
            int r2 = r2.f12525h
            java.lang.String r0 = r0(r2, r1, r0)
            r6.K0(r0)
            goto L_0x00fd
        L_0x00b8:
            if (r8 != 0) goto L_0x00bf
            ke.a r0 = r6.f11878i0
            r0.getClass()
        L_0x00bf:
            if (r8 != 0) goto L_0x00ed
            ke.a r0 = r6.f11878i0
            r0.getClass()
            goto L_0x00ed
        L_0x00c7:
            ke.a r1 = r6.f11878i0
            int r5 = r1.f12524g
            if (r5 != r2) goto L_0x00ed
            if (r8 != 0) goto L_0x00ed
            java.util.ArrayList r1 = r1.b()
            int r1 = r1.size()
            ke.a r2 = r6.f11878i0
            int r2 = r2.f12525h
            if (r1 < r2) goto L_0x00ed
            android.content.Context r1 = r6.p0()
            ke.a r2 = r6.f11878i0
            int r2 = r2.f12525h
            java.lang.String r0 = r0(r2, r1, r0)
            r6.K0(r0)
            goto L_0x00fd
        L_0x00ed:
            r0 = r3
            goto L_0x00fe
        L_0x00ef:
            ke.a r0 = r6.f11878i0
            r0.getClass()
            int r0 = com.luck.picture.lib.R$string.ps_rule
            java.lang.String r0 = r6.x(r0)
            r6.K0(r0)
        L_0x00fd:
            r0 = r4
        L_0x00fe:
            r1 = -1
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 == 0) goto L_0x0105
            r0 = r1
            goto L_0x0106
        L_0x0105:
            r0 = r2
        L_0x0106:
            if (r0 == r2) goto L_0x0109
            return r1
        L_0x0109:
            ke.a r0 = r6.f11878i0
            java.util.ArrayList r0 = r0.b()
            if (r8 == 0) goto L_0x0115
            r0.remove(r7)
            goto L_0x0137
        L_0x0115:
            ke.a r8 = r6.f11878i0
            int r8 = r8.f12524g
            if (r8 != r4) goto L_0x012d
            int r8 = r0.size()
            if (r8 <= 0) goto L_0x012d
            java.lang.Object r8 = r0.get(r3)
            com.luck.picture.lib.entity.LocalMedia r8 = (com.luck.picture.lib.entity.LocalMedia) r8
            r6.H0(r8)
            r0.clear()
        L_0x012d:
            r0.add(r7)
            int r8 = r0.size()
            r7.f8085u = r8
            r4 = r3
        L_0x0137:
            r8 = r4 ^ 1
            androidx.fragment.app.FragmentActivity r0 = r6.m()
            boolean r0 = j7.a.T(r0)
            if (r0 != 0) goto L_0x0167
            androidx.fragment.app.FragmentActivity r0 = r6.m()
            androidx.fragment.app.w r0 = r0.G()
            java.util.List r0 = r0.H()
        L_0x014f:
            int r1 = r0.size()
            if (r3 >= r1) goto L_0x0167
            java.lang.Object r1 = r0.get(r3)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r2 = r1 instanceof je.h
            if (r2 == 0) goto L_0x0164
            je.h r1 = (je.h) r1
            r1.F0(r7, r8)
        L_0x0164:
            int r3 = r3 + 1
            goto L_0x014f
        L_0x0167:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: je.h.l0(com.luck.picture.lib.entity.LocalMedia, boolean):int");
    }

    public void m0(LocalMedia localMedia) {
    }

    public final void n0() {
        String str;
        ke.a aVar = this.f11878i0;
        if (aVar.f12524g == 2) {
            if (aVar.X.size() > 0) {
                str = aVar.X.get(0).f8086v;
            } else {
                str = "";
            }
            if (j7.a.Y(str)) {
                this.f11878i0.getClass();
            }
            if (j7.a.Z(str)) {
                this.f11878i0.getClass();
            }
            if (j7.a.U(str)) {
                this.f11878i0.getClass();
            }
        }
        if (C()) {
            ArrayList arrayList = new ArrayList(this.f11878i0.b());
            this.f11878i0.getClass();
            this.f11878i0.getClass();
            j0();
            k0();
            E0(arrayList);
        }
    }

    public final void o0() {
        J0();
        this.f11878i0.getClass();
        this.f11878i0.getClass();
        if (!j7.a.T(m())) {
            try {
                if (!j7.a.T(m())) {
                    if (this.f11879j0.isShowing()) {
                        this.f11879j0.dismiss();
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f11878i0.getClass();
            this.f11878i0.getClass();
            z0();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.J = true;
        u0();
    }

    public final Context p0() {
        Context r10 = r();
        if (r10 != null) {
            return r10;
        }
        ie.a.a().getClass();
        return this.f11882m0;
    }

    public int q0() {
        return 0;
    }

    public final void s0(String[] strArr) {
        b.f15023a = strArr;
        if (strArr != null && strArr.length > 0) {
            Context p02 = p0();
            String str = strArr[0];
            if (j.f17328a == null) {
                j.f17328a = p02.getSharedPreferences("PictureSpUtils", 0);
            }
            j.f17328a.edit().putBoolean(str, true).apply();
        }
        this.f11878i0.getClass();
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", m().getPackageName(), (String) null));
            startActivityForResult(intent, 1102);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void t0(String[] strArr) {
    }

    public final void u0() {
        if (this.f11878i0 == null) {
            this.f11878i0 = ke.b.a().b();
        }
        ke.a aVar = this.f11878i0;
        if (aVar != null && aVar.f12530m != -2) {
            FragmentActivity m10 = m();
            ke.a aVar2 = this.f11878i0;
            l0.G0(m10, aVar2.f12530m, aVar2.f12531n);
        }
    }

    public final void v0() {
        boolean z10;
        if (!j7.a.T(m())) {
            FragmentManager fragmentManager = this.f2460y;
            if (fragmentManager == null) {
                z10 = false;
            } else {
                z10 = fragmentManager.O();
            }
            if (!z10) {
                this.f11878i0.getClass();
                w G = m().G();
                G.getClass();
                G.w(new FragmentManager.m(-1, 0), false);
            }
            List<Fragment> H = m().G().H();
            for (int i10 = 0; i10 < H.size(); i10++) {
                Fragment fragment = H.get(i10);
                if (fragment instanceof h) {
                    ((h) fragment).B0();
                }
            }
        }
    }

    public void w0() {
    }

    public void x0(Intent intent) {
    }

    public void y0() {
    }

    public void z0() {
        boolean z10;
        if (!j7.a.T(m())) {
            if ((m() instanceof PictureSelectorSupporterActivity) || (m() instanceof PictureSelectorTransparentActivity)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f11878i0.getClass();
                m().finish();
            } else {
                List<Fragment> H = m().G().H();
                for (int i10 = 0; i10 < H.size(); i10++) {
                    if (H.get(i10) instanceof h) {
                        v0();
                    }
                }
            }
        }
        ke.b a10 = ke.b.a();
        ke.a b10 = a10.b();
        if (b10 != null) {
            b10.V = null;
            b10.W = null;
            b10.f12518a0.clear();
            b10.X.clear();
            b10.Z.clear();
            b10.Y.clear();
            ExecutorService c10 = we.b.c();
            if (c10 instanceof b.d) {
                for (Map.Entry entry : we.b.f16804c.entrySet()) {
                    if (entry.getValue() == c10) {
                        we.b.a((b.c) entry.getKey());
                    }
                }
            }
            ArrayList arrayList = se.a.f14748a;
            if (arrayList.size() > 0) {
                arrayList.clear();
            }
            xe.d.f17321a.clear();
            a10.f12545a.remove(b10);
        }
    }
}

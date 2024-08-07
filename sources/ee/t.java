package ee;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.magical.MagicalView;
import com.luck.picture.lib.magical.ViewParams;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.PreviewBottomNavBar;
import com.luck.picture.lib.widget.PreviewTitleBar;
import com.luck.picture.lib.widget.TitleBar;
import ge.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import je.h;
import p3.l0;

/* compiled from: PictureSelectorPreviewFragment */
public class t extends h {
    public static final String O0 = t.class.getSimpleName();
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public int D0;
    public int E0;
    public int F0;
    public long G0 = -1;
    public TextView H0;
    public TextView I0;
    public View J0;
    public CompleteSelectView K0;
    public ArrayList L0 = new ArrayList();
    public boolean M0 = false;
    public final a N0 = new a();

    /* renamed from: o0  reason: collision with root package name */
    public ArrayList<LocalMedia> f9408o0 = new ArrayList<>();

    /* renamed from: p0  reason: collision with root package name */
    public MagicalView f9409p0;

    /* renamed from: q0  reason: collision with root package name */
    public ViewPager2 f9410q0;

    /* renamed from: r0  reason: collision with root package name */
    public fe.e f9411r0;

    /* renamed from: s0  reason: collision with root package name */
    public PreviewBottomNavBar f9412s0;

    /* renamed from: t0  reason: collision with root package name */
    public PreviewTitleBar f9413t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f9414u0 = true;

    /* renamed from: v0  reason: collision with root package name */
    public int f9415v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f9416w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f9417x0;

    /* renamed from: y0  reason: collision with root package name */
    public String f9418y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f9419z0;

    /* compiled from: PictureSelectorPreviewFragment */
    public class a extends ViewPager2.g {
        public a() {
        }

        public final void b(float f10, int i10, int i11) {
            if (t.this.f9408o0.size() > i10) {
                t tVar = t.this;
                int i12 = tVar.E0 / 2;
                ArrayList<LocalMedia> arrayList = tVar.f9408o0;
                if (i11 >= i12) {
                    i10++;
                }
                t tVar2 = t.this;
                tVar2.H0.setSelected(tVar2.f11878i0.b().contains(arrayList.get(i10)));
                t.this.getClass();
                t.this.f11878i0.U.b().getClass();
            }
        }

        public final void c(int i10) {
            t tVar = t.this;
            tVar.f9415v0 = i10;
            PreviewTitleBar previewTitleBar = tVar.f9413t0;
            previewTitleBar.setTitle((t.this.f9415v0 + 1) + "/" + t.this.D0);
            if (t.this.f9408o0.size() > i10) {
                LocalMedia localMedia = t.this.f9408o0.get(i10);
                t.this.f11878i0.U.b().getClass();
                if (t.this.T0()) {
                    t tVar2 = t.this;
                    LocalMedia localMedia2 = tVar2.f9408o0.get(i10);
                    if (j7.a.Z(localMedia2.f8086v)) {
                        tVar2.Q0(localMedia2, false, new u(tVar2, i10));
                    } else {
                        tVar2.P0(localMedia2, false, new v(tVar2, i10));
                    }
                }
                t tVar3 = t.this;
                if (tVar3.f11878i0.f12539v) {
                    ge.b u10 = tVar3.f9411r0.u(i10);
                    if (u10 instanceof ge.h) {
                        ge.h hVar = (ge.h) u10;
                        if (!hVar.u()) {
                            hVar.B.setVisibility(0);
                        }
                    }
                }
                t.this.getClass();
                PreviewBottomNavBar previewBottomNavBar = t.this.f9412s0;
                if (!j7.a.Z(localMedia.f8086v)) {
                    boolean U = j7.a.U(localMedia.f8086v);
                }
                TextView textView = previewBottomNavBar.f8131b;
                previewBottomNavBar.f8133d.getClass();
                textView.setVisibility(8);
                t tVar4 = t.this;
                if (!tVar4.A0 && !tVar4.f9416w0) {
                    tVar4.f11878i0.getClass();
                    t tVar5 = t.this;
                    if (tVar5.f11878i0.I && tVar5.f9414u0) {
                        if (i10 == (tVar5.f9411r0.c() - 1) - 10 || i10 == t.this.f9411r0.c() - 1) {
                            t.this.V0();
                        }
                    }
                }
            }
        }
    }

    /* compiled from: PictureSelectorPreviewFragment */
    public class b implements qe.b<oe.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocalMedia f9421a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ qe.b f9422b;

        public b(LocalMedia localMedia, qe.b bVar) {
            this.f9421a = localMedia;
            this.f9422b = bVar;
        }

        public final void a(Object obj) {
            oe.b bVar = (oe.b) obj;
            int i10 = bVar.f13867a;
            if (i10 > 0) {
                this.f9421a.f8090z = i10;
            }
            int i11 = bVar.f13868b;
            if (i11 > 0) {
                this.f9421a.A = i11;
            }
            qe.b bVar2 = this.f9422b;
            if (bVar2 != null) {
                LocalMedia localMedia = this.f9421a;
                bVar2.a(new int[]{localMedia.f8090z, localMedia.A});
            }
        }
    }

    /* compiled from: PictureSelectorPreviewFragment */
    public class c implements qe.b<oe.b> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocalMedia f9423a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ qe.b f9424b;

        public c(LocalMedia localMedia, qe.b bVar) {
            this.f9423a = localMedia;
            this.f9424b = bVar;
        }

        public final void a(Object obj) {
            oe.b bVar = (oe.b) obj;
            int i10 = bVar.f13867a;
            if (i10 > 0) {
                this.f9423a.f8090z = i10;
            }
            int i11 = bVar.f13868b;
            if (i11 > 0) {
                this.f9423a.A = i11;
            }
            qe.b bVar2 = this.f9424b;
            if (bVar2 != null) {
                LocalMedia localMedia = this.f9423a;
                bVar2.a(new int[]{localMedia.f8090z, localMedia.A});
            }
        }
    }

    /* compiled from: PictureSelectorPreviewFragment */
    public class d implements qe.b<int[]> {
        public d() {
        }

        public final void a(Object obj) {
            t.L0(t.this, (int[]) obj);
        }
    }

    /* compiled from: PictureSelectorPreviewFragment */
    public class e implements qe.b<int[]> {
        public e() {
        }

        public final void a(Object obj) {
            t.L0(t.this, (int[]) obj);
        }
    }

    /* compiled from: PictureSelectorPreviewFragment */
    public class f extends a.a {
        public f() {
        }

        public final void g(ArrayList<LocalMedia> arrayList, boolean z10) {
            t.M0(t.this, arrayList, z10);
        }
    }

    /* compiled from: PictureSelectorPreviewFragment */
    public class g implements b.a {
        public g() {
        }

        public final void a() {
            boolean z10;
            float f10;
            float f11;
            float f12;
            t tVar = t.this;
            String str = t.O0;
            ke.a aVar = tVar.f11878i0;
            if (aVar.f12538u) {
                if (!tVar.C0) {
                    float f13 = 0.0f;
                    if (tVar.f9413t0.getTranslationY() == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = (float) (-tVar.f9413t0.getHeight());
                    }
                    if (z10) {
                        f11 = (float) (-tVar.f9413t0.getHeight());
                    } else {
                        f11 = 0.0f;
                    }
                    if (z10) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    if (!z10) {
                        f13 = 1.0f;
                    }
                    for (int i10 = 0; i10 < tVar.L0.size(); i10++) {
                        View view = (View) tVar.L0.get(i10);
                        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "alpha", new float[]{f12, f13})});
                        if (view instanceof TitleBar) {
                            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat(view, "translationY", new float[]{f10, f11})});
                        }
                    }
                    animatorSet.setDuration(350);
                    animatorSet.start();
                    tVar.C0 = true;
                    animatorSet.addListener(new s(tVar, z10));
                    if (z10) {
                        for (int i11 = 0; i11 < tVar.L0.size(); i11++) {
                            ((View) tVar.L0.get(i11)).setEnabled(false);
                        }
                        tVar.f9412s0.getEditor().setEnabled(false);
                        return;
                    }
                    tVar.S0();
                }
            } else if (tVar.A0) {
                if (aVar.f12539v) {
                    tVar.f9409p0.a();
                } else {
                    tVar.R0();
                }
            } else if (tVar.f9416w0 || !aVar.f12539v) {
                tVar.v0();
            } else {
                tVar.f9409p0.a();
            }
        }

        public final void b() {
            t tVar = t.this;
            String str = t.O0;
            tVar.f11878i0.getClass();
            t tVar2 = t.this;
            if (tVar2.A0) {
                tVar2.f11878i0.getClass();
            }
        }

        public final void c(String str) {
            if (TextUtils.isEmpty(str)) {
                PreviewTitleBar previewTitleBar = t.this.f9413t0;
                previewTitleBar.setTitle((t.this.f9415v0 + 1) + "/" + t.this.D0);
                return;
            }
            t.this.f9413t0.setTitle(str);
        }
    }

    public static void L0(t tVar, int[] iArr) {
        int i10;
        int i11;
        int i12;
        if (tVar.f9419z0) {
            i10 = tVar.f9415v0 + 1;
        } else {
            i10 = tVar.f9415v0;
        }
        ViewParams a10 = se.a.a(i10);
        if (a10 == null || (i11 = iArr[0]) == 0 || (i12 = iArr[1]) == 0) {
            tVar.f9409p0.setViewParams(0, 0, 0, 0, iArr[0], iArr[1]);
            tVar.f9409p0.e(iArr[0], iArr[1]);
            return;
        }
        tVar.f9409p0.setViewParams(a10.f8122a, a10.f8123b, a10.f8124c, a10.f8125d, i11, i12);
        tVar.f9409p0.d();
    }

    public static void M0(t tVar, List list, boolean z10) {
        if (!j7.a.T(tVar.m())) {
            tVar.f9414u0 = z10;
            if (!z10) {
                return;
            }
            if (list.size() > 0) {
                int size = tVar.f9408o0.size();
                tVar.f9408o0.addAll(list);
                tVar.f9411r0.f3034a.c(size, tVar.f9408o0.size());
                return;
            }
            tVar.V0();
        }
    }

    public static void N0(t tVar, int[] iArr) {
        int i10;
        int i11;
        tVar.f9409p0.c(false, iArr[0], iArr[1]);
        if (tVar.f9419z0) {
            i10 = tVar.f9415v0 + 1;
        } else {
            i10 = tVar.f9415v0;
        }
        ViewParams a10 = se.a.a(i10);
        if (a10 == null || ((i11 = iArr[0]) == 0 && iArr[1] == 0)) {
            tVar.f9410q0.post(new r(tVar, iArr));
            tVar.f9409p0.setBackgroundAlpha(1.0f);
            for (int i12 = 0; i12 < tVar.L0.size(); i12++) {
                ((View) tVar.L0.get(i12)).setAlpha(1.0f);
            }
        } else {
            tVar.f9409p0.setViewParams(a10.f8122a, a10.f8123b, a10.f8124c, a10.f8125d, i11, iArr[1]);
            tVar.f9409p0.i(false);
        }
        ObjectAnimator.ofFloat(tVar.f9410q0, "alpha", new float[]{0.0f, 1.0f}).setDuration(50).start();
    }

    public static void O0(t tVar, int i10, int i11, int i12) {
        tVar.f9409p0.c(true, i10, i11);
        if (tVar.f9419z0) {
            i12++;
        }
        ViewParams a10 = se.a.a(i12);
        if (a10 == null || i10 == 0 || i11 == 0) {
            tVar.f9409p0.setViewParams(0, 0, 0, 0, i10, i11);
        } else {
            tVar.f9409p0.setViewParams(a10.f8122a, a10.f8123b, a10.f8124c, a10.f8125d, i10, i11);
        }
    }

    public final void C0() {
        if (j7.a.T(m())) {
            return;
        }
        if (this.A0) {
            if (this.f11878i0.f12539v) {
                this.f9409p0.a();
            } else {
                z0();
            }
        } else if (this.f9416w0) {
            v0();
        } else if (this.f11878i0.f12539v) {
            this.f9409p0.a();
        } else {
            v0();
        }
    }

    public final void F0(LocalMedia localMedia, boolean z10) {
        this.H0.setSelected(this.f11878i0.b().contains(localMedia));
        this.f9412s0.setSelectedChange();
        this.K0.setSelectedChange(true);
        this.f11878i0.U.b().getClass();
    }

    public final Animation K(boolean z10, int i10, int i11) {
        int i12;
        if (T0()) {
            return null;
        }
        ve.a d10 = this.f11878i0.U.d();
        if (d10.f16189c == 0 || d10.f16190d == 0) {
            return super.K(z10, i10, i11);
        }
        FragmentActivity m10 = m();
        if (z10) {
            i12 = d10.f16189c;
        } else {
            i12 = d10.f16190d;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(m10, i12);
        if (!z10) {
            y0();
        }
        return loadAnimation;
    }

    public final void M() {
        fe.e eVar = this.f9411r0;
        if (eVar != null) {
            eVar.t();
        }
        ViewPager2 viewPager2 = this.f9410q0;
        if (viewPager2 != null) {
            viewPager2.f3593c.f3627a.remove(this.N0);
        }
        this.J = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void P0(com.luck.picture.lib.entity.LocalMedia r8, boolean r9, qe.b<int[]> r10) {
        /*
            r7 = this;
            int r0 = r8.f8090z
            int r1 = r8.A
            r2 = 1
            r3 = 0
            if (r0 <= 0) goto L_0x0011
            if (r1 > 0) goto L_0x000b
            goto L_0x0011
        L_0x000b:
            int r4 = r0 * 3
            if (r1 <= r4) goto L_0x0011
            r4 = r2
            goto L_0x0012
        L_0x0011:
            r4 = r3
        L_0x0012:
            if (r4 == 0) goto L_0x0019
            int r0 = r7.E0
            int r1 = r7.F0
            goto L_0x0044
        L_0x0019:
            if (r9 == 0) goto L_0x0044
            if (r0 <= 0) goto L_0x0021
            if (r1 <= 0) goto L_0x0021
            if (r0 <= r1) goto L_0x0044
        L_0x0021:
            ke.a r9 = r7.f11878i0
            boolean r9 = r9.S
            if (r9 == 0) goto L_0x0044
            androidx.viewpager2.widget.ViewPager2 r9 = r7.f9410q0
            r4 = 0
            r9.setAlpha(r4)
            android.content.Context r9 = r7.r()
            java.lang.String r4 = r8.a()
            ee.t$b r5 = new ee.t$b
            r5.<init>(r8, r10)
            xe.e r6 = new xe.e
            r6.<init>(r9, r4, r5)
            we.b.b(r6)
            r9 = r3
            goto L_0x0045
        L_0x0044:
            r9 = r2
        L_0x0045:
            boolean r4 = r8.d()
            if (r4 == 0) goto L_0x0055
            int r4 = r8.B
            if (r4 <= 0) goto L_0x0055
            int r8 = r8.C
            if (r8 <= 0) goto L_0x0055
            r1 = r8
            r0 = r4
        L_0x0055:
            if (r9 == 0) goto L_0x0061
            r8 = 2
            int[] r8 = new int[r8]
            r8[r3] = r0
            r8[r2] = r1
            r10.a(r8)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.t.P0(com.luck.picture.lib.entity.LocalMedia, boolean, qe.b):void");
    }

    public final void Q() {
        ge.b u10;
        this.J = true;
        if (U0()) {
            fe.e eVar = this.f9411r0;
            if (!(eVar == null || (u10 = eVar.u(this.f9410q0.getCurrentItem())) == null)) {
                u10.B();
            }
            this.M0 = true;
        }
    }

    public final void Q0(LocalMedia localMedia, boolean z10, qe.b<int[]> bVar) {
        boolean z11;
        int i10;
        int i11;
        if (!z10 || (((i10 = localMedia.f8090z) > 0 && (i11 = localMedia.A) > 0 && i10 <= i11) || !this.f11878i0.S)) {
            z11 = true;
        } else {
            this.f9410q0.setAlpha(0.0f);
            we.b.b(new xe.f(r(), localMedia.a(), new c(localMedia, bVar)));
            z11 = false;
        }
        if (z11) {
            bVar.a(new int[]{localMedia.f8090z, localMedia.A});
        }
    }

    public final void R0() {
        if (!j7.a.T(m())) {
            if (this.f11878i0.f12538u) {
                S0();
            }
            z0();
        }
    }

    public final void S() {
        ge.b u10;
        this.J = true;
        if (this.M0) {
            fe.e eVar = this.f9411r0;
            if (!(eVar == null || (u10 = eVar.u(this.f9410q0.getCurrentItem())) == null)) {
                u10.B();
            }
            this.M0 = false;
        }
    }

    public final void S0() {
        for (int i10 = 0; i10 < this.L0.size(); i10++) {
            ((View) this.L0.get(i10)).setEnabled(true);
        }
        this.f9412s0.getEditor().setEnabled(true);
    }

    public final void T(Bundle bundle) {
        bundle.putInt("com.luck.picture.lib.current_page", this.f11876g0);
        bundle.putLong("com.luck.picture.lib.current_bucketId", this.G0);
        bundle.putInt("com.luck.picture.lib.current_preview_position", this.f9415v0);
        bundle.putInt("com.luck.picture.lib.current_album_total", this.D0);
        bundle.putBoolean("com.luck.picture.lib.external_preview", this.A0);
        bundle.putBoolean("com.luck.picture.lib.external_preview_display_delete", this.B0);
        bundle.putBoolean("com.luck.picture.lib.display_camera", this.f9419z0);
        bundle.putBoolean("com.luck.picture.lib.bottom_preview", this.f9416w0);
        bundle.putString("com.luck.picture.lib.current_album_name", this.f9418y0);
        ke.a aVar = this.f11878i0;
        ArrayList<LocalMedia> arrayList = this.f9408o0;
        if (arrayList != null) {
            aVar.Y.clear();
            aVar.Y.addAll(arrayList);
            return;
        }
        aVar.getClass();
    }

    public final boolean T0() {
        if (this.f9416w0 || !this.f11878i0.f12539v) {
            return false;
        }
        return true;
    }

    public final boolean U0() {
        boolean z10;
        fe.e eVar = this.f9411r0;
        if (eVar != null) {
            ge.b u10 = eVar.u(this.f9410q0.getCurrentItem());
            if (u10 == null || !u10.u()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final void V0() {
        int i10 = this.f11876g0 + 1;
        this.f11876g0 = i10;
        ke.a aVar = this.f11878i0;
        aVar.getClass();
        this.f11877h0.e(this.G0, i10, aVar.H, new f());
    }

    public final void W(View view, Bundle bundle) {
        boolean z10;
        int i10;
        int i11;
        re.a aVar;
        ArrayList<LocalMedia> arrayList;
        super.W(view, bundle);
        if (bundle != null) {
            this.f11876g0 = bundle.getInt("com.luck.picture.lib.current_page", 1);
            this.G0 = bundle.getLong("com.luck.picture.lib.current_bucketId", -1);
            this.f9415v0 = bundle.getInt("com.luck.picture.lib.current_preview_position", this.f9415v0);
            this.f9419z0 = bundle.getBoolean("com.luck.picture.lib.display_camera", this.f9419z0);
            this.D0 = bundle.getInt("com.luck.picture.lib.current_album_total", this.D0);
            this.A0 = bundle.getBoolean("com.luck.picture.lib.external_preview", this.A0);
            this.B0 = bundle.getBoolean("com.luck.picture.lib.external_preview_display_delete", this.B0);
            this.f9416w0 = bundle.getBoolean("com.luck.picture.lib.bottom_preview", this.f9416w0);
            this.f9418y0 = bundle.getString("com.luck.picture.lib.current_album_name", "");
            if (this.f9408o0.size() == 0) {
                this.f9408o0.addAll(new ArrayList(this.f11878i0.Y));
            }
        }
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9417x0 = z10;
        this.E0 = xe.c.e(r());
        this.F0 = xe.c.f(r());
        this.f9413t0 = (PreviewTitleBar) view.findViewById(R$id.title_bar);
        this.H0 = (TextView) view.findViewById(R$id.ps_tv_selected);
        this.I0 = (TextView) view.findViewById(R$id.ps_tv_selected_word);
        this.J0 = view.findViewById(R$id.select_click_area);
        this.K0 = (CompleteSelectView) view.findViewById(R$id.ps_complete_select);
        this.f9409p0 = (MagicalView) view.findViewById(R$id.magical);
        this.f9410q0 = new ViewPager2(r());
        this.f9412s0 = (PreviewBottomNavBar) view.findViewById(R$id.bottom_nar_bar);
        this.f9409p0.setMagicalContent(this.f9410q0);
        this.f11878i0.U.b().getClass();
        if (this.f11878i0.f12517a == 3 || ((arrayList = this.f9408o0) != null && arrayList.size() > 0 && j7.a.U(this.f9408o0.get(0).f8086v))) {
            this.f9409p0.setBackgroundColor(k1.a.getColor(r(), R$color.ps_color_white));
        } else {
            this.f9409p0.setBackgroundColor(k1.a.getColor(r(), R$color.ps_color_black));
        }
        if (T0()) {
            this.f9409p0.setOnMojitoViewCallback(new p(this));
        }
        Collections.addAll(this.L0, new View[]{this.f9413t0, this.H0, this.I0, this.J0, this.K0, this.f9412s0});
        if (!this.A0) {
            ke.a aVar2 = this.f11878i0;
            aVar2.getClass();
            if (aVar2.I) {
                aVar = new re.d(p0(), this.f11878i0);
            } else {
                aVar = new re.c(p0(), this.f11878i0);
            }
            this.f11877h0 = aVar;
        }
        this.f11878i0.U.c().getClass();
        this.f9413t0.setTitleBarStyle();
        this.f9413t0.setOnTitleBarListener(new x(this));
        this.f9413t0.setTitle((this.f9415v0 + 1) + "/" + this.D0);
        this.f9413t0.getImageDelete().setOnClickListener(new y(this));
        this.J0.setOnClickListener(new z(this));
        this.H0.setOnClickListener(new m(this));
        ArrayList<LocalMedia> arrayList2 = this.f9408o0;
        fe.e eVar = new fe.e(this.f11878i0);
        this.f9411r0 = eVar;
        eVar.f10207d = arrayList2;
        eVar.f10208e = new g();
        this.f9410q0.setOrientation(0);
        this.f9410q0.setAdapter(this.f9411r0);
        this.f11878i0.Y.clear();
        if (arrayList2.size() == 0 || this.f9415v0 >= arrayList2.size() || (i11 = this.f9415v0) < 0) {
            C0();
        } else {
            LocalMedia localMedia = arrayList2.get(i11);
            PreviewBottomNavBar previewBottomNavBar = this.f9412s0;
            if (!j7.a.Z(localMedia.f8086v)) {
                boolean U = j7.a.U(localMedia.f8086v);
            }
            TextView textView = previewBottomNavBar.f8131b;
            previewBottomNavBar.f8133d.getClass();
            textView.setVisibility(8);
            this.H0.setSelected(this.f11878i0.b().contains(arrayList2.get(this.f9410q0.getCurrentItem())));
            this.f9410q0.f3593c.f3627a.add(this.N0);
            this.f9410q0.setPageTransformer(new androidx.viewpager2.widget.e(xe.c.a(p0(), 3.0f)));
            this.f9410q0.setCurrentItem(this.f9415v0, false);
            this.f11878i0.U.b().getClass();
            LocalMedia localMedia2 = arrayList2.get(this.f9415v0);
            this.f11878i0.U.b().getClass();
            if (!this.f9417x0 && !this.f9416w0 && this.f11878i0.f12539v) {
                this.f9410q0.post(new o(this));
                if (j7.a.Z(localMedia.f8086v)) {
                    Q0(localMedia, !j7.a.X(localMedia.a()), new p(this));
                } else {
                    P0(localMedia, !j7.a.X(localMedia.a()), new q(this));
                }
            }
        }
        if (this.A0) {
            ImageView imageDelete = this.f9413t0.getImageDelete();
            if (this.B0) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            imageDelete.setVisibility(i10);
            this.H0.setVisibility(8);
            this.f9412s0.setVisibility(8);
            this.K0.setVisibility(8);
        } else {
            this.f9412s0.setBottomNavBarStyle();
            this.f9412s0.setSelectedChange();
            this.f9412s0.setOnBottomNavBarListener(new n(this));
            ViewGroup viewGroup = (ViewGroup) view;
            this.f11878i0.U.b().getClass();
            l0 b10 = this.f11878i0.U.b();
            b10.getClass();
            if (l0.s()) {
                this.I0.setText((CharSequence) null);
            } else {
                this.I0.setText("");
            }
            this.K0.setCompleteSelectViewStyle();
            this.K0.setSelectedChange(true);
            if (this.f11878i0.f12538u) {
                if (this.I0.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                    ((ConstraintLayout.LayoutParams) this.I0.getLayoutParams()).topMargin = xe.c.g(r());
                } else if (this.I0.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                    ((RelativeLayout.LayoutParams) this.I0.getLayoutParams()).topMargin = xe.c.g(r());
                }
            }
            this.K0.setOnClickListener(new w(this, b10));
        }
        float f10 = 1.0f;
        if (T0()) {
            if (!this.f9417x0) {
                f10 = 0.0f;
            }
            this.f9409p0.setBackgroundAlpha(f10);
            for (int i12 = 0; i12 < this.L0.size(); i12++) {
                if (!(this.L0.get(i12) instanceof TitleBar)) {
                    ((View) this.L0.get(i12)).setAlpha(f10);
                }
            }
            return;
        }
        this.f9409p0.setBackgroundAlpha(1.0f);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        int i10;
        super.onConfigurationChanged(configuration);
        if (T0() && this.f9408o0.size() > (i10 = this.f9415v0)) {
            LocalMedia localMedia = this.f9408o0.get(i10);
            if (j7.a.Z(localMedia.f8086v)) {
                Q0(localMedia, false, new d());
            } else {
                P0(localMedia, false, new e());
            }
        }
    }

    public final int q0() {
        int J = j7.a.J(r(), 2, this.f11878i0);
        if (J != 0) {
            return J;
        }
        return R$layout.ps_fragment_preview;
    }

    public final void w0() {
        this.f9412s0.setOriginalCheck();
    }

    public final void x0(Intent intent) {
        String str;
        if (this.f9408o0.size() > this.f9410q0.getCurrentItem()) {
            LocalMedia localMedia = this.f9408o0.get(this.f9410q0.getCurrentItem());
            Uri uri = (Uri) intent.getParcelableExtra("output");
            if (uri == null) {
                uri = (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
            }
            if (uri != null) {
                str = uri.getPath();
            } else {
                str = "";
            }
            localMedia.f8077f = str;
            localMedia.B = intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1);
            localMedia.C = intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1);
            localMedia.D = intent.getIntExtra("com.yalantis.ucrop.OffsetX", 0);
            localMedia.E = intent.getIntExtra("com.yalantis.ucrop.OffsetY", 0);
            localMedia.F = intent.getFloatExtra("com.yalantis.ucrop.CropAspectRatio", 0.0f);
            localMedia.f8083s = !TextUtils.isEmpty(localMedia.f8077f);
            localMedia.M = intent.getStringExtra("customExtraData");
            localMedia.P = localMedia.d();
            localMedia.f8080p = localMedia.f8077f;
            if (this.f11878i0.b().contains(localMedia)) {
                LocalMedia localMedia2 = localMedia.Q;
                if (localMedia2 != null) {
                    localMedia2.f8077f = localMedia.f8077f;
                    localMedia2.f8083s = localMedia.d();
                    localMedia2.P = localMedia.e();
                    localMedia2.M = localMedia.M;
                    localMedia2.f8080p = localMedia.f8077f;
                    localMedia2.B = intent.getIntExtra("com.yalantis.ucrop.ImageWidth", -1);
                    localMedia2.C = intent.getIntExtra("com.yalantis.ucrop.ImageHeight", -1);
                    localMedia2.D = intent.getIntExtra("com.yalantis.ucrop.OffsetX", 0);
                    localMedia2.E = intent.getIntExtra("com.yalantis.ucrop.OffsetY", 0);
                    localMedia2.F = intent.getFloatExtra("com.yalantis.ucrop.CropAspectRatio", 0.0f);
                }
                H0(localMedia);
            } else {
                l0(localMedia, false);
            }
            this.f9411r0.g(this.f9410q0.getCurrentItem());
        }
    }

    public final void y0() {
        if (this.f11878i0.f12538u) {
            S0();
        }
    }

    public final void z0() {
        fe.e eVar = this.f9411r0;
        if (eVar != null) {
            eVar.t();
        }
        super.z0();
    }
}

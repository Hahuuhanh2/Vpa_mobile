package ee;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.magical.ViewParams;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.RecyclerPreloadView;
import com.luck.picture.lib.widget.TitleBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.h;
import qe.g;
import xe.k;

/* compiled from: PictureSelectorFragment */
public class c extends h implements g {
    public static final String C0 = c.class.getSimpleName();
    public static final Object D0 = new Object();
    public fe.d A0;
    public me.c B0;

    /* renamed from: o0  reason: collision with root package name */
    public RecyclerPreloadView f9371o0;

    /* renamed from: p0  reason: collision with root package name */
    public TextView f9372p0;

    /* renamed from: q0  reason: collision with root package name */
    public TitleBar f9373q0;

    /* renamed from: r0  reason: collision with root package name */
    public BottomNavBar f9374r0;

    /* renamed from: s0  reason: collision with root package name */
    public CompleteSelectView f9375s0;

    /* renamed from: t0  reason: collision with root package name */
    public TextView f9376t0;

    /* renamed from: u0  reason: collision with root package name */
    public long f9377u0 = 0;

    /* renamed from: v0  reason: collision with root package name */
    public int f9378v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f9379w0 = -1;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f9380x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f9381y0;

    /* renamed from: z0  reason: collision with root package name */
    public boolean f9382z0;

    /* compiled from: PictureSelectorFragment */
    public class a extends a.a {
        public a() {
        }

        public final void g(ArrayList<LocalMedia> arrayList, boolean z10) {
            c cVar = c.this;
            String str = c.C0;
            cVar.Q0(arrayList, z10);
        }
    }

    /* compiled from: PictureSelectorFragment */
    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ArrayList f9384a;

        public b(ArrayList arrayList) {
            this.f9384a = arrayList;
        }

        public final void run() {
            c cVar = c.this;
            ArrayList arrayList = this.f9384a;
            String str = c.C0;
            cVar.V0(arrayList);
        }
    }

    /* renamed from: ee.c$c  reason: collision with other inner class name */
    /* compiled from: PictureSelectorFragment */
    public class C0103c implements Runnable {
        public C0103c() {
        }

        public final void run() {
            c.this.S0();
        }
    }

    /* compiled from: PictureSelectorFragment */
    public class d extends a.a {
        public d() {
        }

        public final void g(ArrayList<LocalMedia> arrayList, boolean z10) {
            c.O0(c.this, arrayList, z10);
        }
    }

    public static void L0(c cVar, ArrayList arrayList, boolean z10) {
        if (!j7.a.T(cVar.m())) {
            cVar.f9371o0.setEnabledLoadMore(z10);
            if (arrayList.size() == 0) {
                cVar.A0.f10204e.clear();
            }
            cVar.U0(arrayList);
            cVar.f9371o0.Y(0);
            cVar.f9371o0.n0(0);
        }
    }

    public static void M0(c cVar, int i10, boolean z10) {
        int i11;
        ArrayList<LocalMedia> arrayList;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (j7.a.o(cVar.m(), t.O0)) {
            long j10 = 0;
            if (z10) {
                arrayList = new ArrayList<>(cVar.f11878i0.b());
                i11 = arrayList.size();
            } else {
                arrayList = new ArrayList<>(cVar.A0.f10204e);
                LocalMediaFolder localMediaFolder = cVar.f11878i0.W;
                if (localMediaFolder != null) {
                    i11 = localMediaFolder.f8095e;
                    j10 = localMediaFolder.f8091a;
                } else {
                    i11 = arrayList.size();
                    if (arrayList.size() > 0) {
                        j10 = arrayList.get(0).K;
                    } else {
                        j10 = -1;
                    }
                }
            }
            if (!z10) {
                ke.a aVar = cVar.f11878i0;
                if (aVar.f12539v) {
                    RecyclerPreloadView recyclerPreloadView = cVar.f9371o0;
                    if (aVar.f12538u) {
                        i12 = 0;
                    } else {
                        i12 = xe.c.g(cVar.r());
                    }
                    ArrayList arrayList2 = se.a.f14748a;
                    ArrayList arrayList3 = new ArrayList();
                    boolean z11 = recyclerPreloadView instanceof RecyclerView;
                    if (z11) {
                        i13 = recyclerPreloadView.getChildCount();
                    } else if (recyclerPreloadView instanceof ListView) {
                        i13 = ((ListView) recyclerPreloadView).getChildCount();
                    } else {
                        throw new IllegalArgumentException(recyclerPreloadView.getClass().getCanonicalName() + " Must be " + RecyclerView.class + " or " + ListView.class);
                    }
                    for (int i17 = 0; i17 < i13; i17++) {
                        View childAt = recyclerPreloadView.getChildAt(i17);
                        if (childAt != null) {
                            arrayList3.add(childAt);
                        }
                    }
                    if (z11) {
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerPreloadView.getLayoutManager();
                        if (gridLayoutManager != null) {
                            i15 = gridLayoutManager.L();
                            i14 = gridLayoutManager.Z0();
                            i16 = gridLayoutManager.a1();
                        }
                    } else {
                        ListView listView = (ListView) recyclerPreloadView;
                        ListAdapter adapter = listView.getAdapter();
                        if (adapter != null) {
                            i15 = adapter.getCount();
                            i14 = listView.getFirstVisiblePosition();
                            i16 = listView.getLastVisiblePosition();
                        }
                    }
                    if (i16 > i15) {
                        i16 = i15 - 1;
                    }
                    if (i14 > 0) {
                        while (i14 >= 1) {
                            arrayList3.add(0, (Object) null);
                            i14--;
                        }
                    }
                    if (i16 < i15) {
                        for (int i18 = (i15 - 1) - i16; i18 >= 1; i18--) {
                            arrayList3.add((Object) null);
                        }
                    }
                    se.a.f14748a.clear();
                    for (int i19 = 0; i19 < arrayList3.size(); i19++) {
                        View view = (View) arrayList3.get(i19);
                        ViewParams viewParams = new ViewParams();
                        if (view == null) {
                            viewParams.f8122a = 0;
                            viewParams.f8123b = 0;
                            viewParams.f8124c = 0;
                            viewParams.f8125d = 0;
                        } else {
                            int[] iArr = new int[2];
                            view.getLocationOnScreen(iArr);
                            viewParams.f8122a = iArr[0];
                            viewParams.f8123b = iArr[1] - i12;
                            viewParams.f8124c = view.getWidth();
                            viewParams.f8125d = view.getHeight();
                        }
                        se.a.f14748a.add(viewParams);
                    }
                }
            }
            cVar.f11878i0.getClass();
            FragmentActivity m10 = cVar.m();
            String str = t.O0;
            if (j7.a.o(m10, str)) {
                t tVar = new t();
                tVar.g0(new Bundle());
                String titleText = cVar.f9373q0.getTitleText();
                boolean z12 = cVar.A0.f10203d;
                tVar.f11876g0 = cVar.f11876g0;
                tVar.G0 = j10;
                tVar.f9408o0 = arrayList;
                tVar.D0 = i11;
                tVar.f9415v0 = i10;
                tVar.f9418y0 = titleText;
                tVar.f9419z0 = z12;
                tVar.f9416w0 = z10;
                je.a.a(cVar.m(), str, tVar);
            }
        }
    }

    public static void N0(c cVar, List list, boolean z10) {
        LocalMediaFolder localMediaFolder;
        if (!j7.a.T(cVar.m())) {
            if (list.size() > 0) {
                if (z10) {
                    localMediaFolder = (LocalMediaFolder) list.get(0);
                    cVar.f11878i0.W = localMediaFolder;
                } else {
                    localMediaFolder = cVar.f11878i0.W;
                    if (localMediaFolder == null) {
                        localMediaFolder = (LocalMediaFolder) list.get(0);
                        cVar.f11878i0.W = localMediaFolder;
                    }
                }
                cVar.f9373q0.setTitle(localMediaFolder.d());
                cVar.B0.b(list);
                ke.a aVar = cVar.f11878i0;
                if (!aVar.I) {
                    cVar.U0(localMediaFolder.a());
                } else if (aVar.T) {
                    cVar.f9371o0.setEnabledLoadMore(true);
                } else {
                    cVar.R0(localMediaFolder.f8091a);
                }
            } else {
                cVar.W0();
            }
        }
    }

    public static void O0(c cVar, List list, boolean z10) {
        if (!j7.a.T(cVar.m())) {
            cVar.f9371o0.setEnabledLoadMore(z10);
            if (cVar.f9371o0.T0) {
                try {
                    if (cVar.f11878i0.I && cVar.f9380x0) {
                        synchronized (D0) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (cVar.A0.f10204e.contains(it.next())) {
                                    it.remove();
                                }
                            }
                        }
                    }
                } catch (Exception e10) {
                    try {
                        e10.printStackTrace();
                    } catch (Throwable th2) {
                        cVar.f9380x0 = false;
                        throw th2;
                    }
                }
                cVar.f9380x0 = false;
                if (list.size() > 0) {
                    int size = cVar.A0.f10204e.size();
                    cVar.A0.f10204e.addAll(list);
                    fe.d dVar = cVar.A0;
                    dVar.f3034a.c(size, dVar.c());
                    if (cVar.f9372p0.getVisibility() == 0) {
                        cVar.f9372p0.setVisibility(8);
                    }
                } else {
                    cVar.T0();
                }
                if (list.size() < 10) {
                    RecyclerPreloadView recyclerPreloadView = cVar.f9371o0;
                    recyclerPreloadView.getScrollX();
                    recyclerPreloadView.Y(cVar.f9371o0.getScrollY());
                }
            }
        }
    }

    public final void A0(LocalMedia localMedia) {
        this.A0.g(localMedia.f8084t);
    }

    public final void B0() {
        View e02 = e0();
        e02.setFocusableInTouchMode(true);
        e02.requestFocus();
        e02.setOnKeyListener(new je.c(this));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void F0(LocalMedia localMedia, boolean z10) {
        this.f9374r0.setSelectedChange();
        this.f9375s0.setSelectedChange(false);
        this.f11878i0.getClass();
        this.A0.g(localMedia.f8084t);
        if (!z10) {
            this.f11878i0.U.b().getClass();
        }
    }

    public final void N() {
        this.J = true;
    }

    public final void P0() {
        boolean z10;
        int i10;
        Context context;
        D0();
        this.f11878i0.getClass();
        ke.a aVar = this.f11878i0;
        aVar.getClass();
        if (!aVar.I || !aVar.T) {
            z10 = false;
        } else {
            LocalMediaFolder localMediaFolder = new LocalMediaFolder();
            localMediaFolder.f8091a = -1;
            if (TextUtils.isEmpty(this.f11878i0.G)) {
                TitleBar titleBar = this.f9373q0;
                if (this.f11878i0.f12517a == 3) {
                    context = d0();
                    i10 = R$string.ps_all_audio;
                } else {
                    context = d0();
                    i10 = R$string.ps_camera_roll;
                }
                titleBar.setTitle(context.getString(i10));
            } else {
                this.f9373q0.setTitle(this.f11878i0.G);
            }
            localMediaFolder.f8092b = this.f9373q0.getTitleText();
            this.f11878i0.W = localMediaFolder;
            R0(localMediaFolder.f8091a);
            z10 = true;
        }
        this.f11877h0.d(new b(this, z10));
    }

    public final void Q0(ArrayList<LocalMedia> arrayList, boolean z10) {
        if (!j7.a.T(m())) {
            this.f9371o0.setEnabledLoadMore(z10);
            if (!this.f9371o0.T0 || arrayList.size() != 0) {
                U0(arrayList);
            } else {
                T0();
            }
        }
    }

    public final void R0(long j10) {
        this.f11876g0 = 1;
        this.f9371o0.setEnabledLoadMore(true);
        ke.a aVar = this.f11878i0;
        aVar.getClass();
        re.a aVar2 = this.f11877h0;
        int i10 = this.f11876g0;
        aVar2.e(j10, i10, i10 * aVar.H, new a());
    }

    public final void S0() {
        long j10;
        if (this.f9371o0.T0) {
            int i10 = this.f11876g0 + 1;
            this.f11876g0 = i10;
            ke.a aVar = this.f11878i0;
            LocalMediaFolder localMediaFolder = aVar.W;
            if (localMediaFolder != null) {
                j10 = localMediaFolder.f8091a;
            } else {
                j10 = 0;
            }
            this.f11877h0.e(j10, i10, aVar.H, new d());
        }
    }

    public final void T(Bundle bundle) {
        bundle.putInt("com.luck.picture.lib.all_folder_size", this.f9378v0);
        bundle.putInt("com.luck.picture.lib.current_page", this.f11876g0);
        bundle.putInt("com.luck.picture.lib.current_preview_position", this.f9371o0.getLastVisiblePosition());
        bundle.putBoolean("com.luck.picture.lib.display_camera", this.A0.f10203d);
        ke.a aVar = this.f11878i0;
        ArrayList t10 = this.B0.f13280e.t();
        aVar.Z.clear();
        aVar.Z.addAll(t10);
        ke.a aVar2 = this.f11878i0;
        ArrayList<LocalMedia> arrayList = this.A0.f10204e;
        if (arrayList != null) {
            aVar2.f12518a0.clear();
            aVar2.f12518a0.addAll(arrayList);
            return;
        }
        aVar2.getClass();
    }

    public final void T0() {
        if (this.f9381y0) {
            e0().postDelayed(new C0103c(), 350);
        } else {
            S0();
        }
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void U0(ArrayList<LocalMedia> arrayList) {
        long j10 = this.f11880k0;
        if (j10 > 50) {
            j10 -= 50;
        }
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 > 0) {
            e0().postDelayed(new b(arrayList), j10);
        } else {
            V0(arrayList);
        }
    }

    public final void V0(ArrayList<LocalMedia> arrayList) {
        boolean z10;
        this.f11880k0 = 0;
        this.f11878i0.U.b().getClass();
        fe.d dVar = this.A0;
        if (arrayList != null) {
            dVar.f10204e = arrayList;
            dVar.f();
        } else {
            dVar.getClass();
        }
        this.f11878i0.f12518a0.clear();
        this.f11878i0.Z.clear();
        if (this.f9379w0 > 0) {
            this.f9371o0.post(new d(this));
        }
        if (this.A0.f10204e.size() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            W0();
        } else if (this.f9372p0.getVisibility() == 0) {
            this.f9372p0.setVisibility(8);
        }
    }

    public final void W(View view, Bundle bundle) {
        boolean z10;
        re.a aVar;
        super.W(view, bundle);
        if (bundle != null) {
            this.f9378v0 = bundle.getInt("com.luck.picture.lib.all_folder_size");
            this.f11876g0 = bundle.getInt("com.luck.picture.lib.current_page", this.f11876g0);
            this.f9379w0 = bundle.getInt("com.luck.picture.lib.current_preview_position", this.f9379w0);
            this.f9382z0 = bundle.getBoolean("com.luck.picture.lib.display_camera", this.f11878i0.f12532o);
        } else {
            this.f9382z0 = this.f11878i0.f12532o;
        }
        if (bundle != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9381y0 = z10;
        this.f9372p0 = (TextView) view.findViewById(R$id.tv_data_empty);
        this.f9375s0 = (CompleteSelectView) view.findViewById(R$id.ps_complete_select);
        this.f9373q0 = (TitleBar) view.findViewById(R$id.title_bar);
        this.f9374r0 = (BottomNavBar) view.findViewById(R$id.bottom_nar_bar);
        this.f9376t0 = (TextView) view.findViewById(R$id.tv_current_data_time);
        ke.a aVar2 = this.f11878i0;
        aVar2.getClass();
        if (aVar2.I) {
            aVar = new re.d(p0(), this.f11878i0);
        } else {
            aVar = new re.c(p0(), this.f11878i0);
        }
        this.f11877h0 = aVar;
        me.c cVar = new me.c(r(), this.f11878i0);
        this.B0 = cVar;
        cVar.f13282g = new i(this);
        cVar.f13280e.f10198f = new f(this);
        this.f11878i0.U.c().getClass();
        this.f9373q0.setTitleBarStyle();
        this.f9373q0.setOnTitleBarListener(new h(this));
        int i10 = this.f11878i0.f12524g;
        this.f9375s0.setCompleteSelectViewStyle();
        this.f9375s0.setSelectedChange(false);
        this.f11878i0.U.b().getClass();
        this.f9375s0.setOnClickListener(new g(this));
        this.f9371o0 = (RecyclerPreloadView) view.findViewById(R$id.recycler);
        this.f11878i0.U.b().getClass();
        this.f9371o0.setBackgroundColor(k1.a.getColor(p0(), R$color.ps_color_black));
        int i11 = this.f11878i0.f12529l;
        if (i11 <= 0) {
            i11 = 4;
        }
        if (this.f9371o0.getItemDecorationCount() == 0) {
            this.f9371o0.i(new le.a(i11, xe.c.a(view.getContext(), 1.0f)));
        }
        RecyclerPreloadView recyclerPreloadView = this.f9371o0;
        r();
        recyclerPreloadView.setLayoutManager(new GridLayoutManager(i11));
        RecyclerView.j itemAnimator = this.f9371o0.getItemAnimator();
        if (itemAnimator != null) {
            ((w) itemAnimator).f3302g = false;
            this.f9371o0.setItemAnimator((RecyclerView.j) null);
        }
        if (this.f11878i0.I) {
            this.f9371o0.setReachBottomRow(2);
            this.f9371o0.setOnRecyclerViewPreloadListener(this);
        } else {
            this.f9371o0.setHasFixedSize(true);
        }
        fe.d dVar = new fe.d(r(), this.f11878i0);
        this.A0 = dVar;
        dVar.f10203d = this.f9382z0;
        int i12 = this.f11878i0.J;
        if (i12 == 1) {
            this.f9371o0.setAdapter(new he.a(dVar));
        } else if (i12 != 2) {
            this.f9371o0.setAdapter(dVar);
        } else {
            this.f9371o0.setAdapter(new he.c(dVar));
        }
        this.A0.f10206n = new e(this);
        this.f9371o0.setOnRecyclerViewScrollStateListener(new f(this));
        this.f9371o0.setOnRecyclerViewScrollListener(new f(this));
        this.f11878i0.getClass();
        this.f9374r0.setBottomNavBarStyle();
        this.f9374r0.setOnBottomNavBarListener(new l(this));
        this.f9374r0.setSelectedChange();
        if (this.f9381y0) {
            this.A0.f10203d = this.f9382z0;
            this.f11880k0 = 0;
            this.f11878i0.getClass();
            ArrayList arrayList = new ArrayList(this.f11878i0.Z);
            if (!j7.a.T(m())) {
                if (arrayList.size() > 0) {
                    LocalMediaFolder localMediaFolder = this.f11878i0.W;
                    if (localMediaFolder == null) {
                        localMediaFolder = (LocalMediaFolder) arrayList.get(0);
                        this.f11878i0.W = localMediaFolder;
                    }
                    this.f9373q0.setTitle(localMediaFolder.d());
                    this.B0.b(arrayList);
                    if (this.f11878i0.I) {
                        Q0(new ArrayList(this.f11878i0.f12518a0), true);
                    } else {
                        U0(localMediaFolder.a());
                    }
                } else {
                    W0();
                }
            }
        } else {
            this.A0.f10203d = this.f9382z0;
            if (te.a.c(r(), this.f11878i0.f12517a)) {
                P0();
                return;
            }
            String[] a10 = te.b.a(p0(), this.f11878i0.f12517a);
            D0();
            this.f11878i0.getClass();
            te.a b10 = te.a.b();
            j jVar = new j(this, a10);
            b10.getClass();
            te.a.d(this, a10, jVar);
        }
    }

    public final void W0() {
        int i10;
        LocalMediaFolder localMediaFolder = this.f11878i0.W;
        if (localMediaFolder == null || localMediaFolder.f8091a == -1) {
            if (this.f9372p0.getVisibility() == 8) {
                this.f9372p0.setVisibility(0);
            }
            this.f9372p0.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R$drawable.ps_ic_no_data, 0, 0);
            if (this.f11878i0.f12517a == 3) {
                i10 = R$string.ps_audio_empty;
            } else {
                i10 = R$string.ps_empty;
            }
            this.f9372p0.setText(x(i10));
        }
    }

    public final void m0(LocalMedia localMedia) {
        int i10;
        boolean z10;
        LocalMediaFolder localMediaFolder;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13;
        int i13;
        int i14;
        String str;
        int i15;
        int i16;
        me.c cVar = this.B0;
        if (cVar.f13280e.t().size() > 0) {
            i10 = cVar.c().f8095e;
        } else {
            i10 = 0;
        }
        if (i10 != 0 && (i16 = this.f9378v0) > 0 && i16 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.A0.f10204e.add(0, localMedia);
            this.f9380x0 = true;
        }
        int i17 = this.f11878i0.f12524g;
        l0(localMedia, false);
        this.A0.f3034a.d(this.f11878i0.f12532o ? 1 : 0, 1);
        fe.d dVar = this.A0;
        dVar.f3034a.c(this.f11878i0.f12532o ? 1 : 0, dVar.f10204e.size());
        this.f11878i0.getClass();
        ArrayList t10 = this.B0.f13280e.t();
        if (this.B0.f13280e.t().size() == 0) {
            localMediaFolder = new LocalMediaFolder();
            if (TextUtils.isEmpty(this.f11878i0.G)) {
                if (this.f11878i0.f12517a == 3) {
                    i15 = R$string.ps_all_audio;
                } else {
                    i15 = R$string.ps_camera_roll;
                }
                str = x(i15);
            } else {
                str = this.f11878i0.G;
            }
            localMediaFolder.f8092b = str;
            localMediaFolder.f8093c = "";
            localMediaFolder.f8091a = -1;
            t10.add(0, localMediaFolder);
        } else {
            localMediaFolder = this.B0.c();
        }
        localMediaFolder.f8093c = localMedia.f8073b;
        localMediaFolder.f8094d = localMedia.f8086v;
        localMediaFolder.f8097n = this.A0.f10204e;
        localMediaFolder.f8091a = -1;
        int i18 = localMediaFolder.f8095e;
        if (i18 != 0 && (i14 = this.f9378v0) > 0 && i14 < i18) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            i18++;
        }
        localMediaFolder.f8095e = i18;
        ke.a aVar = this.f11878i0;
        LocalMediaFolder localMediaFolder2 = aVar.W;
        if (localMediaFolder2 == null || localMediaFolder2.f8095e == 0) {
            aVar.W = localMediaFolder;
        }
        LocalMediaFolder localMediaFolder3 = null;
        int i19 = 0;
        while (true) {
            if (i19 >= t10.size()) {
                break;
            }
            LocalMediaFolder localMediaFolder4 = (LocalMediaFolder) t10.get(i19);
            if (TextUtils.equals(localMediaFolder4.d(), localMedia.J)) {
                localMediaFolder3 = localMediaFolder4;
                break;
            }
            i19++;
        }
        if (localMediaFolder3 == null) {
            localMediaFolder3 = new LocalMediaFolder();
            t10.add(localMediaFolder3);
        }
        localMediaFolder3.f8092b = localMedia.J;
        long j10 = localMediaFolder3.f8091a;
        if (j10 == -1 || j10 == 0) {
            localMediaFolder3.f8091a = localMedia.K;
        }
        ke.a aVar2 = this.f11878i0;
        if (aVar2.I) {
            localMediaFolder3.f8099p = true;
        } else {
            int i20 = localMediaFolder.f8095e;
            if (i20 != 0 && (i13 = this.f9378v0) > 0 && i13 < i20) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13 || !TextUtils.isEmpty(aVar2.B) || !TextUtils.isEmpty(this.f11878i0.C)) {
                localMediaFolder3.a().add(0, localMedia);
            }
        }
        int i21 = localMediaFolder.f8095e;
        if (i21 != 0 && (i12 = this.f9378v0) > 0 && i12 < i21) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            i11 = localMediaFolder3.f8095e;
        } else {
            i11 = 1 + localMediaFolder3.f8095e;
        }
        localMediaFolder3.f8095e = i11;
        localMediaFolder3.f8093c = this.f11878i0.E;
        localMediaFolder3.f8094d = localMedia.f8086v;
        this.B0.b(t10);
        this.f9378v0 = 0;
        if (this.A0.f10204e.size() <= 0) {
            this.f11878i0.getClass();
            W0();
        } else if (this.f9372p0.getVisibility() == 0) {
            this.f9372p0.setVisibility(8);
        }
    }

    public final int q0() {
        int J = j7.a.J(r(), 1, this.f11878i0);
        if (J != 0) {
            return J;
        }
        return R$layout.ps_fragment_selector;
    }

    public final void t0(String[] strArr) {
        boolean z10;
        if (strArr != null) {
            D0();
            if (strArr.length <= 0 || !TextUtils.equals(strArr[0], te.b.f15024b[0])) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.f11878i0.getClass();
            if (te.a.a(r(), strArr)) {
                if (z10) {
                    G0();
                } else {
                    P0();
                }
            } else if (z10) {
                k.a(r(), x(R$string.ps_camera));
            } else {
                k.a(r(), x(R$string.ps_jurisdiction));
                C0();
            }
            te.b.f15023a = new String[0];
        }
    }

    public final void w0() {
        this.f9374r0.setOriginalCheck();
    }
}

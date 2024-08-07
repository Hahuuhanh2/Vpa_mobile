package jf;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.c;
import com.google.android.material.search.h;
import com.ots.core.R$layout;
import com.ots.core.utils.commom.PickerLayoutManager;
import d2.f;
import ek.g;
import ek.i;
import hf.t;
import hf.x;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import rk.l;
import sk.j;

/* compiled from: TimeDialog.kt */
public final class d extends c implements PickerLayoutManager.a {
    public static final /* synthetic */ int J0 = 0;
    public PickerLayoutManager A0;
    public final Calendar B0 = Calendar.getInstance();
    public final Calendar C0 = Calendar.getInstance();
    public Context D0;
    public final g E0;
    public final g F0;
    public final g G0;
    public ArrayList<String> H0;
    public a I0;

    /* renamed from: u0  reason: collision with root package name */
    public final int f11890u0;

    /* renamed from: v0  reason: collision with root package name */
    public final int f11891v0;

    /* renamed from: w0  reason: collision with root package name */
    public final String f11892w0;

    /* renamed from: x0  reason: collision with root package name */
    public x f11893x0;

    /* renamed from: y0  reason: collision with root package name */
    public PickerLayoutManager f11894y0;

    /* renamed from: z0  reason: collision with root package name */
    public PickerLayoutManager f11895z0;

    /* compiled from: TimeDialog.kt */
    public interface a {
        void a(d dVar, Calendar calendar);
    }

    /* compiled from: TimeDialog.kt */
    public static final class b extends ef.d<String, t> {

        /* renamed from: p  reason: collision with root package name */
        public final l<String, i> f11896p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(l<? super String, i> lVar) {
            super(lVar);
            j.f(lVar, "listener");
            this.f11896p = lVar;
        }

        public final void u(d2.l lVar, int i10, Serializable serializable) {
            t tVar = (t) lVar;
            String str = (String) serializable;
            j.f(tVar, "binding");
            j.f(str, "model");
            tVar.f10813w.setText(str);
        }

        public final int x() {
            return R$layout.picker_item;
        }
    }

    public d(Context context, int i10, int i11, String str) {
        Calendar.getInstance(Locale.getDefault()).get(1);
        Calendar.getInstance(Locale.getDefault()).get(1);
        j.f(context, "context");
        j.f(str, "inputYear");
        this.f11890u0 = i10;
        this.f11891v0 = i11;
        this.f11892w0 = str;
        LayoutInflater from = LayoutInflater.from(context);
        int i12 = x.B;
        DataBinderMapperImpl dataBinderMapperImpl = f.f8544a;
        x xVar = (x) d2.l.l(from, R$layout.time_dialog, (ViewGroup) null, (Object) null);
        j.e(xVar, "inflate(...)");
        this.f11893x0 = xVar;
        this.D0 = context;
        this.E0 = j7.a.b0(f.f11898a);
        this.F0 = j7.a.b0(h.f11900a);
        this.G0 = j7.a.b0(j.f11902a);
        this.H0 = new ArrayList<>();
        this.f2625k0 = true;
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            dialog.setCancelable(true);
        }
    }

    public static ArrayList p0() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH", Locale.getDefault());
        for (int i10 = 0; i10 < 24; i10++) {
            arrayList.add(simpleDateFormat.format(instance.getTime()));
            instance.add(11, 1);
        }
        return arrayList;
    }

    public static ArrayList r0() {
        Calendar instance = Calendar.getInstance();
        instance.set(12, 0);
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm", Locale.getDefault());
        for (int i10 = 0; i10 < 60; i10++) {
            arrayList.add(simpleDateFormat.format(instance.getTime()));
            instance.add(12, 1);
        }
        return arrayList;
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        LayoutInflater layoutInflater2 = this.Q;
        if (layoutInflater2 == null) {
            layoutInflater2 = P((Bundle) null);
            this.Q = layoutInflater2;
        }
        int i10 = x.B;
        DataBinderMapperImpl dataBinderMapperImpl = f.f8544a;
        x xVar = (x) d2.l.l(layoutInflater2, R$layout.time_dialog, viewGroup, (Object) null);
        j.e(xVar, "inflate(...)");
        this.f11893x0 = xVar;
        return xVar.f8554e;
    }

    public final void W(View view, Bundle bundle) {
        j.f(view, "view");
        ViewParent parent = this.f11893x0.f8554e.getParent();
        j.d(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior C = BottomSheetBehavior.C((View) parent);
        j.e(C, "from(...)");
        C.K(4);
        int i10 = 0;
        C.I(false);
        C.R = false;
        Calendar calendar = this.B0;
        j.c(calendar);
        ArrayList arrayList = new ArrayList();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        for (int i11 = 0; i11 < 365; i11++) {
            arrayList.add(simpleDateFormat.format(calendar.getTime()));
            calendar.add(6, -1);
        }
        ArrayList p02 = p0();
        this.H0 = r0();
        s0().A(arrayList);
        u0().A(p02);
        w0().A(this.H0);
        j.f(this.D0, "context");
        PickerLayoutManager pickerLayoutManager = new PickerLayoutManager(1, 3, 0.6f, true);
        pickerLayoutManager.R = null;
        this.f11894y0 = pickerLayoutManager;
        j.f(this.D0, "context");
        PickerLayoutManager pickerLayoutManager2 = new PickerLayoutManager(1, 3, 0.6f, true);
        pickerLayoutManager2.R = null;
        this.f11895z0 = pickerLayoutManager2;
        j.f(this.D0, "context");
        PickerLayoutManager pickerLayoutManager3 = new PickerLayoutManager(1, 3, 0.6f, true);
        pickerLayoutManager3.R = null;
        this.A0 = pickerLayoutManager3;
        t0().R = this;
        v0().R = this;
        this.f11893x0.f10820x.setLayoutManager(v0());
        this.f11893x0.A.setLayoutManager(t0());
        this.f11893x0.f10819w.setLayoutManager(x0());
        this.f11893x0.A.setAdapter(s0());
        this.f11893x0.f10820x.setAdapter(u0());
        this.f11893x0.f10819w.setAdapter(w0());
        String str = this.f11892w0;
        new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        for (T next : s0().f9444f) {
            int i12 = i10 + 1;
            if (i10 >= 0) {
                if (j.a((String) next, str)) {
                    this.f11893x0.A.k0(i10);
                    PickerLayoutManager.a aVar = t0().R;
                    if (aVar != null) {
                        RecyclerView recyclerView = this.f11893x0.A;
                        j.e(recyclerView, "yearView");
                        aVar.i(i10, recyclerView);
                    }
                }
                i10 = i12;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        y0(this.f11891v0);
        z0(this.f11890u0);
        this.f11893x0.f10822z.setOnClickListener(new h(this, 4));
        this.f11893x0.f10821y.setOnClickListener(new com.google.android.material.textfield.b(this, 7));
    }

    public final void i(int i10, RecyclerView recyclerView) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        if (j.a(recyclerView, this.f11893x0.A)) {
            if (j.a(s0().w(i10), simpleDateFormat.format(this.C0.getTime()))) {
                int w12 = v0().w1();
                int w13 = x0().w1();
                b u02 = u0();
                ArrayList arrayList = new ArrayList();
                int i11 = this.B0.get(11);
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < 10) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append('0');
                            sb2.append(i12);
                            arrayList.add(sb2.toString());
                        } else {
                            arrayList.add(String.valueOf(i12));
                        }
                        if (i12 == i11) {
                            break;
                        }
                        i12++;
                    }
                }
                u02.A(arrayList);
                w0().A(q0());
                y0(w12);
                z0(w13);
                return;
            }
            u0().A(p0());
            w0().A(r0());
        } else if (j.a(recyclerView, this.f11893x0.f10820x)) {
            int w14 = x0().w1();
            if (!j.a(s0().w(t0().w1()), simpleDateFormat.format(this.C0.getTime())) || Integer.parseInt((String) u0().w(i10)) != this.C0.get(11)) {
                w0().A(r0());
                return;
            }
            w0().A(q0());
            z0(w14);
        }
    }

    public final ArrayList<String> q0() {
        ArrayList<String> arrayList = new ArrayList<>();
        int i10 = this.B0.get(12);
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                if (i11 < 10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('0');
                    sb2.append(i11);
                    arrayList.add(sb2.toString());
                } else {
                    arrayList.add(String.valueOf(i11));
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        return arrayList;
    }

    public final b s0() {
        return (b) this.E0.getValue();
    }

    public final PickerLayoutManager t0() {
        PickerLayoutManager pickerLayoutManager = this.f11894y0;
        if (pickerLayoutManager != null) {
            return pickerLayoutManager;
        }
        j.l("dateManager");
        throw null;
    }

    public final b u0() {
        return (b) this.F0.getValue();
    }

    public final PickerLayoutManager v0() {
        PickerLayoutManager pickerLayoutManager = this.f11895z0;
        if (pickerLayoutManager != null) {
            return pickerLayoutManager;
        }
        j.l("hoursManager");
        throw null;
    }

    public final b w0() {
        return (b) this.G0.getValue();
    }

    public final PickerLayoutManager x0() {
        PickerLayoutManager pickerLayoutManager = this.A0;
        if (pickerLayoutManager != null) {
            return pickerLayoutManager;
        }
        j.l("minuteManager");
        throw null;
    }

    public final void y0(int i10) {
        if (i10 > u0().v() - 1) {
            this.f11893x0.f10820x.k0(u0().v() - 1);
            PickerLayoutManager.a aVar = v0().R;
            if (aVar != null) {
                RecyclerView recyclerView = this.f11893x0.f10820x;
                j.e(recyclerView, "monthView");
                aVar.i(u0().v() - 1, recyclerView);
                return;
            }
            return;
        }
        this.f11893x0.f10820x.k0(i10);
        PickerLayoutManager.a aVar2 = v0().R;
        if (aVar2 != null) {
            RecyclerView recyclerView2 = this.f11893x0.f10820x;
            j.e(recyclerView2, "monthView");
            aVar2.i(i10, recyclerView2);
        }
    }

    public final void z0(int i10) {
        if (i10 > w0().v() - 1) {
            this.f11893x0.f10819w.k0(w0().v() - 1);
            PickerLayoutManager.a aVar = x0().R;
            if (aVar != null) {
                RecyclerView recyclerView = this.f11893x0.f10819w;
                j.e(recyclerView, "dayView");
                aVar.i(w0().v() - 1, recyclerView);
                return;
            }
            return;
        }
        this.f11893x0.f10819w.k0(i10);
        PickerLayoutManager.a aVar2 = x0().R;
        if (aVar2 != null) {
            RecyclerView recyclerView2 = this.f11893x0.f10819w;
            j.e(recyclerView2, "dayView");
            aVar2.i(i10, recyclerView2);
        }
    }
}

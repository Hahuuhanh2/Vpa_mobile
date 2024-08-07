package com.swnishan.materialdatetimepicker.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.swnishan.materialdatetimepicker.R$attr;
import com.swnishan.materialdatetimepicker.R$color;
import com.swnishan.materialdatetimepicker.R$dimen;
import com.swnishan.materialdatetimepicker.R$id;
import com.swnishan.materialdatetimepicker.R$layout;
import com.swnishan.materialdatetimepicker.R$style;
import com.swnishan.materialdatetimepicker.R$styleable;
import com.swnishan.materialdatetimepicker.common.LowFlingRecyclerView;
import com.swnishan.materialdatetimepicker.common.MaterialDateTimePickerException;
import com.swnishan.materialdatetimepicker.common.SlowLinearLayoutManager;
import com.swnishan.materialdatetimepicker.common.view.BaseMaterialDateTimePickerView;
import ek.i;
import f0.b0;
import hg.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import nl.a;
import nl.f;
import p3.l0;
import rk.l;
import sk.j;
import sk.k;
import vk.g;
import vk.h;

/* compiled from: MaterialDatePickerView.kt */
public final class MaterialDatePickerView extends BaseMaterialDateTimePickerView {
    public static final /* synthetic */ int P = 0;
    public a B;
    public int C;
    public nl.e D;
    public h E;
    public ArrayList F;
    public ArrayList G;
    public ArrayList H;
    public final fg.a I;
    public final fg.a J;
    public final fg.a K;
    public final m L;
    public final m M;
    public final m N;
    public HashMap O;

    /* compiled from: MaterialDatePickerView.kt */
    public enum a {
        DD_MMM_YYYY
    }

    /* compiled from: MaterialDatePickerView.kt */
    public interface b {
    }

    /* compiled from: MaterialDatePickerView.kt */
    public static final class c extends k implements l<Integer, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MaterialDatePickerView f19347a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(MaterialDatePickerView materialDatePickerView) {
            super(1);
            this.f19347a = materialDatePickerView;
        }

        public final Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) this.f19347a.v(R$id.rvDays);
            j.e(lowFlingRecyclerView, "rvDays");
            lowFlingRecyclerView.n0(intValue);
            return i.f20112a;
        }
    }

    /* compiled from: MaterialDatePickerView.kt */
    public static final class d extends k implements l<Integer, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MaterialDatePickerView f19348a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(MaterialDatePickerView materialDatePickerView) {
            super(1);
            this.f19348a = materialDatePickerView;
        }

        public final Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) this.f19348a.v(R$id.rvMonths);
            j.e(lowFlingRecyclerView, "rvMonths");
            lowFlingRecyclerView.n0(intValue);
            return i.f20112a;
        }
    }

    /* compiled from: MaterialDatePickerView.kt */
    public static final class e extends k implements l<Integer, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MaterialDatePickerView f19349a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(MaterialDatePickerView materialDatePickerView) {
            super(1);
            this.f19349a = materialDatePickerView;
        }

        public final Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) this.f19349a.v(R$id.rvYears);
            j.e(lowFlingRecyclerView, "rvYears");
            lowFlingRecyclerView.n0(intValue);
            return i.f20112a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MaterialDatePickerView(Context context) {
        this(context, (AttributeSet) null);
        j.f(context, "context");
    }

    public static final void w(MaterialDatePickerView materialDatePickerView, int i10) {
        if (i10 == R$id.rvYears) {
            nl.e R = materialDatePickerView.D.R(materialDatePickerView.getYear());
            materialDatePickerView.D = R;
            if (nl.h.v(R.f21755b).u(materialDatePickerView.D.isLeapYear()) != materialDatePickerView.H.size()) {
                materialDatePickerView.B();
                materialDatePickerView.y();
            }
        } else if (i10 == R$id.rvMonths) {
            nl.e Q = materialDatePickerView.D.Q(materialDatePickerView.getMonth());
            materialDatePickerView.D = Q;
            if (nl.h.v(Q.f21755b).u(materialDatePickerView.D.isLeapYear()) != materialDatePickerView.H.size()) {
                materialDatePickerView.B();
                materialDatePickerView.y();
            }
        } else if (i10 == R$id.rvDays) {
            materialDatePickerView.D = materialDatePickerView.D.O(materialDatePickerView.getDayOfMonth());
        } else {
            materialDatePickerView.getClass();
        }
    }

    public final void A() {
        Object obj;
        boolean z10;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(R$id.rvYears);
        fg.a aVar = this.I;
        ArrayList arrayList = this.F;
        int i10 = this.D.f21754a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.c) obj).f20511c == i10) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        a.c cVar = (a.c) obj;
        if (cVar != null) {
            lowFlingRecyclerView.k0(BaseMaterialDateTimePickerView.s(aVar, arrayList, cVar));
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Cannot find given Year in given years range (size: ");
        q10.append(this.F.size());
        q10.append(" index: ");
        q10.append(i10);
        q10.append(')');
        throw new MaterialDateTimePickerException(q10.toString());
    }

    public final void B() {
        h hVar = new h(1, nl.h.v(this.D.f21755b).u(this.D.isLeapYear()));
        ArrayList arrayList = new ArrayList(fk.j.H0(hVar));
        g m10 = hVar.iterator();
        int i10 = 0;
        while (m10.f23340c) {
            int nextInt = m10.nextInt();
            int i11 = i10 + 1;
            if (i10 >= 0) {
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(nextInt)}, 1));
                j.e(format, "java.lang.String.format(format, *args)");
                arrayList.add(new a.C0287a(i10, nextInt, format));
                i10 = i11;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        this.H = arrayList;
        fg.a aVar = this.K;
        aVar.getClass();
        aVar.f20161d = arrayList;
        aVar.f();
    }

    public final void C() {
        h hVar = new h(1, 12);
        ArrayList arrayList = new ArrayList(fk.j.H0(hVar));
        g m10 = hVar.iterator();
        int i10 = 0;
        while (m10.f23340c) {
            int nextInt = m10.nextInt();
            int i11 = i10 + 1;
            if (i10 >= 0) {
                arrayList.add(new a.b(i10, nextInt, x(nextInt)));
                i10 = i11;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        this.G = arrayList;
        fg.a aVar = this.J;
        aVar.getClass();
        aVar.f20161d = arrayList;
        aVar.f();
    }

    public final long getDate() {
        nl.e eVar = this.D;
        j.f(eVar, "$this$toLong");
        int i10 = eVar.f21754a;
        short s10 = eVar.f21755b;
        short s11 = eVar.f21756c;
        f fVar = f.f21757c;
        nl.e F2 = nl.e.F(i10, s10, s11);
        nl.g gVar = nl.g.f21761e;
        rl.a.HOUR_OF_DAY.m((long) 0);
        nl.m D2 = nl.m.D(new f(F2, nl.g.f21763n[0]), nl.j.t(), (nl.k) null);
        return nl.d.u(D2.toEpochSecond(), (long) D2.f21784a.f21760b.f21767d).x();
    }

    public final int getDayOfMonth() {
        m mVar = this.N;
        int i10 = R$id.rvDays;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(i10);
        j.e(lowFlingRecyclerView, "rvDays");
        View d10 = mVar.d(lowFlingRecyclerView.getLayoutManager());
        if (d10 == null) {
            return 0;
        }
        ArrayList arrayList = this.H;
        ((LowFlingRecyclerView) v(i10)).getClass();
        return ((a.C0287a) arrayList.get(RecyclerView.M(d10) % this.H.size())).f20505c;
    }

    public final int getMonth() {
        m mVar = this.M;
        int i10 = R$id.rvMonths;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(i10);
        j.e(lowFlingRecyclerView, "rvMonths");
        View d10 = mVar.d(lowFlingRecyclerView.getLayoutManager());
        if (d10 == null) {
            return 0;
        }
        ArrayList arrayList = this.G;
        ((LowFlingRecyclerView) v(i10)).getClass();
        return ((a.b) arrayList.get(RecyclerView.M(d10) % this.G.size())).f20508c;
    }

    public final int getYear() {
        m mVar = this.L;
        int i10 = R$id.rvYears;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(i10);
        j.e(lowFlingRecyclerView, "rvYears");
        View d10 = mVar.d(lowFlingRecyclerView.getLayoutManager());
        if (d10 == null) {
            return 0;
        }
        ArrayList arrayList = this.F;
        ((LowFlingRecyclerView) v(i10)).getClass();
        return ((a.c) arrayList.get(RecyclerView.M(d10) % this.F.size())).f20511c;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.D = this.D.R(savedState.f19342a).Q(savedState.f19343b).O(savedState.f19344c);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return onSaveInstanceState;
        }
        SavedState savedState = new SavedState(onSaveInstanceState);
        nl.e eVar = this.D;
        savedState.f19342a = eVar.f21754a;
        savedState.f19343b = eVar.f21755b;
        savedState.f19344c = eVar.f21756c;
        return savedState;
    }

    public final void r(RecyclerView recyclerView, long j10, float f10) {
        j.f(recyclerView, "view");
        int id2 = recyclerView.getId();
        if (id2 == R$id.rvYears) {
            BaseMaterialDateTimePickerView.u(j7.a.d0(v(R$id.viewTopShadeYear), v(R$id.viewBottomShadeYear)), j10, f10);
        } else if (id2 == R$id.rvMonths) {
            BaseMaterialDateTimePickerView.u(j7.a.d0(v(R$id.viewTopShadeMonth), v(R$id.viewBottomShadeMonth)), j10, f10);
        } else if (id2 == R$id.rvDays) {
            BaseMaterialDateTimePickerView.u(j7.a.d0(v(R$id.viewTopShadeTimeDay), v(R$id.viewBottomShadeTimeDay)), j10, f10);
        }
    }

    public final void setDate(long j10) {
        nl.d dVar = nl.d.f21749c;
        long j11 = (long) 1000;
        nl.d s10 = nl.d.s(((int) (((j10 % j11) + j11) % j11)) * 1000000, l0.T(j10, 1000));
        nl.j t10 = nl.j.t();
        s10.getClass();
        l0.y0(t10, "zone");
        nl.e eVar = nl.m.C(s10.f21750a, s10.f21751b, t10).f21784a.f21759a;
        j.e(eVar, "Instant.ofEpochMilli(thi…mDefault()).toLocalDate()");
        this.D = eVar;
        A();
        z();
        y();
    }

    public final void setDateFormat(a aVar) {
        j.f(aVar, "dateFormat");
        this.B = aVar;
        C();
    }

    public final void setOnTimePickedListener(b bVar) {
    }

    public final View v(int i10) {
        if (this.O == null) {
            this.O = new HashMap();
        }
        View view = (View) this.O.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        this.O.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    public final String x(int i10) {
        int ordinal = this.B.ordinal();
        if (ordinal == 0) {
            String t10 = nl.h.v(i10).t(pl.j.FULL, Locale.getDefault());
            j.e(t10, "Month.of(month).getDispl…ULL, Locale.getDefault())");
            return t10;
        } else if (ordinal == 1) {
            String t11 = nl.h.v(i10).t(pl.j.SHORT, Locale.getDefault());
            j.e(t11, "Month.of(month).getDispl…ORT, Locale.getDefault())");
            return t11;
        } else if (ordinal == 2) {
            String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            j.e(format, "java.lang.String.format(format, *args)");
            return format;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void y() {
        Object obj;
        boolean z10;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(R$id.rvDays);
        fg.a aVar = this.K;
        ArrayList arrayList = this.H;
        short s10 = this.D.f21756c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.C0287a) obj).f20505c == s10) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        a.C0287a aVar2 = (a.C0287a) obj;
        if (aVar2 != null) {
            lowFlingRecyclerView.k0(BaseMaterialDateTimePickerView.s(aVar, arrayList, aVar2));
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Cannot find given Day in given days range (size: ");
        q10.append(this.H.size());
        q10.append(" index: ");
        q10.append(s10);
        q10.append(')');
        throw new MaterialDateTimePickerException(q10.toString());
    }

    public final void z() {
        Object obj;
        boolean z10;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(R$id.rvMonths);
        fg.a aVar = this.J;
        ArrayList arrayList = this.G;
        short s10 = this.D.f21755b;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.b) obj).f20508c == s10) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        a.b bVar = (a.b) obj;
        if (bVar != null) {
            lowFlingRecyclerView.k0(BaseMaterialDateTimePickerView.s(aVar, arrayList, bVar));
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Cannot find given Month in given months range (size: ");
        q10.append(this.G.size());
        q10.append(" index: ");
        q10.append(s10);
        q10.append(')');
        throw new MaterialDateTimePickerException(q10.toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MaterialDatePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialDatePickerViewStyle);
        j.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialDatePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        j.f(context, "context");
        View.inflate(getContext(), R$layout.view_date_picker, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1));
        Context context2 = getContext();
        j.e(context2, "context");
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R$dimen.time_picker_view_padding_top);
        Context context3 = getContext();
        j.e(context3, "context");
        setPadding(0, dimensionPixelSize, 0, context3.getResources().getDimensionPixelSize(R$dimen.time_picker_view_padding_bottom));
        this.B = a.DD_MMM_YYYY;
        this.C = R$style.TextAppearance_MaterialDatePicker;
        nl.e eVar = nl.e.f21752d;
        a.C0293a aVar = new a.C0293a(nl.j.t());
        long currentTimeMillis = System.currentTimeMillis();
        nl.d dVar = nl.d.f21749c;
        long j10 = (long) 1000;
        nl.d s10 = nl.d.s(((int) (((currentTimeMillis % j10) + j10) % j10)) * 1000000, l0.T(currentTimeMillis, 1000));
        this.D = nl.e.G(l0.T(s10.f21750a + ((long) aVar.f21741a.s().a(s10).f21779b), 86400));
        h hVar = new h(1950, 2100);
        this.E = hVar;
        ArrayList arrayList = new ArrayList(fk.j.H0(hVar));
        g m10 = hVar.iterator();
        int i12 = 0;
        while (m10.f23340c) {
            int nextInt = m10.nextInt();
            int i13 = i12 + 1;
            if (i12 >= 0) {
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(nextInt)}, 1));
                j.e(format, "java.lang.String.format(format, *args)");
                arrayList.add(new a.c(i12, nextInt, format));
                i12 = i13;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        this.F = arrayList;
        h hVar2 = new h(1, 12);
        ArrayList arrayList2 = new ArrayList(fk.j.H0(hVar2));
        g m11 = hVar2.iterator();
        int i14 = 0;
        while (m11.f23340c) {
            int nextInt2 = m11.nextInt();
            int i15 = i14 + 1;
            if (i14 >= 0) {
                arrayList2.add(new a.b(i14, nextInt2, x(nextInt2)));
                i14 = i15;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        this.G = arrayList2;
        h hVar3 = new h(1, 31);
        ArrayList arrayList3 = new ArrayList(fk.j.H0(hVar3));
        g m12 = hVar3.iterator();
        int i16 = 0;
        while (m12.f23340c) {
            int nextInt3 = m12.nextInt();
            int i17 = i16 + 1;
            if (i16 >= 0) {
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(nextInt3)}, 1));
                j.e(format2, "java.lang.String.format(format, *args)");
                arrayList3.add(new a.C0287a(i16, nextInt3, format2));
                i16 = i17;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        this.H = arrayList3;
        fg.a aVar2 = new fg.a(this.F, this.C, 1, new e(this));
        this.I = aVar2;
        fg.a aVar3 = new fg.a(this.G, this.C, 1, new d(this));
        this.J = aVar3;
        fg.a aVar4 = new fg.a(this.H, this.C, 1, new c(this));
        this.K = aVar4;
        m mVar = new m();
        this.L = mVar;
        m mVar2 = new m();
        this.M = mVar2;
        m mVar3 = new m();
        this.N = mVar3;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MaterialDatePickerView, i10, R$style.Widget_MaterialDatePicker);
        int color = obtainStyledAttributes.getColor(R$styleable.MaterialDatePickerView_highlighterColor, k1.a.getColor(getContext(), R$color.O100));
        float dimension = obtainStyledAttributes.getDimension(R$styleable.MaterialDatePickerView_highlighterHeight, 50.0f);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.MaterialTimePickerView_android_background);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MaterialDatePickerView_android_textAppearance, R$style.TextAppearance_MaterialTimePicker);
        this.C = resourceId;
        aVar2.f20162e = resourceId;
        aVar2.f();
        aVar3.f20162e = this.C;
        aVar3.f();
        aVar4.f20162e = this.C;
        aVar4.f();
        this.B = a.values()[obtainStyledAttributes.getInt(R$styleable.MaterialDatePickerView_dateFormat, 0)];
        setFadeInDuration$materialdatetimepicker_release((long) obtainStyledAttributes.getInt(R$styleable.MaterialDatePickerView_fadeInDuration, (int) getFadeInDuration$materialdatetimepicker_release()));
        setFadeOutDuration$materialdatetimepicker_release((long) obtainStyledAttributes.getInt(R$styleable.MaterialDatePickerView_fadeOutDuration, (int) getFadeOutDuration$materialdatetimepicker_release()));
        float f10 = obtainStyledAttributes.getFloat(R$styleable.MaterialDatePickerView_fadeInAlpha, getFadeInAlpha$materialdatetimepicker_release());
        if (f10 > 1.0f || f10 < 0.0f) {
            throw new MaterialDateTimePickerException("Given fadeIn alpha is invalid (" + f10 + "). fadeIn value should be 0 to 1");
        }
        super.setFadeInAlpha$materialdatetimepicker_release(f10);
        String str = "java.lang.String.format(format, *args)";
        float f11 = obtainStyledAttributes.getFloat(R$styleable.MaterialDatePickerView_fadeOutAlpha, getFadeOutAlpha$materialdatetimepicker_release());
        if (f11 > 1.0f || i11 < 0) {
            throw new MaterialDateTimePickerException("Given fadeOut alpha is invalid (" + f11 + "). fadeOut value should be 0 to 1");
        }
        super.setFadeOutAlpha$materialdatetimepicker_release(f11);
        int i18 = obtainStyledAttributes.getInt(R$styleable.MaterialDatePickerView_minYear, 1950);
        int i19 = obtainStyledAttributes.getInt(R$styleable.MaterialDatePickerView_maxYear, 2100);
        this.E = new h(i18, i19);
        int i20 = obtainStyledAttributes.getInt(R$styleable.MaterialDatePickerView_defaultYear, this.D.f21754a);
        if (i20 < i18 || i20 > i19) {
            StringBuilder u10 = b0.u("Default year (", i20, ") out of the year range. It should be in between ", i18, " to ");
            u10.append(i19);
            throw new MaterialDateTimePickerException(u10.toString());
        }
        nl.e R = this.D.R(i20);
        this.D = R;
        nl.e Q = R.Q(obtainStyledAttributes.getInt(R$styleable.MaterialDatePickerView_defaultMonth, R.f21755b));
        this.D = Q;
        this.D = Q.O(obtainStyledAttributes.getInt(R$styleable.MaterialDatePickerView_defaultDay, Q.f21756c));
        int i21 = R$id.viewCenter;
        View v2 = v(i21);
        j.e(v2, "viewCenter");
        String str2 = "%02d";
        v2.setVisibility(true ^ obtainStyledAttributes.getBoolean(R$styleable.MaterialDatePickerView_isShowHighlighter, true) ? 4 : 0);
        v(i21).setBackgroundColor(color);
        View v10 = v(i21);
        j.e(v10, "viewCenter");
        v10.getLayoutParams().height = (int) dimension;
        if (drawable instanceof ColorDrawable) {
            int color2 = ((ColorDrawable) drawable).getColor();
            v(R$id.viewTopShadeYear).setBackgroundColor(color2);
            v(R$id.viewTopShadeMonth).setBackgroundColor(color2);
            v(R$id.viewTopShadeTimeDay).setBackgroundColor(color2);
            v(R$id.viewBottomShadeYear).setBackgroundColor(color2);
            v(R$id.viewBottomShadeMonth).setBackgroundColor(color2);
            v(R$id.viewBottomShadeTimeDay).setBackgroundColor(color2);
            setBackgroundColor(color2);
        }
        obtainStyledAttributes.recycle();
        int i22 = R$id.rvYears;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(i22);
        lowFlingRecyclerView.setHasFixedSize(true);
        lowFlingRecyclerView.setAdapter(aVar2);
        lowFlingRecyclerView.getContext();
        LowFlingRecyclerView lowFlingRecyclerView2 = (LowFlingRecyclerView) lowFlingRecyclerView.r0(i22);
        j.e(lowFlingRecyclerView2, "rvYears");
        lowFlingRecyclerView.setLayoutManager(new SlowLinearLayoutManager(lowFlingRecyclerView2, new hg.b(this)));
        mVar.a(lowFlingRecyclerView);
        q(lowFlingRecyclerView, new hg.c(this));
        int i23 = R$id.rvMonths;
        LowFlingRecyclerView lowFlingRecyclerView3 = (LowFlingRecyclerView) v(i23);
        lowFlingRecyclerView3.setHasFixedSize(true);
        lowFlingRecyclerView3.setAdapter(aVar3);
        lowFlingRecyclerView3.getContext();
        LowFlingRecyclerView lowFlingRecyclerView4 = (LowFlingRecyclerView) lowFlingRecyclerView3.r0(i23);
        j.e(lowFlingRecyclerView4, "rvMonths");
        lowFlingRecyclerView3.setLayoutManager(new SlowLinearLayoutManager(lowFlingRecyclerView4, new hg.d(this)));
        mVar2.a(lowFlingRecyclerView3);
        q(lowFlingRecyclerView3, new hg.e(this));
        int i24 = R$id.rvDays;
        LowFlingRecyclerView lowFlingRecyclerView5 = (LowFlingRecyclerView) v(i24);
        lowFlingRecyclerView5.setHasFixedSize(true);
        lowFlingRecyclerView5.setAdapter(aVar4);
        lowFlingRecyclerView5.getContext();
        LowFlingRecyclerView lowFlingRecyclerView6 = (LowFlingRecyclerView) lowFlingRecyclerView5.r0(i24);
        j.e(lowFlingRecyclerView6, "rvDays");
        lowFlingRecyclerView5.setLayoutManager(new SlowLinearLayoutManager(lowFlingRecyclerView6, new hg.f(this)));
        mVar3.a(lowFlingRecyclerView5);
        q(lowFlingRecyclerView5, new hg.g(this));
        h hVar4 = this.E;
        ArrayList arrayList4 = new ArrayList(fk.j.H0(hVar4));
        g m13 = hVar4.iterator();
        int i25 = 0;
        while (m13.f23340c) {
            int nextInt4 = m13.nextInt();
            int i26 = i25 + 1;
            if (i25 >= 0) {
                String format3 = String.format(str2, Arrays.copyOf(new Object[]{Integer.valueOf(nextInt4)}, 1));
                j.e(format3, str);
                arrayList4.add(new a.c(i25, nextInt4, format3));
                i25 = i26;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        this.F = arrayList4;
        fg.a aVar5 = this.I;
        aVar5.getClass();
        aVar5.f20161d = arrayList4;
        aVar5.f();
        C();
        B();
    }

    /* compiled from: MaterialDatePickerView.kt */
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f19342a = nl.i.s().f21771a.f21759a.f21754a;

        /* renamed from: b  reason: collision with root package name */
        public int f19343b = nl.i.s().f21771a.f21759a.f21755b;

        /* renamed from: c  reason: collision with root package name */
        public int f19344c = nl.i.s().f21771a.f21759a.f21756c;

        /* compiled from: MaterialDatePickerView.kt */
        public static final class a implements Parcelable.Creator<SavedState> {
            public static SavedState[] a(int i10) {
                return a(i10);
            }

            public final Object createFromParcel(Parcel parcel) {
                j.f(parcel, "source");
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i10) {
                return a(i10);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            j.f(parcel, "out");
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f19342a);
            parcel.writeInt(this.f19343b);
            parcel.writeInt(this.f19344c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel parcel) {
            super(parcel);
            j.f(parcel, "source");
            this.f19342a = parcel.readInt();
            this.f19343b = parcel.readInt();
            this.f19344c = parcel.readInt();
        }
    }
}

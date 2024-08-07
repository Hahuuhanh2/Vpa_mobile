package com.swnishan.materialdatetimepicker.timepicker;

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
import com.google.android.material.textview.MaterialTextView;
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
import ig.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import nl.a;
import nl.f;
import nl.g;
import p3.l0;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: MaterialTimePickerView.kt */
public final class MaterialTimePickerView extends BaseMaterialDateTimePickerView {
    public static final /* synthetic */ int O = 0;
    public int B;
    public final ArrayList C;
    public final ArrayList D;
    public final ArrayList E;
    public final m F;
    public final m G;
    public final m H;
    public final fg.a I;
    public final fg.a J;
    public g K;
    public b L;
    public c M;
    public HashMap N;

    /* compiled from: MaterialTimePickerView.kt */
    public interface a {
    }

    /* compiled from: MaterialTimePickerView.kt */
    public enum b {
        HOURS_24,
        HOURS_12
    }

    /* compiled from: MaterialTimePickerView.kt */
    public enum c {
        AM,
        PM
    }

    /* compiled from: MaterialTimePickerView.kt */
    public static final class d extends k implements l<Integer, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MaterialTimePickerView f19359a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(MaterialTimePickerView materialTimePickerView) {
            super(1);
            this.f19359a = materialTimePickerView;
        }

        public final Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) this.f19359a.v(R$id.rvHours);
            j.e(lowFlingRecyclerView, "rvHours");
            lowFlingRecyclerView.n0(intValue);
            return i.f20112a;
        }
    }

    /* compiled from: MaterialTimePickerView.kt */
    public static final class e extends k implements l<Integer, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MaterialTimePickerView f19360a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(MaterialTimePickerView materialTimePickerView) {
            super(1);
            this.f19360a = materialTimePickerView;
        }

        public final Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) this.f19360a.v(R$id.rvMinute);
            j.e(lowFlingRecyclerView, "rvMinute");
            lowFlingRecyclerView.n0(intValue);
            return i.f20112a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MaterialTimePickerView(Context context) {
        this(context, (AttributeSet) null);
        j.f(context, "context");
    }

    private final List<h.a> getHoursBasedOnClockType() {
        int ordinal = this.L.ordinal();
        if (ordinal == 0) {
            return this.C;
        }
        if (ordinal == 1) {
            return this.D;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void w(MaterialTimePickerView materialTimePickerView, int i10) {
        if (i10 == R$id.rvHours) {
            g G2 = materialTimePickerView.K.G(materialTimePickerView.getHour());
            j.e(G2, "pickerTime.withHour(getHour())");
            materialTimePickerView.K = G2;
        } else if (i10 == R$id.rvMinute) {
            g H2 = materialTimePickerView.K.H(materialTimePickerView.getMinute());
            j.e(H2, "pickerTime.withMinute(getMinute())");
            materialTimePickerView.K = H2;
        } else if (i10 == R$id.rvTimePeriod) {
            materialTimePickerView.M = materialTimePickerView.getTimePeriod();
            g G3 = materialTimePickerView.K.G(materialTimePickerView.getHour());
            j.e(G3, "pickerTime.withHour(getHour())");
            materialTimePickerView.K = G3;
        } else {
            materialTimePickerView.getClass();
        }
    }

    public final void A() {
        boolean z10;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(R$id.rvTimePeriod);
        j.e(lowFlingRecyclerView, "rvTimePeriod");
        int i10 = 0;
        if (this.L == b.HOURS_12) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        lowFlingRecyclerView.setVisibility(i10);
    }

    public final int getHour() {
        m mVar = this.F;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(R$id.rvHours);
        j.e(lowFlingRecyclerView, "rvHours");
        int t10 = BaseMaterialDateTimePickerView.t(mVar, lowFlingRecyclerView);
        int ordinal = this.L.ordinal();
        if (ordinal == 0) {
            return t10 % this.C.size();
        }
        if (ordinal == 1) {
            List<? extends eg.a> list = this.I.f20161d;
            eg.a aVar = (eg.a) list.get(t10 % list.size());
            if (aVar != null) {
                int i10 = 12;
                int i11 = ((h.a) aVar).f20557c % 12;
                if (getTimePeriod() != c.PM) {
                    i10 = 0;
                }
                return i11 + i10;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.swnishan.materialdatetimepicker.timepicker.TimeModel.Hour");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int getMinute() {
        m mVar = this.G;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(R$id.rvMinute);
        j.e(lowFlingRecyclerView, "rvMinute");
        return BaseMaterialDateTimePickerView.t(mVar, lowFlingRecyclerView) % this.E.size();
    }

    public final long getTime() {
        nl.i s10 = nl.i.s();
        byte b10 = this.K.f21764a;
        f fVar = s10.f21771a;
        nl.i v2 = s10.v(fVar.K(fVar.f21759a, fVar.f21760b.G(b10)), s10.f21772b);
        byte b11 = this.K.f21765b;
        f fVar2 = v2.f21771a;
        nl.i v10 = v2.v(fVar2.K(fVar2.f21759a, fVar2.f21760b.H(b11)), v2.f21772b);
        f fVar3 = v10.f21771a;
        g gVar = fVar3.f21760b;
        if (gVar.f21766c != 0) {
            rl.a.SECOND_OF_MINUTE.m((long) 0);
            gVar = g.t(gVar.f21764a, gVar.f21765b, 0, gVar.f21767d);
        }
        nl.i v11 = v10.v(fVar3.K(fVar3.f21759a, gVar), v10.f21772b);
        f fVar4 = v11.f21771a;
        nl.i v12 = v11.v(fVar4.K(fVar4.f21759a, fVar4.f21760b.I(0)), v11.f21772b);
        f fVar5 = v12.f21771a;
        return nl.d.u(fVar5.v(v12.f21772b), (long) fVar5.x().f21767d).x();
    }

    public final c getTimePeriod() {
        c[] values = c.values();
        m mVar = this.H;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(R$id.rvTimePeriod);
        j.e(lowFlingRecyclerView, "rvTimePeriod");
        return values[BaseMaterialDateTimePickerView.t(mVar, lowFlingRecyclerView)];
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            g H2 = this.K.G(savedState.f19350a).H(savedState.f19351b);
            j.e(H2, "pickerTime.withHour(stat…ute(state.selectedMinute)");
            this.K = H2;
            this.M = c.valueOf(savedState.f19352c);
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
        g gVar = this.K;
        savedState.f19350a = gVar.f21764a;
        savedState.f19351b = gVar.f21765b;
        String name = this.M.name();
        j.f(name, "<set-?>");
        savedState.f19352c = name;
        return savedState;
    }

    public final void r(RecyclerView recyclerView, long j10, float f10) {
        j.f(recyclerView, "view");
        int id2 = recyclerView.getId();
        if (id2 == R$id.rvHours) {
            BaseMaterialDateTimePickerView.u(j7.a.d0(v(R$id.viewTopShadeHour), v(R$id.viewBottomShadeHour)), j10, f10);
        } else if (id2 == R$id.rvMinute) {
            BaseMaterialDateTimePickerView.u(j7.a.d0(v(R$id.viewTopShadeMinute), v(R$id.viewBottomShadeMinute)), j10, f10);
        } else if (id2 == R$id.rvTimePeriod) {
            BaseMaterialDateTimePickerView.u(j7.a.d0(v(R$id.viewTopShadeTimePeriod), v(R$id.viewBottomShadeTimePeriod)), j10, f10);
        }
    }

    public final void setHour(int i10) {
        c cVar;
        c cVar2 = c.PM;
        int i11 = 12;
        if (i10 >= 12) {
            cVar = cVar2;
        } else {
            cVar = c.AM;
        }
        setTimePeriod(cVar);
        int ordinal = this.L.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                int i12 = i10 % 12;
                if (this.M != cVar2) {
                    i11 = 0;
                }
                i10 = i12 + i11;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        g G2 = this.K.G(i10);
        j.e(G2, "pickerTime.withHour(setHour)");
        this.K = G2;
        x();
    }

    public final void setMinute(int i10) {
        g H2 = this.K.H(i10);
        j.e(H2, "pickerTime.withMinute(minute)");
        this.K = H2;
        y();
    }

    public final void setOnTimePickedListener(a aVar) {
    }

    public final void setTimeConvention(b bVar) {
        ArrayList arrayList;
        j.f(bVar, "timeConvention");
        this.L = bVar;
        int ordinal = bVar.ordinal();
        if (ordinal == 0) {
            arrayList = this.C;
        } else if (ordinal == 1) {
            arrayList = this.D;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        fg.a aVar = this.I;
        aVar.getClass();
        j.f(arrayList, "items");
        aVar.f20161d = arrayList;
        aVar.f();
        A();
        x();
        y();
        z();
    }

    public final void setTimePeriod(c cVar) {
        j.f(cVar, "timePeriod");
        if (cVar != this.M) {
            this.M = cVar;
            g gVar = this.K;
            byte b10 = gVar.f21764a;
            if (b10 < 12 && cVar == c.PM) {
                gVar = gVar.z(12);
                j.e(gVar, "pickerTime.plusHours(12)");
            } else if (b10 >= 12 && cVar == c.AM) {
                gVar.getClass();
                gVar = gVar.z(-12);
                j.e(gVar, "pickerTime.minusHours(12)");
            }
            this.K = gVar;
            z();
        }
    }

    public final View v(int i10) {
        if (this.N == null) {
            this.N = new HashMap();
        }
        View view = (View) this.N.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        this.N.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: ig.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: ig.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: ig.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: ig.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: ig.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: ig.h$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: ig.h$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x() {
        /*
            r12 = this;
            fg.a r0 = r12.I
            java.util.List r1 = r12.getHoursBasedOnClockType()
            nl.g r2 = r12.K
            byte r2 = r2.f21764a
            com.swnishan.materialdatetimepicker.timepicker.MaterialTimePickerView$b r3 = r12.L
            int r3 = r3.ordinal()
            r4 = 41
            java.lang.String r5 = " index: "
            r6 = 0
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L_0x006b
            if (r3 != r8) goto L_0x0065
            java.util.ArrayList r3 = r12.D
            java.util.Iterator r3 = r3.iterator()
        L_0x0021:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x003e
            java.lang.Object r9 = r3.next()
            r10 = r9
            ig.h$a r10 = (ig.h.a) r10
            int r10 = r10.f20557c
            int r11 = r2 % 12
            if (r11 != 0) goto L_0x0036
            r11 = 12
        L_0x0036:
            if (r10 != r11) goto L_0x003a
            r10 = r8
            goto L_0x003b
        L_0x003a:
            r10 = r6
        L_0x003b:
            if (r10 == 0) goto L_0x0021
            r7 = r9
        L_0x003e:
            ig.h$a r7 = (ig.h.a) r7
            if (r7 == 0) goto L_0x0043
            goto L_0x008e
        L_0x0043:
            com.swnishan.materialdatetimepicker.common.MaterialDateTimePickerException r0 = new com.swnishan.materialdatetimepicker.common.MaterialDateTimePickerException
            java.lang.String r1 = "Cannot find given Hour in given 12 hours range (size: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            java.util.ArrayList r3 = r12.D
            int r3 = r3.size()
            r1.append(r3)
            r1.append(r5)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0065:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x006b:
            java.util.ArrayList r3 = r12.C
            java.util.Iterator r3 = r3.iterator()
        L_0x0071:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x008a
            java.lang.Object r9 = r3.next()
            r10 = r9
            ig.h$a r10 = (ig.h.a) r10
            int r10 = r10.f20557c
            int r11 = r2 % 24
            if (r10 != r11) goto L_0x0086
            r10 = r8
            goto L_0x0087
        L_0x0086:
            r10 = r6
        L_0x0087:
            if (r10 == 0) goto L_0x0071
            r7 = r9
        L_0x008a:
            ig.h$a r7 = (ig.h.a) r7
            if (r7 == 0) goto L_0x009e
        L_0x008e:
            int r0 = com.swnishan.materialdatetimepicker.common.view.BaseMaterialDateTimePickerView.s(r0, r1, r7)
            int r1 = com.swnishan.materialdatetimepicker.R$id.rvHours
            android.view.View r1 = r12.v(r1)
            com.swnishan.materialdatetimepicker.common.LowFlingRecyclerView r1 = (com.swnishan.materialdatetimepicker.common.LowFlingRecyclerView) r1
            r1.k0(r0)
            return
        L_0x009e:
            com.swnishan.materialdatetimepicker.common.MaterialDateTimePickerException r0 = new com.swnishan.materialdatetimepicker.common.MaterialDateTimePickerException
            java.lang.String r1 = "Cannot find given Hour in given 24 hours range (size: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            java.util.ArrayList r3 = r12.C
            int r3 = r3.size()
            r1.append(r3)
            r1.append(r5)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swnishan.materialdatetimepicker.timepicker.MaterialTimePickerView.x():void");
    }

    public final void y() {
        Object obj;
        boolean z10;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(R$id.rvMinute);
        fg.a aVar = this.J;
        ArrayList arrayList = this.E;
        byte b10 = this.K.f21765b;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((h.b) obj).f20560c == b10) {
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
        h.b bVar = (h.b) obj;
        if (bVar != null) {
            lowFlingRecyclerView.k0(BaseMaterialDateTimePickerView.s(aVar, arrayList, bVar));
            return;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Cannot find given Minute in given minutes range (size: ");
        q10.append(this.E.size());
        q10.append(" index: ");
        q10.append(b10);
        q10.append(')');
        throw new MaterialDateTimePickerException(q10.toString());
    }

    public final void z() {
        int i10;
        if (this.M == c.PM) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        ((LowFlingRecyclerView) v(R$id.rvTimePeriod)).k0(i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public MaterialTimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.materialTimePickerViewStyle);
        j.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MaterialTimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        int i11;
        ArrayList arrayList;
        c cVar = c.PM;
        c cVar2 = c.AM;
        j.f(context, "context");
        View.inflate(getContext(), R$layout.view_time_picker, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1));
        Context context2 = getContext();
        j.e(context2, "context");
        int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R$dimen.date_picker_view_padding_top);
        Context context3 = getContext();
        j.e(context3, "context");
        setPadding(0, dimensionPixelSize, 0, context3.getResources().getDimensionPixelSize(R$dimen.date_picker_view_padding_bottom));
        this.B = R$style.TextAppearance_MaterialTimePicker;
        vk.h hVar = new vk.h(0, 23);
        ArrayList arrayList2 = new ArrayList(fk.j.H0(hVar));
        vk.g m10 = hVar.iterator();
        int i12 = 0;
        while (m10.f23340c) {
            int nextInt = m10.nextInt();
            int i13 = i12 + 1;
            if (i12 >= 0) {
                String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(nextInt)}, 1));
                j.e(format, "java.lang.String.format(format, *args)");
                arrayList2.add(new h.a(i12, nextInt, format));
                i12 = i13;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        this.C = arrayList2;
        vk.h hVar2 = new vk.h(1, 12);
        ArrayList arrayList3 = new ArrayList(fk.j.H0(hVar2));
        vk.g m11 = hVar2.iterator();
        int i14 = 0;
        while (m11.f23340c) {
            int nextInt2 = m11.nextInt();
            int i15 = i14 + 1;
            if (i14 >= 0) {
                String format2 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(nextInt2)}, 1));
                j.e(format2, "java.lang.String.format(format, *args)");
                arrayList3.add(new h.a(i14, nextInt2, format2));
                i14 = i15;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        this.D = arrayList3;
        vk.h hVar3 = new vk.h(0, 59);
        ArrayList arrayList4 = new ArrayList(fk.j.H0(hVar3));
        vk.g m12 = hVar3.iterator();
        int i16 = 0;
        while (m12.f23340c) {
            int nextInt3 = m12.nextInt();
            int i17 = i16 + 1;
            if (i16 >= 0) {
                String format3 = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(nextInt3)}, 1));
                j.e(format3, "java.lang.String.format(format, *args)");
                arrayList4.add(new h.b(i16, nextInt3, format3));
                i16 = i17;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        this.E = arrayList4;
        m mVar = new m();
        this.F = mVar;
        m mVar2 = new m();
        this.G = mVar2;
        this.H = new m();
        fg.a aVar = new fg.a(this.C, this.B, 1, new d(this));
        this.I = aVar;
        fg.a aVar2 = new fg.a(arrayList4, this.B, 1, new e(this));
        this.J = aVar2;
        g gVar = g.f21761e;
        a.C0293a aVar3 = new a.C0293a(nl.j.t());
        long currentTimeMillis = System.currentTimeMillis();
        nl.d dVar = nl.d.f21749c;
        long j10 = (long) 1000;
        nl.d s10 = nl.d.s(((int) (((currentTimeMillis % j10) + j10) % j10)) * 1000000, l0.T(currentTimeMillis, 1000));
        long j11 = ((s10.f21750a % 86400) + ((long) aVar3.f21741a.s().a(s10).f21779b)) % 86400;
        g x10 = g.x(s10.f21751b, j11 < 0 ? j11 + 86400 : j11);
        j.e(x10, "LocalTime.now()");
        this.K = x10;
        this.L = b.HOURS_24;
        this.M = x10.f21764a >= 12 ? cVar : cVar2;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MaterialTimePickerView, i10, R$style.Widget_MaterialTimePicker);
        int color = obtainStyledAttributes.getColor(R$styleable.MaterialTimePickerView_highlighterColor, k1.a.getColor(getContext(), R$color.O100));
        float dimension = obtainStyledAttributes.getDimension(R$styleable.MaterialTimePickerView_highlighterHeight, 50.0f);
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.MaterialTimePickerView_android_background);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.MaterialTimePickerView_android_textAppearance, R$style.TextAppearance_MaterialTimePicker);
        this.B = resourceId;
        aVar.f20162e = resourceId;
        aVar.f();
        aVar2.f20162e = this.B;
        aVar2.f();
        this.L = b.values()[obtainStyledAttributes.getInt(R$styleable.MaterialTimePickerView_timeConvention, 0)];
        setFadeInDuration$materialdatetimepicker_release((long) obtainStyledAttributes.getInt(R$styleable.MaterialTimePickerView_fadeInDuration, (int) getFadeInDuration$materialdatetimepicker_release()));
        setFadeOutDuration$materialdatetimepicker_release((long) obtainStyledAttributes.getInt(R$styleable.MaterialTimePickerView_fadeOutDuration, (int) getFadeOutDuration$materialdatetimepicker_release()));
        float f10 = obtainStyledAttributes.getFloat(R$styleable.MaterialTimePickerView_fadeInAlpha, getFadeInAlpha$materialdatetimepicker_release());
        if (f10 > 1.0f || f10 < 0.0f) {
            throw new MaterialDateTimePickerException("Given fadeIn alpha is invalid (" + f10 + "). fadeIn value should be 0 to 1");
        }
        super.setFadeInAlpha$materialdatetimepicker_release(f10);
        float f11 = obtainStyledAttributes.getFloat(R$styleable.MaterialTimePickerView_fadeOutAlpha, getFadeOutAlpha$materialdatetimepicker_release());
        if (f11 > 1.0f || i11 < 0) {
            throw new MaterialDateTimePickerException("Given fadeOut alpha is invalid (" + f11 + "). fadeOut value should be 0 to 1");
        }
        super.setFadeOutAlpha$materialdatetimepicker_release(f11);
        int i18 = obtainStyledAttributes.getInt(R$styleable.MaterialTimePickerView_defaultHour, this.K.f21764a);
        if (i18 > 23 || i18 < 0) {
            throw new MaterialDateTimePickerException("Given default hour is invalid. Hour should be in between 0 to 23");
        }
        g G2 = this.K.G(i18);
        j.e(G2, "pickerTime.withHour(hour)");
        this.K = G2;
        this.M = G2.f21764a >= 12 ? cVar : cVar2;
        int i19 = obtainStyledAttributes.getInt(R$styleable.MaterialTimePickerView_defaultMinute, G2.f21765b);
        if (i19 > 59 || i18 < 0) {
            throw new MaterialDateTimePickerException("Given default minute is invalid. Minute should be in between 0 to 59");
        }
        g H2 = this.K.H(i19);
        j.e(H2, "pickerTime.withMinute(minute)");
        this.K = H2;
        int i20 = R$id.viewCenter;
        View v2 = v(i20);
        j.e(v2, "viewCenter");
        v2.setVisibility(obtainStyledAttributes.getBoolean(R$styleable.MaterialTimePickerView_isShowHighlighter, true) ^ true ? 4 : 0);
        v(i20).setBackgroundColor(color);
        View v10 = v(i20);
        j.e(v10, "viewCenter");
        v10.getLayoutParams().height = (int) dimension;
        ((MaterialTextView) v(R$id.tvHourTimeSeparator)).setTextAppearance(this.B);
        if (drawable instanceof ColorDrawable) {
            int color2 = ((ColorDrawable) drawable).getColor();
            v(R$id.viewTopShadeHour).setBackgroundColor(color2);
            v(R$id.viewTopShadeMinute).setBackgroundColor(color2);
            v(R$id.viewTopShadeTimePeriod).setBackgroundColor(color2);
            v(R$id.viewBottomShadeHour).setBackgroundColor(color2);
            v(R$id.viewBottomShadeMinute).setBackgroundColor(color2);
            v(R$id.viewBottomShadeTimePeriod).setBackgroundColor(color2);
            setBackgroundColor(color2);
        }
        obtainStyledAttributes.recycle();
        int ordinal = this.L.ordinal();
        if (ordinal == 0) {
            arrayList = this.C;
        } else if (ordinal == 1) {
            arrayList = this.D;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        j.f(arrayList, "items");
        aVar.f20161d = arrayList;
        aVar.f();
        int i21 = R$id.rvHours;
        LowFlingRecyclerView lowFlingRecyclerView = (LowFlingRecyclerView) v(i21);
        lowFlingRecyclerView.setHasFixedSize(true);
        lowFlingRecyclerView.setAdapter(aVar);
        lowFlingRecyclerView.getContext();
        LowFlingRecyclerView lowFlingRecyclerView2 = (LowFlingRecyclerView) lowFlingRecyclerView.r0(i21);
        j.e(lowFlingRecyclerView2, "rvHours");
        lowFlingRecyclerView.setLayoutManager(new SlowLinearLayoutManager(lowFlingRecyclerView2, new ig.a(this)));
        mVar.a(lowFlingRecyclerView);
        q(lowFlingRecyclerView, new ig.b(this));
        int i22 = R$id.rvMinute;
        LowFlingRecyclerView lowFlingRecyclerView3 = (LowFlingRecyclerView) v(i22);
        lowFlingRecyclerView3.setHasFixedSize(true);
        lowFlingRecyclerView3.setAdapter(aVar2);
        lowFlingRecyclerView3.getContext();
        LowFlingRecyclerView lowFlingRecyclerView4 = (LowFlingRecyclerView) lowFlingRecyclerView3.r0(i22);
        j.e(lowFlingRecyclerView4, "rvMinute");
        lowFlingRecyclerView3.setLayoutManager(new SlowLinearLayoutManager(lowFlingRecyclerView4, new ig.c(this)));
        mVar2.a(lowFlingRecyclerView3);
        q(lowFlingRecyclerView3, new ig.d(this));
        LowFlingRecyclerView lowFlingRecyclerView5 = (LowFlingRecyclerView) v(R$id.rvTimePeriod);
        lowFlingRecyclerView5.setHasFixedSize(true);
        int i23 = 0;
        List d02 = j7.a.d0(cVar2, cVar);
        ArrayList arrayList5 = new ArrayList(fk.j.H0(d02));
        for (Object next : d02) {
            int i24 = i23 + 1;
            if (i23 >= 0) {
                c cVar3 = (c) next;
                arrayList5.add(new h.c(i23, cVar3.ordinal(), cVar3.name()));
                i23 = i24;
            } else {
                j7.a.x0();
                throw null;
            }
        }
        lowFlingRecyclerView5.setAdapter(new fg.a(arrayList5, this.B, 2, new ig.e(lowFlingRecyclerView5, this)));
        lowFlingRecyclerView5.getContext();
        LowFlingRecyclerView lowFlingRecyclerView6 = (LowFlingRecyclerView) lowFlingRecyclerView5.r0(R$id.rvTimePeriod);
        j.e(lowFlingRecyclerView6, "rvTimePeriod");
        lowFlingRecyclerView5.setLayoutManager(new SlowLinearLayoutManager(lowFlingRecyclerView6, new ig.f(this)));
        this.H.a(lowFlingRecyclerView5);
        q(lowFlingRecyclerView5, new ig.g(this));
        A();
    }

    /* compiled from: MaterialTimePickerView.kt */
    public static final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public int f19350a;

        /* renamed from: b  reason: collision with root package name */
        public int f19351b;

        /* renamed from: c  reason: collision with root package name */
        public String f19352c;

        /* compiled from: MaterialTimePickerView.kt */
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
            this.f19350a = nl.i.s().f21771a.f21760b.f21764a;
            this.f19351b = nl.i.s().f21771a.f21760b.f21765b;
            this.f19352c = "AM";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            j.f(parcel, "out");
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f19350a);
            parcel.writeInt(this.f19351b);
            parcel.writeString(this.f19352c);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SavedState(Parcel parcel) {
            super(parcel);
            j.f(parcel, "source");
            this.f19350a = nl.i.s().f21771a.f21760b.f21764a;
            this.f19351b = nl.i.s().f21771a.f21760b.f21765b;
            String str = "AM";
            this.f19352c = str;
            this.f19350a = parcel.readInt();
            this.f19350a = parcel.readInt();
            String readString = parcel.readString();
            this.f19352c = readString != null ? readString : str;
        }
    }
}

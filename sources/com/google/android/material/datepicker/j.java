package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$integer;
import com.google.android.material.R$layout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.r;
import java.util.Calendar;
import java.util.GregorianCalendar;
import w1.d0;
import x1.f;

/* compiled from: MaterialCalendar */
public final class j<S> extends z<S> {

    /* renamed from: s0  reason: collision with root package name */
    public static final /* synthetic */ int f6163s0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public int f6164f0;

    /* renamed from: g0  reason: collision with root package name */
    public DateSelector<S> f6165g0;

    /* renamed from: h0  reason: collision with root package name */
    public CalendarConstraints f6166h0;

    /* renamed from: i0  reason: collision with root package name */
    public DayViewDecorator f6167i0;

    /* renamed from: j0  reason: collision with root package name */
    public Month f6168j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f6169k0;

    /* renamed from: l0  reason: collision with root package name */
    public b f6170l0;

    /* renamed from: m0  reason: collision with root package name */
    public RecyclerView f6171m0;

    /* renamed from: n0  reason: collision with root package name */
    public RecyclerView f6172n0;

    /* renamed from: o0  reason: collision with root package name */
    public View f6173o0;

    /* renamed from: p0  reason: collision with root package name */
    public View f6174p0;

    /* renamed from: q0  reason: collision with root package name */
    public View f6175q0;

    /* renamed from: r0  reason: collision with root package name */
    public View f6176r0;

    /* compiled from: MaterialCalendar */
    public class a extends w1.a {
        public final void d(View view, f fVar) {
            this.f16280a.onInitializeAccessibilityNodeInfo(view, fVar.f16862a);
            fVar.f16862a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) null);
        }
    }

    /* compiled from: MaterialCalendar */
    public class b extends d0 {
        public final /* synthetic */ int M;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11) {
            super(i10);
            this.M = i11;
        }

        public final void P0(RecyclerView.w wVar, int[] iArr) {
            if (this.M == 0) {
                iArr[0] = j.this.f6172n0.getWidth();
                iArr[1] = j.this.f6172n0.getWidth();
                return;
            }
            iArr[0] = j.this.f6172n0.getHeight();
            iArr[1] = j.this.f6172n0.getHeight();
        }
    }

    /* compiled from: MaterialCalendar */
    public class c implements d {
        public c() {
        }
    }

    /* compiled from: MaterialCalendar */
    public interface d {
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        if (bundle == null) {
            bundle = this.f2448f;
        }
        this.f6164f0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f6165g0 = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f6166h0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f6167i0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f6168j0 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        int i11;
        g gVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(r(), this.f6164f0);
        this.f6170l0 = new b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.f6166h0.f6075a;
        if (r.q0(contextThemeWrapper)) {
            i11 = R$layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i11 = R$layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        Resources resources = d0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R$dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_days_of_week_height);
        int i12 = v.f6213n;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_vertical_padding) * (i12 - 1)) + (resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_height) * i12) + resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R$id.mtrl_calendar_days_of_week);
        d0.o(gridView, new a());
        int i13 = this.f6166h0.f6079e;
        if (i13 <= 0) {
            gVar = new g();
        }
        gridView.setAdapter(gVar);
        gridView.setNumColumns(month.f6100d);
        gridView.setEnabled(false);
        this.f6172n0 = (RecyclerView) inflate.findViewById(R$id.mtrl_calendar_months);
        r();
        this.f6172n0.setLayoutManager(new b(i10, i10));
        this.f6172n0.setTag("MONTHS_VIEW_GROUP_TAG");
        x xVar = new x(contextThemeWrapper, this.f6165g0, this.f6166h0, this.f6167i0, new c());
        this.f6172n0.setAdapter(xVar);
        int integer = contextThemeWrapper.getResources().getInteger(R$integer.mtrl_calendar_year_selector_span);
        int i14 = R$id.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(i14);
        this.f6171m0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f6171m0.setLayoutManager(new GridLayoutManager(integer, 0));
            this.f6171m0.setAdapter(new h0(this));
            this.f6171m0.i(new l(this));
        }
        int i15 = R$id.month_navigation_fragment_toggle;
        if (inflate.findViewById(i15) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(i15);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            d0.o(materialButton, new m(this));
            View findViewById = inflate.findViewById(R$id.month_navigation_previous);
            this.f6173o0 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R$id.month_navigation_next);
            this.f6174p0 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f6175q0 = inflate.findViewById(i14);
            this.f6176r0 = inflate.findViewById(R$id.mtrl_calendar_day_selector_frame);
            k0(1);
            materialButton.setText(this.f6168j0.m());
            this.f6172n0.j(new n(this, xVar, materialButton));
            materialButton.setOnClickListener(new o(this));
            this.f6174p0.setOnClickListener(new p(this, xVar));
            this.f6173o0.setOnClickListener(new h(this, xVar));
        }
        if (!r.q0(contextThemeWrapper)) {
            new r().a(this.f6172n0);
        }
        RecyclerView recyclerView2 = this.f6172n0;
        Month month2 = this.f6168j0;
        Month month3 = xVar.f6223d.f6075a;
        if (month3.f6097a instanceof GregorianCalendar) {
            recyclerView2.k0((month2.f6098b - month3.f6098b) + ((month2.f6099c - month3.f6099c) * 12));
            d0.o(this.f6172n0, new k());
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void T(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f6164f0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f6165g0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f6166h0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f6167i0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f6168j0);
    }

    public final boolean i0(r.c cVar) {
        return super.i0(cVar);
    }

    public final void j0(Month month) {
        boolean z10;
        Month month2 = ((x) this.f6172n0.getAdapter()).f6223d.f6075a;
        Calendar calendar = month2.f6097a;
        if (calendar instanceof GregorianCalendar) {
            int i10 = month.f6099c;
            int i11 = month2.f6099c;
            int i12 = month.f6098b;
            int i13 = month2.f6098b;
            int i14 = (i12 - i13) + ((i10 - i11) * 12);
            Month month3 = this.f6168j0;
            if (calendar instanceof GregorianCalendar) {
                int i15 = i14 - ((month3.f6098b - i13) + ((month3.f6099c - i11) * 12));
                boolean z11 = true;
                if (Math.abs(i15) > 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i15 <= 0) {
                    z11 = false;
                }
                this.f6168j0 = month;
                if (z10 && z11) {
                    this.f6172n0.k0(i14 - 3);
                    this.f6172n0.post(new i(this, i14));
                } else if (z10) {
                    this.f6172n0.k0(i14 + 3);
                    this.f6172n0.post(new i(this, i14));
                } else {
                    this.f6172n0.post(new i(this, i14));
                }
            } else {
                throw new IllegalArgumentException("Only Gregorian calendars are supported.");
            }
        } else {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
    }

    public final void k0(int i10) {
        this.f6169k0 = i10;
        if (i10 == 2) {
            this.f6171m0.getLayoutManager().C0(this.f6168j0.f6099c - ((h0) this.f6171m0.getAdapter()).f6159d.f6166h0.f6075a.f6099c);
            this.f6175q0.setVisibility(0);
            this.f6176r0.setVisibility(8);
            this.f6173o0.setVisibility(8);
            this.f6174p0.setVisibility(8);
        } else if (i10 == 1) {
            this.f6175q0.setVisibility(8);
            this.f6176r0.setVisibility(0);
            this.f6173o0.setVisibility(0);
            this.f6174p0.setVisibility(0);
            j0(this.f6168j0);
        }
    }
}

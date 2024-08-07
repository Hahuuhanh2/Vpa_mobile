package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.g;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l8.h;
import w1.d0;
import w1.q0;
import w1.u0;
import w1.w;
import w1.x0;

/* compiled from: MaterialDatePicker */
public final class r<S> extends g {
    public z<S> A0;
    public CalendarConstraints B0;
    public DayViewDecorator C0;
    public j<S> D0;
    public int E0;
    public CharSequence F0;
    public boolean G0;
    public int H0;
    public int I0;
    public CharSequence J0;
    public int K0;
    public CharSequence L0;
    public int M0;
    public CharSequence N0;
    public int O0;
    public CharSequence P0;
    public TextView Q0;
    public TextView R0;
    public CheckableImageButton S0;
    public h T0;
    public Button U0;
    public boolean V0;
    public CharSequence W0;
    public CharSequence X0;

    /* renamed from: u0  reason: collision with root package name */
    public final LinkedHashSet<t<? super S>> f6190u0 = new LinkedHashSet<>();

    /* renamed from: v0  reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f6191v0 = new LinkedHashSet<>();

    /* renamed from: w0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f6192w0 = new LinkedHashSet<>();

    /* renamed from: x0  reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f6193x0 = new LinkedHashSet<>();

    /* renamed from: y0  reason: collision with root package name */
    public int f6194y0;

    /* renamed from: z0  reason: collision with root package name */
    public DateSelector<S> f6195z0;

    /* compiled from: MaterialDatePicker */
    public class a implements View.OnClickListener {
        public a() {
        }

        public final void onClick(View view) {
            Iterator<t<? super S>> it = r.this.f6190u0.iterator();
            while (it.hasNext()) {
                it.next().a(r.this.o0().v0());
            }
            r.this.j0(false, false);
        }
    }

    /* compiled from: MaterialDatePicker */
    public class b implements View.OnClickListener {
        public b() {
        }

        public final void onClick(View view) {
            Iterator<View.OnClickListener> it = r.this.f6191v0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            r.this.j0(false, false);
        }
    }

    /* compiled from: MaterialDatePicker */
    public class c extends y<S> {
        public c() {
        }

        public final void a() {
            r.this.U0.setEnabled(false);
        }

        public final void b(S s10) {
            r rVar = r.this;
            String q10 = rVar.o0().q(rVar.r());
            rVar.R0.setContentDescription(rVar.o0().c0(rVar.d0()));
            rVar.R0.setText(q10);
            r rVar2 = r.this;
            rVar2.U0.setEnabled(rVar2.o0().o0());
        }
    }

    /* compiled from: MaterialDatePicker */
    public static final class d<S> {

        /* renamed from: a  reason: collision with root package name */
        public final DateSelector<S> f6199a;

        /* renamed from: b  reason: collision with root package name */
        public int f6200b = 0;

        /* renamed from: c  reason: collision with root package name */
        public CalendarConstraints f6201c;

        /* renamed from: d  reason: collision with root package name */
        public int f6202d = 0;

        /* renamed from: e  reason: collision with root package name */
        public CharSequence f6203e = null;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f6204f = null;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f6205g = null;

        public d(RangeDateSelector rangeDateSelector) {
            this.f6199a = rangeDateSelector;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
            if (r4 != false) goto L_0x0083;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.google.android.material.datepicker.r<S> a() {
            /*
                r6 = this;
                com.google.android.material.datepicker.CalendarConstraints r0 = r6.f6201c
                if (r0 != 0) goto L_0x000f
                com.google.android.material.datepicker.CalendarConstraints$b r0 = new com.google.android.material.datepicker.CalendarConstraints$b
                r0.<init>()
                com.google.android.material.datepicker.CalendarConstraints r0 = r0.a()
                r6.f6201c = r0
            L_0x000f:
                int r0 = r6.f6202d
                if (r0 != 0) goto L_0x001b
                com.google.android.material.datepicker.DateSelector<S> r0 = r6.f6199a
                int r0 = r0.S()
                r6.f6202d = r0
            L_0x001b:
                com.google.android.material.datepicker.CalendarConstraints r0 = r6.f6201c
                com.google.android.material.datepicker.Month r1 = r0.f6078d
                r2 = 0
                if (r1 != 0) goto L_0x0085
                com.google.android.material.datepicker.DateSelector<S> r1 = r6.f6199a
                java.util.ArrayList r1 = r1.s0()
                boolean r1 = r1.isEmpty()
                r3 = 1
                if (r1 != 0) goto L_0x005f
                com.google.android.material.datepicker.DateSelector<S> r1 = r6.f6199a
                java.util.ArrayList r1 = r1.s0()
                java.util.Iterator r1 = r1.iterator()
                java.lang.Object r1 = r1.next()
                java.lang.Long r1 = (java.lang.Long) r1
                long r4 = r1.longValue()
                com.google.android.material.datepicker.Month r1 = com.google.android.material.datepicker.Month.k(r4)
                com.google.android.material.datepicker.CalendarConstraints r4 = r6.f6201c
                com.google.android.material.datepicker.Month r5 = r4.f6075a
                int r5 = r1.compareTo(r5)
                if (r5 < 0) goto L_0x005b
                com.google.android.material.datepicker.Month r4 = r4.f6076b
                int r4 = r1.compareTo(r4)
                if (r4 > 0) goto L_0x005b
                r4 = r3
                goto L_0x005c
            L_0x005b:
                r4 = r2
            L_0x005c:
                if (r4 == 0) goto L_0x005f
                goto L_0x0083
            L_0x005f:
                com.google.android.material.datepicker.Month r1 = new com.google.android.material.datepicker.Month
                java.util.Calendar r4 = com.google.android.material.datepicker.f0.h()
                r1.<init>(r4)
                com.google.android.material.datepicker.CalendarConstraints r4 = r6.f6201c
                com.google.android.material.datepicker.Month r5 = r4.f6075a
                int r5 = r1.compareTo(r5)
                if (r5 < 0) goto L_0x007b
                com.google.android.material.datepicker.Month r4 = r4.f6076b
                int r4 = r1.compareTo(r4)
                if (r4 > 0) goto L_0x007b
                goto L_0x007c
            L_0x007b:
                r3 = r2
            L_0x007c:
                if (r3 == 0) goto L_0x007f
                goto L_0x0083
            L_0x007f:
                com.google.android.material.datepicker.CalendarConstraints r1 = r6.f6201c
                com.google.android.material.datepicker.Month r1 = r1.f6075a
            L_0x0083:
                r0.f6078d = r1
            L_0x0085:
                com.google.android.material.datepicker.r r0 = new com.google.android.material.datepicker.r
                r0.<init>()
                android.os.Bundle r1 = new android.os.Bundle
                r1.<init>()
                int r3 = r6.f6200b
                java.lang.String r4 = "OVERRIDE_THEME_RES_ID"
                r1.putInt(r4, r3)
                com.google.android.material.datepicker.DateSelector<S> r3 = r6.f6199a
                java.lang.String r4 = "DATE_SELECTOR_KEY"
                r1.putParcelable(r4, r3)
                com.google.android.material.datepicker.CalendarConstraints r3 = r6.f6201c
                java.lang.String r4 = "CALENDAR_CONSTRAINTS_KEY"
                r1.putParcelable(r4, r3)
                r3 = 0
                java.lang.String r4 = "DAY_VIEW_DECORATOR_KEY"
                r1.putParcelable(r4, r3)
                int r4 = r6.f6202d
                java.lang.String r5 = "TITLE_TEXT_RES_ID_KEY"
                r1.putInt(r5, r4)
                java.lang.CharSequence r4 = r6.f6203e
                java.lang.String r5 = "TITLE_TEXT_KEY"
                r1.putCharSequence(r5, r4)
                java.lang.String r4 = "INPUT_MODE_KEY"
                r1.putInt(r4, r2)
                java.lang.String r4 = "POSITIVE_BUTTON_TEXT_RES_ID_KEY"
                r1.putInt(r4, r2)
                java.lang.CharSequence r4 = r6.f6204f
                java.lang.String r5 = "POSITIVE_BUTTON_TEXT_KEY"
                r1.putCharSequence(r5, r4)
                java.lang.String r4 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
                r1.putInt(r4, r2)
                java.lang.String r4 = "POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
                r1.putCharSequence(r4, r3)
                java.lang.String r4 = "NEGATIVE_BUTTON_TEXT_RES_ID_KEY"
                r1.putInt(r4, r2)
                java.lang.CharSequence r4 = r6.f6205g
                java.lang.String r5 = "NEGATIVE_BUTTON_TEXT_KEY"
                r1.putCharSequence(r5, r4)
                java.lang.String r4 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY"
                r1.putInt(r4, r2)
                java.lang.String r2 = "NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY"
                r1.putCharSequence(r2, r3)
                r0.g0(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.r.d.a():com.google.android.material.datepicker.r");
        }
    }

    public static int p0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_content_padding);
        int i10 = new Month(f0.h()).f6100d;
        int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.mtrl_calendar_day_width) * i10;
        return ((i10 - 1) * resources.getDimensionPixelOffset(R$dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean q0(Context context) {
        return r0(context, 16843277);
    }

    public static boolean r0(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8.b.c(R$attr.materialCalendarStyle, context, j.class.getCanonicalName()).data, new int[]{i10});
        boolean z10 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z10;
    }

    public final void J(Bundle bundle) {
        super.J(bundle);
        if (bundle == null) {
            bundle = this.f2448f;
        }
        this.f6194y0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f6195z0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.B0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.C0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.E0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.F0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.H0 = bundle.getInt("INPUT_MODE_KEY");
        this.I0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.J0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.K0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.L0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.M0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.N0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.O0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.P0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.F0;
        if (charSequence == null) {
            charSequence = d0().getResources().getText(this.E0);
        }
        this.W0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.X0 = charSequence;
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10;
        boolean z10;
        if (this.G0) {
            i10 = R$layout.mtrl_picker_fullscreen;
        } else {
            i10 = R$layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i10, viewGroup);
        Context context = inflate.getContext();
        DayViewDecorator dayViewDecorator = this.C0;
        if (dayViewDecorator != null) {
            dayViewDecorator.getClass();
        }
        if (this.G0) {
            inflate.findViewById(R$id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(p0(context), -2));
        } else {
            inflate.findViewById(R$id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(p0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R$id.mtrl_picker_header_selection_text);
        this.R0 = textView;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.g.f(textView, 1);
        this.S0 = (CheckableImageButton) inflate.findViewById(R$id.mtrl_picker_header_toggle);
        this.Q0 = (TextView) inflate.findViewById(R$id.mtrl_picker_title_text);
        this.S0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.S0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, h.a.a(context, R$drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], h.a.a(context, R$drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.S0;
        if (this.H0 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        checkableImageButton2.setChecked(z10);
        d0.o(this.S0, (w1.a) null);
        t0(this.S0);
        this.S0.setOnClickListener(new q(this, 0));
        this.U0 = (Button) inflate.findViewById(R$id.confirm_button);
        if (o0().o0()) {
            this.U0.setEnabled(true);
        } else {
            this.U0.setEnabled(false);
        }
        this.U0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.J0;
        if (charSequence != null) {
            this.U0.setText(charSequence);
        } else {
            int i11 = this.I0;
            if (i11 != 0) {
                this.U0.setText(i11);
            }
        }
        CharSequence charSequence2 = this.L0;
        if (charSequence2 != null) {
            this.U0.setContentDescription(charSequence2);
        } else if (this.K0 != 0) {
            this.U0.setContentDescription(r().getResources().getText(this.K0));
        }
        this.U0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R$id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.N0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i12 = this.M0;
            if (i12 != 0) {
                button.setText(i12);
            }
        }
        CharSequence charSequence4 = this.P0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.O0 != 0) {
            button.setContentDescription(r().getResources().getText(this.O0));
        }
        button.setOnClickListener(new b());
        return inflate;
    }

    public final void T(Bundle bundle) {
        Month month;
        super.T(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f6194y0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f6195z0);
        CalendarConstraints.b bVar = new CalendarConstraints.b(this.B0);
        j<S> jVar = this.D0;
        if (jVar == null) {
            month = null;
        } else {
            month = jVar.f6168j0;
        }
        if (month != null) {
            bVar.f6086c = Long.valueOf(month.f6102f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.C0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.E0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.F0);
        bundle.putInt("INPUT_MODE_KEY", this.H0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.I0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.J0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.K0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.L0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.M0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.N0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.O0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.P0);
    }

    public final void U() {
        Integer num;
        boolean z10;
        int i10;
        boolean z11;
        x0.d dVar;
        x0.d dVar2;
        super.U();
        Window window = l0().getWindow();
        if (this.G0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.T0);
            if (!this.V0) {
                View findViewById = e0().findViewById(R$id.fullscreen_header);
                ColorStateList d10 = b8.b.d(findViewById.getBackground());
                if (d10 != null) {
                    num = Integer.valueOf(d10.getDefaultColor());
                } else {
                    num = null;
                }
                int i11 = Build.VERSION.SDK_INT;
                boolean z12 = false;
                if (num == null || num.intValue() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int B = m9.b.B(window.getContext(), 16842801, -16777216);
                if (z10) {
                    num = Integer.valueOf(B);
                }
                Integer valueOf = Integer.valueOf(B);
                u0.a(window, false);
                window.getContext();
                Context context = window.getContext();
                if (i11 < 27) {
                    i10 = n1.d.d(m9.b.B(context, 16843858, -16777216), 128);
                } else {
                    i10 = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i10);
                boolean G = m9.b.G(num.intValue());
                if (m9.b.G(0) || G) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                w wVar = new w(window.getDecorView());
                if (i11 >= 30) {
                    x0.d dVar3 = new x0.d(window.getInsetsController(), wVar);
                    dVar3.f16428c = window;
                    dVar = dVar3;
                } else if (i11 >= 26) {
                    dVar = new x0.c(window, wVar);
                } else {
                    dVar = new x0.b(window, wVar);
                }
                dVar.d(z11);
                boolean G2 = m9.b.G(valueOf.intValue());
                if (m9.b.G(i10) || (i10 == 0 && G2)) {
                    z12 = true;
                }
                w wVar2 = new w(window.getDecorView());
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 30) {
                    x0.d dVar4 = new x0.d(window.getInsetsController(), wVar2);
                    dVar4.f16428c = window;
                    dVar2 = dVar4;
                } else if (i12 >= 26) {
                    dVar2 = new x0.c(window, wVar2);
                } else {
                    dVar2 = new x0.b(window, wVar2);
                }
                dVar2.c(z12);
                s sVar = new s(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                d0.i.u(findViewById, sVar);
                this.V0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = w().getDimensionPixelOffset(R$dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.T0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new a8.a(l0(), rect));
        }
        s0();
    }

    public final void V() {
        this.A0.f6230e0.clear();
        super.V();
    }

    public final Dialog k0() {
        Context d02 = d0();
        Context d03 = d0();
        int i10 = this.f6194y0;
        if (i10 == 0) {
            i10 = o0().g0(d03);
        }
        Dialog dialog = new Dialog(d02, i10);
        Context context = dialog.getContext();
        this.G0 = q0(context);
        int i11 = R$attr.materialCalendarStyle;
        int i12 = R$style.Widget_MaterialComponents_MaterialCalendar;
        this.T0 = new h(context, (AttributeSet) null, i11, i12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, R$styleable.MaterialCalendar, i11, i12);
        int color = obtainStyledAttributes.getColor(R$styleable.MaterialCalendar_backgroundTint, 0);
        obtainStyledAttributes.recycle();
        this.T0.k(context);
        this.T0.n(ColorStateList.valueOf(color));
        h hVar = this.T0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        hVar.m(d0.i.i(decorView));
        return dialog;
    }

    public final DateSelector<S> o0() {
        if (this.f6195z0 == null) {
            this.f6195z0 = (DateSelector) this.f2448f.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f6195z0;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f6192w0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f6193x0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.L;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [com.google.android.material.datepicker.u, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00ce  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s0() {
        /*
            r8 = this;
            android.content.Context r0 = r8.d0()
            int r1 = r8.f6194y0
            if (r1 == 0) goto L_0x0009
            goto L_0x0011
        L_0x0009:
            com.google.android.material.datepicker.DateSelector r1 = r8.o0()
            int r1 = r1.g0(r0)
        L_0x0011:
            com.google.android.material.datepicker.DateSelector r0 = r8.o0()
            com.google.android.material.datepicker.CalendarConstraints r2 = r8.B0
            com.google.android.material.datepicker.DayViewDecorator r3 = r8.C0
            com.google.android.material.datepicker.j r4 = new com.google.android.material.datepicker.j
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r5.putInt(r6, r1)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r5.putParcelable(r7, r0)
            java.lang.String r0 = "CALENDAR_CONSTRAINTS_KEY"
            r5.putParcelable(r0, r2)
            java.lang.String r7 = "DAY_VIEW_DECORATOR_KEY"
            r5.putParcelable(r7, r3)
            com.google.android.material.datepicker.Month r2 = r2.f6078d
            java.lang.String r3 = "CURRENT_MONTH_KEY"
            r5.putParcelable(r3, r2)
            r4.g0(r5)
            r8.D0 = r4
            int r2 = r8.H0
            r3 = 1
            if (r2 != r3) goto L_0x0067
            com.google.android.material.datepicker.DateSelector r2 = r8.o0()
            com.google.android.material.datepicker.CalendarConstraints r4 = r8.B0
            com.google.android.material.datepicker.u r5 = new com.google.android.material.datepicker.u
            r5.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r7.putInt(r6, r1)
            java.lang.String r1 = "DATE_SELECTOR_KEY"
            r7.putParcelable(r1, r2)
            r7.putParcelable(r0, r4)
            r5.g0(r7)
            r4 = r5
        L_0x0067:
            r8.A0 = r4
            android.widget.TextView r0 = r8.Q0
            int r1 = r8.H0
            r2 = 2
            if (r1 != r3) goto L_0x0083
            android.content.res.Resources r1 = r8.w()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            if (r1 != r2) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            if (r3 == 0) goto L_0x0083
            java.lang.CharSequence r1 = r8.X0
            goto L_0x0085
        L_0x0083:
            java.lang.CharSequence r1 = r8.W0
        L_0x0085:
            r0.setText(r1)
            com.google.android.material.datepicker.DateSelector r0 = r8.o0()
            android.content.Context r1 = r8.r()
            java.lang.String r0 = r0.q(r1)
            android.widget.TextView r1 = r8.R0
            com.google.android.material.datepicker.DateSelector r3 = r8.o0()
            android.content.Context r4 = r8.d0()
            java.lang.String r3 = r3.c0(r4)
            r1.setContentDescription(r3)
            android.widget.TextView r1 = r8.R0
            r1.setText(r0)
            androidx.fragment.app.FragmentManager r0 = r8.o()
            r0.getClass()
            androidx.fragment.app.a r1 = new androidx.fragment.app.a
            r1.<init>(r0)
            int r0 = com.google.android.material.R$id.mtrl_calendar_frame
            com.google.android.material.datepicker.z<S> r3 = r8.A0
            if (r0 == 0) goto L_0x00ce
            r4 = 0
            r1.g(r0, r3, r4, r2)
            r1.f()
            com.google.android.material.datepicker.z<S> r0 = r8.A0
            com.google.android.material.datepicker.r$c r1 = new com.google.android.material.datepicker.r$c
            r1.<init>()
            r0.i0(r1)
            return
        L_0x00ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must use non-zero containerViewId"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.r.s0():void");
    }

    public final void t0(CheckableImageButton checkableImageButton) {
        String str;
        if (this.H0 == 1) {
            str = checkableImageButton.getContext().getString(R$string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(R$string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.S0.setContentDescription(str);
    }
}

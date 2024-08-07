package com.ots.core.utils.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import ej.h;
import ek.i;
import java.util.ArrayList;
import kf.h;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: DropDownView.kt */
public final class DropDownView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<gf.b> f8350a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public TextView f8351b;

    /* renamed from: c  reason: collision with root package name */
    public TextView f8352c;

    /* renamed from: d  reason: collision with root package name */
    public rk.a<i> f8353d = b.f8360a;

    /* renamed from: e  reason: collision with root package name */
    public String f8354e = "reflection";

    /* renamed from: f  reason: collision with root package name */
    public boolean f8355f;

    /* compiled from: DropDownView.kt */
    public static final class a extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DropDownView f8356a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f8357b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f8358c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Context f8359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(DropDownView dropDownView, String str, boolean z10, Context context) {
            super(1);
            this.f8356a = dropDownView;
            this.f8357b = str;
            this.f8358c = z10;
            this.f8359d = context;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            ArrayList<gf.b> selectionReflectionType = this.f8356a.getSelectionReflectionType();
            String str = this.f8357b;
            if (str == null) {
                str = "Chọn phản ánh";
            }
            a aVar = new a(selectionReflectionType, str, this.f8358c);
            DropDownView dropDownView = this.f8356a;
            aVar.E0 = new c(dropDownView);
            try {
                Context context = this.f8359d;
                dropDownView.getClass();
                FragmentManager a10 = DropDownView.a(context);
                if (a10 != null) {
                    Context context2 = this.f8359d;
                    j.d(context2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    j.e(((FragmentActivity) context2).G(), "getSupportFragmentManager(...)");
                    aVar.n0(a10, "ModalBottomSheet");
                }
            } catch (ClassCastException unused) {
            }
            return i.f20112a;
        }
    }

    /* compiled from: DropDownView.kt */
    public static final class b extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8360a = new b();

        public b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DropDownView(Context context) {
        super(context);
        j.f(context, "context");
        b(context, (AttributeSet) null);
    }

    public static FragmentManager a(Context context) {
        int i10 = h.f12560a;
        if (context instanceof AppCompatActivity) {
            return ((AppCompatActivity) context).G();
        }
        if (context instanceof ContextThemeWrapper) {
            return a(((ContextThemeWrapper) context).getBaseContext());
        }
        if (!(context instanceof h.a)) {
            return null;
        }
        j.d(context, "null cannot be cast to non-null type androidx.fragment.app.Fragment");
        return ((Fragment) context).o();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
        if (r3 == null) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r8)
            int r1 = com.ots.core.R$layout.widget_drop_down
            r2 = 1
            r0.inflate(r1, r7, r2)
            int r0 = com.ots.core.R$id.dropTextView
            android.view.View r0 = r7.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r7.f8352c = r0
            r7.f8351b = r0
            int[] r0 = com.ots.core.R$styleable.DropDownWidget
            android.content.res.TypedArray r9 = r8.obtainStyledAttributes(r9, r0)
            java.lang.String r0 = "obtainStyledAttributes(...)"
            sk.j.e(r9, r0)
            int r0 = com.ots.core.R$styleable.DropDownWidget_ddIconEnd
            android.graphics.drawable.Drawable r0 = r9.getDrawable(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x0038
            android.widget.TextView r3 = r7.f8352c
            if (r3 == 0) goto L_0x0035
            r3.setCompoundDrawablesWithIntrinsicBounds(r2, r2, r0, r2)
            ek.i r3 = ek.i.f20112a
            goto L_0x0036
        L_0x0035:
            r3 = r2
        L_0x0036:
            if (r3 != 0) goto L_0x0043
        L_0x0038:
            android.widget.TextView r3 = r7.f8352c
            if (r3 == 0) goto L_0x0043
            int r4 = com.ots.core.R$drawable.ic_arrow_down
            r3.setCompoundDrawablesWithIntrinsicBounds(r1, r1, r4, r1)
            ek.i r3 = ek.i.f20112a
        L_0x0043:
            int r3 = com.ots.core.R$styleable.DropDownWidget_ddText
            java.lang.String r3 = r9.getString(r3)
            if (r3 == 0) goto L_0x0053
            android.widget.TextView r4 = r7.f8352c
            if (r4 != 0) goto L_0x0050
            goto L_0x0053
        L_0x0050:
            r4.setText(r3)
        L_0x0053:
            int r3 = com.ots.core.R$styleable.DropDownWidget_ddTitle
            java.lang.String r3 = r9.getString(r3)
            int r4 = com.ots.core.R$styleable.DropDownWidget_allowMultiSelect
            boolean r4 = r9.getBoolean(r4, r1)
            int r5 = com.ots.core.R$styleable.DropDownWidget_ddHint
            java.lang.String r5 = r9.getString(r5)
            if (r5 == 0) goto L_0x006f
            android.widget.TextView r6 = r7.f8352c
            if (r6 != 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r6.setHint(r5)
        L_0x006f:
            int r5 = com.ots.core.R$styleable.DropDownWidget_ddIconStart
            android.graphics.drawable.Drawable r5 = r9.getDrawable(r5)
            if (r5 == 0) goto L_0x007e
            android.widget.TextView r6 = r7.f8352c
            if (r6 == 0) goto L_0x007e
            r6.setCompoundDrawablesWithIntrinsicBounds(r5, r2, r0, r2)
        L_0x007e:
            int r0 = com.ots.core.R$styleable.DropDownWidget_ddValidatorType
            java.lang.String r0 = r9.getString(r0)
            if (r0 == 0) goto L_0x0088
            r7.f8354e = r0
        L_0x0088:
            int r0 = com.ots.core.R$styleable.DropDownWidget_ddRequired
            boolean r0 = r9.getBoolean(r0, r1)
            if (r0 == 0) goto L_0x009f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r7.f8354e
            java.lang.String r2 = "|required"
            java.lang.String r0 = android.support.v4.media.a.o(r0, r1, r2)
            r7.f8354e = r0
        L_0x009f:
            android.widget.TextView r0 = r7.f8351b
            if (r0 == 0) goto L_0x00b2
            r1 = 500(0x1f4, double:2.47E-321)
            com.ots.core.utils.customview.DropDownView$a r5 = new com.ots.core.utils.customview.DropDownView$a
            r5.<init>(r7, r3, r4, r8)
            kf.b r8 = new kf.b
            r8.<init>(r1, r0, r5)
            r0.setOnClickListener(r8)
        L_0x00b2:
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ots.core.utils.customview.DropDownView.b(android.content.Context, android.util.AttributeSet):void");
    }

    public final TextView getDropDownView() {
        return this.f8352c;
    }

    public final boolean getOnChange() {
        return this.f8355f;
    }

    public final rk.a<i> getOnLoadMoreAction() {
        return this.f8353d;
    }

    public final ArrayList<gf.b> getSelectionReflectionType() {
        return this.f8350a;
    }

    public final String getText() {
        CharSequence charSequence;
        TextView textView = this.f8351b;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        return String.valueOf(charSequence);
    }

    public final TextView getTvDropDown() {
        return this.f8351b;
    }

    public final void setDropDownView(TextView textView) {
        this.f8352c = textView;
    }

    public final void setFragmentManager(FragmentManager fragmentManager) {
        j.f(fragmentManager, "manager");
    }

    public final void setOnChange(boolean z10) {
        this.f8355f = z10;
    }

    public final void setOnLoadMoreAction(rk.a<i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8353d = aVar;
    }

    public final void setSelectionReflectionType(ArrayList<gf.b> arrayList) {
        j.f(arrayList, "<set-?>");
        this.f8350a = arrayList;
    }

    public final void setTvDropDown(TextView textView) {
        this.f8351b = textView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DropDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        b(context, attributeSet);
    }
}

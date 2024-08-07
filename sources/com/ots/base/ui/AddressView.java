package com.ots.base.ui;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import ek.i;
import gf.b;
import java.util.ArrayList;
import sk.j;
import sk.k;

/* compiled from: AddressTextView.kt */
public final class AddressView extends AppCompatTextView {

    /* renamed from: o  reason: collision with root package name */
    public ArrayList<b> f8238o = j7.a.e(new b("TP Hà Nội", true, (String) null, (Integer) null, 58), new b("TP Hồ Chí Minh", false, (String) null, (Integer) null, 62), new b("Đà Nẵng", false, (String) null, (Integer) null, 62));

    /* renamed from: p  reason: collision with root package name */
    public rk.a<i> f8239p = a.f8242a;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8240q;

    /* renamed from: r  reason: collision with root package name */
    public String f8241r = "";

    /* compiled from: AddressTextView.kt */
    public static final class a extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8242a = new a();

        public a() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressView(Context context) {
        super(context);
        j.f(context, "context");
        l(context, (AttributeSet) null);
    }

    public final boolean getOnChange() {
        return this.f8240q;
    }

    public final rk.a<i> getOnLoadMoreAction() {
        return this.f8239p;
    }

    public final ArrayList<b> getSelectionReflectionType() {
        return this.f8238o;
    }

    public final String getTitle() {
        return this.f8241r;
    }

    public final void l(Context context, AttributeSet attributeSet) {
        Spanned spanned;
        Spanned spanned2;
        this.f8241r = getText().toString();
        if (getTypeface().getStyle() == 1) {
            StringBuilder q10 = android.support.v4.media.a.q("<strong>");
            q10.append(getText());
            q10.append("</strong> <font color = '#FC0808'>*</font>");
            String sb2 = q10.toString();
            j.f(sb2, "string");
            if (Build.VERSION.SDK_INT >= 24) {
                spanned2 = Html.fromHtml(sb2, 0);
                j.c(spanned2);
            } else {
                spanned2 = Html.fromHtml(sb2);
                j.c(spanned2);
            }
            setText(spanned2);
            return;
        }
        String str = getText() + " <font color = '#FC0808'>*</font>";
        j.f(str, "string");
        if (Build.VERSION.SDK_INT >= 24) {
            spanned = Html.fromHtml(str, 0);
            j.c(spanned);
        } else {
            spanned = Html.fromHtml(str);
            j.c(spanned);
        }
        setText(spanned);
    }

    public final void setFragmentManager(FragmentManager fragmentManager) {
        j.f(fragmentManager, "manager");
    }

    public final void setOnChange(boolean z10) {
        this.f8240q = z10;
    }

    public final void setOnLoadMoreAction(rk.a<i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8239p = aVar;
    }

    public final void setSelectionReflectionType(ArrayList<b> arrayList) {
        j.f(arrayList, "<set-?>");
        this.f8238o = arrayList;
    }

    public final void setTitle(String str) {
        j.f(str, "<set-?>");
        this.f8241r = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        l(context, attributeSet);
    }
}

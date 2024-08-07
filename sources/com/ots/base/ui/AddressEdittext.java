package com.ots.base.ui;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.w;
import com.ots.base.ui.a;
import com.ots.core.R$styleable;
import com.ots.core.utils.customview.textview.AppTitleTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.R;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: AddressEdittext.kt */
public final class AddressEdittext extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Animator f8212a;

    /* renamed from: b  reason: collision with root package name */
    public rk.a<ek.i> f8213b = h.f8236a;

    /* renamed from: c  reason: collision with root package name */
    public l<? super String, ek.i> f8214c = g.f8235a;

    /* renamed from: d  reason: collision with root package name */
    public l<? super String, ek.i> f8215d = d.f8231a;

    /* renamed from: e  reason: collision with root package name */
    public TextView f8216e;

    /* renamed from: f  reason: collision with root package name */
    public AppTitleTextView f8217f;

    /* renamed from: n  reason: collision with root package name */
    public ImageView f8218n;

    /* renamed from: o  reason: collision with root package name */
    public ImageView f8219o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8220p;

    /* renamed from: q  reason: collision with root package name */
    public nf.a f8221q = new nf.a();

    /* renamed from: r  reason: collision with root package name */
    public String f8222r = "text";

    /* renamed from: s  reason: collision with root package name */
    public String f8223s = "";

    /* renamed from: t  reason: collision with root package name */
    public long f8224t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f8225u = true;

    /* renamed from: v  reason: collision with root package name */
    public ArrayList<gf.b> f8226v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public FragmentManager f8227w;

    /* compiled from: AddressEdittext.kt */
    public static final class a extends k implements l<View, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AddressEdittext f8228a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(AddressEdittext addressEdittext) {
            super(1);
            this.f8228a = addressEdittext;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            this.f8228a.getOnRightDrawableClicked().invoke();
            return ek.i.f20112a;
        }
    }

    /* compiled from: AddressEdittext.kt */
    public static final class b extends k implements l<View, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AddressEdittext f8229a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(AddressEdittext addressEdittext) {
            super(1);
            this.f8229a = addressEdittext;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            this.f8229a.getOnRightDrawableClicked().invoke();
            return ek.i.f20112a;
        }
    }

    /* compiled from: AddressEdittext.kt */
    public static final class c extends k implements l<View, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AddressEdittext f8230a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(AddressEdittext addressEdittext) {
            super(1);
            this.f8230a = addressEdittext;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            this.f8230a.getOnRightDrawableClicked().invoke();
            return ek.i.f20112a;
        }
    }

    /* compiled from: AddressEdittext.kt */
    public static final class d extends k implements l<String, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f8231a = new d();

        public d() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j.f((String) obj, "it");
            return ek.i.f20112a;
        }
    }

    /* compiled from: AddressEdittext.kt */
    public static final class e extends k implements rk.a<ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AddressEdittext f8232a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ a f8233b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(AddressEdittext addressEdittext, a aVar) {
            super(0);
            this.f8232a = addressEdittext;
            this.f8233b = aVar;
        }

        public final Object invoke() {
            Context context = this.f8232a.getContext();
            j.d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            w G = ((FragmentActivity) context).G();
            j.e(G, "getSupportFragmentManager(...)");
            this.f8233b.n0(G, "ModalBottomSheet");
            return ek.i.f20112a;
        }
    }

    /* compiled from: AddressEdittext.kt */
    public static final class f implements a.C0079a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AddressEdittext f8234a;

        public f(AddressEdittext addressEdittext) {
            this.f8234a = addressEdittext;
        }

        public final void a(ArrayList<gf.b> arrayList, String str) {
            boolean z10;
            T t10;
            String str2;
            j.f(str, "listItemString");
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                AppTitleTextView tvTitle = this.f8234a.getTvTitle();
                if (tvTitle != null) {
                    tvTitle.setVisibility(8);
                }
                TextView textView = this.f8234a.getTextView();
                if (textView != null) {
                    textView.setText(this.f8234a.getTvTextItem().f13595c);
                }
            } else {
                TextView textView2 = this.f8234a.getTextView();
                if (textView2 != null) {
                    textView2.setText(str);
                }
                AddressEdittext addressEdittext = this.f8234a;
                Animator loadAnimator = AnimatorInflater.loadAnimator(addressEdittext.getContext(), R.animator.fade_in);
                j.e(loadAnimator, "loadAnimator(...)");
                addressEdittext.setFadeInAnimation(loadAnimator);
                this.f8234a.getFadeInAnimation().setTarget(this.f8234a.getTvTitle());
                this.f8234a.getFadeInAnimation().start();
                AppTitleTextView tvTitle2 = this.f8234a.getTvTitle();
                if (tvTitle2 != null) {
                    tvTitle2.setVisibility(0);
                }
            }
            this.f8234a.setSelectionReflectionType(arrayList);
            l<String, ek.i> onItemSelected = this.f8234a.getOnItemSelected();
            Iterator<T> it = this.f8234a.getSelectionReflectionType().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (((gf.b) t10).f10499c) {
                    break;
                }
            }
            gf.b bVar = (gf.b) t10;
            if (bVar == null || (str2 = bVar.b()) == null) {
                str2 = "";
            }
            onItemSelected.invoke(str2);
        }
    }

    /* compiled from: AddressEdittext.kt */
    public static final class g extends k implements l<String, ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f8235a = new g();

        public g() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j.f((String) obj, "it");
            return ek.i.f20112a;
        }
    }

    /* compiled from: AddressEdittext.kt */
    public static final class h extends k implements rk.a<ek.i> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f8236a = new h();

        public h() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return ek.i.f20112a;
        }
    }

    /* compiled from: AddressEdittext.kt */
    public static final class i implements ah.h {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AddressEdittext f8237a;

        public i(AddressEdittext addressEdittext) {
            this.f8237a = addressEdittext;
        }

        public final void a(LocalDate localDate, String str) {
            boolean z10;
            this.f8237a.setDate(localDate.atStartOfDay().F(ZoneId.of("Asia/Ho_Chi_Minh")).toInstant().toEpochMilli());
            if (str.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                AppTitleTextView tvTitle = this.f8237a.getTvTitle();
                if (tvTitle != null) {
                    tvTitle.setVisibility(8);
                }
                TextView textView = this.f8237a.getTextView();
                if (textView != null) {
                    textView.setText(this.f8237a.getTvTextItem().f13595c);
                    return;
                }
                return;
            }
            TextView textView2 = this.f8237a.getTextView();
            if (textView2 != null) {
                textView2.setText(str);
            }
            this.f8237a.getOnChangeTime().invoke(str);
            AddressEdittext addressEdittext = this.f8237a;
            Animator loadAnimator = AnimatorInflater.loadAnimator(addressEdittext.getContext(), R.animator.fade_in);
            j.e(loadAnimator, "loadAnimator(...)");
            addressEdittext.setFadeInAnimation(loadAnimator);
            this.f8237a.getFadeInAnimation().setTarget(this.f8237a.getTvTitle());
            this.f8237a.getFadeInAnimation().start();
            AppTitleTextView tvTitle2 = this.f8237a.getTvTitle();
            if (tvTitle2 != null) {
                tvTitle2.setVisibility(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressEdittext(Context context) {
        super(context);
        j.f(context, "context");
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        int i10;
        int i11;
        AppTitleTextView appTitleTextView;
        Spanned spanned;
        Spanned spanned2;
        AppTitleTextView appTitleTextView2;
        Spanned spanned3;
        Object systemService = context.getSystemService("layout_inflater");
        j.d(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        boolean z10 = true;
        ((LayoutInflater) systemService).inflate(C0535R$layout.widget_text_layout, this, true);
        this.f8217f = (AppTitleTextView) findViewById(2131362771);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CustomEditTextWidget, 0, 0);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(8);
        if (string != null) {
            nf.a aVar = this.f8221q;
            aVar.getClass();
            aVar.f13594b = string;
            this.f8221q.f13593a = obtainStyledAttributes.getBoolean(7, false);
            if (this.f8221q.f13593a) {
                AppTitleTextView appTitleTextView3 = this.f8217f;
                if (appTitleTextView3 != null) {
                    String str = "<strong>" + string + "</strong> <font color = '#FC0808'>*</font>";
                    j.f(str, "string");
                    if (Build.VERSION.SDK_INT >= 24) {
                        spanned3 = Html.fromHtml(str, 0);
                        j.c(spanned3);
                    } else {
                        spanned3 = Html.fromHtml(str);
                        j.c(spanned3);
                    }
                    appTitleTextView3.setText(spanned3);
                }
            } else {
                AppTitleTextView appTitleTextView4 = this.f8217f;
                if (appTitleTextView4 != null) {
                    appTitleTextView4.setText(string);
                }
            }
        }
        String string2 = obtainStyledAttributes.getString(4);
        if (!(string2 == null || (appTitleTextView2 = this.f8217f) == null)) {
            appTitleTextView2.setText(string2);
        }
        String string3 = obtainStyledAttributes.getString(3);
        if (string3 != null) {
            nf.a aVar2 = this.f8221q;
            if (aVar2.f13593a) {
                String str2 = "<strong>" + string3 + "</strong> <font color = '#FC0808'>*</font>";
                j.f(str2, "string");
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 24) {
                    spanned = Html.fromHtml(str2, 0);
                    j.c(spanned);
                } else {
                    spanned = Html.fromHtml(str2);
                    j.c(spanned);
                }
                aVar2.f13595c = spanned;
                AppTitleTextView appTitleTextView5 = this.f8217f;
                if (appTitleTextView5 != null) {
                    appTitleTextView5.setText(this.f8221q.f13595c);
                }
                TextView textView = this.f8216e;
                if (textView != null) {
                    String str3 = "<strong>" + string3 + "</strong> <font color = '#FC0808'>*</font>";
                    j.f(str3, "string");
                    if (i12 >= 24) {
                        spanned2 = Html.fromHtml(str3, 0);
                        j.c(spanned2);
                    } else {
                        spanned2 = Html.fromHtml(str3);
                        j.c(spanned2);
                    }
                    textView.setText(spanned2);
                }
            } else {
                AppTitleTextView appTitleTextView6 = this.f8217f;
                if (appTitleTextView6 != null) {
                    appTitleTextView6.setText(string3);
                }
            }
        }
        boolean z11 = obtainStyledAttributes.getBoolean(10, false);
        View findViewById = findViewById(2131362314);
        j.e(findViewById, "findViewById(...)");
        if (z11) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        findViewById.setVisibility(i10);
        float dimension = obtainStyledAttributes.getDimension(9, 0.0f);
        if (dimension != 0.0f) {
            z10 = false;
        }
        if (!z10 && (appTitleTextView = this.f8217f) != null) {
            appTitleTextView.setTextSize(dimension);
        }
        String string4 = obtainStyledAttributes.getString(11);
        if (string4 != null) {
            this.f8222r = string4;
            View findViewById2 = findViewById(2131362780);
            j.e(findViewById2, "findViewById(...)");
            if (j.a(string4, "content")) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            findViewById2.setVisibility(i11);
        }
        if (this.f8221q.f13593a) {
            this.f8222r = android.support.v4.media.a.o(new StringBuilder(), this.f8222r, "|required");
        }
        obtainStyledAttributes.getString(2);
        this.f8221q.getClass();
        this.f8218n = (ImageView) findViewById(2131362198);
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        if (drawable != null) {
            ImageView imageView = this.f8218n;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
            ImageView imageView2 = this.f8218n;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        } else {
            ImageView imageView3 = this.f8218n;
            if (imageView3 != null) {
                imageView3.setVisibility(8);
            }
        }
        this.f8219o = (ImageView) findViewById(2131362197);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(5);
        if (drawable2 != null) {
            ImageView imageView4 = this.f8219o;
            if (imageView4 != null) {
                imageView4.setImageDrawable(drawable2);
            }
            ImageView imageView5 = this.f8219o;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
            }
        } else {
            ImageView imageView6 = this.f8219o;
            if (imageView6 != null) {
                imageView6.setVisibility(8);
            }
        }
        obtainStyledAttributes.recycle();
        ImageView imageView7 = this.f8219o;
        if (imageView7 != null) {
            imageView7.setOnClickListener(new kf.b(500, imageView7, new a(this)));
        }
        ImageView imageView8 = this.f8218n;
        if (imageView8 != null) {
            imageView8.setOnClickListener(new kf.b(500, imageView8, new b(this)));
        }
        TextView textView2 = this.f8216e;
        if (textView2 != null) {
            textView2.setOnClickListener(new kf.b(500, textView2, new c(this)));
        }
    }

    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        j.f(view, "child");
        j.f(layoutParams, "params");
        if (view instanceof TextView) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            ((FrameLayout) findViewById(2131362691)).addView(view, layoutParams);
            TextView textView = (TextView) view;
            this.f8216e = textView;
            textView.setText(this.f8221q.f13595c);
            TextView textView2 = this.f8216e;
            if (textView2 != null) {
                textView2.addTextChangedListener(new ye.b(this));
            }
            TextView textView3 = this.f8216e;
            if (textView3 != null) {
                textView3.addTextChangedListener(new ye.a());
                return;
            }
            return;
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b() {
        a aVar = new a(this.f8226v, this.f8221q.f13594b);
        aVar.G0 = new f(this);
        try {
            FragmentManager fragmentManager = this.f8227w;
            if (fragmentManager != null) {
                aVar.n0(fragmentManager, "ModalBottomSheet");
                ek.i iVar = ek.i.f20112a;
                return;
            }
            new e(this, aVar);
        } catch (ClassCastException e10) {
            e10.printStackTrace();
        }
    }

    public final void c() {
        Context context = getContext();
        j.e(context, "getContext(...)");
        LocalDate localDate = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.f8224t), ZoneId.systemDefault()).f();
        j.e(localDate, "toLocalDate(...)");
        ah.d dVar = new ah.d(context, localDate);
        dVar.f18961j = new i(this);
        dVar.h();
    }

    public final boolean getChecked() {
        return this.f8225u;
    }

    public final long getDate() {
        return this.f8224t;
    }

    public final Animator getFadeInAnimation() {
        Animator animator = this.f8212a;
        if (animator != null) {
            return animator;
        }
        j.l("fadeInAnimation");
        throw null;
    }

    public final ImageView getIconEnd() {
        return this.f8219o;
    }

    public final ImageView getIconStart() {
        return this.f8218n;
    }

    public final boolean getOnChange() {
        return this.f8220p;
    }

    public final l<String, ek.i> getOnChangeTime() {
        return this.f8215d;
    }

    public final l<String, ek.i> getOnItemSelected() {
        return this.f8214c;
    }

    public final rk.a<ek.i> getOnRightDrawableClicked() {
        return this.f8213b;
    }

    public final ArrayList<gf.b> getSelectionReflectionType() {
        return this.f8226v;
    }

    public final TextView getTextView() {
        return this.f8216e;
    }

    public final nf.a getTvTextItem() {
        return this.f8221q;
    }

    public final AppTitleTextView getTvTitle() {
        return this.f8217f;
    }

    public final String getValidatorTypeText() {
        return this.f8223s;
    }

    public final void setChecked(boolean z10) {
        this.f8225u = z10;
    }

    public final void setDate(long j10) {
        this.f8224t = j10;
    }

    public final void setFadeInAnimation(Animator animator) {
        j.f(animator, "<set-?>");
        this.f8212a = animator;
    }

    public final void setFragmentManager(FragmentManager fragmentManager) {
        j.f(fragmentManager, "manager");
        this.f8227w = fragmentManager;
    }

    public final void setIconEnd(ImageView imageView) {
        this.f8219o = imageView;
    }

    public final void setIconStart(ImageView imageView) {
        this.f8218n = imageView;
    }

    public final void setOnChange(boolean z10) {
        this.f8220p = z10;
    }

    public final void setOnChangeTime(l<? super String, ek.i> lVar) {
        j.f(lVar, "<set-?>");
        this.f8215d = lVar;
    }

    public final void setOnItemSelected(l<? super String, ek.i> lVar) {
        j.f(lVar, "<set-?>");
        this.f8214c = lVar;
    }

    public final void setOnRightDrawableClicked(rk.a<ek.i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8213b = aVar;
    }

    public final void setSelectionReflectionType(ArrayList<gf.b> arrayList) {
        j.f(arrayList, "<set-?>");
        this.f8226v = arrayList;
    }

    public final void setTextView(TextView textView) {
        this.f8216e = textView;
    }

    public final void setTimeContent(Long l10) {
        long j10;
        String str;
        String str2;
        if (l10 != null) {
            try {
                j10 = l10.longValue();
            } catch (Exception e10) {
                e10.printStackTrace();
                TextView textView = this.f8216e;
                if (textView != null) {
                    textView.setText("");
                    return;
                }
                return;
            }
        } else {
            j10 = System.currentTimeMillis();
        }
        this.f8224t = j10;
        TextView textView2 = this.f8216e;
        T t10 = null;
        if (textView2 != null) {
            if (l10 != null) {
                str2 = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date(l10.longValue()));
                if (str2 == null) {
                    str2 = "";
                }
            } else {
                str2 = null;
            }
            textView2.setText(str2);
        }
        if (l10 != null) {
            if (l10.longValue() == 0) {
                return;
            }
        }
        AppTitleTextView appTitleTextView = this.f8217f;
        if (appTitleTextView != null) {
            appTitleTextView.setVisibility(0);
        }
        l<? super String, ek.i> lVar = this.f8214c;
        Iterator<T> it = this.f8226v.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((gf.b) next).f10499c) {
                t10 = next;
                break;
            }
        }
        gf.b bVar = (gf.b) t10;
        if (bVar == null || (str = bVar.b()) == null) {
            str = "";
        }
        lVar.invoke(str);
    }

    public final void setTvTextItem(nf.a aVar) {
        j.f(aVar, "<set-?>");
        this.f8221q = aVar;
    }

    public final void setTvTitle(AppTitleTextView appTitleTextView) {
        this.f8217f = appTitleTextView;
    }

    public final void setValidatorTypeText(String str) {
        j.f(str, "<set-?>");
        this.f8223s = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressEdittext(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        a(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddressEdittext(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        a(context, attributeSet);
    }
}

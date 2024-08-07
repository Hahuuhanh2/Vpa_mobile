package com.ots.core.utils.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.w;
import com.ots.core.R$id;
import com.ots.core.R$layout;
import com.ots.core.R$styleable;
import ek.g;
import ek.i;
import java.util.ArrayList;
import java.util.Iterator;
import mf.e;
import mf.f;
import sk.j;
import sk.k;

/* compiled from: ImageRecyclerview.kt */
public final class ImageRecyclerview extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public ArrayList<gf.a> f8363a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f8364b;

    /* renamed from: c  reason: collision with root package name */
    public rk.a<i> f8365c = d.f8372a;

    /* renamed from: d  reason: collision with root package name */
    public rk.a<i> f8366d = b.f8370a;

    /* renamed from: e  reason: collision with root package name */
    public String f8367e = "";

    /* renamed from: f  reason: collision with root package name */
    public final g f8368f = j7.a.b0(new a(this));

    /* compiled from: ImageRecyclerview.kt */
    public static final class a extends k implements rk.a<p002if.c> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageRecyclerview f8369a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(ImageRecyclerview imageRecyclerview) {
            super(0);
            this.f8369a = imageRecyclerview;
        }

        public final Object invoke() {
            return new p002if.c(this.f8369a.getAccessToken(), new d(this.f8369a));
        }
    }

    /* compiled from: ImageRecyclerview.kt */
    public static final class b extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f8370a = new b();

        public b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* compiled from: ImageRecyclerview.kt */
    public static final class c<T> implements tj.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ImageRecyclerview f8371a;

        public c(ImageRecyclerview imageRecyclerview) {
            this.f8371a = imageRecyclerview;
        }

        public final void accept(Object obj) {
            Integer num = (Integer) obj;
            ArrayList<gf.a> medias = this.f8371a.getMedias();
            j.c(num);
            medias.remove(num.intValue());
            this.f8371a.getAdapter().A(this.f8371a.getMedias());
            z.d dVar = e.f13293a;
            ArrayList<gf.a> medias2 = this.f8371a.getMedias();
            dVar.getClass();
            j.f(medias2, "newList");
            Iterator it = ((ArrayList) dVar.f17746a).iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(medias2);
            }
        }
    }

    /* compiled from: ImageRecyclerview.kt */
    public static final class d extends k implements rk.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f8372a = new d();

        public d() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageRecyclerview(Context context) {
        super(context);
        j.f(context, "context");
        a(context, (AttributeSet) null);
    }

    @SuppressLint({"CheckResult"})
    public final void a(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R$layout.image_recycleview, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ImageWidget);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        View findViewById = findViewById(R$id.rcvImage);
        j.e(findViewById, "findViewById(...)");
        setRcv((RecyclerView) findViewById);
        int i10 = obtainStyledAttributes.getInt(R$styleable.ImageWidget_orientationRcv, 0);
        if (i10 == 0) {
            RecyclerView rcv = getRcv();
            p002if.c adapter = getAdapter();
            j.f(rcv, "view");
            rcv.getContext();
            rcv.setLayoutManager(new GridLayoutManager(2));
            rcv.setItemAnimator(new androidx.recyclerview.widget.c());
            RecyclerView.j itemAnimator = rcv.getItemAnimator();
            j.d(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
            ((w) itemAnimator).f3302g = false;
            rcv.setNestedScrollingEnabled(false);
            rcv.setAdapter(adapter);
        } else if (i10 == 1) {
            RecyclerView rcv2 = getRcv();
            rcv2.setHasFixedSize(true);
            rcv2.setLayoutManager(new LinearLayoutManager(1));
        }
        int i11 = obtainStyledAttributes.getInt(R$styleable.ImageWidget_flow, 0);
        if (i11 == 0) {
            p002if.c adapter2 = getAdapter();
            adapter2.getClass();
            adapter2.f11440s = "CREATE";
        } else if (i11 == 1) {
            p002if.c adapter3 = getAdapter();
            adapter3.getClass();
            adapter3.f11440s = "DETAIL";
        }
        ck.a<Integer> aVar = getAdapter().f11439r;
        c cVar = new c(this);
        aVar.getClass();
        aVar.b(new wj.c(cVar));
        obtainStyledAttributes.recycle();
    }

    public final String getAccessToken() {
        return this.f8367e;
    }

    public final p002if.c getAdapter() {
        return (p002if.c) this.f8368f.getValue();
    }

    public final rk.a<i> getCheckPermission() {
        return this.f8366d;
    }

    public final ArrayList<gf.a> getMedias() {
        return this.f8363a;
    }

    public final RecyclerView getRcv() {
        RecyclerView recyclerView = this.f8364b;
        if (recyclerView != null) {
            return recyclerView;
        }
        j.l("rcv");
        throw null;
    }

    public final rk.a<i> getRequestCamera() {
        return this.f8365c;
    }

    public final void setAccessToken(String str) {
        j.f(str, "<set-?>");
        this.f8367e = str;
    }

    public final void setCheckPermission(rk.a<i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8366d = aVar;
    }

    public final void setMedias(ArrayList<gf.a> arrayList) {
        j.f(arrayList, "<set-?>");
        this.f8363a = arrayList;
    }

    public final void setRcv(RecyclerView recyclerView) {
        j.f(recyclerView, "<set-?>");
        this.f8364b = recyclerView;
    }

    public final void setRequestCamera(rk.a<i> aVar) {
        j.f(aVar, "<set-?>");
        this.f8365c = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImageRecyclerview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        a(context, attributeSet);
    }
}

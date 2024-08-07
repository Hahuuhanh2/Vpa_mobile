package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: YearGridAdapter */
public final class h0 extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public final j<?> f6159d;

    /* compiled from: YearGridAdapter */
    public static class a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f6160u;

        public a(TextView textView) {
            super(textView);
            this.f6160u = textView;
        }
    }

    public h0(j<?> jVar) {
        this.f6159d = jVar;
    }

    public final int c() {
        return this.f6159d.f6166h0.f6080f;
    }

    public final void i(RecyclerView.a0 a0Var, int i10) {
        String str;
        Object obj;
        a aVar = (a) a0Var;
        int i11 = this.f6159d.f6166h0.f6075a.f6099c + i10;
        aVar.f6160u.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i11)}));
        TextView textView = aVar.f6160u;
        Context context = textView.getContext();
        if (f0.h().get(1) == i11) {
            str = String.format(context.getString(R$string.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i11)});
        } else {
            str = String.format(context.getString(R$string.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i11)});
        }
        textView.setContentDescription(str);
        b bVar = this.f6159d.f6170l0;
        Calendar h10 = f0.h();
        if (h10.get(1) == i11) {
            obj = bVar.f6125f;
        } else {
            obj = bVar.f6123d;
        }
        a aVar2 = (a) obj;
        for (Long longValue : this.f6159d.f6165g0.s0()) {
            h10.setTimeInMillis(longValue.longValue());
            if (h10.get(1) == i11) {
                aVar2 = (a) bVar.f6124e;
            }
        }
        aVar2.b(aVar.f6160u);
        aVar.f6160u.setOnClickListener(new g0(this, i11));
    }

    public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
        return new a((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R$layout.mtrl_calendar_year, recyclerView, false));
    }
}

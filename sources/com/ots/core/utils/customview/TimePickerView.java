package com.ots.core.utils.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w;
import com.ots.core.R$drawable;
import com.ots.core.R$id;
import com.ots.core.R$layout;
import com.ots.core.R$styleable;
import ek.i;
import fk.p;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import jf.d;
import kf.b;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: TimePickerView.kt */
public final class TimePickerView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public Calendar f8378a;

    /* renamed from: b  reason: collision with root package name */
    public String f8379b = "HH:mm dd/MM/yyyy";

    /* renamed from: c  reason: collision with root package name */
    public String f8380c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f8381d;

    /* renamed from: e  reason: collision with root package name */
    public String f8382e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8383f;

    /* compiled from: TimePickerView.kt */
    public static final class a extends k implements l<View, i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f8384a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TimePickerView f8385b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, TimePickerView timePickerView) {
            super(1);
            this.f8384a = context;
            this.f8385b = timePickerView;
        }

        public final Object invoke(Object obj) {
            j.f((View) obj, "it");
            try {
                Context context = this.f8384a;
                j.d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                w G = ((FragmentActivity) context).G();
                j.e(G, "getSupportFragmentManager(...)");
                TextView tvTime = this.f8385b.getTvTime();
                if (tvTime != null) {
                    Context context2 = this.f8384a;
                    TimePickerView timePickerView = this.f8385b;
                    CharSequence text = tvTime.getText();
                    j.e(text, "getText(...)");
                    CharSequence text2 = tvTime.getText();
                    j.e(text2, "getText(...)");
                    int parseInt = Integer.parseInt((String) p.M0(yk.l.f1((CharSequence) p.M0(yk.l.f1(text2, new String[]{" "})), new String[]{":"})));
                    CharSequence text3 = tvTime.getText();
                    j.e(text3, "getText(...)");
                    d dVar = new d(context2, Integer.parseInt((String) p.R0(yk.l.f1((CharSequence) p.M0(yk.l.f1(text3, new String[]{" "})), new String[]{":"}))), parseInt, (String) p.R0(yk.l.f1(text, new String[]{" "})));
                    dVar.I0 = new e(timePickerView);
                    dVar.n0(G, "ModalBottomSheet");
                }
            } catch (ClassCastException unused) {
            }
            return i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerView(Context context) {
        super(context);
        String str;
        j.f(context, "context");
        Calendar instance = Calendar.getInstance();
        this.f8378a = instance;
        j.e(instance, "currentReflectionCalendar");
        String str2 = this.f8379b;
        j.f(str2, "format");
        try {
            str = new SimpleDateFormat(str2, Locale.getDefault()).format(instance.getTime());
            j.e(str, "format(...)");
        } catch (Exception unused) {
            str = "";
        }
        this.f8380c = str;
        this.f8382e = "time";
        a(context, (AttributeSet) null);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        i iVar;
        String str;
        LayoutInflater.from(context).inflate(R$layout.widget_time_edittext, this, true);
        TextView textView = (TextView) findViewById(R$id.tvTime);
        this.f8381d = textView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TimePickerWidget);
        j.e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = obtainStyledAttributes.getString(R$styleable.TimePickerWidget_timeFormat);
        if (string != null) {
            this.f8379b = string;
        }
        Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.TimePickerWidget_timeIconEnd);
        if (drawable != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            iVar = i.f20112a;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, R$drawable.ic_calendar, 0);
        }
        String string2 = obtainStyledAttributes.getString(R$styleable.TimePickerWidget_timeText);
        if (string2 != null) {
            textView.setText(string2);
        }
        String string3 = obtainStyledAttributes.getString(R$styleable.TimePickerWidget_timeValidatorType);
        if (string3 != null) {
            this.f8382e = string3;
        }
        obtainStyledAttributes.getString(R$styleable.TimePickerWidget_timeTitle);
        String string4 = obtainStyledAttributes.getString(R$styleable.TimePickerWidget_timeHint);
        if (string4 != null) {
            textView.setHint(string4);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(R$styleable.TimePickerWidget_timeIconStart);
        if (drawable2 != null) {
            textView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
        }
        if (obtainStyledAttributes.getBoolean(R$styleable.TimePickerWidget_timeRequired, false)) {
            this.f8382e = android.support.v4.media.a.o(new StringBuilder(), this.f8382e, "|required");
        }
        TextView textView2 = this.f8381d;
        j.c(textView2);
        Calendar calendar = this.f8378a;
        j.e(calendar, "currentReflectionCalendar");
        String str2 = this.f8379b;
        j.f(str2, "format");
        try {
            str = new SimpleDateFormat(str2, Locale.getDefault()).format(calendar.getTime());
            j.e(str, "format(...)");
        } catch (Exception unused) {
            str = "";
        }
        textView2.setText(str);
        TextView textView3 = this.f8381d;
        if (textView3 != null) {
            textView3.setOnClickListener(new b(500, textView3, new a(context, this)));
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean getOnChange() {
        return this.f8383f;
    }

    public final String getText() {
        CharSequence charSequence;
        TextView textView = this.f8381d;
        if (textView != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        return String.valueOf(charSequence);
    }

    public final String getTime() {
        return this.f8380c;
    }

    public final TextView getTvTime() {
        return this.f8381d;
    }

    public final void setOnChange(boolean z10) {
        this.f8383f = z10;
    }

    public final void setTime(String str) {
        j.f(str, "<set-?>");
        this.f8380c = str;
    }

    public final void setTvTime(TextView textView) {
        this.f8381d = textView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        String str;
        j.f(context, "context");
        j.f(attributeSet, "attrs");
        Calendar instance = Calendar.getInstance();
        this.f8378a = instance;
        j.e(instance, "currentReflectionCalendar");
        String str2 = this.f8379b;
        j.f(str2, "format");
        try {
            str = new SimpleDateFormat(str2, Locale.getDefault()).format(instance.getTime());
            j.e(str, "format(...)");
        } catch (Exception unused) {
            str = "";
        }
        this.f8380c = str;
        this.f8382e = "time";
        a(context, attributeSet);
    }
}

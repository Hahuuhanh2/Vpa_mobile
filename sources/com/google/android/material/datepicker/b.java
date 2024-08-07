package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import i8.c;

/* compiled from: CalendarStyle */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f6120a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f6121b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f6122c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f6123d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f6124e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f6125f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f6126g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f6127h;

    public /* synthetic */ b(MaterialCardView materialCardView, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.f6120a = materialCardView;
        this.f6121b = materialButton;
        this.f6122c = materialButton2;
        this.f6123d = materialButton3;
        this.f6124e = imageView;
        this.f6125f = imageView2;
        this.f6126g = textView;
        this.f6127h = textView2;
    }

    public b(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i8.b.c(R$attr.materialCalendarStyle, context, j.class.getCanonicalName()).data, R$styleable.MaterialCalendar);
        this.f6120a = a.a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayStyle, 0));
        this.f6126g = a.a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f6121b = a.a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f6122c = a.a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, R$styleable.MaterialCalendar_rangeFillColor);
        this.f6123d = a.a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearStyle, 0));
        this.f6124e = a.a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f6125f = a.a(context, obtainStyledAttributes.getResourceId(R$styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f6127h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}

package com.ots.base.utils.customview;

import android.content.Context;
import android.os.Build;
import android.os.CountDownTimer;
import android.text.Html;
import android.text.Spanned;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ek.i;
import java.util.Calendar;
import sk.j;
import yk.l;

/* compiled from: TimeCounterView.kt */
public final class TimeCounterView extends AppCompatTextView {

    /* renamed from: o  reason: collision with root package name */
    public CountDownTimer f8269o;

    /* compiled from: TimeCounterView.kt */
    public static final class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TimeCounterView f8270a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ rk.a<i> f8271b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(TimeCounterView timeCounterView, rk.a<i> aVar, long j10) {
            super(j10, 1000);
            this.f8270a = timeCounterView;
            this.f8271b = aVar;
        }

        public final void onFinish() {
            this.f8270a.setText("Hết hạn");
            this.f8271b.invoke();
        }

        public final void onTick(long j10) {
            TimeCounterView timeCounterView = this.f8270a;
            timeCounterView.getClass();
            timeCounterView.setText(TimeCounterView.l(j10));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeCounterView(Context context) {
        super(context);
        j.f(context, "context");
    }

    public static Spanned l(long j10) {
        int i10 = (int) (j10 / ((long) 1000));
        int i11 = (i10 % 3600) / 60;
        int i12 = i10 % 60;
        int i13 = (i10 % 86400) / 3600;
        int i14 = i10 / 86400;
        StringBuilder sb2 = new StringBuilder();
        if (i14 > 0) {
            sb2.append(i14 + " ngày ");
        }
        if (i13 > 0) {
            sb2.append(i13 + " giờ ");
        }
        if (i11 > 0) {
            sb2.append(i11 + " phút ");
        }
        if (i12 > 0 && i13 <= 0) {
            sb2.append(i12 + " giây");
        }
        String sb3 = sb2.toString();
        j.e(sb3, "toString(...)");
        String obj = l.k1(sb3).toString();
        j.f(obj, "string");
        if (Build.VERSION.SDK_INT >= 24) {
            Spanned l10 = Html.fromHtml(obj, 0);
            j.c(l10);
            return l10;
        }
        Spanned fromHtml = Html.fromHtml(obj);
        j.c(fromHtml);
        return fromHtml;
    }

    public final CountDownTimer getCountDownTimer() {
        return this.f8269o;
    }

    public final void m(long j10, rk.a<i> aVar) {
        CountDownTimer countDownTimer = this.f8269o;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        setText(l(j10 - Calendar.getInstance().getTimeInMillis()));
        a aVar2 = new a(this, aVar, j10 - Calendar.getInstance().getTimeInMillis());
        this.f8269o = aVar2;
        aVar2.start();
    }

    public final void setCountDownTimer(CountDownTimer countDownTimer) {
        this.f8269o = countDownTimer;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeCounterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimeCounterView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
    }
}

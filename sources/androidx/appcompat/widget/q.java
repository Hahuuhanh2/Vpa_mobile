package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

/* compiled from: AppCompatTextHelper */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TextView f1199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f1200b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f1201c;

    public q(TextView textView, Typeface typeface, int i10) {
        this.f1199a = textView;
        this.f1200b = typeface;
        this.f1201c = i10;
    }

    public final void run() {
        this.f1199a.setTypeface(this.f1200b, this.f1201c);
    }
}

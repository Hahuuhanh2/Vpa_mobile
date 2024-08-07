package x1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: AccessibilityClickableSpanCompat */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    public final int f16857a;

    /* renamed from: b  reason: collision with root package name */
    public final f f16858b;

    /* renamed from: c  reason: collision with root package name */
    public final int f16859c;

    public a(int i10, f fVar, int i11) {
        this.f16857a = i10;
        this.f16858b = fVar;
        this.f16859c = i11;
    }

    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f16857a);
        f fVar = this.f16858b;
        fVar.f16862a.performAction(this.f16859c, bundle);
    }
}

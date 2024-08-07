package y6;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class r extends t {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Intent f17584a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f17585b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f17586c;

    public r(int i10, Activity activity, Intent intent) {
        this.f17584a = intent;
        this.f17585b = activity;
        this.f17586c = i10;
    }

    public final void a() {
        Intent intent = this.f17584a;
        if (intent != null) {
            this.f17585b.startActivityForResult(intent, this.f17586c);
        }
    }
}

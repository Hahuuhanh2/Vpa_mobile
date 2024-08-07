package xd;

import android.content.Intent;
import com.journeyapps.barcodescanner.b;

/* compiled from: CaptureManager */
public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f17288a;

    public d(b bVar) {
        this.f17288a = bVar;
    }

    public final void run() {
        b bVar = this.f17288a;
        bVar.getClass();
        Intent intent = new Intent("com.google.zxing.client.android.SCAN");
        intent.putExtra("TIMEOUT", true);
        bVar.f8015a.setResult(0, intent);
        bVar.a();
    }
}

package r;

import android.os.IBinder;
import androidx.browser.customtabs.CustomTabsService;
import java.util.NoSuchElementException;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CustomTabsService.a f14449a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f14450b;

    public /* synthetic */ a(CustomTabsService.a aVar, b bVar) {
        this.f14449a = aVar;
        this.f14450b = bVar;
    }

    public final void binderDied() {
        IBinder iBinder;
        CustomTabsService.a aVar = this.f14449a;
        b bVar = this.f14450b;
        CustomTabsService customTabsService = CustomTabsService.this;
        customTabsService.getClass();
        try {
            synchronized (customTabsService.f1267a) {
                b.a aVar2 = bVar.f14451a;
                if (aVar2 == null) {
                    iBinder = null;
                } else {
                    iBinder = aVar2.asBinder();
                }
                if (iBinder != null) {
                    iBinder.unlinkToDeath(customTabsService.f1267a.getOrDefault(iBinder, null), 0);
                    customTabsService.f1267a.remove(iBinder);
                }
            }
        } catch (NoSuchElementException unused) {
        }
    }
}

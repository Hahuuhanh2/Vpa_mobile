package ej;

import android.app.Application;
import android.app.Service;
import hj.b;
import ng.k;
import ng.o;
import p3.l0;

/* compiled from: ServiceComponentManager */
public final class g implements b<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final Service f20088a;

    /* renamed from: b  reason: collision with root package name */
    public o f20089b;

    /* compiled from: ServiceComponentManager */
    public interface a {
        k a();
    }

    public g(Service service) {
        this.f20088a = service;
    }

    public final Object d() {
        if (this.f20089b == null) {
            Application application = this.f20088a.getApplication();
            l0.q(application instanceof b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
            k a10 = ((a) l0.X(a.class, application)).a();
            Service service = this.f20088a;
            a10.getClass();
            service.getClass();
            Class<Service> cls = Service.class;
            this.f20089b = new o(a10.f21577a);
        }
        return this.f20089b;
    }
}

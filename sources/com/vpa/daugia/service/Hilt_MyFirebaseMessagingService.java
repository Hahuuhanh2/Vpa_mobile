package com.vpa.daugia.service;

import com.google.firebase.messaging.FirebaseMessagingService;
import ej.g;
import hj.b;
import vi.a;

public abstract class Hilt_MyFirebaseMessagingService extends FirebaseMessagingService implements b {

    /* renamed from: o  reason: collision with root package name */
    public volatile g f19907o;

    /* renamed from: p  reason: collision with root package name */
    public final Object f19908p = new Object();

    /* renamed from: q  reason: collision with root package name */
    public boolean f19909q = false;

    public final Object d() {
        if (this.f19907o == null) {
            synchronized (this.f19908p) {
                if (this.f19907o == null) {
                    this.f19907o = new g(this);
                }
            }
        }
        return this.f19907o.d();
    }

    public final void onCreate() {
        if (!this.f19909q) {
            this.f19909q = true;
            ((a) d()).a((MyFirebaseMessagingService) this);
        }
        super.onCreate();
    }
}

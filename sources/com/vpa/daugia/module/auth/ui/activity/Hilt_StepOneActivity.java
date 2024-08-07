package com.vpa.daugia.module.auth.ui.activity;

import androidx.lifecycle.f0;
import com.ots.core.base.BaseActivity;
import d2.l;
import ej.a;
import hj.b;
import zg.q;

public abstract class Hilt_StepOneActivity<DB extends l> extends BaseActivity<DB> implements b {
    public volatile a O;
    public final Object P = new Object();
    public boolean Q = false;

    public Hilt_StepOneActivity() {
        D(new q(this));
    }

    public final Object d() {
        if (this.O == null) {
            synchronized (this.P) {
                if (this.O == null) {
                    this.O = new a(this);
                }
            }
        }
        return this.O.d();
    }

    public final f0.b f() {
        return dj.a.a(this, super.f());
    }
}

package com.vpa.daugia.module.auth.ui.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.a;
import com.vpa.daugia.module.auth.ui.viewmodel.RegisterViewModel;
import d2.i;
import fk.p;
import java.text.SimpleDateFormat;
import java.util.Date;
import sk.j;
import yk.l;

/* compiled from: RegisterAccountActivity.kt */
public final class RegisterAccountActivity$mMessageReceiver$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegisterAccountActivity f19520a;

    public RegisterAccountActivity$mMessageReceiver$1(RegisterAccountActivity registerAccountActivity) {
        this.f19520a = registerAccountActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        j.f(context, "context");
        j.f(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras != null) {
            RegisterAccountActivity registerAccountActivity = this.f19520a;
            String string = extras.getString("QR_CODE");
            if (string != null) {
                String str2 = RegisterAccountActivity.T;
                ((RegisterViewModel) registerAccountActivity.R.getValue()).f19587d.g(p.M0(l.f1(string, new String[]{"|"})));
                ((RegisterViewModel) registerAccountActivity.R.getValue()).f19588e.g(l.f1(string, new String[]{"|"}).get(2));
                ((RegisterViewModel) registerAccountActivity.R.getValue()).f19589f.g(l.f1(string, new String[]{"|"}).get(5));
                i<String> iVar = ((RegisterViewModel) registerAccountActivity.R.getValue()).f19590g;
                String str3 = (String) l.f1(string, new String[]{"|"}).get(3);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date parse = new SimpleDateFormat("ddMMyyyy").parse(str3);
                    j.c(parse);
                    str = simpleDateFormat.format(parse);
                    j.e(str, "format(...)");
                } catch (Exception e10) {
                    StringBuilder q10 = a.q("Đã xảy ra lỗi: ");
                    q10.append(e10.getMessage());
                    System.out.println(q10.toString());
                    str = "";
                }
                iVar.g(str);
            }
        }
    }
}

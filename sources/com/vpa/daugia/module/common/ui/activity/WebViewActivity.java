package com.vpa.daugia.module.common.ui.activity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import c0.i0;
import com.google.android.material.datepicker.q;
import com.ots.core.R$layout;
import com.ots.core.base.BaseActivity;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import d.k;
import fk.p;
import java.util.WeakHashMap;
import kf.h;
import mg.a2;
import sk.j;
import w1.d0;
import w1.q0;
import yk.l;

/* compiled from: WebViewActivity.kt */
public final class WebViewActivity extends BaseActivity<a2> {
    public static final /* synthetic */ int O = 0;

    /* compiled from: WebViewActivity.kt */
    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f19633a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ WebViewActivity f19634b;

        public a(Dialog dialog, WebViewActivity webViewActivity) {
            this.f19633a = dialog;
            this.f19634b = webViewActivity;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f19633a.hide();
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webView != null) {
                webView.setVisibility(8);
            }
            this.f19633a.hide();
            Toast.makeText(this.f19634b.getApplicationContext(), "Vui lòng kiểm tra lại kết nối", 0).show();
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Uri uri;
            Uri uri2 = null;
            if (webResourceRequest != null) {
                uri = webResourceRequest.getUrl();
            } else {
                uri = null;
            }
            if (l.N0(String.valueOf(uri), "tel:")) {
                WebViewActivity webViewActivity = this.f19634b;
                if (webResourceRequest != null) {
                    uri2 = webResourceRequest.getUrl();
                }
                String str = (String) p.R0(l.f1(String.valueOf(uri2), new String[]{":"}));
                j.f(webViewActivity, "context");
                j.f(str, "phone");
                try {
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:" + str));
                    webViewActivity.startActivity(intent);
                    return true;
                } catch (Exception e10) {
                    h.a(e10);
                    return true;
                }
            } else {
                this.f19633a.show();
                return false;
            }
        }
    }

    public final int N() {
        return C0535R$layout.activity_web_view;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void onCreate(Bundle bundle) {
        Dialog dialog;
        super.onCreate(bundle);
        k.a(this);
        View findViewById = findViewById(2131362339);
        i0 i0Var = new i0(29);
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        d0.i.u(findViewById, i0Var);
        try {
            dialog = new Dialog(this);
            dialog.setContentView(LayoutInflater.from(this).inflate(R$layout.widget_progress_dialog, (ViewGroup) null));
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        } catch (Exception e10) {
            h.a(e10);
            dialog = new Dialog(this);
        }
        if (getIntent().hasExtra("WEB_TITLE")) {
            ((AppTextView) ((a2) M()).f20939z.f10530d).setText(getIntent().getStringExtra("WEB_TITLE"));
        }
        if (getIntent().hasExtra("WEB_LINK")) {
            dialog.show();
            ((a2) M()).A.setWebViewClient(new a(dialog, this));
            ((a2) M()).A.getSettings().setJavaScriptEnabled(true);
            ((a2) M()).A.getSettings().setJavaScriptEnabled(true);
            ((a2) M()).A.getSettings().setLoadWithOverviewMode(true);
            ((a2) M()).A.getSettings().setUseWideViewPort(true);
            TextView textView = ((a2) M()).f20938y;
            String stringExtra = getIntent().getStringExtra("WEB_LINK");
            j.c(stringExtra);
            textView.setText(Html.fromHtml(fk.h.D0(stringExtra)));
            WebView webView = ((a2) M()).A;
            String stringExtra2 = getIntent().getStringExtra("WEB_LINK");
            j.c(stringExtra2);
            webView.loadData(fk.h.D0(stringExtra2), "text/html", "UTF-8");
        }
        ((ImageButton) ((a2) M()).f20939z.f10528b).setOnClickListener(new q(this, 20));
    }
}

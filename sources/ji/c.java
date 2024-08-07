package ji;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import androidx.databinding.DataBinderMapperImpl;
import com.ots.core.R$layout;
import com.vpa.daugia.C0535R$layout;
import ef.f;
import fk.p;
import kf.h;
import mg.v2;
import sk.j;
import yk.l;

/* compiled from: DialogRegulation.kt */
public final class c extends f.a<c> {

    /* renamed from: i  reason: collision with root package name */
    public v2 f20783i;

    /* renamed from: j  reason: collision with root package name */
    public d f20784j;

    /* renamed from: k  reason: collision with root package name */
    public final Dialog f20785k;

    /* compiled from: DialogRegulation.kt */
    public static final class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f20786a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f20787b;

        public a(c cVar, Context context) {
            this.f20786a = cVar;
            this.f20787b = context;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            this.f20786a.f20785k.hide();
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (webView != null) {
                webView.setVisibility(8);
            }
            this.f20786a.f20785k.hide();
            Toast.makeText(this.f20787b, "Vui lòng kiểm tra lại kết nối", 0).show();
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
                Context context = this.f20787b;
                if (webResourceRequest != null) {
                    uri2 = webResourceRequest.getUrl();
                }
                String str = (String) p.R0(l.f1(String.valueOf(uri2), new String[]{":"}));
                j.f(context, "context");
                j.f(str, "phone");
                try {
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:" + str));
                    context.startActivity(intent);
                    return true;
                } catch (Exception e10) {
                    h.a(e10);
                    return true;
                }
            } else {
                this.f20786a.f20785k.show();
                return false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(Context context, String str) {
        super(context);
        Dialog dialog;
        int i10;
        int i11;
        CharSequence charSequence;
        j.f(context, "context");
        LayoutInflater from = LayoutInflater.from(context);
        int i12 = v2.A;
        DataBinderMapperImpl dataBinderMapperImpl = d2.f.f8544a;
        String str2 = null;
        v2 v2Var = (v2) d2.l.l(from, C0535R$layout.dialog_regulation, (ViewGroup) null, (Object) null);
        j.e(v2Var, "inflate(...)");
        this.f20783i = v2Var;
        try {
            dialog = new Dialog(context);
            dialog.setContentView(LayoutInflater.from(context).inflate(R$layout.widget_progress_dialog, (ViewGroup) null));
            dialog.setCancelable(false);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
        } catch (Exception e10) {
            h.a(e10);
            dialog = new Dialog(context);
        }
        this.f20785k = dialog;
        this.f20783i.f21401z.setWebViewClient(new a(this, context));
        this.f20783i.f21401z.getSettings().setJavaScriptEnabled(true);
        this.f20783i.f21401z.getSettings().setLoadWithOverviewMode(true);
        this.f20783i.f21401z.getSettings().setUseWideViewPort(true);
        this.f20783i.f21401z.getSettings().setSupportZoom(true);
        this.f20783i.f21401z.getSettings().setBuiltInZoomControls(true);
        if (str != null) {
            i10 = l.S0(str, "if gte vml 1", 0, false, 6);
        } else {
            i10 = 0;
        }
        if (str != null) {
            i11 = l.S0(str, "if !vml", 0, false, 6);
        } else {
            i11 = 0;
        }
        if (str != null) {
            if (i11 >= i10) {
                if (i11 == i10) {
                    charSequence = str.subSequence(0, str.length());
                } else {
                    StringBuilder sb2 = new StringBuilder(str.length() - (i11 - i10));
                    sb2.append(str, 0, i10);
                    sb2.append(str, i11, str.length());
                    charSequence = sb2;
                }
                str2 = charSequence.toString();
            } else {
                throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
            }
        }
        this.f20783i.f21401z.loadData(str2 == null ? "" : str2, "text/html", "UTF-8");
        this.f20783i.f21401z.setOnScrollChangeListener(new b(this));
        this.f20783i.f21398w.setOnClickListener(new ei.a(this, 5));
        this.f20783i.f21399x.setOnClickListener(new ai.c(this, 7));
        g(-1);
        e(this.f20783i.f8554e);
        d(false);
    }
}

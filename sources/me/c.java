package me;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$style;
import com.luck.picture.lib.decoration.WrapContentLinearLayoutManager;
import com.luck.picture.lib.entity.LocalMediaFolder;
import ee.i;
import java.util.ArrayList;
import java.util.List;

/* compiled from: AlbumListPopWindow */
public final class c extends PopupWindow {

    /* renamed from: a  reason: collision with root package name */
    public View f13276a;

    /* renamed from: b  reason: collision with root package name */
    public RecyclerView f13277b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f13278c = false;

    /* renamed from: d  reason: collision with root package name */
    public int f13279d;

    /* renamed from: e  reason: collision with root package name */
    public fe.b f13280e;

    /* renamed from: f  reason: collision with root package name */
    public ke.a f13281f;

    /* renamed from: g  reason: collision with root package name */
    public b f13282g;

    /* compiled from: AlbumListPopWindow */
    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            c.super.dismiss();
            c.this.f13278c = false;
        }
    }

    /* compiled from: AlbumListPopWindow */
    public interface b {
    }

    public c(Context context, ke.a aVar) {
        this.f13281f = aVar;
        setContentView(LayoutInflater.from(context).inflate(R$layout.ps_window_folder, (ViewGroup) null));
        setWidth(-1);
        setHeight(-2);
        setAnimationStyle(R$style.PictureThemeWindowStyle);
        setFocusable(true);
        setOutsideTouchable(true);
        update();
        this.f13279d = (int) (((double) xe.c.f(context)) * 0.6d);
        this.f13277b = (RecyclerView) getContentView().findViewById(R$id.folder_list);
        this.f13276a = getContentView().findViewById(R$id.rootViewBg);
        this.f13277b.setLayoutManager(new WrapContentLinearLayoutManager());
        fe.b bVar = new fe.b(this.f13281f);
        this.f13280e = bVar;
        this.f13277b.setAdapter(bVar);
        this.f13276a.setOnClickListener(new a(this));
        getContentView().findViewById(R$id.rootView).setOnClickListener(new b(this));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void b(List<LocalMediaFolder> list) {
        int i10;
        fe.b bVar = this.f13280e;
        bVar.getClass();
        bVar.f10196d = new ArrayList(list);
        this.f13280e.f();
        ViewGroup.LayoutParams layoutParams = this.f13277b.getLayoutParams();
        if (list.size() > 8) {
            i10 = this.f13279d;
        } else {
            i10 = -2;
        }
        layoutParams.height = i10;
    }

    public final LocalMediaFolder c() {
        if (this.f13280e.t().size() <= 0 || this.f13280e.t().size() <= 0) {
            return null;
        }
        return (LocalMediaFolder) this.f13280e.t().get(0);
    }

    public final void dismiss() {
        if (!this.f13278c) {
            this.f13276a.setAlpha(0.0f);
            b bVar = this.f13282g;
            if (bVar != null) {
                i iVar = (i) bVar;
                ee.c cVar = iVar.f9394a;
                String str = ee.c.C0;
                cVar.f11878i0.getClass();
                j7.a.q0(iVar.f9394a.f9373q0.getImageArrow(), false);
            }
            this.f13278c = true;
            this.f13276a.post(new a());
        }
    }

    public final void showAsDropDown(View view) {
        boolean z10;
        this.f13280e.t();
        if (this.f13280e.t().size() != 0) {
            if (Build.VERSION.SDK_INT == 24) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                showAtLocation(view, 0, 0, view.getHeight() + iArr[1]);
            } else {
                super.showAsDropDown(view);
            }
            this.f13278c = false;
            b bVar = this.f13282g;
            if (bVar != null) {
                i iVar = (i) bVar;
                ee.c cVar = iVar.f9394a;
                String str = ee.c.C0;
                cVar.f11878i0.getClass();
                j7.a.q0(iVar.f9394a.f9373q0.getImageArrow(), true);
            }
            this.f13276a.animate().alpha(1.0f).setDuration(250).setStartDelay(250).start();
            ArrayList t10 = this.f13280e.t();
            for (int i10 = 0; i10 < t10.size(); i10++) {
                LocalMediaFolder localMediaFolder = (LocalMediaFolder) t10.get(i10);
                localMediaFolder.f8096f = false;
                this.f13280e.g(i10);
                int i11 = 0;
                while (true) {
                    if (i11 >= this.f13281f.a()) {
                        break;
                    } else if (TextUtils.equals(localMediaFolder.d(), this.f13281f.b().get(i11).J) || localMediaFolder.f8091a == -1) {
                        localMediaFolder.f8096f = true;
                        this.f13280e.g(i10);
                    } else {
                        i11++;
                    }
                }
            }
        }
    }
}

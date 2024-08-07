package h1;

import a1.e;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0533R$id;
import java.util.ArrayList;
import java.util.HashSet;
import v0.b;
import v0.h;

/* compiled from: DirectedAcyclicGraph */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f10527a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10528b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f10529c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f10530d;

    public /* synthetic */ a(LinearLayout linearLayout, ImageButton imageButton, ImageButton imageButton2, AppTextView appTextView) {
        this.f10527a = linearLayout;
        this.f10528b = imageButton;
        this.f10529c = imageButton2;
        this.f10530d = appTextView;
    }

    public static a a(View view) {
        int i10 = 2131361926;
        ImageButton imageButton = (ImageButton) j7.a.D(2131361926, view);
        if (imageButton != null) {
            i10 = C0533R$id.btnMore;
            ImageButton imageButton2 = (ImageButton) j7.a.D(C0533R$id.btnMore, view);
            if (imageButton2 != null) {
                i10 = 2131362806;
                AppTextView appTextView = (AppTextView) j7.a.D(2131362806, view);
                if (appTextView != null) {
                    return new a((LinearLayout) view, imageButton, imageButton2, appTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public final void b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                ArrayList arrayList2 = (ArrayList) ((h) this.f10528b).getOrDefault(obj, null);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        b(arrayList2.get(i10), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    public a(int i10) {
        if (i10 != 1) {
            this.f10527a = new e(10, 1);
            this.f10528b = new h();
            this.f10529c = new ArrayList();
            this.f10530d = new HashSet();
            return;
        }
        this.f10527a = new b();
        this.f10528b = new SparseArray();
        this.f10529c = new v0.e();
        this.f10530d = new b();
    }
}

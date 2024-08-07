package je;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.w;
import com.luck.picture.lib.R$id;

/* compiled from: FragmentInjectManager */
public final class a {
    public static void a(FragmentActivity fragmentActivity, String str, h hVar) {
        if (j7.a.o(fragmentActivity, str)) {
            w G = fragmentActivity.G();
            G.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(G);
            aVar.g(R$id.fragment_container, hVar, str, 1);
            if (aVar.f2562h) {
                aVar.f2561g = true;
                aVar.f2563i = str;
                aVar.d();
                return;
            }
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
    }
}

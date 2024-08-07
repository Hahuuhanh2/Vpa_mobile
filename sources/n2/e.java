package n2;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.d;
import androidx.emoji2.text.f;

/* compiled from: EmojiKeyListener */
public final class e implements KeyListener {

    /* renamed from: a  reason: collision with root package name */
    public final KeyListener f13464a;

    /* renamed from: b  reason: collision with root package name */
    public final a f13465b;

    /* compiled from: EmojiKeyListener */
    public static class a {
    }

    public e(KeyListener keyListener) {
        a aVar = new a();
        this.f13464a = keyListener;
        this.f13465b = aVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i10) {
        this.f13464a.clearMetaKeyState(view, editable, i10);
    }

    public final int getInputType() {
        return this.f13464a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i10, KeyEvent keyEvent) {
        boolean z10;
        boolean z11;
        this.f13465b.getClass();
        Object obj = d.f2379i;
        if (i10 == 67) {
            z10 = f.a(editable, keyEvent, false);
        } else if (i10 != 112) {
            z10 = false;
        } else {
            z10 = f.a(editable, keyEvent, true);
        }
        if (z10) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 || this.f13464a.onKeyDown(view, editable, i10, keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f13464a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i10, KeyEvent keyEvent) {
        return this.f13464a.onKeyUp(view, editable, i10, keyEvent);
    }
}

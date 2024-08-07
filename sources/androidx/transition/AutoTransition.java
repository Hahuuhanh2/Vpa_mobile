package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        P();
    }

    public final void P() {
        O(1);
        L(new Fade(2));
        L(new ChangeBounds());
        L(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        P();
    }
}

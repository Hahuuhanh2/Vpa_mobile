package com.ots.base.utils.customview;

import al.a0;
import al.d0;
import al.e0;
import al.r0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import ik.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

/* compiled from: TimerView.kt */
public final class TimerView extends AppCompatTextView {

    @e(c = "com.ots.base.utils.customview.TimerView$startCountDown$1", f = "TimerView.kt", l = {32, 35}, m = "invokeSuspend")
    /* compiled from: TimerView.kt */
    public static final class a extends i implements p<d0, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f8272a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TimerView f8273b;

        @e(c = "com.ots.base.utils.customview.TimerView$startCountDown$1$1", f = "TimerView.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.ots.base.utils.customview.TimerView$a$a  reason: collision with other inner class name */
        /* compiled from: TimerView.kt */
        public static final class C0082a extends i implements p<d0, d<? super ek.i>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ TimerView f8274a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0082a(TimerView timerView, d<? super C0082a> dVar) {
                super(2, dVar);
                this.f8274a = timerView;
            }

            public final d<ek.i> create(Object obj, d<?> dVar) {
                return new C0082a(this.f8274a, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0082a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
            }

            public final Object invokeSuspend(Object obj) {
                String str;
                jk.a aVar = jk.a.COROUTINE_SUSPENDED;
                l0.Q0(obj);
                TimerView timerView = this.f8274a;
                Calendar instance = Calendar.getInstance();
                j.e(instance, "getInstance(...)");
                try {
                    str = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy", Locale.getDefault()).format(instance.getTime());
                    j.e(str, "format(...)");
                } catch (Exception unused) {
                    str = "";
                }
                timerView.setText(str);
                return ek.i.f20112a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(TimerView timerView, d<? super a> dVar) {
            super(2, dVar);
            this.f8273b = timerView;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            return new a(this.f8273b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0032 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x003d A[RETURN] */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                jk.a r0 = jk.a.COROUTINE_SUSPENDED
                int r1 = r7.f8272a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x001a
                if (r1 == r3) goto L_0x0015
                if (r1 != r2) goto L_0x000d
                goto L_0x001a
            L_0x000d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0015:
                p3.l0.Q0(r8)
                r8 = r7
                goto L_0x0033
            L_0x001a:
                p3.l0.Q0(r8)
                r8 = r7
            L_0x001e:
                gl.c r1 = al.r0.f19084a
                al.q1 r1 = fl.m.f20254a
                com.ots.base.utils.customview.TimerView$a$a r4 = new com.ots.base.utils.customview.TimerView$a$a
                com.ots.base.utils.customview.TimerView r5 = r8.f8273b
                r6 = 0
                r4.<init>(r5, r6)
                r8.f8272a = r3
                java.lang.Object r1 = p3.l0.V0(r8, r1, r4)
                if (r1 != r0) goto L_0x0033
                return r0
            L_0x0033:
                r4 = 1000(0x3e8, double:4.94E-321)
                r8.f8272a = r2
                java.lang.Object r1 = al.m0.a(r4, r8)
                if (r1 != r0) goto L_0x001e
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ots.base.utils.customview.TimerView.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimerView(Context context) {
        super(context);
        j.f(context, "context");
        l();
    }

    public final void l() {
        l0.j0(e0.a(r0.f19085b), (a0) null, new a(this, (d<? super a>) null), 3);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        j.f(context, "context");
        l();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TimerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
        l();
    }
}

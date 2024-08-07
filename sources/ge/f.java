package ge;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.entity.LocalMedia;
import ee.t;
import f0.b0;
import ge.b;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p3.l0;

/* compiled from: PreviewAudioHolder */
public final class f extends b {
    public final Handler B = new Handler(Looper.getMainLooper());
    public ImageView C;
    public TextView D;
    public TextView E;
    public TextView F;
    public SeekBar G;
    public ImageView H;
    public ImageView I;
    public MediaPlayer J = new MediaPlayer();
    public boolean K = false;
    public d L = new d();
    public final a M = new a();
    public final b N = new b();
    public final c O = new c();

    /* compiled from: PreviewAudioHolder */
    public class a implements MediaPlayer.OnCompletionListener {
        public a() {
        }

        public final void onCompletion(MediaPlayer mediaPlayer) {
            f fVar = f.this;
            fVar.B.removeCallbacks(fVar.L);
            f.this.F();
            f.this.E(true);
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class b implements MediaPlayer.OnErrorListener {
        public b() {
        }

        public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
            f.this.F();
            f.this.E(true);
            return false;
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class c implements MediaPlayer.OnPreparedListener {
        public c() {
        }

        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (mediaPlayer.isPlaying()) {
                f.this.G.setMax(mediaPlayer.getDuration());
                f fVar = f.this;
                fVar.B.post(fVar.L);
                f fVar2 = f.this;
                fVar2.B.post(fVar2.L);
                fVar2.G(true);
                fVar2.C.setImageResource(R$drawable.ps_ic_audio_stop);
                return;
            }
            f fVar3 = f.this;
            fVar3.B.removeCallbacks(fVar3.L);
            f.this.F();
            f.this.E(true);
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class d implements Runnable {
        public d() {
        }

        public final void run() {
            long currentPosition = (long) f.this.J.getCurrentPosition();
            String b10 = xe.b.b(currentPosition);
            if (!TextUtils.equals(b10, f.this.F.getText())) {
                f.this.F.setText(b10);
                if (((long) f.this.J.getDuration()) - currentPosition > 1000) {
                    f.this.G.setProgress((int) currentPosition);
                } else {
                    f fVar = f.this;
                    fVar.G.setProgress(fVar.J.getDuration());
                }
            }
            f.this.B.postDelayed(this, 1000 - (currentPosition % 1000));
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class e implements ue.j {
        public e() {
        }

        public final void a() {
            b.a aVar = f.this.A;
            if (aVar != null) {
                ((t.g) aVar).a();
            }
        }
    }

    /* renamed from: ge.f$f  reason: collision with other inner class name */
    /* compiled from: PreviewAudioHolder */
    public class C0115f implements View.OnLongClickListener {
        public C0115f(LocalMedia localMedia) {
        }

        public final boolean onLongClick(View view) {
            b.a aVar = f.this.A;
            if (aVar == null) {
                return false;
            }
            ((t.g) aVar).b();
            return false;
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class g implements View.OnClickListener {
        public g() {
        }

        public final void onClick(View view) {
            f fVar = f.this;
            long progress = ((long) fVar.G.getProgress()) - 3000;
            if (progress <= 0) {
                fVar.G.setProgress(0);
            } else {
                fVar.G.setProgress((int) progress);
            }
            fVar.F.setText(xe.b.b((long) fVar.G.getProgress()));
            fVar.J.seekTo(fVar.G.getProgress());
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class h implements View.OnClickListener {
        public h() {
        }

        public final void onClick(View view) {
            f fVar = f.this;
            long progress = ((long) fVar.G.getProgress()) + 3000;
            if (progress >= ((long) fVar.G.getMax())) {
                SeekBar seekBar = fVar.G;
                seekBar.setProgress(seekBar.getMax());
            } else {
                fVar.G.setProgress((int) progress);
            }
            fVar.F.setText(xe.b.b((long) fVar.G.getProgress()));
            fVar.J.seekTo(fVar.G.getProgress());
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class i implements SeekBar.OnSeekBarChangeListener {
        public i() {
        }

        public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
            if (z10) {
                seekBar.setProgress(i10);
                f fVar = f.this;
                fVar.getClass();
                fVar.F.setText(xe.b.b((long) i10));
                if (f.this.u()) {
                    f.this.J.seekTo(seekBar.getProgress());
                }
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class j implements View.OnClickListener {
        public j() {
        }

        public final void onClick(View view) {
            b.a aVar = f.this.A;
            if (aVar != null) {
                ((t.g) aVar).a();
            }
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class k implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocalMedia f10483a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f10484b;

        public k(LocalMedia localMedia, String str) {
            this.f10483a = localMedia;
            this.f10484b = str;
        }

        public final void onClick(View view) {
            try {
                if (!l0.h0()) {
                    ((t.g) f.this.A).c(this.f10483a.I);
                    if (f.this.u()) {
                        f fVar = f.this;
                        fVar.J.pause();
                        fVar.K = true;
                        fVar.E(false);
                        fVar.B.removeCallbacks(fVar.L);
                        return;
                    }
                    f fVar2 = f.this;
                    if (fVar2.K) {
                        fVar2.J.seekTo(fVar2.G.getProgress());
                        fVar2.J.start();
                        fVar2.B.post(fVar2.L);
                        fVar2.B.post(fVar2.L);
                        fVar2.G(true);
                        fVar2.C.setImageResource(R$drawable.ps_ic_audio_stop);
                        return;
                    }
                    f.D(fVar2, this.f10484b);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: PreviewAudioHolder */
    public class l implements View.OnLongClickListener {
        public l(LocalMedia localMedia) {
        }

        public final boolean onLongClick(View view) {
            b.a aVar = f.this.A;
            if (aVar == null) {
                return false;
            }
            ((t.g) aVar).b();
            return false;
        }
    }

    public f(View view) {
        super(view);
        this.C = (ImageView) view.findViewById(R$id.iv_play_video);
        this.D = (TextView) view.findViewById(R$id.tv_audio_name);
        this.F = (TextView) view.findViewById(R$id.tv_current_time);
        this.E = (TextView) view.findViewById(R$id.tv_total_duration);
        this.G = (SeekBar) view.findViewById(R$id.music_seek_bar);
        this.H = (ImageView) view.findViewById(R$id.iv_play_back);
        this.I = (ImageView) view.findViewById(R$id.iv_play_fast);
    }

    public static void D(f fVar, String str) {
        fVar.getClass();
        try {
            if (j7.a.S(str)) {
                fVar.J.setDataSource(fVar.f3013a.getContext(), Uri.parse(str));
            } else {
                fVar.J.setDataSource(str);
            }
            fVar.J.prepare();
            fVar.J.seekTo(fVar.G.getProgress());
            fVar.J.start();
            fVar.K = false;
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    public final void A() {
        this.B.removeCallbacks(this.L);
        MediaPlayer mediaPlayer = this.J;
        if (mediaPlayer != null) {
            mediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
            this.J.setOnErrorListener((MediaPlayer.OnErrorListener) null);
            this.J.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
            this.J.release();
            this.J = null;
        }
    }

    public final void B() {
        if (u()) {
            this.J.pause();
            this.K = true;
            E(false);
            this.B.removeCallbacks(this.L);
            return;
        }
        this.J.seekTo(this.G.getProgress());
        this.J.start();
        this.B.post(this.L);
        this.B.post(this.L);
        G(true);
        this.C.setImageResource(R$drawable.ps_ic_audio_stop);
    }

    public final void E(boolean z10) {
        this.B.removeCallbacks(this.L);
        if (z10) {
            this.G.setProgress(0);
            this.F.setText("00:00");
        }
        G(false);
        this.C.setImageResource(R$drawable.ps_ic_audio_play);
        b.a aVar = this.A;
        if (aVar != null) {
            ((t.g) aVar).c((String) null);
        }
    }

    public final void F() {
        this.K = false;
        this.J.stop();
        this.J.reset();
    }

    public final void G(boolean z10) {
        this.H.setEnabled(z10);
        this.I.setEnabled(z10);
        if (z10) {
            this.H.setAlpha(1.0f);
            this.I.setAlpha(1.0f);
            return;
        }
        this.H.setAlpha(0.5f);
        this.I.setAlpha(0.5f);
    }

    public final void r(LocalMedia localMedia, int i10) {
        String str;
        double d10;
        String a10 = localMedia.a();
        long j10 = localMedia.L;
        SimpleDateFormat simpleDateFormat = xe.b.f17318a;
        if (String.valueOf(j10).length() <= 10) {
            j10 *= 1000;
        }
        String format = xe.b.f17320c.format(Long.valueOf(j10));
        long j11 = localMedia.G;
        if (j11 >= 0) {
            if (j11 < 1000) {
                d10 = (double) j11;
                str = "";
            } else if (j11 < 1000000) {
                d10 = ((double) j11) / 1000.0d;
                str = "KB";
            } else {
                int i11 = (j11 > 1000000000 ? 1 : (j11 == 1000000000 ? 0 : -1));
                double d11 = (double) j11;
                if (i11 < 0) {
                    d10 = d11 / 1000000.0d;
                    str = "MB";
                } else {
                    d10 = d11 / 1.0E9d;
                    str = "GB";
                }
            }
            String format2 = String.format(new Locale("zh"), "%.2f", new Object[]{Double.valueOf(d10)});
            StringBuilder sb2 = new StringBuilder();
            int i12 = ((((double) Math.round(j7.a.z0(format2))) - j7.a.z0(format2)) > 0.0d ? 1 : ((((double) Math.round(j7.a.z0(format2))) - j7.a.z0(format2)) == 0.0d ? 0 : -1));
            Object obj = format2;
            if (i12 == 0) {
                obj = Long.valueOf(Math.round(j7.a.z0(format2)));
            }
            sb2.append(obj);
            sb2.append(str);
            String sb3 = sb2.toString();
            v(localMedia, -1, -1);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(localMedia.I);
            sb4.append("\n");
            sb4.append(format);
            sb4.append(" - ");
            sb4.append(sb3);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb4.toString());
            String s10 = b0.s(format, " - ", sb3);
            int indexOf = sb4.indexOf(s10);
            int length = s10.length() + indexOf;
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(xe.c.a(this.f3013a.getContext(), 12.0f)), indexOf, length, 17);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(-10132123), indexOf, length, 17);
            this.D.setText(spannableStringBuilder);
            this.E.setText(xe.b.b(localMedia.f8081q));
            this.G.setMax((int) localMedia.f8081q);
            G(false);
            this.H.setOnClickListener(new g());
            this.I.setOnClickListener(new h());
            this.G.setOnSeekBarChangeListener(new i());
            this.f3013a.setOnClickListener(new j());
            this.C.setOnClickListener(new k(localMedia, a10));
            this.f3013a.setOnLongClickListener(new l(localMedia));
            return;
        }
        throw new IllegalArgumentException("byteSize shouldn't be less than zero!");
    }

    public final void s() {
    }

    public final boolean u() {
        MediaPlayer mediaPlayer = this.J;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return false;
        }
        return true;
    }

    public final void v(LocalMedia localMedia, int i10, int i11) {
        this.D.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R$drawable.ps_ic_audio_play_cover, 0, 0);
    }

    public final void w() {
        this.f10459z.setOnViewTapListener(new e());
    }

    public final void x(LocalMedia localMedia) {
        this.f10459z.setOnLongClickListener(new C0115f(localMedia));
    }

    public final void y() {
        this.K = false;
        this.J.setOnCompletionListener(this.M);
        this.J.setOnErrorListener(this.N);
        this.J.setOnPreparedListener(this.O);
        E(true);
    }

    public final void z() {
        this.K = false;
        this.B.removeCallbacks(this.L);
        this.J.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
        this.J.setOnErrorListener((MediaPlayer.OnErrorListener) null);
        this.J.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
        F();
        E(true);
    }
}

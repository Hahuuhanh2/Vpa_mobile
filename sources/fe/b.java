package fe;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$drawable;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.R$layout;
import com.luck.picture.lib.R$string;
import com.luck.picture.lib.entity.LocalMediaFolder;
import java.util.ArrayList;

/* compiled from: PictureAlbumAdapter */
public final class b extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f10196d;

    /* renamed from: e  reason: collision with root package name */
    public final ke.a f10197e;

    /* renamed from: f  reason: collision with root package name */
    public qe.a f10198f;

    /* compiled from: PictureAlbumAdapter */
    public class a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public ImageView f10199u;

        /* renamed from: v  reason: collision with root package name */
        public TextView f10200v;

        /* renamed from: w  reason: collision with root package name */
        public TextView f10201w;

        public a(b bVar, View view) {
            super(view);
            this.f10199u = (ImageView) view.findViewById(R$id.first_image);
            this.f10200v = (TextView) view.findViewById(R$id.tv_folder_name);
            this.f10201w = (TextView) view.findViewById(R$id.tv_select_tag);
            ve.a aVar = (ve.a) bVar.f10197e.U.f16191a;
            if (aVar == null) {
                new ve.a
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002d: CONSTRUCTOR  (r2v8 ? I:ve.a) =  call: ve.a.<init>():void type: CONSTRUCTOR in method: fe.b.a.<init>(fe.b, android.view.View):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v8 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 49 more
                    */
                /*
                    this = this;
                    r1.<init>(r3)
                    int r0 = com.luck.picture.lib.R$id.first_image
                    android.view.View r0 = r3.findViewById(r0)
                    android.widget.ImageView r0 = (android.widget.ImageView) r0
                    r1.f10199u = r0
                    int r0 = com.luck.picture.lib.R$id.tv_folder_name
                    android.view.View r0 = r3.findViewById(r0)
                    android.widget.TextView r0 = (android.widget.TextView) r0
                    r1.f10200v = r0
                    int r0 = com.luck.picture.lib.R$id.tv_select_tag
                    android.view.View r0 = r3.findViewById(r0)
                    android.widget.TextView r0 = (android.widget.TextView) r0
                    r1.f10201w = r0
                    ke.a r2 = r2.f10197e
                    ve.b r2 = r2.U
                    com.google.android.material.card.MaterialCardView r2 = r2.f16191a
                    ve.a r2 = (ve.a) r2
                    if (r2 != 0) goto L_0x0030
                    ve.a r2 = new ve.a
                    r2.<init>()
                L_0x0030:
                    int r0 = r2.f16187a
                    if (r0 == 0) goto L_0x0037
                    r3.setBackgroundResource(r0)
                L_0x0037:
                    int r3 = r2.f16188b
                    if (r3 == 0) goto L_0x0040
                    android.widget.TextView r0 = r1.f10201w
                    r0.setBackgroundResource(r3)
                L_0x0040:
                    int r3 = r2.f16190d
                    if (r3 == 0) goto L_0x0049
                    android.widget.TextView r0 = r1.f10200v
                    r0.setTextColor(r3)
                L_0x0049:
                    int r2 = r2.f16189c
                    if (r2 <= 0) goto L_0x0053
                    android.widget.TextView r3 = r1.f10200v
                    float r2 = (float) r2
                    r3.setTextSize(r2)
                L_0x0053:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: fe.b.a.<init>(fe.b, android.view.View):void");
            }
        }

        public b(ke.a aVar) {
            this.f10197e = aVar;
        }

        public final int c() {
            return this.f10196d.size();
        }

        @SuppressLint({"NotifyDataSetChanged"})
        public final void i(RecyclerView.a0 a0Var, int i10) {
            int i11;
            boolean z10;
            a aVar = (a) a0Var;
            LocalMediaFolder localMediaFolder = (LocalMediaFolder) this.f10196d.get(i10);
            String d10 = localMediaFolder.d();
            int i12 = localMediaFolder.f8095e;
            TextView textView = aVar.f10201w;
            if (localMediaFolder.f8096f) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            textView.setVisibility(i11);
            LocalMediaFolder localMediaFolder2 = this.f10197e.W;
            View view = aVar.f3013a;
            if (localMediaFolder2 == null || localMediaFolder.f8091a != localMediaFolder2.f8091a) {
                z10 = false;
            } else {
                z10 = true;
            }
            view.setSelected(z10);
            if (j7.a.U(localMediaFolder.f8094d)) {
                aVar.f10199u.setImageResource(R$drawable.ps_audio_placeholder);
            } else {
                this.f10197e.getClass();
            }
            aVar.f10200v.setText(aVar.f3013a.getContext().getString(R$string.ps_camera_roll_num, new Object[]{d10, Integer.valueOf(i12)}));
            aVar.f3013a.setOnClickListener(new a(this, i10, localMediaFolder));
        }

        public final RecyclerView.a0 k(RecyclerView recyclerView, int i10) {
            recyclerView.getContext();
            return new a(this, LayoutInflater.from(recyclerView.getContext()).inflate(R$layout.ps_album_folder_item, recyclerView, false));
        }

        public final ArrayList t() {
            ArrayList arrayList = this.f10196d;
            if (arrayList != null) {
                return arrayList;
            }
            return new ArrayList();
        }
    }

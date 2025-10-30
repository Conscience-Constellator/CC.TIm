package CC.Encycloped.TIm;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.Map;
import java.util.HashMap;
import static CC.Encycloped.TIm.TIm.Nano$Sec;
import static java.lang.System.nanoTime;

public class TImr
{
	public int Num;
	public long TIm;

	@Lin_DclAr
	public void Ad_Inst(long TIm)
	{
		Num+=1;
		this.TIm+=TIm;
	}
		@Lin_DclAr
		public void Ad_Inst(long StRt,long Nd)
		{Ad_Inst(Nd-StRt);}
			@Lin_DclAr
			public void Ad_Inst_(long StRt)
			{Ad_Inst(StRt,nanoTime());}
	@Lin_DclAr
	public double Get_Avrg()
	{return (Num!=0)?TIm/Num:-1;}
		@Lin_DclAr
		public double Get_Avrg_Sec()
		{return Nano$Sec((long)Get_Avrg());}

	@Override
	public String toString()
	{return "Num="+Num+",TIm="+TIm+'('+Get_Avrg()+')';}

	public TImr(int Num,long TIm)
	{
		this.Num=Num;
		this.TIm=TIm;
	}
		public TImr()
		{this(0,0);}

	public static final Map<String,TImr> TImrg=new HashMap<>();
}
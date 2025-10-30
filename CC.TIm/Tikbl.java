package CC.Encycloped.TIm;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Bool.Trn.Onbl;
import java.util.List;
import static CC.Encycloped.TIm.Clok.Clock.Try_WAt;
import static CC.Encycloped.TIm.Clok.Clock.Try_WAt_Nan;
import static java.lang.Long.max;
import static java.lang.System.nanoTime;

@Finishd(Is_Finishd=false)
public interface Tikbl
		 extends Runnable
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Tikbl.class,
		Clas_Rap.class);
	/*Dep ?done*/

	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void Tik();
	@Finishd(Is_Finishd=true)
	static <Tikbl_Typ extends Tikbl>void Tik_Ech(Tikbl_Typ... List)
	{
		for(Tikbl_Typ Tikbl:List)
		{Tikbl.Tik();}
	}
	@Finishd(Is_Finishd=true)
	static <Tikbl_Typ extends Tikbl>void Tik_Ech(List<Tikbl_Typ> List)
	{
		for(int IndX=0;
			IndX<List.size();
			IndX+=1)
		{List.get(IndX).Tik();}
	}
		@Override
		default void run()
		{Tik();}
		default void Tik_WAt(int Mil)
		{
			Tik();
			Try_WAt(Mil);
		}
		default long Tik_WAt(long Dr)
		{
			long TIm=nanoTime();

			Tik();

			TIm=nanoTime()-TIm;
			Try_WAt_Nan(max(Dr-TIm,0));

			return TIm;
		}
		default void WAt_Loop(long Dr,Onbl On_Havr)
		{
			while(On_Havr.Is_On())
			{Tik_WAt(Dr);}
		}
}
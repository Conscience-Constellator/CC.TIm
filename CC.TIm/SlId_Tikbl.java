package CC.Encycloped.TIm;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;

public interface SlId_Tikbl
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void SlId_Tik(double TIm);

	@Finishd(Is_Finishd=true)
	static <Tikbl_Typ extends SlId_Tikbl>void Tik_Ech(double TIm,Tikbl_Typ... List)
	{
		for(Tikbl_Typ Tikbl:List)
		{Tikbl.SlId_Tik(TIm);}
	}
	@Finishd(Is_Finishd=false)
	static <Tikbl_Typ extends SlId_Tikbl>void Tik_Ech(double TIm,List<Tikbl_Typ> List)
	{
		for(Tikbl_Typ Tikbl:List)
		{Tikbl.SlId_Tik(TIm);}
	}
}
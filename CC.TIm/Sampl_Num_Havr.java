package CC.Encycloped.TIm;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

public interface Sampl_Num_Havr
{
	@Lin_DclAr @Finishd(Is_Finishd=true)
	long Get_Sampl_Num();

	@Finishd(Is_Finishd=true)
	class Sampl_Num_Havr_ConcrEt implements Sampl_Num_Havr
	{
		private long Sampl_Num;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final long Get_Sampl_Num()
			{return Sampl_Num;}
			@Lin_DclAr @Finishd(Is_Finishd=true)
			public void Set_Sampl_Num(long Num)
			{Sampl_Num=Num;}

		@Finishd(Is_Finishd=true)
		public Sampl_Num_Havr_ConcrEt(long RAt)
		{Set_Sampl_Num(RAt);}
	}
}
package CC.Encycloped.TIm;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

@Finishd(Is_Finishd=true)
public interface Sampl_RAt_Havr
{
	@Lin_DclAr @Finishd(Is_Finishd=true)
	double Get_Sampl_RAt();
	@Lin_DclAr @Finishd(Is_Finishd=true)
	void Set_Sampl_RAt(double RAt);

	@Finishd(Is_Finishd=true)
	class Sampl_RAt_Havr_ConcrEt implements Sampl_RAt_Havr
	{
		private double Sampl_RAt;
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final double Get_Sampl_RAt()
			{return Sampl_RAt;}
			@Override @Finishd(Is_Finishd=true)
			public void Set_Sampl_RAt(double RAt)
			{Sampl_RAt=RAt;}

		@Finishd(Is_Finishd=true)
		public Sampl_RAt_Havr_ConcrEt(double RAt)
		{Set_Sampl_RAt(RAt);}
	}
}
package CC.Encycloped.TIm;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap.*;
import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import static java.lang.System.nanoTime;

public interface UpdAtbl
{
//	Clas_Rap Class=Ad_Reg_Task(Updatbl.class);

	/**To tell an object to make sure it's up to date.*/
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	void UpdAt();
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Gar_Lisnd(UpdAt_Lisnbl Lisnbl)
		{
			if(Lisnbl!=null)
			{Lisnbl.Ad_UpdAt_Lisnr(this);}
		}
		@Lin_DclAr @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
		default void Gar_No_Lisnd(UpdAt_Lisnbl Lisnbl)
		{
			if(Lisnbl!=null)
			{Lisnbl.Rmov_UpdAt_Lisnr(this);}
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Set_UpdAt_DpNdNC(UpdAt_Lisnbl Old,
									  UpdAt_Lisnbl New)
		{
			Old.Rmov_UpdAt_Lisnr(this);
			New.  Ad_UpdAt_Lisnr(this);
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Set_UpdAt_DpNdNC_SAf(UpdAt_Lisnbl Old,
										  UpdAt_Lisnbl New)
		{
			Gar_No_Lisnd(Old);
			   Gar_Lisnd(New);
		}

	@Finishd(Is_Finishd=true)
	interface Updat_TImbl
	  extends UpdAtbl
	{
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		long Get_Last_UpdAtd();
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		void Set_Last_UpdAtd(long TIm);
			@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
			default void UpdAt_Last_UpdAtd()
			{Set_Last_UpdAtd(nanoTime());}
		@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
		void UpdAt_MEt();
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void UpdAt()
		{
			UpdAt_MEt();
			UpdAt_Last_UpdAtd();
		}
	}
}
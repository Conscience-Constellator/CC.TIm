package CC.Encycloped.TIm;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;
import java.util.ArrayList;

@Finishd(Is_Finishd=true)
public	interface UpdAt_Lisnbl
		  extends UpdAtbl
{
	@Lin_DclAr @Neds_Ovrid(NEds=Yes) @Finishd(Is_Finishd=true)
	List<UpdAtbl> Get_UpdAt_Lisnrg();
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void UpdAt_Lisnrg()
		{
			for(UpdAtbl Lisnr:Get_UpdAt_Lisnrg())
			{Lisnr.UpdAt();}
		}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Ad_UpdAt_Lisnr(UpdAtbl Lisnr)
		{Get_UpdAt_Lisnrg().add(Lisnr);}
		@Lin_DclAr @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
		default void Rmov_UpdAt_Lisnr(UpdAtbl Lisnr)
		{Get_UpdAt_Lisnrg().remove(Lisnr);}
	@Override @Neds_Ovrid(NEds=Ok) @Finishd(Is_Finishd=true)
	default void UpdAt()
	{UpdAt_Lisnrg();}

	@Finishd(Is_Finishd=true)
	class UpdAt_Lisnbl_Imp implements UpdAt_Lisnbl
	{
		@Finishd(Is_Finishd=true)
		public List<UpdAtbl> UpdAt_Lisnrg=new ArrayList<>();
			@Override @Neds_Ovrid(NEds=No) @Finishd(Is_Finishd=true)
			public final List<UpdAtbl> Get_UpdAt_Lisnrg()
			{return UpdAt_Lisnrg;}
	}
}

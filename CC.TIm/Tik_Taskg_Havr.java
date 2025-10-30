package CC.Encycloped.TIm;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import java.util.List;

public interface Tik_Taskg_Havr extends Tikbl
{
	@Lin_DclAr
	List<Runnable> Get_Tik_Taskg();
		@Lin_DclAr
		default void Ad_Tik_Task(Runnable Task)
		{Get_Tik_Taskg().add(Task);}
		@Override
		default void Tik()
		{
			for(Runnable Task:Get_Tik_Taskg())
			{Task.run();}
		}
}
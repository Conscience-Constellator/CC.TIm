package CC.Encycloped.TIm;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import java.util.List;
import java.util.ArrayList;

public class Sequence implements Runnable
{
	/*
	public static Clas_Rap Class=Init_StRt(Sequence.class,
		Clas_Rap.class);
	/*Dep ?done*/

	private List<Runnable> Runblg;
		public void Set_Runblg(ArrayList<Runnable> List)
		{Set_Runblg(List);}
		public void Ad_Runbl(Runnable Runnable,int Index){Runblg.add(Index,Runnable);}
		public void Ad_Runbl(Runnable Runnable){Runblg.add(Runnable);}
		public void Rem_Runbl(int Indx){Runblg.remove(Indx);}
		public Runnable Runbl(int Indx){return Runblg.get(Indx);}
		@Override
		public void run()
		{
			for(Runnable Runbl: Runblg)
			{Runbl.run();}
		}

	public Sequence(ArrayList<Runnable> List)
	{Set_Runblg(List);}
	public Sequence()
	{this(new ArrayList<>());}

//	static{Init_Nd(Sequence.class);}
}
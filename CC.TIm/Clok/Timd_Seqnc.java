package CC.Encycloped.TIm.Clok;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.TIm.Sequence;
import java.util.ArrayList;

public class Timd_Seqnc extends Sequence
{
	/*
	public static final Clas_Rap Class=Init_StRt(Timd_Seqnc.class,
		Clas_Rap.class);
	/*Dep ?done*/

	public Timd_Seqnc(ArrayList<Runnable> Runblg,ArrayList<Long> Watg)
	{Set_Timrg(Runblg,Watg);}
	public Timd_Seqnc()
	{}

	private ArrayList<Runnable> Runblg;
		public ArrayList<Runnable> Runblg(){return Runblg;}
		@Override public void Set_Runblg(ArrayList<Runnable> List){Set_Runblg(List);}
		@Override public void Ad_Runbl(Runnable Run,int Indx){Runblg.add(Indx,Run);}
		@Override public void Ad_Runbl(Runnable Run){Ad_Runbl(Run,Runblg.size());}
		@Override public void Rem_Runbl(int Indx){Runblg.remove(Indx);}
	public ArrayList<Long> Watg=new ArrayList<>();
		public void Set_Watg(ArrayList<Long> List){Watg=List;}
		public void Ad_Wat(Long Wat,int Indx){Watg.add(Indx,Wat);}
		public void Ad_Wat(Long Wat){Ad_Wat(Wat,Watg.size());}

		public void Set_Timrg(ArrayList<Runnable> Runblg,ArrayList<Long> Watg)
		{
			this.Runblg=Runblg;
			this.Watg=Watg;
		}
		public void Ad_Timr(Runnable Runbl,long Wat)
		{
			Ad_Runbl(Runbl);
			Ad_Wat(Wat);
		}
		public void Rem_Timr(int Indx)
		{
			Runblg.remove(Indx);
			Watg.remove(Indx);
		}
		@Override
		public Runnable Runbl(int IndX)
		{return Runblg.get(IndX);}
		public void Run(int Indx)
		{
			Runbl(Indx).run();
			Rem_Timr(Indx);
		}

//	static{Init_Nd(Timd_Seqnc.class);}
}
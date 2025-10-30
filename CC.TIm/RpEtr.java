package CC.Encycloped.TIm;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Bool.Trn.Flagd_On_Trnbl.Flagd_On_Trnbl_Imp;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Fun.Path.Loopr1.WIl;
import static CC.Encycloped.TIm.Clok.Clock.Try_WAt;

public class RpEtr extends Flagd_On_Trnbl_Imp
{
	/*
	public static final Clas_Rap Class=Init_StRt(Repetr.class,
		Clas_Rap.class);
	/*Dep ?done*/

	public Runnable Do;
	@Override
	public Object Trn_On(Object In)
	{
		if(!Is_On())
		{
			super.Trn_On(In);
			WIl(Do,this);
		}
		return null;
	}

	public RpEtr(Runnable Do)
	{this.Do=Do;}
	public RpEtr()
	{}

	public static class Do_Wat implements Runnable
	{
		public Runnable Do;
		public long Wat;

		@Override
		public void run()
		{
			Do.run();
			Try_WAt(Wat);
		}

		public Do_Wat(Runnable Do,long WAt)
		{
			this.Do=Do;
			this.Wat=WAt;
		}
		public Do_Wat()
		{}
	}

//	static{Init_Nd(Repetr.class);}
}
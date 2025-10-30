package CC.Encycloped.TIm;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Met.Nom_Imp_Par;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

public interface Dur_Havr
{
	/*
	Clas_Rap Class=Init_StRt_Nd(Dur_Havr.class,
		Clas_Rap.class);
	/*Dep ?done*/

	void Set_Dur(long Durat);
	long Get_Dur();

	static long Sec_To_Nan(float Sec){return (long)(Sec*10_0000_0000);}
	static float Nan_To_Sec(long Nan){return Nan/10_0000_0000;}

	class Dur_Havr_Imp implements Dur_Havr
	{
//		public static final Clas_Rap Class=Init_StRt(Dur_Havr_Imp.class,Dur_Havr.Class.Depg);/*Dep done*/
//			public static final Nom_Imp_Par<Dur_Havr,Dur_Havr_Imp> Nom_Imp=new Nom_Imp_Par<>(Dur_Havr_Imp.class);

		public long Dur;
			@Override public long Get_Dur(){return Dur;}
			@Override public void Set_Dur(long Durat){this.Dur=Durat;}

		public Dur_Havr_Imp(long Dur)
		{Set_Dur(Dur);}
		public Dur_Havr_Imp()
		{}

//		static{Init_Nd(Dur_Havr_Imp.class);}
	}
}
package CC.Encycloped.TIm;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.TIm.Clok.Timd_Seqnc;
import CC.Bool.Trn.Flagd_On_Trnbl.Flagd_On_Trnbl_Imp;
import java.util.ArrayList;

public class UpdAt_ContXt extends Flagd_On_Trnbl_Imp implements FrAm_RAt_Havr
{
	/*
	public static final Clas_Rap Class=Init_StRt(UpdAt_ContXt.class,
		Clas_Rap.class);
	/*Dep ?done*/

	public Object ContXt;
		public Object Get_ContXt(){return ContXt;}
		public void Set_ContXt(Object ContXt){this.ContXt=ContXt;}

	public ArrayList<UpdAtbl> Updatdg=new ArrayList<>();
		public void Ad_Updatd(UpdAtbl Updatd){Updatdg.add(Updatd);}
	public Timd_Seqnc Seqnc;
		public Timd_Seqnc Get_TImd_Seq(){return Seqnc;}
		public void Set_TImd_Seq(Timd_Seqnc Seqnc){this.Seqnc=Seqnc;}

	private long Last_Updat;
	private int Fram_Rat=64;
		@Override public int Fram_Rat(){return Fram_Rat;}
		@Override public void Set_Fram_Rat(int Rat){Fram_Rat=Rat;}

	@Override
	public Object Trn_On(Object Unusd)
	{
		super.Trn_On(Unusd);
		for(UpdAtbl Updatbl:Updatdg)
		{
			//Updatbl.On();
		}

		return null;
	}

	//{out.println("Updat_Contxt");}

//	static{Init_Nd(UpdAt_ContXt.class);}
}
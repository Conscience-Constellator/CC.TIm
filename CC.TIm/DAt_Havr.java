package CC.Encycloped.TIm;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Met.Methg;
//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Met.Nom_Imp_Par;

import java.util.Calendar;
import static java.util.Calendar.*;

public interface DAt_Havr
{
	/*
	Clas_Rap Class=Init_StRt_Nd(DAt_Havr.class,
		Clas_Rap.class);
	/*Dep ?done*/

	void Set_Dat(String DAt);
	String Get_DAt();

	byte
		Sun=1,Mon=2,Tue=3,
		Wen=4,Thu=5,Fri=6,
		Sat=7;
//	static String Get_Da_Wek_Nam(int Mon)
//	{
//		return switch(Mon)
//			{
//				case 0->Jan;case 1->Feb;case 2->Mar;
//				case 3->Apr;case 4->May;case 5->Jun;
//				case 6->Jul;case 7->Aug;case 8->Sep;
//				case 9->Oct;case 10->Nov;case 11->Dec;
//				default->throw new IllegalStateException("Unexpected value:"+Mon);
//			};
//	}
	String
		Jan="Jan",Feb="Feb",Mar="Mar",
		Apr="Apr",May="May",Jun="Jun",
		Jul="Jul",Aug="Aug",Sep="Sep",
		Oct="Oct",Nov="Nov",Dec="Dec";
	static int Mon(){return Cal.getTime().getMonth();}
	static String Mon_Nam(int Mon)
	{
		return switch(Mon)
		{
			case 0->Jan;case 1->Feb;case 2->Mar;
			case 3->Apr;case 4->May;case 5->Jun;
			case 6->Jul;case 7->Aug;case 8->Sep;
			case 9->Oct;case 10->Nov;case 11->Dec;
			default->throw new IllegalStateException("Unexpected value:"+Mon);
		};
	}
		static String Mon_Nam(){return Mon_Nam(Mon());}
//	static int Get_Yer(){return Cal.getY}
	static String Date_P(){return Cal.get(MILLISECOND)+"."+Cal.get(SECOND)+":"+Cal.get(MINUTE)+":"+Cal.get(HOUR)+"/"+Cal.get(DAY_OF_MONTH)+"/"+Mon_Nam(Cal.get(MONTH))+"/"+Cal.get(YEAR);}
	Calendar Cal=Calendar.getInstance();

//	Methg Dat_List=new Methg(
		//
//	);

	class Dat_Havr_Imp
	{
//		public static final Clas_Rap Class=Init_StRt(Dat_Havr_Imp.class,DAt_Havr.Class.Depg);/*Dep done*/
//			public static final Nom_Imp_Par<DAt_Havr,Dat_Havr_Imp> Dat_Havr=new Nom_Imp_Par<>(Dat_Havr_Imp.class);

		public String Dat;
			public void Set_Dat(String Dat){this.Dat=Dat;}
			public String Get_Dat(){return Dat;}

		public Dat_Havr_Imp(String DAt)
		{Set_Dat(DAt);}
		public Dat_Havr_Imp()
		{}

//		static{Init_Nd(Dat_Havr_Imp.class);}
	}
}
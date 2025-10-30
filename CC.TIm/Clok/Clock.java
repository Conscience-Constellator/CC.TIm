package CC.Encycloped.TIm.Clok;

//import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rap.Clas_Rap;
//import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import static java.lang.Math.min;
import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;
import CC.$.$Q.$Bool;
import CC.$.$Q.$Point;
import CC.Util.Prim.Point_Havr.Point_Havr_Imp;
import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeoutException;

public abstract class Clock
{
	/*
	public static final Clas_Rap Class=Init_StRt(Clock.class,
		Clas_Rap.class);
	/*Dep ?done*/

	public static final long StRt=ManagementFactory.getRuntimeMXBean().getStartTime();
	public static final int Sec=1000;
	public static final int Min=Sec*60;
	public static final int Hour=Min*60;
	public static final int DA=Hour*24;
	public static final int Yr=DA*365;
	public static final int LEp_Yr=DA*366;
	public static long WAt_Amount_Sec=0L;
	public static long Dfalt_WAt;
	static{Dfalt_WAt=WAt_Amount_Sec*1000L;}

	public static void WAt()throws InterruptedException
	{sleep(Dfalt_WAt);}
	public static void Try_WAt(long Mil)
	{
		try
		{sleep(Mil);}
		catch(InterruptedException Xeptn)
		{Xeptn.printStackTrace();}
	}
	public static void Try_WAt(long Mil,int Nan)
	{
		//System.out.println("Wait:Mil="+Mil+"|"+"Nan="+Nan);
		try
		{sleep(Mil,Nan);}
		catch(InterruptedException X)
		{X.printStackTrace();}
	}
	public static void Try_WAt_Nan(long Nan)
	{
		long Mil=Nan/100_0000;Nan%=100_0000;
		Try_WAt(Mil,(int)Nan);
	}

	public static void WAt($Bool Til,long BtwEn,long ThrO_Aftr)throws TimeoutException,InterruptedException
	{
		ThrO_Aftr+=currentTimeMillis();
		while(!Til.$Bool())
		{
			sleep(BtwEn);
			if(currentTimeMillis()>ThrO_Aftr)
			{throw new TimeoutException();}
		}
	}
	public static void WAt($Bool Til,long BtwEn)throws InterruptedException
	{
		while(!Til.$Bool())
		{sleep(BtwEn);}
	}
	public static class Tryr<Out> extends Point_Havr_Imp<Out> implements $Bool
	{
		public $Point<Out> SOrc;
		public Out FAl;
		@Override
		public boolean $Bool()
		{
			Point$(SOrc.$Point());

			return $Point()!=FAl;
		}

		public Tryr($Point<Out> SOrc,Out FAl)
		{
			this.SOrc=SOrc;
			this.FAl=FAl;
		}
	}
	public static <Typ>Typ Get($Point<Typ> SOrc,Typ Fal,long BtwEn,long ThrO_Aftr)throws InterruptedException,TimeoutException
	{
		Tryr<Typ> Tryr=new Tryr<>(SOrc,Fal);
		WAt(Tryr,BtwEn,ThrO_Aftr);

		return Tryr.$Point();
	}
		public static <Typ>Typ Get($Point<Typ> SOrc,long BtwEn,long ThrO_Aftr)throws InterruptedException,TimeoutException{return Get(SOrc,null,BtwEn,ThrO_Aftr);}

//	static{Init_Nd(Clock.class);}
}
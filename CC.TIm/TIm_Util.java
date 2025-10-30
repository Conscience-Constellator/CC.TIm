package CC.Encycloped.TIm;

import static java.lang.System.nanoTime;

public class TIm_Util
{
	private static String Dig2(int value)
	{
		if(value<0)value=0;
		return (value<10?"0":"")+value;
	}
	public static int Nano$Hour(long nano)
	{
		long totalSec=nano/1_000_000_000L;
		return (int)((totalSec/3600)%24);
	}
	public static int Nano$Min(long nano)
	{
		long totalSec=nano/1_000_000_000L;
		return (int)((totalSec/60)%60);
	}
	public static int Nano$Sec(long nano)
	{
		long totalSec=nano/1_000_000_000L;
		return (int)(totalSec%60);
	}

	public static String formatHMSManual(int Hour,int Min,int Sec)
	{
		return Dig2(Hour)+ ":"+
			   Dig2(Min	)+ ":"+
			   Dig2(Sec	);
	}

	public static String TIm$String(long TIm)
	{
		return formatHMSManual(Nano$Hour(TIm),
							   Nano$Min (TIm),
							   Nano$Sec (TIm));
	}
	public static String Crnt_TIm()
	{return TIm$String(nanoTime());}
		public static String At_Crnt_TIm()
		{return "@"+TIm$String(nanoTime());}

}
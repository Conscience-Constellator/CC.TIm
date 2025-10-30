package CC.Encycloped.TIm;

import CC.COd.Finishd;

import static java.lang.System.nanoTime;

@Finishd(Is_Finishd=true)
public class TIm
{
	@Finishd(Is_Finishd=true)
	public static long Sinc(long StRt)
	{return nanoTime()-StRt;}
	@Finishd(Is_Finishd=true)
	public static double Sec_Sinc(long StRt)
	{return Nano$Sec(Sinc(StRt));}
	@Finishd(Is_Finishd=true)
	public static double Micro$Sec(long Mil)
	{return Mil/Milion;}
	@Finishd(Is_Finishd=true)
	public static double Nano$Sec(long Nano)
	{return Nano/Bilion;}

	@Finishd(Is_Finishd=true)
	public static final double
		Bilion=10_0000_0000,
		Thousnd=1000,
		Milion=100_0000;
}
import java.util.Scanner;

public class Minxiangjia {
public static void main(String[]args){
	int m1,m2,m3,m4;
	System.out.println("请输入两相加时间数：");
	Scanner sc=new Scanner(System.in);

	m1=sc.nextInt();
	m2=sc.nextInt();
	m3=sc.nextInt();
	m4=sc.nextInt();
	int min=m1+m2;
	int sec=m3+m4;
	int Chushu;
	Chushu=min/60;
	System.out.print(Chushu+"小时");
	
	if(min+(sec/60)/60>=1){
		System.out.print((min+(sec/60))%60+"分钟"+sec%60+"秒");
	}else{
		System.out.print(min+(sec/60)+"分钟"+sec%60+"秒");
	}

}
}//这只是第一步，计算得出两个时间段相加，但要是想大量实现功能，还是得活用控制台


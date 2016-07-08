package Shujia;

import java.util.Scanner;

public class Minxiangjia {
public static void main(String[]args){
    int m1,m2,m3,m4;
 	
 	Scanner sc=new Scanner(System.in);
 	System.out.println("请输入分钟数");
 	m1=sc.nextInt();
 	System.out.println("请输入秒数");
 	m3=sc.nextInt();
 	System.out.println("请输入分钟数");
 	m2=sc.nextInt();
 	System.out.println("请输入秒数");
 	m4=sc.nextInt();
 	
 	
 	int min=m1+m2;
 	int sec=m3+m4;

 	int Chushu=min/60;
 	System.out.print(Chushu+"小时");
 	
 	if(min+(sec/60)/60>=1){
 		System.out.println((min+(sec/60))%60+"分钟"+sec%60+"秒");
 	}else{
 		System.out.println(min+(sec/60)+"分钟"+sec%60+"秒");
 	}

 	  boolean isContinued = false;;
      do {
          isContinued = false;
          Scanner in = new Scanner(System.in);
          
          
          
          System.out.println("继续吗？");
          in = new Scanner(System.in);
          char input = in.next().charAt(0);
          if (input == 'y') {
              isContinued = true;
          } else if (input == 'n') {
              isContinued = false;
          } else {
              System.out.println("您的输入无法被识别，默认结束！");
          }
          System.out.println("请输入分钟数");
      
          int m  = in.nextInt();
          System.out.println("请输入秒数");
          int n = in.nextInt();//输出的就是秒数,这里的问题就是输入的数只能加上min或者是sec
          int min1=min+m;
          int sec1=sec+n;              
          int Chushu1=min1/60;
       	System.out.print(Chushu1+"小时");
       	
       	if(min1+(sec1/60)/60>=1){
       		System.out.println((min1+(sec1/60))%60+"分钟"+sec1%60+"秒");
       	}else{
       		System.out.println(min1+(sec1/60)+"分钟"+sec1%60+"秒");
       	}

      } 
          while (isContinued);
      System.out.println("运行结束");
   
}
}//这里的问题就是在while循环里面不能修改min1和sec1的值，导致输入的数到最后都会加上原来的那组相加的数据


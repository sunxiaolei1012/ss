package zxing321;

public class Trangle {
	 double sideA,sideB,sideC,area,length; 
	   boolean boo; //booΪtrue��ʾ������,booΪfalse��ʾ��������
	   public   Trangle(double a,double b,double c)  
	   {   sideA=a; sideB=b; sideC=c; //����a,b,c�ֱ�ֵ��sideA,sideB,sideC 
	       if(a+b>c&a+c>b&b+c>a) //a,b,c���������ε��������ʽ 
	      {   boo=true; //��boo��ֵ�� 
	      }     
	       else 
	      {   boo=false; //��boo��ֵ�� 
	      } 
	   } 
	   double getLength()  
	   {   return sideA+sideB+sideC; //�����壬Ҫ�������ܳ�(length����}��ֵ������  
	   } 
	   public double  getArea()  //���������ε����������
	   {   if(boo) 
	      {   double p=(sideA+sideB+sideC)/2.0; 
	         area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ; 
	         return area; 
	      } 
	      else 
	      {   System.out.println("����һ��������,���ܼ������"); 
	         return 0; 
	      } 
	   }  
	   public void setABC(double a,double b,double c) 
	   {   sideA=a;sideB=b;sideC=c ;//����a,b,c�ֱ�ֵ��sideA,sideB,sideC 
	      if((a+b>c)&&(a+c>b)&&(c+b>a)) //a,b,c���������ε��������ʽ 
	      {   boo=true; //��boo��ֵ�� 
	      }  
	      else 
	      {   boo=false; //��boo��ֵ�� 
	      } 
	   } 
	} 
	class Lader  //������
	{   double above,bottom,height,area;  
	   Lader(double a,double b,double h) 
	   {  above=a;bottom=b;height=h; //�����壬������a,b,c�ֱ�ֵ��above,bottom,height 
	   } 
	   double getArea() 
	   {  return(above+bottom)*height/2; //�����壬,Ҫ���������(area����)��ֵ������ 
	   } 
	} 
	  
	class Circle  //Բ����
	{   double radius,area,length; 
	   Circle(double r) 
	   {   radius=r;; //������,�ò���r����radius(�뾶)���� 
	   } 
	   double getArea()  
	   {   return 3.1415926*radius*radius; //�����壬Ҫ���������area������ 
	   } 
	   double getLength()  
	   {   return 2*3.1415926*radius; // getLength������Ĵ���,Ҫ�������ܳ�length������ 
	   } 
	   void setRadius(double newRadius) 
	   {   radius=newRadius; 
	   } 
	    double getRadius()  
	   {   return radius; 
	   } 
	 
	
	   public static void main(String[] args) 
	   {   double length,area; 
	      Circle circle=null; 
	      Trangle trangle; 
	      Lader lader; 
	      circle=new Circle(10); //��������circle 
	      trangle =new Trangle(5,8,10); //��������trangle�� 
	      lader =new Lader(5,8,10);//��������lader 
	      length =circle.getLength(); // circle���÷��������ܳ�����ֵ��length 
	      System.out.println("Բ���ܳ�:"+length);  
	      area=circle.getArea(); // circle���÷��������������ֵ��area 
	      System.out.println("Բ�����:"+area);  
	      length=trangle.getLength(); // trangle���÷��������ܳ�����ֵ��length 
	      System.out.println("�����ε��ܳ�:"+length);  
	     area=trangle.getArea(); // trangle���÷��������������ֵ��area 
	      System.out.println("�����ε����:"+area);  
	      area=lader.getArea(); // lader���÷��������������ֵ��area 
	      System.out.println("���ε����:"+area);  
	      trangle =new Trangle(15,13,5); // trangle���÷������������ߣ�Ҫ���������޸�Ϊ15,13,5�� 
	      area=trangle.getArea(); // trangle���÷��������������ֵ��area 
	      System.out.println("�����ε����:"+area);  
	      length=trangle.getLength(); // trangle���÷��������ܳ�����ֵ��length 
	      System.out.println("�����ε��ܳ�:"+length); 
	   
	}

}

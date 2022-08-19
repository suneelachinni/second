package package2;




public class SumAvg {
	 int reading;
	 int math;
	 int writing;
	 int socialStudies;
	 int science;
	 int sum;
	 float avg;
	 
	 void sum () {
		 sum=reading+math+writing+socialStudies+science;
	 }
void avg() {
	avg=sum/5;
	
}
public static void mainH(String[] args) {
	SumAvg student=new SumAvg();
	student.reading=95;
	student.math=99;
	student.writing=75;
	student.socialStudies=75;
	student.science=90;
student.sum();
student.avg();
System.out.println("student all subjects sum="+student.sum);
System.out.println("student marks avg="+student.avg);

}

}


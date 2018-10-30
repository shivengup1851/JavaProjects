/**
 * @(#)StaticFieldTester.java
 *
 * StaticFieldTester application
 *
 * @author 
 * @version 1.00 2018/1/22
 */
 
public class StaticFieldTester2 {
    
    public static void main(String[] args) {
    	
    		
		int beforeFinal = 90, theFinal = 70;
		StaticField2 student1 = new StaticField2(beforeFinal, theFinal);      
		System.out.println("Grade before the final: " + student1.gradeAverage + "\nFinal Exam: " + student1.finalExam);
		System.out.println(student1.getGrade( ) + " is the final average");
		System.out.println(StaticField2.curve + "% is curve"); 
		StaticField2 student2 = new StaticField2( );
		System.out.println("Grade before the final: " + student2.gradeAverage + "\nFinal Exam: " + student2.finalExam);
		System.out.println(student2.getGrade( ) + " is the final average"); 
		System.out.println(StaticField2.curve + "% is the curve");
		
		
    }
    	
}
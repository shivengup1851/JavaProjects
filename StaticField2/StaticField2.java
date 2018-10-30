class StaticField2 {
	
	public final int curve = 5;
    private static int counter = 0;
    
    public StaticField2( )  //constructor (the default one)
    {
		System.out.println ("\nUsing default settings for this student");
		gradeAverage = 100;
		finalExam = 100;
		counter++;
    }
    
    public StaticField2(int gradeBeforeFinal, int finalExamination)  //constructor
    {
		gradeAverage = gradeBeforeFinal;
		finalExam = finalExamination;
		counter++;
    }
       
    public double getGrade( )
    {
		double finalAverage;
		finalAverage = (4 * gradeAverage + finalExam) / 5 + curve;
		System.out.println ("Student " + counter + "'s grade info: ");
		return (finalAverage);
    }
    
    public int gradeAverage, finalExam; //this is a bad programming technique of using public instance variables
	
}
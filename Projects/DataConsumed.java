//A simple Java program to check the data consumed per day in a  Prepaid recharge of 600GB per year.

import java.util.Scanner;
import java.util.Date;

public class DateDifferenceCalculator {
    
    public static long modOfDiff(long days)
    {
    	return (days >= 0)? days : -days;
    }   
    
    public static long main(String[] args) {
        Date currentDate = new Date();
        Date specifiedDate = createDate(2024, 2, 13); // Year: 2023, Month: June, Day: 15
       // Enter the plan recharged date here
        
        long differenceInDays = calculateDifferenceInDays(currentDate, specifiedDate);
        
       // System.out.println("Difference in days: " + differenceInDays);
       return modOfDiff(differenceInDays);
    }
    
    public static Date createDate(int year, int month, int day) {
        return new Date(year - 1900, month - 1, day); // Adjusting year and month for Date constructor
    }
    
    public static long calculateDifferenceInDays(Date currentDate, Date specifiedDate) {
        long differenceInMilliseconds = specifiedDate.getTime() - currentDate.getTime();
        return differenceInMilliseconds / (1000 * 60 * 60 * 24);
    }
}

class DataConsumed
{
	private float maxData;
	public void setData(float maxData)
	{
		 this.maxData = maxData;
	}
	public float getData()
	{
		 return maxData;
	}
	
	public void maxConsumption(long daysDiff)
	{
		float data = 1.5f * daysDiff;
		this.setData(data);
	}

}

class Main {
	public static void main(String[] args) {
		DateDifferenceCalculator date = new DateDifferenceCalculator();
		long daysDiff = date.main(args) + 1;
	        DataConsumed data = new DataConsumed();
	        data.maxConsumption(daysDiff);
                System.out.printf("Remaining days of plan: %d days%n", 365 - daysDiff+1);
                System.out.println("Enter the remaining data");
                Scanner sc = new Scanner(System.in);
                float consumedData = 600 - sc.nextFloat(); //600 is the total data available for 1 year in a specific plan
                float leftOutData = data.getData() - consumedData;
                if(leftOutData > 0)
                     System.out.println("You can use : " + leftOutData + "GB");
                else
                     System.out.println("\nNo data left");
	}
}

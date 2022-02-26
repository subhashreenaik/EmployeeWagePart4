package com.assignment.bridgelabz;


public class EmpWageBuilder {
	    //Declaring constant
		final static int FULL_TIME=1;
		final static int PART_TIME=2;
//		
		
			
			
			//This method returns daily wage of employee
			  public static int  computeDailyWage(int wage_per_hour,int MaxhourPerMonth,int no_workingday) {
			    	
			    	//Variable declaring
					 int working_hour=0;
					 int total_wage=0;
					 int totalhr=0;
					 int totalworkingdays=0;
					
				while(totalhr<=MaxhourPerMonth && totalworkingdays<no_workingday) {
		       	totalworkingdays++;

		        int empType = (int) (Math.random() * 10) % 3;
		        switch(empType) {
		        case FULL_TIME:
			      {
				   working_hour=8;
				   break;
			       }
			       case PART_TIME:
			       {
				   working_hour=4;
				   break;
			
			       }
			       default:
			       {
				   working_hour=0;
				   break;
			       }
		        }
		        
		        totalhr +=working_hour;
			      
		}
				total_wage= totalhr * wage_per_hour;
				
			    return total_wage;
		}
			

		     public static void main(String[] args) {
		    	 
		    	 System.out.println(computeDailyWage(20, 20, 100));
			 
		 }
	}
			
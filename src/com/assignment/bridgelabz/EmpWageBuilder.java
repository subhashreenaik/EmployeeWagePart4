package com.assignment.bridgelabz;


public class EmpWageBuilder {
	    
//		
		
			
			
			//This method returns daily wage of employee
			  public static  void computeDailyWage(int wage_per_hour,int MaxhourPerMonth,int no_workingday,String company) {
			    	
			    	//Variable declaring
					 int working_hour=0;
					 int total_wage=0;
					 int totalhr=0;
					 int totalworkingdays=0;
					
				while(totalhr<=MaxhourPerMonth && totalworkingdays<no_workingday) {
		       	totalworkingdays++;

		        int empType = (int) (Math.random() * 10) % 3;
		        switch(empType) {
		        case 1:
			      {
				   working_hour=8;
				   break;
			       }
			       case 2:
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
				
			    System.out.println("Total wage for company "+company+" is "+total_wage);
		}
			

		     public static void main(String[] args) {
		    	 
		    	 computeDailyWage(20, 20, 100,"DMart");
		    	 computeDailyWage(25, 10, 100,"V2");
		    	 computeDailyWage(30, 15, 100,"BIGBAZAR");
			 
		 }
	}
			
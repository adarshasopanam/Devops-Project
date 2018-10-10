package com.devops.project.devopsproject;

public class NumReceive {
	public String Words(int number) {
		String s="";
		NumberWords numberWords=new NumberWords();
		
            if(number>0 && number<=999){
              
           
                   s=s+numberWords.toWords(((number / 100) % 10), " HUNDRED");
         
                   s=s+numberWords.toWords((number % 100), " ");
                  

            } else{
                s="NUMBER OUT OF RANGE";
            }
       
       
		return s;
	}
}

/*
1491. Average Salary Excluding the Minimum and Maximum Salary
Given an array of unique integers salary where salary[i] is the salary of the employee i.

Return the average salary of employees excluding the minimum and maximum salary.
*/


class MeanSalary {
    public double average(int[] salary) {
        int min=1000001,max=0;
        double sum=0;
        for(int index=0;index<salary.length;index++){
            if(salary[index] < min)
                min=salary[index];
            if(salary[index] > max)
                max=salary[index];
            
            sum+=salary[index];    
        }
        return (sum - (min+max))/(salary.length-2);
    }
}
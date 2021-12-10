package baseCourse.exercises.module03;

public class L07Ex01SalaryIncrease {
    public static void main(String[] args){
        int contractYear = 1994;
        float workerSalary = 1500;
        float upgradeValue = 0;
        float salaryUpgradeTax = 0.0f;

        for(contractYear = 1994;contractYear <= 2021;contractYear++){
            if(contractYear == 1995) {
                salaryUpgradeTax = 0.02f;
            }

            if(contractYear >= 1996){
                salaryUpgradeTax += 0.1;
            }

            upgradeValue = workerSalary * salaryUpgradeTax;
            workerSalary += upgradeValue;

            System.out.println("==============================");
            System.out.println("===== System information =====");
            System.out.println("Current year = " + contractYear);
            System.out.println("Salary upgrade tax = " + salaryUpgradeTax);
            System.out.println("Salary upgrade value = " + upgradeValue);
            System.out.println("Worker salary = " + workerSalary);

            workerSalary = 1500;
        }
    }
}

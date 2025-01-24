public class demo020 {
            public static double calculateTax(double monthlyGrossSalary, double hra, double pf) {
            double annualSalary = monthlyGrossSalary * 12;
            double deductions = hra + pf;
            double taxableIncome = annualSalary - deductions;
            double tax = 0;
    
            if (taxableIncome <= 500000) {
                tax = taxableIncome * 0.10;
            } else if (taxableIncome <= 1000000) {
                tax = (500000 * 0.10) + ((taxableIncome - 500000) * 0.20);
            } else {
                tax = (500000 * 0.10) + (500000 * 0.20) + ((taxableIncome - 1000000) * 0.30);
            }
    
            return tax;
        }
    
        public static void main(String[] args) {
            double monthlyGrossSalary = 60000; 
            double hra = 15000; 
            double pf = 5000; 
    
            double annualTax = calculateTax(monthlyGrossSalary, hra, pf);
            System.out.println("Annual Income Tax: Rs " + annualTax);
        }
    }


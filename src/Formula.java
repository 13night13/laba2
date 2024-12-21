public class Formula {

    public double calculateFormula1(double x, double y, double z) {
        double sqrtComponent = 1 / Math.sqrt(x + Math.cos(y) + Math.cos(z * z));
        double lnComponent = Math.log(1 + Math.pow(x, 2)) + Math.pow(Math.E, Math.cos(y) + Math.sin(z) * Math.sin(z));
        return sqrtComponent * lnComponent;
    }

    public double calculateFormula2(double x, double y, double z) {
        return Math.cbrt(y + Math.pow(x, 3) / Math.log(z));
    }
}

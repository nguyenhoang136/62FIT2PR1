public class test {
    public static void main(String[] args) {
        System.out.println("currentPopulation = 312032486");
        System.out.println("secondsInAYear = 365 * 24 * 60 * 60");
        System.out.println("birthsPerYear = secondsInAYear / 7");
        System.out.println("deathsPerYear = secondsInAYear / 13");
        System.out.println("immigrantsPerYear = secondsInAYear / 45");
        System.out.println("populationChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear");
        System.out.println("Dân số năm hiện tại= " + "(currentPopulation)");
        System.out.println("Dân số năm 1= " + "(currentPopulation + populationChangePerYear))");
        System.out.println("Dân số năm 2= " + "(currentPopulation + 2 * populationChangePerYear))");
        System.out.println("Dân số năm 3= " + "(currentPopulation + 3 * populationChangePerYear))");
        System.out.println("Dân số năm 4= " + "(currentPopulation + 4 * populationChangePerYear))");
        System.out.println("Dân số năm 5= " + "(currentPopulation + 5 * populationChangePerYear))");
    }

}

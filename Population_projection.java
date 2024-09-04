public class Population_projection {
    public static void main(String[] args) {
        // Dân số hiện tại
        int currentPopulation = 312032486;

        // Số giây trong một năm
        int secondsInAYear = 365 * 24 * 60 * 60;

        // Tính số sinh, số tử, và người nhập cư trong một năm
        int birthsPerYear = secondsInAYear / 7;
        int deathsPerYear = secondsInAYear / 13;
        int immigrantsPerYear = secondsInAYear / 45;

        // Tính thay đổi dân số mỗi năm
        int populationChangePerYear = birthsPerYear - deathsPerYear + immigrantsPerYear;

        // Hiển thị dân số cho 5 năm tới
        System.out.println("Dân số năm hiện tại: " + currentPopulation);
        System.out.println("Dân số năm 1: " + (currentPopulation + populationChangePerYear));
        System.out.println("Dân số năm 2: " + (currentPopulation + 2 * populationChangePerYear));
        System.out.println("Dân số năm 3: " + (currentPopulation + 3 * populationChangePerYear));
        System.out.println("Dân số năm 4: " + (currentPopulation + 4 * populationChangePerYear));
        System.out.println("Dân số năm 5: " + (currentPopulation + 5 * populationChangePerYear));
    }
}


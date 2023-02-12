public enum Planet {
    URANUS(30687),
    EARTH(365),
    JUPITER(4333),
    MERCURY(88),
    MARS(687),
    NEPTUNE(60200),
    SATURN(10759),
    VENUS(225);
    private int number;

    Planet(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
    public static void findMaxDay(Planet[] planets){
        int san = 1;
        for (Planet planet: planets) {
            if (san < planet.getNumber()){
                san = planet.getNumber();
            }
        }
        System.out.println(san);
    }
    public static void findMixDay(Planet[] planets){
        int san =planets[0].getNumber();
        Planet minPlanet = null;
        for (Planet planet: planets) {
            if (san > planet.getNumber()){
                san = planet.getNumber();
                minPlanet = planet;
            }
        }
        System.out.println(san);
        System.out.println(minPlanet);
    }
}

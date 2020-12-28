package syntax3.ex01;

public class PunkRock {
    private final Rock[] band;
    public PunkRock(Rock yRoad) {
        band = new Rock[]{yRoad};
    }

    public Rock[] myBand() {
        return band;
    }
}
//yes

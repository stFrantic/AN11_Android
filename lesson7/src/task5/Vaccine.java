package task5;

public enum Vaccine {
    VEROCELL("Verocell"),
    PFIZER("Pfizer"),
    SPUTNIK_V("Sputnik V"),
    MODERNA("Moderna"),
    ASTRA_ZENICA("AstraZenica"),
    JOHNSON_JOHNSON("Johnson&Johnson");

    private String title;

    private Vaccine(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  this.ordinal() + " " + title;
    }
    public static Vaccine getByOrdinal(int index){
        for (Vaccine i: values()) {
            if (i.ordinal() == index){
                return i;
            }
        }
        System.out.println("Wrong index");
        return null;
    }
}

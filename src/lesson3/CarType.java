package lesson3;

public enum CarType {
    HATCHBACK("Хетчбек"),
    SEDAN("Седан"),
    SUV("Кросовер");
    private String ukrainianTranslation;
    CarType(String ukrainianTranslation){
        this.ukrainianTranslation=ukrainianTranslation;
    }
    public String getUkrainianTranslation(){
        return ukrainianTranslation;
    } public void setUkrainianTranslation(String ukrainianTranslation){
        this.ukrainianTranslation= ukrainianTranslation;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "ukrainianTranslation='" + ukrainianTranslation + '\'' +
                '}';
    }
}

package PracticeComp;

public class HardDrive {
    @Override
    public String toString() {
        return "HardDrive{" +
                "modelDrive='" + modelDrive + '\'' +
                ", CapacityDrive=" + CapacityDrive +
                ", type=" + type +
                ", country=" + country +
                '}';
    }

    public String getModelDrive() {
        return modelDrive;
    }

    public void setModelDrive(String modelDrive) {
        this.modelDrive = modelDrive;
    }

    public int getCapacityDrive() {
        return CapacityDrive;
    }

    public void setCapacityDrive(int capacityDrive) {
        CapacityDrive = capacityDrive;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public HardDrive(String modelDrive, int capacityDrive, Type type, Country country) {
        this.modelDrive = modelDrive;
        CapacityDrive = capacityDrive;
        this.type = type;
        this.country = country;
    }
// Жорсткий диск (Класс з полями)
//         - Модель жорсткого диску
//         - Тип (ссд або хдд (енум))
//         - об'єм жорсткого диску
//         - Країна виробник (Енуми. Китай, Корея, Індія, США)


    String modelDrive;
    int CapacityDrive;
    Type type;
    Country country;
}

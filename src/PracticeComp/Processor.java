package PracticeComp;
// Процессор(Класс)
//         - Тип
//         -кількість ядер
//         -частота
//         -виробник (Енуми ті самі країни)

public class Processor {
    @Override
    public String toString() {
        return "Processor{" +
                "procType='" + procType + '\'' +
                ", core=" + core +
                ", frequency=" + frequency +
                '}';
    }

    public String getProcType() {
        return procType;
    }

    public void setProcType(String procType) {
        this.procType = procType;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public Processor(String procType, int core, double frequency, Country india) {
        this.procType = procType;
        this.core = core;
        this.frequency = frequency;
    }

    String procType;
    int core;
    double frequency;
    enum Country{China,Korea, India, USA}
}


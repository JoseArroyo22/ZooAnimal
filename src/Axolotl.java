public class Axolotl implements  iAnimal {
    private String animalType = "Axolotl";
    private int anIdTag;
    private int minTemp = 50;
    private int maxTemp = 74;

    public String getAnimalType() {
        return animalType;
    }


    public int getIdTag() {
        return anIdTag;
    }


    public void setIdTag(int anIdTag) {
        this.anIdTag = anIdTag;

    }


    public int getMinTemperature() {
        return minTemp;
    }


    public int getMaxTemperature() {
        return maxTemp;
    }
}

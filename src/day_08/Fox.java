package day_08;


public class Fox {
    public String foxNum;
    public boolean wearCoats;
    public boolean hasTorch;
    public String coatColor;
    public int bagCount;

    public void setInfo(String foxNum,boolean wearCoats, boolean hasTorch, String coatColor, int bagCount) {
        this.foxNum =foxNum;
        this.wearCoats = wearCoats;
        this.hasTorch = hasTorch;
        this.coatColor = coatColor;
        this.bagCount = bagCount;
    }

    public void isSuspect() {

        if (wearCoats && hasTorch && coatColor.equalsIgnoreCase("black") && bagCount == 3) {
            System.out.println(foxNum + " is one of suspects!");
        } else {
            System.out.println(foxNum + " cleared of charges!");
        }

    }


}

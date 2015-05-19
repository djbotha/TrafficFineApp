package speedingfineapp;

public class SpeedingFine {

    private String registrationNumber;
    private char laneCode;
    private char areaCode;
    private char roadCode;
    private int speed;

    public SpeedingFine(String registrationNumber, char laneCode, char areaCode, char roadCode, int speed) {
        this.registrationNumber = registrationNumber;
        this.laneCode = laneCode;
        this.areaCode = areaCode;
        this.roadCode = roadCode;
        this.speed = speed;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public char getLaneCodes() {
        return laneCode;
    }

    public char getAreaCodes() {
        return areaCode;
    }

    public char getRoadCode() {
        return roadCode;
    }

    /**
     * The lane codes are: D = double lane, S = single lane
     *
     * The area codes are: U = urban, P = peri-urban, R = residential, O = open
     * or out-of-town,
     *
     * Road code (optional): N = narrow and winding, no clear views ahead
     *
     * Limits are: R = always 60, SU = 60, SP = 80, SO = 120, DU = always 80, DP
     * = always 100, DO = always 120, SON = 100, SPN = 70
     */
    public int getSpeedLimit() {
        // 2.1.2
        String area = "";
        
        if (this.areaCode == 'R')
            return 60;
        
        if (this.roadCode == 'N')
            area = ""+ this.laneCode + this.areaCode + this.roadCode;
        else
            area = "" + this.laneCode + this.areaCode;
        
        switch(area)
        {
            case "SU":
                return 60;
            case "SP":
                return 80;
            case "SO":
                return 120;
            case "DU":
                return 80;
            case "DP":
                return 100;
            case "DO":
                return 120;
            case "SON":
                return 100;
            case "SPN":
                return 70;
        }
        
        return 1;
    }
    
    public double getFine()     {
        // 2.1.3
        return 0.0;
    }

    public boolean isFinable() {
        boolean finable;
        if (speed - getSpeedLimit() < 10) {
            finable = false;
        } else {
            finable = true;
        }
        return finable;
    }

    @Override
    public String toString() {
        // 2.1.4
        return "output";
    }
}

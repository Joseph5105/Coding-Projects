package utsa.edu.cs3443_map_project;

import java.time.LocalTime;
/*ParkingActivity holds all relevant parking information for use in the MapActivty
* parking Buttons*/
public class ParkingActivity {
private String lotName;
private boolean commuter;
private boolean resident;
private boolean employeeA;
private boolean employeeB;
private String traffic;


public ParkingActivity(){
    String lotName = "";
    boolean commuter = false;
    boolean resident = false;
    boolean employeeA = false;
    boolean employeeB = false;
    String traffic = "";
}
public ParkingActivity(String lotName, boolean resident, boolean employeeA,
                            boolean employeeB, boolean commuter, String traffic){
    this.lotName = lotName;
    this.resident = resident;
    this.employeeA = employeeA;
    this.employeeB = employeeB;
    this.commuter = commuter;
    this.traffic = traffic;
    }

    public String getLotName() {
        return lotName;
    }

    public boolean getCommuter() {
        return commuter;
    }

    public boolean getResident() {
        return resident;
    }

    public boolean getEmployeeA() {
        return employeeA;
    }

    public boolean getEmployeeB() {
        return employeeB;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setLotName(String lotName) {
        this.lotName = lotName;
    }

    public void setCommuter(boolean commuter) {
        this.commuter = commuter;
    }

    public void setResident(boolean resident) {
        this.resident = resident;
    }

    public void setEmployeeA(boolean employeeA) {
        this.employeeA = employeeA;
    }

    public void setEmployeeB(boolean employeeB) {
        this.employeeB = employeeB;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }
    public void currentTraffic(int green, int red) {

        LocalTime currentTime = LocalTime.now();

        if (currentTime.getHour() <=  green) {
            setTraffic("Green");
        } else if (currentTime.getHour() >= red) {
            setTraffic("Red");
        } else {
            setTraffic("Yellow");
        }
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(lotName).append("\n");

        stringBuilder.append("Parking Type: ");
        if (resident) {
            stringBuilder.append("Resident\n");
        } if (employeeA) {
            stringBuilder.append("\t\tEmployee A\n");
        } if (employeeB) {
            stringBuilder.append("\t\tEmployee B\n");
        } if (commuter) {
            stringBuilder.append("\t\tCommuter\n");
        }
        stringBuilder.append("Traffic Status: ").append(traffic);
        return stringBuilder.toString();
    }
}


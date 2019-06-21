@data
@entity

public class GymTraffic {

    private @Id @GenerateValue Long id;
    private int time;
    private int trafficVol;
    private String status;

    private GymTraffic(){ }

    public GymTraffic(int time, int trafficVol, String status){

        this.time = time;
        this.trafficVol = trafficVol;
        this.status = status;


    }


}
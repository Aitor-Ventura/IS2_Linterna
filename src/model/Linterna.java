package model;

public class Linterna {
    private boolean status = false;

    public Linterna(){
    }

    public Linterna(boolean status){
        this.status = status;
    }

    public void turnOn(){
        this.status = true;
    }

    public void turnOff(){
        this.status = false;
    }

    @Override
    public String toString() {
        return "Linterna{" +
                "status=" + status +
                '}';
    }

    public boolean getStatus() {
        return status;
    }
}

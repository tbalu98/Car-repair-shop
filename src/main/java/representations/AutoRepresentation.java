package representations;

import entities.Car;
import entities.CarParameter;
import org.pmw.tinylog.Logger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AutoRepresentation {


    public static List<AutoRepresentation> of(List<Car> gepjarmuvek){

        List<AutoRepresentation> teljesGepjarmuNezetek = new ArrayList<>();
        for(Car car : gepjarmuvek){

            teljesGepjarmuNezetek.add(new AutoRepresentation(car));

        }

        Logger.info(teljesGepjarmuNezetek);
        return teljesGepjarmuNezetek;

    }
    private Integer id;

    private Integer alvazszam;

    private LocalDate vizsgaLejarta;

    private Integer evjarat;

    private String ptipus;

    private Integer pmotorterfogat;

    private Integer pteljesitmeny;

    private Car car;


    public AutoRepresentation(Car car){
        this.alvazszam = car.getAlvazszam();
        this.vizsgaLejarta = car.getVizsgaLejarta();
        this.evjarat = car.getEvjarat();
        this.ptipus = car.getTipus();
        this.pmotorterfogat = car.getMotorterfogat();
        this.pteljesitmeny = car.getTeljesitmeny();
        this.car = car;

    }

    public AutoRepresentation(CarParameter carParameter, Integer alvazszam, LocalDate vizsgaLejarta, Integer evjarat,
                              String ptipus, Integer pmotorterfogat, Integer pteljesitmeny) {

        this.alvazszam = alvazszam;
        this.vizsgaLejarta = vizsgaLejarta;
        this.evjarat = evjarat;
        this.ptipus = ptipus;
        this.pmotorterfogat = pmotorterfogat;
        this.pteljesitmeny = pteljesitmeny;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Integer getAlvazszam() {
        return alvazszam;
    }

    public void setAlvazszam(Integer alvazszam) {
        this.alvazszam = alvazszam;
    }

    public LocalDate getVizsgaLejarta() {
        return vizsgaLejarta;
    }

    public void setVizsgaLejarta(LocalDate vizsgaLejarta) {
        this.vizsgaLejarta = vizsgaLejarta;
    }

    public Integer getEvjarat() {
        return evjarat;
    }

    public void setEvjarat(Integer evjarat) {
        this.evjarat = evjarat;
    }

    public String getPtipus() {
        return ptipus;
    }

    public void setPtipus(String ptipus) {
        this.ptipus = ptipus;
    }

    public Integer getPmotorterfogat() {
        return pmotorterfogat;
    }

    public void setPmotorterfogat(Integer pmotorterfogat) {
        this.pmotorterfogat = pmotorterfogat;
    }

    public Integer getPteljesitmeny() {
        return pteljesitmeny;
    }

    public void setPteljesitmeny(Integer pteljesitmeny) {
        this.pteljesitmeny = pteljesitmeny;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "TeljesGepjarmuNezet{" +
                "id=" + id +
                ", alvazszam=" + alvazszam +
                ", vizsgaLejarta=" + vizsgaLejarta +
                ", evjarat=" + evjarat +
                ", ptipus='" + ptipus + '\'' +
                ", pmotorterfogat=" + pmotorterfogat +
                ", pteljesitmeny=" + pteljesitmeny +
                '}';
    }
}
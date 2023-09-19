package Exercicio_02;

public class Cao {

    private String name;
    private String barkSound;
    private String race;

    public Cao(String name, String race) {
        this.name = name;
        this.race = race;
        this.barkSound = "au au";
    }

    public String getBarkSound() {
        return this.barkSound;
    }

    public void setBarkSound(String barkSound) {
        this.barkSound = barkSound;
    }

    public void bark(){
        System.out.println(this.barkSound);
    }

    public String getName() {
        return name;
    }
}

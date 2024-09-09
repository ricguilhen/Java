package org.example;

public class Guerreiro extends Personagem {
    private int forcaExtra;
    private int armadura;

    public Guerreiro(String nome, int nivel, int hp, int atk, int def, int forcaExtra, int armadura) {
        super(nome, nivel, hp, atk, def);
        this.forcaExtra = forcaExtra;
        this.armadura = armadura;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = (this.atk + forcaExtra) - inimigo.def;
        if (dano > 0) {
            inimigo.receberDano(dano);
        }
    }

    // Getters e Setters
    public int getForcaExtra() {
        return forcaExtra;
    }

    public void setForcaExtra(int forcaExtra) {
        this.forcaExtra = forcaExtra;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }
}
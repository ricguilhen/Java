package org.example;

public class Guerreiro extends Personagem {
    private int forcaExtra;
    private int armadura;

    public Guerreiro(String nome, int nivel, int hp, int atk, int def, int forcaExtra, int armadura) {
        super(nome, nivel, hp, atk, def);
        this.forcaExtra = forcaExtra;
        this.armadura = armadura;
        this.def = def - armadura;
    }

    @Override
    public void atacar(Personagem inimigo) {
        int dano = Math.max(this.atk + this.forcaExtra - inimigo.def, 0);
        inimigo.receberDano(dano);
    }
}
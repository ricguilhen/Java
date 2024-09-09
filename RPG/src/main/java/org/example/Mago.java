package org.example;

public class Mago extends Personagem {
    private int mana;
    private int poderMagico;

    public Mago(String nome, int nivel, int hp, int atk, int def, int mana, int poderMagico) {
        super(nome, nivel, hp, atk, def);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lancarMagia(Personagem inimigo) {
        int custoMana = 10;
        if (this.mana >= custoMana) {
            int danoMagico = Math.max(this.poderMagico - inimigo.def, 0);
            inimigo.receberDano(danoMagico);
            this.mana -= custoMana;
        }
    }

    public int getMana() {
        return mana;
    }
}
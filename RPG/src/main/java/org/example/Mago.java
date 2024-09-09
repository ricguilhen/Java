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
        if (mana >= 10) {
            int dano = poderMagico - inimigo.def;
            if (dano > 0) {
                inimigo.receberDano(dano);
            }
            mana -= 10;
        } else {
            System.out.println("Mana insuficiente!");
        }
    }

    // Getters e Setters
    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }
}
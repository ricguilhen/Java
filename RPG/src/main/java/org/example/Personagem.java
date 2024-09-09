package org.example;

public abstract class Personagem {
    protected String nome;
    protected int nivel;
    protected int hp;
    protected int atk;
    protected int def;

    public Personagem(String nome, int nivel, int hp, int atk, int def) {
        this.nome = nome;
        this.nivel = nivel;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    public void atacar(Personagem inimigo) {
        int dano = Math.max(this.atk - inimigo.def, 0);
        inimigo.receberDano(dano);
    }

    protected int calcularDano(Personagem inimigo) {
        return Math.max(this.atk - inimigo.def, 0);
    }


    public void receberDano(int dano) {
        this.hp = Math.max(this.hp - dano, 0);
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    public void exibirStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Nível: " + this.nivel);
        System.out.println("HP: " + this.hp);
        System.out.println("ATK: " + this.atk);
        System.out.println("DEF: " + this.def);
    }

    public int getHp() {
        return hp;
    }
}
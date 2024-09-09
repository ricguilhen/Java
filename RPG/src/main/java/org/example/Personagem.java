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
        int dano = this.atk - inimigo.def;
        if (dano > 0) {
            inimigo.receberDano(dano);
        }
    }

    public void receberDano(int dano) {
        this.hp -= dano;
        if (this.hp < 0) {
            this.hp = 0;
        }
    }

    public void exibirStatus() {
        System.out.println(nome + " | Nível: " + nivel + " | HP: " + hp + " | ATK: " + atk + " | DEF: " + def);
    }

    public boolean estaVivo() {
        return this.hp > 0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
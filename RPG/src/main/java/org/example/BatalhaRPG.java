package org.example;

public class BatalhaRPG {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Thorin", 10, 100, 20, 10, 5, 2);
        Mago mago = new Mago("Gandalf", 10, 80, 15, 5, 50, 25);
        Arqueiro arqueiro = new Arqueiro("Legolas", 10, 90, 18, 8, 10, 15);

        // Status iniciais
        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();

        // Simulação
        System.out.println("\nBatalha começa!\n");

        guerreiro.atacar(mago);
        mago.lancarMagia(guerreiro);
        arqueiro.atirarFlecha(guerreiro);

        // Status finais
        System.out.println("\nStatus final após a batalha:\n");
        guerreiro.exibirStatus();
        mago.exibirStatus();
        arqueiro.exibirStatus();
    }
}

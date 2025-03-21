package Edu.gus.unit3;

public class Petshop {
    public static void main(String[] args) {
        MaquinaBanho maquinaBanho = new MaquinaBanho();

        // Checa níveis iniciais
        maquinaBanho.checarAgua();
        maquinaBanho.checarShampoo();

        // Abastece a máquina
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                maquinaBanho.abastecerAgua();
            }
            maquinaBanho.abastecerShampoo();
        }

        // Checa níveis depois de abastecer
        maquinaBanho.checarAgua();
        maquinaBanho.checarShampoo();

        // 🐶 Primeiro cachorro
        System.out.println("\n--- BANHO 1 ---");
        maquinaBanho.checarPet();
        maquinaBanho.colocarPet();
        maquinaBanho.darBanho();
        maquinaBanho.retirarPet();

        // TENTA dar banho no segundo pet antes de limpar
        System.out.println("\n--- BANHO 2 (tentativa antes de limpar) ---");
        maquinaBanho.checarPet();
        maquinaBanho.colocarPet();
        maquinaBanho.darBanho();

        // Agora limpa a máquina e continua
        System.out.println("\n--- LIMPEZA ---");
        maquinaBanho.checarPet();
        maquinaBanho.limparMaquina();

        // Tenta novamente
        System.out.println("\n--- BANHO 2 (após limpeza) ---");
        maquinaBanho.checarPet();
        maquinaBanho.colocarPet();
        maquinaBanho.darBanho();
        maquinaBanho.retirarPet();

        // Checa recursos finais
        System.out.println("\n--- RECURSOS FINAIS ---");
        maquinaBanho.checarAgua();
        maquinaBanho.checarShampoo();
    }
}

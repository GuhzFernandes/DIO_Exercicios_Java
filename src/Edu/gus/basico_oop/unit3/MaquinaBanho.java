package Edu.gus.basico_oop.unit3;

public class MaquinaBanho {
    private int reservatorioAgua, reservatorioShampoo;
    private boolean maquinaLimpa, petDentro, petLimpo;

    MaquinaBanho() {
        this.maquinaLimpa = true;
        this.petDentro = false;
        this.petLimpo = false;

        this.reservatorioShampoo = 0;
        this.reservatorioAgua = 0;
    }

    public void darBanho() {
        if (maquinaLimpa) {
            if (petDentro) {
                if (reservatorioAgua >= 10 && reservatorioShampoo >= 2) {
                    reservatorioAgua -= 10;
                    reservatorioShampoo -= 2;
                    petLimpo = true;
                    maquinaLimpa = false;
                    System.out.println("Pet tomou banho e está limpinho!");
                } else {
                    System.out.println("Não há água ou shampoo suficiente para dar banho");
                }
            } else {
                System.out.println("A máquina está vazia, coloque um pet antes");
            }
        } else {
            System.out.println("A máquina precisa ser limpa antes");
        }
    }

    public void abastecerAgua() {
        if (reservatorioAgua <= 28) {
            reservatorioAgua += 2;
            System.out.println("Reservatório abastecido\nNível de água: " + reservatorioAgua + " litros");
        } else {
            System.out.println("Não é necessário abastecer agora");
            checarAgua();
        }
    }

    public void abastecerShampoo() {
        if (reservatorioShampoo <= 8) {
            reservatorioShampoo += 2;
            System.out.println("Reservatório abastecido\nNível de shampoo: " + reservatorioShampoo + " litros");
        } else {
            System.out.println("Não é necessário abastecer agora");
            checarShampoo();
        }
    }

    public void checarAgua() {
        System.out.println("Nível de água: " + reservatorioAgua + " litros");
    }

    public void checarShampoo() {
        System.out.println("Nível de shampoo: " + reservatorioShampoo + " litros");
    }

    public void checarPet() {
        if (petDentro) {
            System.out.println("Há um pet na máquina");
        } else {
            System.out.println("Não há pet na máquina");
        }
    }

    public void colocarPet() {
        if (!petDentro) {
            if (maquinaLimpa) {
                petDentro = true;
                petLimpo = false;
                System.out.println("Pet colocado na máquina");
            } else {
                System.out.println("A máquina está suja! Limpe antes de colocar um novo pet");
            }
        } else {
            System.out.println("Já há um pet na máquina");
        }
    }

    public void retirarPet() {
        if (petDentro) {
            System.out.println("Pet retirado da máquina");
            petDentro = false;
            if (!petLimpo) {
                maquinaLimpa = false;
                System.out.println("O pet saiu, a máquina ficou suja");
            }
            petLimpo = false; // reset
        } else {
            System.out.println("Não há pet para retirar");
        }
    }

    public void limparMaquina() {
        if (reservatorioAgua >= 3 && reservatorioShampoo >= 1) {
            reservatorioAgua -= 3;
            reservatorioShampoo -= 1;
            maquinaLimpa = true;
            System.out.println("A máquina foi limpa");
        } else {
            System.out.println("Não há recursos suficientes para limpar a máquina");
        }
    }
}
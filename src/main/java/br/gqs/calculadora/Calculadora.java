package br.gqs.calculadora;

class Calculadora {
    int somar(int num1, int num2){
        return num1 + num2;
    }

    int subtrair(int num1, int num2){
        return num1 - num2;
    }

    int multiplicar(int num1, int num2){
        return num1 * num2;
    }

    int dividir(int num1, int num2) throws DivisionByZeroException {
        if (num2 == 0 ){
            throw new DivisionByZeroException();
        }
        return num1 / num2;
    }
}
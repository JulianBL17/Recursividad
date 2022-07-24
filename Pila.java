package pila;

/**
 *
 * @author YeYo
 */
public class Pila {

    Nodo cabeza, nuevo, p;
    private int contador;
    
    public Pila() {
        cabeza = null;
    }

    public int getContador() {
        return contador;
    }

    public void insertarPila(int dato) {
        nuevo = new Nodo(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        contador++;
    }

    public void imprimirPila() {
        p = cabeza;
        if (p == null) {
            System.out.println("La pila esta vacia!");
        } else {
            while (p != null) {
                System.out.print("[" + p.info + "]  ");
                p = p.siguiente;
            }
        }
    }

    public int sumaPila() {
        int suma = 0;
        p = cabeza;
        if (p == null) {
            System.out.println("La pila esta vacia!");
        } else {
            while (p != null) {
                suma += p.info;
                p = p.siguiente;
            }
        }
        return suma;
    }

    public void sumatoriaPila() {
        int aux = 0, sumatoria = 0;
        p = cabeza;
        if (p == null) {
            System.out.println("La pila esta vacia!");
        } else {
            while (p != null) {
                aux = p.info;
                for (int i = 1; i <= aux; i++) {
                    sumatoria = sumatoria + i;
                }
                System.out.print("[ " + sumatoria + "]  ");
                p = p.siguiente;
                sumatoria = 0;
            }
        }
    }

    public int sumaPares() {
        int aux = 0, suma = 0;
        p = cabeza;
        if (p == null) {
            System.out.println("La pila esta vacia!");
        } else {
            while (p != null) {
                if (esPar(p.info)) {
                    suma += p.info;
                }
                p = p.siguiente;

            }
        }
        return suma;
    }

    // Metodo para determinar SI es PAR o NO
    private static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void factorialPila() {
        int factoria = 1;
        p = cabeza;
        if (p == null) {
            System.out.println("La pila esta vacia!");
        } else {
            while (p != null) {
                for (int i = 1; i <= p.info; i++) {
                    factoria = factoria * i;
                }
                System.out.print("[ " + factoria + "]  ");
                p = p.siguiente;
                factoria = 1;
            }
        }
        System.out.println(" ");
    }

    public void primoPila() {
        p = cabeza;
        if (p == null) {
            System.out.println("La pila esta vacia!");
        } else {
            while (p != null) {

                if (esPrimo(p.info)) {
                    System.out.print("[" + p.info + "]  ");
                }
                p = p.siguiente;
            }
        }
        System.out.println(" ");
    }

    // Metodo para determinar si un Numero es Primo o NO
    private static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void numeroMalvado() {
        int binario = 0, contador = 0, digito, aux;
        p = cabeza;
        if (p == null) {
            System.out.println("La pila esta vacia!");
        } else {
            while (p != null) {
                aux = p.info;
                binario = convertirBinario(aux);
                while (binario > 0) {
                    digito = binario % 10;
                    if (digito == 1) {
                        contador++;
                    }
                    binario = binario / 10;
                }
                if (contador % 2 == 0) {
                    System.out.print("[" + aux + "]  ");
                }
                contador = 0;
                p = p.siguiente;
            }
        }
        System.out.println(" ");
    }

    // En este metodo se conviete el numero Decimal a Binario
    private int convertirBinario(int numero) {
        int binario = 0, base = 10, exp = 0;

        while (numero > 0) {
            int digito = numero % 2;
            binario = (digito * (int) Math.pow(base, exp)) + binario;
            exp++;
            numero = numero / 2;
        }
        return binario;
    }

    public void sumaDigitos() {
        int digito, suma = 0, aux;
        p = cabeza;
        if (p == null) {
            System.out.println("La pila esta vacia!");
        } else {
            while (p != null) {
                aux = p.info;
                System.out.print("[" + aux + "]  ");
                while (aux > 0) {
                    if (aux != 0) {
                        digito = aux % 10;
                        suma += digito;
                        aux /= 10;
                    }
                }
                System.out.print(" la suma de sus Digitos es = " + suma + "  \n");
                suma = 0;
                p = p.siguiente;
            }
        }
    }
}

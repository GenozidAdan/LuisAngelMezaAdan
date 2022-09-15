package server;

public class methods {

    public String operacion(double numero1, double numero2 , double numero3, double numero4) {

        double suma = (numero1 + numero2 + numero3 + numero4);

        double producto = (numero1 * numero2 * numero3 * numero4);

        double promedio = (numero1 + numero2 + numero3 + numero4 / 4);

        return "Hola el producto es" + producto + "la suma es" + suma
                + "y el promedio es" + promedio;
    }




    public String suma2(double numero1, double numero2) {

        if (numero1 > numero2) {

            double x = numero1;
            numero1 = numero2;
            numero2 = x; }


        double sumatotal = 0;
        for (double i = numero1; i < numero2; i++) {

            sumatotal = sumatotal + i;
        }
        sumatotal = sumatotal - numero1;
        return "Suma Total: " + sumatotal;
    }





    public String arreglo(int cifra, int numero1, int numero2, int numero3, int numero4, int numero5) {

        double array[] = new double[cifra];
        array[0] = numero1;
        array[1] = numero2;
        array[2] = numero3;
        array[3] = numero4;
        array[4] = numero5;

        double aux = 0;

        for (double i = 0; i < 5; i++) {

            for (double x = 0; x < cifra - 1; x++) {

                if (array[(int) x] > array[(int) (x + 1)]) {
                    aux = array[(int) x];
                    array[(int) x] = array[(int) (x + 1)];
                    array[(int) (x + 1)] = aux;
                }
            }
        }

        return "EL orden del numero menor al mayor es de " + array[0] + ", " + array[1] + ", " + array[2] + ", " + array[3] + ", " + array[4];

    }
}
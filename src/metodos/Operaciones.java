package metodos; // nombre del paquete

public class Operaciones { //la  clase

    public int operarSuma(int n1, int n2) { //se  ha creado el metodo
        int suma = 0; //dentro  de  este metodo  se ha declarado suma de  tipo numerico y  con valor inicial cero
        if ((n1 > 10 && n1 < 20) && (n2 > 10 && n2 < 20)) {
            //donde  aca el if nos dice que puede ingresar valores valores  que 10 y menores   20 para poder  realizar  la opracion de suma
            suma = n1 + n2;
            //nos capturara los valores ingresados  y nos  dara el resultado  suma
        } else {//  si en caso contrario nos retornara un valor  de cero  si no se cumple  la if ((n1 > 10 && n1 < 20) && (n2 > 10 && n2 < 20))
            suma = 0;
        }
        return suma;
        // nos retorna la  suma  por  este metdo  se va utilizar
    }

}

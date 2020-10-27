import java.util.Scanner;

class pokedex{
    //Un programa estilo pokedex que nos dirá el estilo y características de tres pokemones
     public static void main(String[] args){

        //Instancia de nuestro objeto
        Scanner entrada = new Scanner(System.in);

        //Variables
        int op,op2;
        char letra;
        
        
        //Cuerpo del programa
    do{
        System.out.println("3IV8_Cerecedo_Ramirez_Sebastian");
        System.out.println("Elija la opcion deseada: ");
        System.out.println("1.- Charmander  ");
        System.out.println("2.- Bulbasaor ");
        System.out.println("3.- Squartle ");
        System.out.println("4.- Batalla ");
        System.out.println("5.- Regresar al menu ");
        System.out.println("6.- Salir ");
        //Menu
        

        op = entrada.nextInt();

        
        //Estas son las opciones
        switch (op) {
            case 1:
                
                System.out.println("Charmander");
                System.out.println("ID: 20 ");
                System.out.println("Fuerza: 20");
                System.out.println("Defensa: 10");
                System.out.println("Vida: 100");
                System.out.println("Ataque principal: Elemento agua");
                System.out.println("Ataque secundario: Acido");
                break;

            case 2:
                System.out.println("Bulbasaor");
                System.out.println("ID: 22 ");
                System.out.println("Fuerza: 30");
                System.out.println("Defensa: 25");
                System.out.println("Vida: 100");
                System.out.println("Ataque principal: Elemento fuego");
                System.out.println("Ataque secundario: Onda sonora");
                break;

            case 3:
                System.out.println("Squartle");
                System.out.println("ID: 71 ");
                System.out.println("Fuerza: 10");
                System.out.println("Defensa: 50");
                System.out.println("Vida: 100");
                System.out.println("Ataque principal: Elemento aire");
                System.out.println("Ataque secundario: Golpe");
                break;
            case 4:
                System.out.println("Bienvenido a Batallas Pokemon");
                System.out.println("Escoja su pokemon");
                op2 = entrada.nextInt();
                




        }
        //ESto de abajo es para repetir el programa
        System.out.println("¿Deseas repetir el programa?, si lo desea escriba s");
        
        letra = entrada.next().charAt(0);

        

    }while(letra == 's');

        

    }
} 
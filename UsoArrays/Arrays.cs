using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace UsoArrays
{
    internal class Arrays
    {
        public static void Main(string[] args)
        {
            // arrays para cuando no se tiene claro los valores que tendra
            int[] Edades1 = new int[4];
            Edades1[0] = 15;
            Edades1[1] = 27;
            Edades1[2] = 19;
            Edades1[3] = 80;

            // arrays para cuando se tiene claro los valores que tendra
            // arrays cuando no tiene un limite de datos
            int[] Edades2 = {15,27,19,80,21};
            Console.WriteLine(Edades2[4]);

            // arrays cuando tiene un limite de datos
            int[] Edades3 = new int[5] { 15, 27, 19, 80, 21 };
            Console.WriteLine(Edades3[4]);

            // array implicito
            var Datos = new[] {"Juan","Diaz","España"}; // array tipo string
            var Valores = new[] {15,28,35,75.5,30.30}; // array tipo double

            // arrays objetos
            Empleados Ana = new Empleados("Ana", 27);
            Empleados[] arrayEmpleados = new Empleados[2]; // instanciar
            arrayEmpleados[0] = new Empleados("Sara", 37);
            arrayEmpleados[1] = Ana;

            // tiempo video 6:40

            // arrays tipos anonimos
            // recorrido y acceso de arrays con buche for
        }
    }
    class Empleados
    {
        string nombre;
        int edad;

        public Empleados(String nombre, int edad) // constructor
        {
            this.nombre = nombre;
            this.edad = edad;
        }
    }
}
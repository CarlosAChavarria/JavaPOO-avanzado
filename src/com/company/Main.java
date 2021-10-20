package com.company;

import bank.CuentaBancaria;
import ejercicio1.Person;
import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        /*
        Persona persona = new Persona();
        Persona.nombre = "Carlos";
        Persona.edad = 23;

        Animal animal = new Animal();
        animal.nombre = "lomito";*/

        /*Scanner sc = new Scanner(System.in);
        CuentaBancaria cuenta1 = new CuentaBancaria("Carlos", 0001, 15650);
        System.out.println("Datos actuales:");
        System.out.println(cuenta1.getMostrarName());
        System.out.println(cuenta1.getMostrarKey());
        System.out.println(cuenta1.getMostrarSaldo() + "\n");
        System.out.println("Actualiza tus datos");
        System.out.print("Ingresa nuevo nombre : ");
        String newName = sc.nextLine();
        System.out.print("Ingresa nuevo key : ");
        int newKey = sc.nextInt();
        System.out.print("Ingresa nuevo saldo : ");
        float newSaldo = sc.nextFloat();
        cuenta1.setName(newName);
        cuenta1.setKey(newKey);
        cuenta1.setSaldo(newSaldo);
        System.out.println("Datos actulizados : ");
        System.out.println(cuenta1.getMostrarName());
        System.out.println(cuenta1.getMostrarKey());
        System.out.println(cuenta1.getMostrarSaldo() + "\n");*/

        Person person1 = new Person("Carlos", 23, "2014080265");
        Scanner sc = new Scanner(System.in);

        System.out.println("Datos : ");
        System.out.println(person1.getName() + "\n" + person1.getAge() + "\n" + person1.getId());

        System.out.println("\nEditar datos");
        System.out.print("Ingresa nuevo nombre : ");
        String newName = sc.nextLine();
        System.out.print("Ingresa nueva edad : ");
        int newKey = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingresa nuevo id : ");
        String newSaldo = sc.nextLine();
        person1.setName(newName);
        person1.setAge(newKey);
        person1.setId(newSaldo);

        System.out.println("\nDatos actualizados : \n");
        System.out.println(person1.getName() + "\n" + person1.getAge() + "\n" + person1.getId());
    }
}

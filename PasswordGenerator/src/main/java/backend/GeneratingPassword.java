/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Random;

/**
 *
 * @author jony_
 */
public class GeneratingPassword {
    
    Random randomChar = new Random();
    
    private int numberOfCharacters;    
    private int[] characters;
    private String chosenType;
    
    final String[] PASSWORD_TYPE = {"fraca", "média", "forte"};

    public GeneratingPassword() {
        this.numberOfCharacters = 0;
        this.chosenType = "fraca";
    }

    public int getNumberOfCharacters() {
        return numberOfCharacters;
    }

    public void setNumberOfCharacters(int numberOfCharacters) {
        this.numberOfCharacters = numberOfCharacters;
    }

    public String getChosenType() {
        return chosenType;
    }

    public void setChosenType(String chosenType) {
        this.chosenType = chosenType;
    }
    
    private void generate() {
        if(this.numberOfCharacters == 0) {
            System.out.println("Failed to generate password!\n "
                + "Please, enter the number of characters...");
        }
        else if(this.numberOfCharacters < 4 && this.numberOfCharacters > 50){
            System.out.println("failure!! \n"
                + "the password must contain between 4 and 50 digits.");            
        }
        else {
            this.characters = new int[this.numberOfCharacters];
            for(int i = 0; i < this.characters.length; i++) {
                this.characters[i] = this.randomChar.nextInt(9);
            }
        }
    } 
    
    public void start() {
        generate();
    }
    
    @Override
    public String toString() {
        String print = "";
        for(int i = 0; i < this.characters.length; i++) {
            print += " " + this.characters[i] + " ";
        }               
        return print;
    }
    
    
}


//perguntar ao usuario com quantos caracteres deve ser a senha
//ou pedir pra escolher entre as opções (fraca, média e forte)
//estabelecer um limite de no minimo 4 digitos e no maximo 50 caracteres
//randomizar os caracteres
//armazenar os caracteres dentro de um array
//imprimir a senha gerada para o usuário

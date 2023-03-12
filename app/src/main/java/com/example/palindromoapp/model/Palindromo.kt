package com.example.palindromoapp.model

class Palindromo constructor(arg : String){

    val content : String = arg
        get() {
            return field.lowercase().trim();
        };

    fun isPalindromo() : Boolean{
        return content == content.toString().trim().reversed();
    }
}
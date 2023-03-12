/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.netbeans.validation.api.builtin.stringvalidation;

import org.netbeans.validation.api.Problems;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidator;

/**
 *
 * @author KAOS
 */
public class ValidacioContra extends StringValidator{
    @Override
    public void validate(Problems prblms, String compName, String textUsuari) {
        int numerosContra = 0;
        int letrasContra = 0;
        int caracteresContra = 0;
        String abecedario = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "1234567890";
        String caracteres = "ºª!|@·#$~%€&¬/()=?¿¡^`[*]+¨{¨;,.:-_<>çñÇ}Ñ";
        

        if (textUsuari != null && !textUsuari.equals(
                "")) {
            for (int i = 0; i < textUsuari.length(); i++) {
                if (numeros.contains(textUsuari.substring(i, i + 1))) {
                    numerosContra++;
                } else if (abecedario.contains(textUsuari.substring(i, i + 1))) {
                    letrasContra++;
                } else if (caracteres.contains(textUsuari.substring(i, i + 1))) {
                    caracteresContra++;
                }
            }
        }
        if (textUsuari.length() < 8){
            prblms.add("El campo '" + compName + "' ha de tener 8 caracteres como minimo");
        } else if (caracteresContra != 0){
            prblms.add("El campo '" + compName + "' no puede contener caracteres especiales");
        } else if (letrasContra <= 1){
            prblms.add("El campo '" + compName + "' tiene que tener 2 letras como minimo");
        } else if (numerosContra <= 1){
            prblms.add("El campo '" + compName + "' tiene que contener 2 numeros como minimo");
        }
    }
}

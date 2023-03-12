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
public class ValidacioUsuari extends StringValidator {

    @Override
    public void validate(Problems prblms, String compName, String textUsuari) {
        if (textUsuari != null && !textUsuari.equals("")) {
            if (!textUsuari.substring(0, 1).equals(textUsuari.substring(0, 1).toUpperCase())) {
                prblms.add("El campo '" + compName + "' tiene que tener la primera letra en mayuscula");
            }
        }
    }

}

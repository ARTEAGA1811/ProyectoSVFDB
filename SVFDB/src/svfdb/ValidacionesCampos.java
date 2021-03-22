/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svfdb;

//import com.itextpdf.xmp.impl.Utils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import org.h2.util.StringUtils;

/**
 *
 * @author David Arteaga. 14 mar. 2021 9:29:25 p. m.
 */
public class ValidacionesCampos {

    private boolean isPhoneNumberCorrect(String pPhoneNumber) {
        Pattern pattern = Pattern.compile("((\\+[1-9]{3,4}|0[1-9]{4}|00[1-9]{3})\\-?)?\\d{8,20}");
        Matcher matcher = pattern.matcher(pPhoneNumber);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    public boolean validadorDeCedula() {

        String cedula = null;
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                        JOptionPane.showMessageDialog(null, "La Cédula ingresada es Incorrecta");
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Una excepcion ocurrio en el proceso de validadcion , Ingrese su cédula nuevamente");

            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {

        }
        return cedulaCorrecta;
    }
    
    
    
    
    public boolean validadorDeCedula(String miCedula) {

        String cedula = miCedula;
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
// Coeficientes de validación cédula
// El decimo digito se lo considera dígito verificador
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                        //JOptionPane.showMessageDialog(null, "La Cédula ingresada es Correcta");
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Una excepcion ocurrio en el proceso de validadcion , Ingrese su cédula nuevamente");

            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {

        }
        return cedulaCorrecta;
    }

}

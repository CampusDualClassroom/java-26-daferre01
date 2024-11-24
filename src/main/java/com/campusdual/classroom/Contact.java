package com.campusdual.classroom;

import java.text.Normalizer;

public class Contact implements ICallActions{
    private String name;
    private String surnames;
    private String phone;
    private String code;

    public Contact(String name, String surnames, String phone) {
        this.name = name;
        this.phone = phone;
        this.surnames = surnames;
        this.code=getcode(name,surnames);
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getSurnames() {
        return surnames;
    }

    public String getPhone() {
        return phone;
    }
    private String getcode(String name, String surnames) {
        String normalizado_nome = quitarTildes(name.toLowerCase().trim().replaceAll("\\s+", " "));
        String normalizado_apelido = quitarTildes(surnames.toLowerCase().trim().replaceAll("\\s+", " "));
        String[] arraysurnames = normalizado_apelido.split(" ");

        StringBuilder codeBuilder = new StringBuilder();
        codeBuilder.append(normalizado_nome.charAt(0));

        if (arraysurnames.length == 1) {
            codeBuilder.append(arraysurnames[0]);
        } else {
            for (int i = 0; i < arraysurnames.length; i++) {
                if (i == 0) {
                    codeBuilder.append(arraysurnames[i].charAt(0));
                } else {
                    codeBuilder.append(arraysurnames[i]);
                }
            }
        }
        return codeBuilder.toString();
    }


    public static String quitarTildes(String texto) {
        String textoNormalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);
        return textoNormalizado.replaceAll("[^\\p{ASCII}]", "");
    }

    @Override
    public void callMyNumber() {
        System.out.println("Te estas llamando a ti mismo: " + this.name + " " + this.surnames + ", Telefono: " + this.phone);
    }

    @Override
    public void callOtherNumber(String number) {
            System.out.println(this.name + " " + this.surnames + " está llamando al numero: " + number);
    }



    @Override
    public void showContactDetails() {
        System.out.println("Detalles del contacto:");
        System.out.println("Nombre: " + this.name + " " + this.surnames);
        System.out.println("Numero: " + this.phone);
        System.out.println("Codigo: " + this.code);
    }
}

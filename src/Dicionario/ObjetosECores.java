package Dicionario;

import java.util.ArrayList;
import java.util.HashMap;

public class ObjetosECores {

    public static void main(String[] args) {


        HashMap<String, ArrayList<String>> dicionario = new HashMap<String, ArrayList<String>>();

        ArrayList<String> cores = new ArrayList<String>();
        cores.add("azul");
        dicionario.put("bola", cores);

        cores = new ArrayList<String>();
        cores.add("amarela");
        dicionario.put("boneca", cores);

        cores = new ArrayList<String>();
        cores.add("rosa");
        dicionario.put("dado", cores);

        for (String key:
             dicionario.keySet()) {

            System.out.println(key + ": " + dicionario.get(key));

        }
    }
}

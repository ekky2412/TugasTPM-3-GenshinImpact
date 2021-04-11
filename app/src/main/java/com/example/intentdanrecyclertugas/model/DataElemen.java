package com.example.intentdanrecyclertugas.model;

import com.example.intentdanrecyclertugas.R;

import java.util.ArrayList;

public class DataElemen {
    private static String[] namaElemen = {
            "Anemo",
            "Pyro",
            "Electro",
            "Hydro",
            "Cryo",
            "Geo"
    };

    private static String[] deskripsiElemen = {
            "Archon dari Elemen Anemo adalah Barbatos, yang berdomisili di Mondstat",
            "Archon dari Elemen Pyro adalah Murata, yang berdomisili di Natlan",
            "Archon dari Elemen Electro adalah Baal, yang berdomisili di Inazuma",
            "Domisili dari Elemen Hydro adalah Fontaine",
            "Archon dari Elemen Cryo adalah Tsaritsa, yang berdomisili di Snezhnaya",
            "Archon dari Elemen Geo adalah Morax, yang berdomisili di Liyue"
    };

    private static int[] gambarElemen = {
            R.drawable.element_anemo,
            R.drawable.element_pyro,
            R.drawable.element_electro,
            R.drawable.element_hydro,
            R.drawable.element_cryo,
            R.drawable.element_geo
    };

    public static ArrayList<ModelElemen> getGroup(){
        ModelElemen modelElemen = null;
        ArrayList<ModelElemen> elemenList = new ArrayList<>();
        for(int i=0; i<namaElemen.length; i++ ){
            modelElemen = new ModelElemen();
            modelElemen.setNamaElemen(namaElemen[i]);
            modelElemen.setDeskripsiElemen(deskripsiElemen[i]);
            modelElemen.setGambarElemen(gambarElemen[i]);

            elemenList.add(modelElemen);
        }

        return elemenList;
    }

}

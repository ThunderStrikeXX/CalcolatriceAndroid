package com.dave.calcolatrice;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Principale extends AppCompatActivity {

    //Dichiarazione controlli
    Button pulsanteUno;
    Button pulsanteDue;
    Button pulsanteTre;
    Button pulsanteQuattro;
    Button pulsanteCinque;
    Button pulsanteSei;
    Button pulsanteSette;
    Button pulsanteOtto;
    Button pulsanteNove;
    Button pulsanteZero;
    Button pulsantePiu;
    Button pulsanteMeno;
    Button pulsantePer;
    Button pulsanteDiviso;
    Button pulsanteCancella;
    Button pulsantePunto;
    Button pulsanteUguale;
    Button pulsanteRadice;
    Button pulsanteEsci;
    Button pulsantePotenza;
    Button pulsanteChiudiRadice;
    Button pulsanteChiudiPotenza;
    Button pulsanteCoseno;
    Button pulsanteSeno;
    Button pulsanteChiudiCoseno;
    Button pulsanteChiudiSeno;
    ImageButton pulsanteResettaNumero;
    TextView espressioneCompleta;
    EditText numeroEspressione;

    //Variabili espressione normale
    List<Double> listaNumeri = new ArrayList<Double>();
    List<Character> listaOperatori = new ArrayList<Character>();

    //Variabili radice
    List<Double> listaNumeriRadice = new ArrayList<Double>();
    List<Character> listaOperatoriRadice = new ArrayList<Character>();
    String daRimuovereRadice = "√(";
    String tempRadice = "";

    //Variabili esponente
    List<Double> listaNumeriEsponente = new ArrayList<Double>();
    List<Character> listaOperatoriEsponente = new ArrayList<Character>();
    String daRimuovereEsponente = "^(";
    String tempEsponente = "";
    String numeroBase = "";
    String testoPrimaEsponente;

    //Variabli coseno
    List<Double> listaNumeriCoseno = new ArrayList<Double>();
    List<Character> listaOperatoriCoseno = new ArrayList<Character>();
    String daRimuovereCoseno = "cos(";
    String tempCoseno = "";
    String numeroCoseno = "";
    String testoPrimaCoseno;

    //Variabli seno
    List<Double> listaNumeriSeno = new ArrayList<Double>();
    List<Character> listaOperatoriSeno = new ArrayList<Character>();
    String daRimuovereSeno = "sin(";
    String tempSeno = "";
    String numeroSeno = "";
    String testoPrimaSeno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principale);

        //Inizializzazione controlli
        pulsanteUno = (Button) findViewById(R.id.pulsanteUno);
        pulsanteDue = (Button) findViewById(R.id.pulsanteDue);
        pulsanteTre = (Button) findViewById(R.id.pulsanteTre);
        pulsanteQuattro = (Button) findViewById(R.id.pulsanteQuattro);
        pulsanteCinque = (Button) findViewById(R.id.pulsanteCinque);
        pulsanteSei = (Button) findViewById(R.id.pulsanteSei);
        pulsanteSette = (Button) findViewById(R.id.pulsanteSette);
        pulsanteOtto = (Button) findViewById(R.id.pulsanteOtto);
        pulsanteNove = (Button) findViewById(R.id.pulsanteNove);
        pulsanteZero = (Button) findViewById(R.id.pulsanteZero);
        pulsantePiu = (Button) findViewById(R.id.pulsantePiu);
        pulsanteMeno = (Button) findViewById(R.id.pulsanteMeno);
        pulsantePer = (Button) findViewById(R.id.pulsantePer);
        pulsanteDiviso = (Button) findViewById(R.id.pulsanteDiviso);
        pulsanteCancella = (Button) findViewById(R.id.pulsanteCancella);
        pulsantePunto = (Button) findViewById(R.id.pulsantePunto);
        pulsanteUguale = (Button) findViewById(R.id.pulsanteUguale);
        pulsanteRadice = (Button) findViewById(R.id.pulsanteRadice);
        pulsanteEsci = (Button) findViewById(R.id.pulsanteEsci);
        pulsantePotenza = (Button) findViewById(R.id.pulsantePotenza);
        pulsanteChiudiRadice = (Button) findViewById(R.id.pulsanteChiudiRadice);
        pulsanteChiudiPotenza = (Button) findViewById(R.id.pulsanteChiudiPotenza);
        pulsanteCoseno = (Button) findViewById(R.id.pulsanteCoseno);
        pulsanteSeno = (Button) findViewById(R.id.pulsanteSeno);
        pulsanteChiudiCoseno = (Button) findViewById(R.id.pulsanteChiudiCoseno);
        pulsanteChiudiSeno = (Button) findViewById(R.id.pulsanteChiudiSeno);
        pulsanteResettaNumero = (ImageButton) findViewById(R.id.pulsanteResettaNumero);
        espressioneCompleta = (TextView) findViewById(R.id.espressioneCompleta);
        numeroEspressione = (EditText) findViewById(R.id.numeroEspressione);
        numeroEspressione.setKeyListener(null);

        //Pulsanti Numeri
        pulsanteUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stampaNumero(1);
            }
        });

        pulsanteDue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stampaNumero(2);
            }
        });

        pulsanteTre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stampaNumero(3);
            }
        });

        pulsanteQuattro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stampaNumero(4);
            }
        });

        pulsanteCinque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stampaNumero(5);
            }
        });

        pulsanteSei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stampaNumero(6);
            }
        });

        pulsanteSette.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stampaNumero(7);
            }
        });

        pulsanteOtto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stampaNumero(8);
            }
        });

        pulsanteNove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stampaNumero(9);
            }
        });

        pulsanteZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numeroEspressione.getText().toString().isEmpty() ||
                        numeroEspressione.getText().toString().endsWith("+") ||
                        numeroEspressione.getText().toString().endsWith("-") ||
                        numeroEspressione.getText().toString().endsWith("x") ||
                        numeroEspressione.getText().toString().endsWith(":") ||
                        numeroEspressione.getText().toString().endsWith("(")) {
                    stampaNumero(0);
                    stampaCarattere('.');
                } else {
                    stampaNumero(0);
                }
            }
        });


        //Pulsanti Segno
        pulsantePiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!numeroEspressione.getText().toString().endsWith(".") &&
                        !numeroEspressione.getText().toString().endsWith("(")) {
                    if (numeroEspressione.getText().toString().startsWith("√")) {
                        segnoRadice('+');
                    } else if (numeroEspressione.getText().toString().contains("^")) {
                        segnoEsponente('+');
                    } else {
                        segnoEspressione('+');
                    }
                }
            }
        });

        pulsanteMeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!numeroEspressione.getText().toString().endsWith(".")) {

                    if (numeroEspressione.getText().toString().isEmpty() ||
                            numeroEspressione.getText().toString().endsWith("(")) {

                        numeroEspressione.setText(numeroEspressione.getText().toString() + "-");

                    } else if (numeroEspressione.getText().toString().startsWith("√")) {
                        segnoRadice('-');
                    } else if (numeroEspressione.getText().toString().contains("^")) {
                        segnoEsponente('-');
                    } else {
                        segnoEspressione('-');

                    }
                }
            }
        });

        pulsantePer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!numeroEspressione.getText().toString().endsWith(".") &&
                        !numeroEspressione.getText().toString().endsWith("(")) {
                    if (numeroEspressione.getText().toString().startsWith("√")) {
                        segnoRadice('x');
                    } else if (numeroEspressione.getText().toString().contains("^")) {
                        segnoEsponente('x');
                    } else {
                        segnoEspressione('x');
                    }
                }
            }
        });

        pulsanteDiviso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!numeroEspressione.getText().toString().endsWith(".") &&
                        !numeroEspressione.getText().toString().endsWith("(")) {
                    if (numeroEspressione.getText().toString().startsWith("√")) {
                        segnoRadice(':');
                    } else if (numeroEspressione.getText().toString().contains("^")) {
                        segnoEsponente(':');
                    } else {
                        segnoEspressione(':');
                    }
                }
            }
        });


        //Pulsante Punto
        pulsantePunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Stampo il punto (virgola)
                stampaCarattere('.');
            }
        });

        //Pulsante Coseno
        pulsanteCoseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Se non sono presenti numeri o sono presenti segni
                if (!numeroEspressione.getText().toString().isEmpty() &&
                        !numeroEspressione.getText().toString().endsWith(".") &&
                        !numeroEspressione.getText().toString().endsWith("+") &&
                        !numeroEspressione.getText().toString().endsWith("-") &&
                        !numeroEspressione.getText().toString().endsWith("x") &&
                        !numeroEspressione.getText().toString().endsWith(":") &&
                        !numeroEspressione.getText().toString().endsWith("(")) {

                    testoPrimaCoseno = numeroEspressione.getText().toString();

                    tempCoseno = numeroEspressione.getText().toString();

                    while (!tempCoseno.isEmpty() &&
                            !tempCoseno.toString().endsWith("+") &&
                            !tempCoseno.toString().endsWith("-") &&
                            !tempCoseno.toString().endsWith("x") &&
                            !tempCoseno.toString().endsWith(":") &&
                            !tempCoseno.toString().endsWith("(")) {

                        numeroCoseno = String.valueOf(tempCoseno.charAt(tempCoseno.length() - 1)) + numeroCoseno.toString();

                        tempCoseno = tempCoseno.substring(0, tempCoseno.length() - 1);
                    }

                    testoPrimaCoseno = testoPrimaCoseno.replace(numeroCoseno, "");

                    numeroEspressione.setText(numeroEspressione.getText().toString() + "cos(");

                    //Rendo visibile il pulsante per chiudere la potenza
                    pulsanteChiudiCoseno.setVisibility(View.VISIBLE);
                    pulsanteCoseno.setVisibility(View.INVISIBLE);
                }
            }
        });

        //Pulsante Seno
        pulsanteSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Se non sono presenti numeri o sono presenti segni
                if (!numeroEspressione.getText().toString().isEmpty() &&
                        !numeroEspressione.getText().toString().endsWith(".") &&
                        !numeroEspressione.getText().toString().endsWith("+") &&
                        !numeroEspressione.getText().toString().endsWith("-") &&
                        !numeroEspressione.getText().toString().endsWith("x") &&
                        !numeroEspressione.getText().toString().endsWith(":") &&
                        !numeroEspressione.getText().toString().endsWith("(")) {

                    testoPrimaSeno = numeroEspressione.getText().toString();

                    tempSeno = numeroEspressione.getText().toString();

                    while (!tempSeno.isEmpty() &&
                            !tempSeno.toString().endsWith("+") &&
                            !tempSeno.toString().endsWith("-") &&
                            !tempSeno.toString().endsWith("x") &&
                            !tempSeno.toString().endsWith(":") &&
                            !tempSeno.toString().endsWith("(")) {

                        numeroSeno = String.valueOf(tempSeno.charAt(tempSeno.length() - 1)) + numeroSeno.toString();

                        tempSeno = tempSeno.substring(0, tempSeno.length() - 1);
                    }

                    testoPrimaSeno = testoPrimaSeno.replace(numeroSeno, "");

                    numeroEspressione.setText(numeroEspressione.getText().toString() + "sin(");

                    //Rendo visibile il pulsante per chiudere la potenza
                    pulsanteChiudiSeno.setVisibility(View.VISIBLE);
                    pulsanteSeno.setVisibility(View.INVISIBLE);
                }
            }
        });

        //Pulsante ChiudiCoseno
        pulsanteChiudiCoseno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //E' possibile chiudere l'esponente se non è presente un segno o un punto o una parentesi
                if (!numeroEspressione.getText().toString().endsWith("+") &&
                        !numeroEspressione.getText().toString().endsWith("-") &&
                        !numeroEspressione.getText().toString().endsWith("x") &&
                        !numeroEspressione.getText().toString().endsWith(":") &&
                        !numeroEspressione.getText().toString().endsWith("(") &&
                        !numeroEspressione.getText().toString().endsWith(".")) {

                    //Ottengo il testo inserito
                    tempCoseno = numeroEspressione.getText().toString();

                    while (tempCoseno.charAt(0) != 'c') {
                        tempCoseno = tempCoseno.substring(1, tempCoseno.length());
                    }

                    tempCoseno = tempCoseno.replace(daRimuovereCoseno, "");

                    //Aggiungo il numero
                    listaNumeriCoseno.add(Double.parseDouble(tempCoseno));

                    if (Double.isInfinite(Double.valueOf(numeroCoseno) * Math.cos(Math.toRadians(risolviEspressione(listaNumeriCoseno, listaOperatoriCoseno))))) {
                        Toast.makeText(Principale.this, "E' un numero infinito! :(", Toast.LENGTH_LONG).show();
                        numeroEspressione.setText("");
                    } else {
                        numeroEspressione.setText(testoPrimaCoseno + String.valueOf(arrotondaDouble(Double.valueOf(numeroCoseno) * Math.cos(Math.toRadians(risolviEspressione(listaNumeriCoseno, listaOperatoriCoseno))), 8)));
                    }

                    //Libero le liste
                    listaNumeriCoseno.clear();
                    listaOperatoriCoseno.clear();
                    daRimuovereCoseno = "cos(";
                    tempCoseno = "";
                    numeroCoseno = "";
                    testoPrimaCoseno = "";

                    //Cambio i pulsanti
                    pulsanteCoseno.setVisibility(View.VISIBLE);
                    pulsanteChiudiCoseno.setVisibility(View.INVISIBLE);
                }
            }
        });

        //Pulsante ChiudiSeno
        pulsanteChiudiSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //E' possibile chiudere l'esponente se non è presente un segno o un punto o una parentesi
                if (!numeroEspressione.getText().toString().endsWith("+") &&
                        !numeroEspressione.getText().toString().endsWith("-") &&
                        !numeroEspressione.getText().toString().endsWith("x") &&
                        !numeroEspressione.getText().toString().endsWith(":") &&
                        !numeroEspressione.getText().toString().endsWith("(") &&
                        !numeroEspressione.getText().toString().endsWith(".")) {

                    //Ottengo il testo inserito
                    tempSeno = numeroEspressione.getText().toString();

                    while (tempSeno.charAt(0) != 's') {
                        tempSeno = tempSeno.substring(1, tempSeno.length());
                    }

                    tempSeno = tempSeno.replace(daRimuovereSeno, "");

                    //Aggiungo il numero
                    listaNumeriSeno.add(Double.parseDouble(tempSeno));

                    if (Double.isInfinite(Double.valueOf(numeroSeno) * Math.sin(Math.toRadians(risolviEspressione(listaNumeriSeno, listaOperatoriSeno))))) {
                        Toast.makeText(Principale.this, "E' un numero infinito! :(", Toast.LENGTH_LONG).show();
                        numeroEspressione.setText("");
                    } else {
                        numeroEspressione.setText(testoPrimaSeno + String.valueOf(arrotondaDouble(Double.valueOf(numeroSeno) * Math.sin(Math.toRadians(risolviEspressione(listaNumeriSeno, listaOperatoriSeno))), 8)));
                    }

                    //Libero le liste
                    listaNumeriSeno.clear();
                    listaOperatoriSeno.clear();
                    daRimuovereSeno = "sen(";
                    tempSeno = "";
                    numeroSeno = "";
                    testoPrimaSeno = "";

                    //Cambio i pulsanti
                    pulsanteSeno.setVisibility(View.VISIBLE);
                    pulsanteChiudiSeno.setVisibility(View.INVISIBLE);
                }
            }
        });


        //Pulsante Cancella
        pulsanteCancella.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Cancello i numeri dalla schermata
                numeroEspressione.setText("");
                espressioneCompleta.setText("");

                //Rendo la schermata come iniziale
                pulsanteRadice.setVisibility(View.VISIBLE);
                pulsanteChiudiRadice.setVisibility(View.INVISIBLE);

                pulsantePotenza.setVisibility(View.VISIBLE);
                pulsanteChiudiPotenza.setVisibility(View.INVISIBLE);

                pulsanteCoseno.setVisibility(View.VISIBLE);
                pulsanteChiudiCoseno.setVisibility(View.INVISIBLE);

                pulsanteSeno.setVisibility(View.VISIBLE);
                pulsanteChiudiSeno.setVisibility(View.INVISIBLE);

                //Resetto le liste
                listaOperatori.clear();
                listaNumeri.clear();
                listaNumeriRadice.clear();
                listaOperatoriRadice.clear();
                listaNumeriEsponente.clear();
                listaOperatoriEsponente.clear();
                listaNumeriCoseno.clear();
                listaOperatoriCoseno.clear();
                listaNumeriSeno.clear();
                listaOperatoriSeno.clear();

                //Resetto le variabili
                daRimuovereRadice = "√(";
                daRimuovereEsponente = "^(";
                tempRadice = "";
                tempEsponente = "";
                numeroBase = "";
                testoPrimaEsponente = "";
                daRimuovereCoseno = "cos(";
                tempCoseno = "";
                numeroCoseno = "";
                testoPrimaCoseno = "";
                daRimuovereSeno = "sen(";
                tempSeno = "";
                numeroSeno = "";
                testoPrimaSeno = "";
            }
        });


        //Pulsante resettaNumero
        pulsanteResettaNumero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!espressioneCompleta.getText().toString().endsWith("=")) {

                    //Cancello i numeri dalla schermata
                    numeroEspressione.setText("");

                    //Resetto le liste
                    listaNumeriRadice.clear();
                    listaOperatoriRadice.clear();
                    listaNumeriEsponente.clear();
                    listaOperatoriEsponente.clear();

                    //Resetto le variabili
                    daRimuovereRadice = "√(";
                    tempRadice = "";
                    daRimuovereEsponente = "^(";
                    tempEsponente = "";
                    numeroBase = "";
                    testoPrimaEsponente = "";

                    //Resetto la schermata
                    pulsanteRadice.setVisibility(View.VISIBLE);
                    pulsanteChiudiRadice.setVisibility(View.INVISIBLE);

                    pulsantePotenza.setVisibility(View.VISIBLE);
                    pulsanteChiudiPotenza.setVisibility(View.INVISIBLE);
                }
            }
        });


        //Pulsante Esci
        pulsanteEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                esci();
            }
        });

        //Pulsante Potenza
        pulsantePotenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Se non sono presenti numeri o sono presenti segni
                if (!numeroEspressione.getText().toString().isEmpty() &&
                        !numeroEspressione.getText().toString().endsWith(".") &&
                        !numeroEspressione.getText().toString().endsWith("+") &&
                        !numeroEspressione.getText().toString().endsWith("-") &&
                        !numeroEspressione.getText().toString().endsWith("x") &&
                        !numeroEspressione.getText().toString().endsWith(":") &&
                        !numeroEspressione.getText().toString().endsWith("(")) {

                    testoPrimaEsponente = numeroEspressione.getText().toString();

                    tempEsponente = numeroEspressione.getText().toString();

                    while (!tempEsponente.isEmpty() &&
                            !tempEsponente.toString().endsWith("+") &&
                            !tempEsponente.toString().endsWith("-") &&
                            !tempEsponente.toString().endsWith("x") &&
                            !tempEsponente.toString().endsWith(":") &&
                            !tempEsponente.toString().endsWith("(")) {

                        numeroBase = String.valueOf(tempEsponente.charAt(tempEsponente.length() - 1)) + numeroBase.toString();

                        tempEsponente = tempEsponente.substring(0, tempEsponente.length() - 1);
                    }

                    testoPrimaEsponente = testoPrimaEsponente.replace(numeroBase, "");

                    numeroEspressione.setText(numeroEspressione.getText().toString() + "^(");


                    //Rendo visibile il pulsante per chiudere la potenza
                    pulsanteChiudiPotenza.setVisibility(View.VISIBLE);
                    pulsantePotenza.setVisibility(View.INVISIBLE);
                }
            }
        });

        //Pulsante ChiudiPotenza
        pulsanteChiudiPotenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //E' possibile chiudere l'esponente se non è presente un segno o un punto o una parentesi
                if (!numeroEspressione.getText().toString().endsWith("+") &&
                        !numeroEspressione.getText().toString().endsWith("-") &&
                        !numeroEspressione.getText().toString().endsWith("x") &&
                        !numeroEspressione.getText().toString().endsWith(":") &&
                        !numeroEspressione.getText().toString().endsWith("(") &&
                        !numeroEspressione.getText().toString().endsWith(".")) {

                    //Ottengo il testo inserito
                    tempEsponente = numeroEspressione.getText().toString();

                    while (tempEsponente.charAt(0) != '^') {
                        tempEsponente = tempEsponente.substring(1, tempEsponente.length());
                    }

                    tempEsponente = tempEsponente.replace(daRimuovereEsponente, "");

                    //Elimino il testo che ho già elaborato
                    tempEsponente = tempEsponente.replace(daRimuovereEsponente, "");

                    //Aggiungo il numero
                    listaNumeriEsponente.add(Double.parseDouble(tempEsponente));

                    if (Double.isInfinite(Math.pow(Double.parseDouble(numeroBase), risolviEspressione(listaNumeriEsponente, listaOperatoriEsponente)))) {
                        Toast.makeText(Principale.this, "E' un numero infinito! :(", Toast.LENGTH_LONG).show();
                        numeroEspressione.setText("");
                    } else {
                        numeroEspressione.setText(testoPrimaEsponente + String.valueOf(arrotondaDouble(Math.pow(Double.parseDouble(numeroBase), risolviEspressione(listaNumeriEsponente, listaOperatoriEsponente)), 2)));
                    }

                    //Libero le liste
                    listaNumeriEsponente.clear();
                    listaOperatoriEsponente.clear();
                    daRimuovereEsponente = "^(";
                    tempEsponente = "";
                    numeroBase = "";
                    testoPrimaEsponente = "";

                    //Cambio i pulsanti
                    pulsantePotenza.setVisibility(View.VISIBLE);
                    pulsanteChiudiPotenza.setVisibility(View.INVISIBLE);
                }
            }
        });


        //Pulsante Radice
        pulsanteRadice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Se non sono presenti numeri o sono presenti segni
                if (numeroEspressione.getText().toString().isEmpty() ||
                        espressioneCompleta.getText().toString().endsWith("+") ||
                        espressioneCompleta.getText().toString().endsWith("-") ||
                        espressioneCompleta.getText().toString().endsWith("x") ||
                        espressioneCompleta.getText().toString().endsWith(":")) {

                    numeroEspressione.setText("√(");
                }

                //Rendo visibile il pulsante per chiudere la radice
                pulsanteChiudiRadice.setVisibility(View.VISIBLE);
                pulsanteRadice.setVisibility(View.INVISIBLE);
            }
        });


        //Pulsante ChiudiRadice
        pulsanteChiudiRadice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //E' possibile chiudere la radice se non è presente un segno o un punto o una parentesi
                if (!numeroEspressione.getText().toString().endsWith("+") &&
                        !numeroEspressione.getText().toString().endsWith("-") &&
                        !numeroEspressione.getText().toString().endsWith("x") &&
                        !numeroEspressione.getText().toString().endsWith(":") &&
                        !numeroEspressione.getText().toString().endsWith("(") &&
                        !numeroEspressione.getText().toString().endsWith(".")) {

                    //Ottengo il testo inserito
                    tempRadice = numeroEspressione.getText().toString();

                    //Elimino il testo che ho già elaborato
                    tempRadice = tempRadice.replace(daRimuovereRadice, "");

                    //Aggiungo il numero
                    listaNumeriRadice.add(Double.parseDouble(tempRadice));

                    if (Double.isNaN(Math.sqrt(risolviEspressione(listaNumeriRadice, listaOperatoriRadice)))) {

                        Toast.makeText(Principale.this, "Radice di numero negativo! :D", Toast.LENGTH_LONG).show();
                        numeroEspressione.setText("");
                    } else {

                        numeroEspressione.setText(String.valueOf(arrotondaDouble(Math.sqrt(risolviEspressione(listaNumeriRadice, listaOperatoriRadice)), 2)));
                    }

                    //Libero le liste
                    listaNumeriRadice.clear();
                    listaOperatoriRadice.clear();
                    daRimuovereRadice = "√(";
                    tempRadice = "";

                    //Cambio i pulsanti
                    pulsanteRadice.setVisibility(View.VISIBLE);
                    pulsanteChiudiRadice.setVisibility(View.INVISIBLE);
                }
            }
        });


        //Pulsanti Uguale
        pulsanteUguale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Ottengo il testo temporaneo dell'espressione completa
                String tmpEspressione = espressioneCompleta.getText().toString();

                //Se non abbiamo già premuto l'uguale
                if (!tmpEspressione.endsWith("=")) {

                    //Se il testo termina con un segno (sempre tranne all'avvio della calcolatrice)
                    if (tmpEspressione.endsWith("+") ||
                            tmpEspressione.endsWith("-") ||
                            tmpEspressione.endsWith("x") ||
                            tmpEspressione.endsWith(":")) {

                        //Se abbiamo inserito un numero procede, altrimenti non fa nulla
                        if (!numeroEspressione.getText().toString().isEmpty()) {

                            //Setto l'espressione completa nel riquadro sopra
                            espressioneCompleta.setText(espressioneCompleta.getText().toString() + numeroEspressione.getText().toString() + "=");

                            //Aggiungo il numero alla lista
                            listaNumeri.add(Double.parseDouble(numeroEspressione.getText().toString()));


                            //Ottengo il risultato
                            String risultatoEspressione = String.valueOf(risolviEspressione(listaNumeri, listaOperatori));

                            //Tronco gli zero decimali
                            while (risultatoEspressione != null &&
                                    risultatoEspressione.length() > 0 &&
                                    risultatoEspressione.charAt(risultatoEspressione.length() - 1) == '0') {

                                risultatoEspressione = risultatoEspressione.substring(0, risultatoEspressione.length() - 1);
                            }

                            //Tronco il punto
                            while (risultatoEspressione != null &&
                                    risultatoEspressione.length() > 0 &&
                                    risultatoEspressione.charAt(risultatoEspressione.length() - 1) == '.') {

                                risultatoEspressione = risultatoEspressione.substring(0, risultatoEspressione.length() - 1);
                            }

                            //Setto il risultato
                            numeroEspressione.setText(String.valueOf(risultatoEspressione));
                        }
                    }
                }
            }
        });
    }

    //Metodo che stampa un numero
    public void stampaNumero(int numero) {

        //Controllo se non è già stato stampato un risultato
        if (!espressioneCompleta.getText().toString().endsWith("=")) {
            numeroEspressione.setText(numeroEspressione.getText().toString() + numero);
        }
    }

    //Metodo che stampa un punto
    public void stampaCarattere(char carattere) {

        //Se non è presente un altro punto, il testo non è vuoto, non termina con una parentesi, non è il risultato
        if (!numeroEspressione.getText().toString().endsWith(".") &&
                !numeroEspressione.getText().toString().isEmpty() &&
                !numeroEspressione.getText().toString().endsWith("(") &&
                !espressioneCompleta.getText().toString().endsWith("=")) {
            numeroEspressione.setText(numeroEspressione.getText().toString() + carattere);
        }
    }

    //Il cuore del codice <3
    public double risolviEspressione(List<Double> listaNumeri, List<Character> listaOperatori) {

        if (listaOperatori.contains('x') || listaOperatori.contains(':')) {

            int i = 0;

            while (i < listaOperatori.size()) {

                if (listaOperatori.contains('x')) {
                    if (listaOperatori.get(i) == 'x') {

                        //Esegue l'operazione e setta il risultato nel primo membro del calcolo
                        listaNumeri.set(i, listaNumeri.get(i) * listaNumeri.get(i + 1));

                        //Rimuove il secondo
                        listaNumeri.remove(i + 1);

                        //Rimuove il segno già eseguito
                        listaOperatori.remove(i);
                    }
                }

                if (listaOperatori.contains(':')) {
                    if (listaOperatori.get(i) == ':') {

                        //Esegue l'operazione e setta il risultato nel primo membro del calcolo
                        listaNumeri.set(i, listaNumeri.get(i) / listaNumeri.get(i + 1));

                        //Rimuove il secondo
                        listaNumeri.remove(i + 1);

                        //Rimuove il segno già eseguito
                        listaOperatori.remove(i);
                    }
                }

                if (listaOperatori.contains('x') || listaOperatori.contains(':')) {
                    if (listaOperatori.get(i) != 'x' && listaOperatori.get(i) != ':') {
                        i++;
                    }
                } else {
                    break;
                }
            }
        }


        //Se nell'espressione compare un + o -
        if (listaOperatori.contains('+') || listaOperatori.contains('-')) {

            //Utilizzo un while personalizzato
            final int k = 0;

            /*
            Essendo l'espressione ridotta a soli + e -,
            non ho più bisogno di un indice, che resterà
            perciò costante a 0 per comodità
            */

            while (k < listaOperatori.size()) {

                //Se contiene un +
                if (listaOperatori.contains('+')) {

                    if (listaOperatori.get(k) == '+') {

                        //Esegue l'operazione e setta il risultato nel primo membro del calcolo
                        listaNumeri.set(k, arrotondaDouble(listaNumeri.get(k) + listaNumeri.get(k + 1), 2));

                        //Rimuove il secondo
                        listaNumeri.remove(k + 1);

                        //Rimuove il segno già eseguito
                        listaOperatori.remove(k);
                    }
                }

                if (listaOperatori.contains('-')) {
                    if (listaOperatori.get(k) == '-') {

                        //Esegue l'operazione e setta il risultato nel primo membro del calcolo
                        listaNumeri.set(k, listaNumeri.get(k) - listaNumeri.get(k + 1));

                        //Rimuove il secondo
                        listaNumeri.remove(k + 1);

                        //Rimuove il segno già eseguito
                        listaOperatori.remove(k);

                    }
                }
            }
        }

        return arrotondaDouble(listaNumeri.get(0), 2);
    }

    //Metodo che prosegue con l'espressione
    public void segnoEspressione(char segno) {

        if (espressioneCompleta.getText().toString().endsWith("=")) {
            espressioneCompleta.setText("");

            //Resetto le liste
            listaOperatori.clear();
            listaNumeri.clear();
        }

        //Se sono prenenti numeri e non termina con un punto (espressione)
        if (!numeroEspressione.getText().toString().isEmpty() &&
                !numeroEspressione.getText().toString().endsWith(".")) {

            //Aggiungo il numero alla lista
            listaNumeri.add(Double.parseDouble(numeroEspressione.getText().toString()));

            //Setto l'espressione completa nel riquadro sopra
            espressioneCompleta.setText(espressioneCompleta.getText().toString() + numeroEspressione.getText().toString() + segno);

            //Svuoto il campo del numero
            numeroEspressione.setText("");

            //Aggiungo alla lista degli operatori quello selezionato
            listaOperatori.add(segno);

        }
    }

    //Metodo che prosegue con la radice
    public void segnoRadice(char segno) {

        //Ottengo il testo con la radice
        tempRadice = numeroEspressione.getText().toString();

        //Elimino inizialmente la radice e la parentesi, successivamente i numeri e i segni che ho già utilizzato
        tempRadice = tempRadice.replace(daRimuovereRadice, "");

        //Aggiungo il numero alla lista
        listaNumeriRadice.add(Double.parseDouble(tempRadice));

        //Aggiungo il segno alla lista
        listaOperatoriRadice.add(segno);

        //Aggiungo il numero e il segno che ho già utilizzato e che non mi servono più
        daRimuovereRadice += tempRadice + segno;

        //Alla fine aggiungo il segno al testo visibile
        numeroEspressione.setText(numeroEspressione.getText().toString() + segno);
    }

    //Metodo che prosegue con l'esponente
    public void segnoEsponente(char segno) {

        //Ottengo il testo con la radice
        tempEsponente = numeroEspressione.getText().toString();

        //Elimino inizialmente la radice e la parentesi, successivamente i numeri e i segni che ho già utilizzato
        tempEsponente = tempEsponente.replace(daRimuovereEsponente, "");

        //Aggiungo il numero alla lista
        listaNumeriEsponente.add(Double.parseDouble(tempEsponente));

        //Aggiungo il segno alla lista
        listaOperatoriEsponente.add(segno);

        //Aggiungo il numero e il segno che ho già utilizzato e che non mi servono più
        daRimuovereEsponente += tempEsponente + segno;

        //Alla fine aggiungo il segno al testo visibile
        numeroEspressione.setText(numeroEspressione.getText().toString() + segno);
    }

    //Metodo che arrotonda una double
    public double arrotondaDouble(double d, int p) {
        return Math.rint(d * Math.pow(10, p)) / Math.pow(10, p);
    }

    //Metodo che chiude l'applicazione
    public void esci() {
        //Chiudo l'applicazione
        finish();
        System.exit(0);
    }

    public double coseno(Double gradi) {

        Double radianti = (gradi * Math.PI) / 180;

        Double cosRadianti = Math.cos(radianti);

        return (cosRadianti * 180) / Math.PI;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.actionOne) {
            startActivity(new Intent(getApplicationContext(), Impostazioni.class));
        }

        if (id == R.id.actionTwo) {

            //Utilizza l'app predefinita per inviare una mail
            final Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
            emailIntent.setType("plain/text");
            emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"dave.venturini@gmail.com"});
            emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "App Android Calcolatrice");

            startActivity(Intent.createChooser(emailIntent, "Invia email..."));
        }

        if (id == R.id.actionThree) {
            esci();
        }

        return super.onOptionsItemSelected(item);
    }
}

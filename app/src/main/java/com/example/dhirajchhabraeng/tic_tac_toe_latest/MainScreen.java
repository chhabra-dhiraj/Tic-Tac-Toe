package com.example.dhirajchhabraeng.tic_tac_toe_latest;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.sql.Array;
import java.util.Arrays;

public class MainScreen extends AppCompatActivity {
    public String arr[][] = new String[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        arr[0][0] = "1";
        arr[0][1] = "2";
        arr[0][2] = "3";
        arr[1][0] = "4";
        arr[1][1] = "5";
        arr[1][2] = "6";
        arr[2][0] = "7";
        arr[2][1] = "8";
        arr[2][2] = "9";

        final Button Button1 = (Button) findViewById(R.id.button_1);
        final Button Button2 = (Button) findViewById(R.id.button_2);
        final Button Button3 = (Button) findViewById(R.id.button_3);
        final Button Button4 = (Button) findViewById(R.id.button_4);
        final Button Button5 = (Button) findViewById(R.id.button_5);
        final Button Button6 = (Button) findViewById(R.id.button_6);
        final Button Button7 = (Button) findViewById(R.id.button_7);
        final Button Button8 = (Button) findViewById(R.id.button_8);
        final Button Button9 = (Button) findViewById(R.id.button_9);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button1.setText("" + MainActivity.symbol);
                arr[0][0] = MainActivity.symbol;

                if (MainActivity.symbol == "O") {
                    MainActivity.symbol = "X";
                } else {
                    MainActivity.symbol = "O";
                }

                if (checkTriplet(0, 0)) {
                    messagePop();
                }

            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button2.setText("" + MainActivity.symbol);
                arr[0][1] = MainActivity.symbol;

                if (MainActivity.symbol == "O") {
                    MainActivity.symbol = "X";
                } else {
                    MainActivity.symbol = "O";
                }

                if (checkTriplet(0, 1)) {
                    messagePop();
                }
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button3.setText("" + MainActivity.symbol);
                arr[0][2] = MainActivity.symbol;

                if (MainActivity.symbol == "O") {
                    MainActivity.symbol = "X";
                } else {
                    MainActivity.symbol = "O";
                }

                if (checkTriplet(0, 2)) {
                    messagePop();
                }

            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button4.setText("" + MainActivity.symbol);
                arr[1][0] = MainActivity.symbol;

                if (MainActivity.symbol == "O") {
                    MainActivity.symbol = "X";
                } else {
                    MainActivity.symbol = "O";
                }

                if (checkTriplet(1, 0)) {
                    messagePop();
                }
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button5.setText("" + MainActivity.symbol);
                arr[1][1] = MainActivity.symbol;

                if (MainActivity.symbol == "O") {
                    MainActivity.symbol = "X";
                } else {
                    MainActivity.symbol = "O";
                }

                if (checkTriplet(1, 1)) {
                    messagePop();
                }

            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button6.setText("" + MainActivity.symbol);
                arr[1][2] = MainActivity.symbol;

                if (MainActivity.symbol == "O") {
                    MainActivity.symbol = "X";
                } else {
                    MainActivity.symbol = "O";
                }

                if (checkTriplet(1, 2)) {
                    messagePop();
                }

            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button7.setText("" + MainActivity.symbol);
                arr[2][0] = MainActivity.symbol;

                if (MainActivity.symbol == "O") {
                    MainActivity.symbol = "X";
                } else {
                    MainActivity.symbol = "O";
                }

                if (checkTriplet(2, 0)) {
                    messagePop();
                }

            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button8.setText("" + MainActivity.symbol);
                arr[2][1] = MainActivity.symbol;

                if (MainActivity.symbol == "O") {
                    MainActivity.symbol = "X";
                } else {
                    MainActivity.symbol = "O";
                }

                if (checkTriplet(2, 1)) {
                    messagePop();
                }

            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button9.setText("" + MainActivity.symbol);
                arr[2][2] = MainActivity.symbol;

                if (MainActivity.symbol == "O") {
                    MainActivity.symbol = "X";
                } else {
                    MainActivity.symbol = "O";
                }

                if (checkTriplet(2, 2)) {
                    messagePop();
                }

            }
        });

    }

    public boolean checkTriplet(int i, int j) {

        if (arr[0][0].equals(arr[0][1]) && arr[0][1].equals(arr[0][2])) {
            return true;
        } else if (arr[0][0].equals(arr[1][0]) && arr[1][0].equals(arr[2][0])) {
            return true;
        } else if (arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2])) {
            return true;
        } else if (arr[0][1].equals(arr[1][1]) && arr[1][1].equals(arr[2][1])) {
            return true;
        } else if (arr[0][2].equals(arr[1][2]) && arr[1][2].equals(arr[2][2])) {
            return true;
        } else if (arr[0][2].equals(arr[1][1]) && arr[1][1].equals(arr[2][0])) {
            return true;
        } else if (arr[1][0].equals(arr[1][1]) && arr[1][1].equals(arr[1][2])) {
            return true;
        } else if (arr[2][0].equals(arr[2][1]) && arr[2][1].equals(arr[2][2])) {
            return true;
        } else {
            return false;
        }

    }

    public void messagePop() {
        AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Game Over.\nWant to Replay the game?");
        builder1.setCancelable(true);

        builder1.setPositiveButton(
                "Yes",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Intent intent = new Intent(MainScreen.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });

        builder1.setNegativeButton(
                "No",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        AlertDialog alert11 = builder1.create();
        alert11.show();
    }

    public void resetFunction(View view) {
        Intent intent = new Intent(MainScreen.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
                builder1.setMessage("Do you want to change your symbol?");
                builder1.setCancelable(true);

                builder1.setPositiveButton(
                        "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Intent intent = new Intent(MainScreen.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                        });

                builder1.setNegativeButton(
                        "No",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alert11 = builder1.create();
                alert11.show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

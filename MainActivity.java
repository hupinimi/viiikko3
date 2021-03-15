package com.example.ht8_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private int bottles;
    private double money;
    ArrayList<Bottle> bottle_array = new ArrayList<Bottle>();

    private Button moneyAdder;
    private Button bottleBuyer;
    private Button catalogShower;
    private Button returnCash;
    private TextView screenView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottleBuyer = (Button) findViewById(R.id.buyButton);
        catalogShower = (Button) findViewById(R.id.catalogButton);
        returnCash = (Button) findViewById(R.id.returnMoney);
        screenView = (TextView) findViewById(R.id.screenView);
        moneyAdder = (Button) findViewById(R.id.addMoney);

        //private void BottleDispenser() {
        bottles = 5;
        money = 0;

        for(int i = 0; i< bottles; i++) {
            Bottle temp = new Bottle();
            bottle_array.add(temp);


        moneyAdder.setOnClickListener(v -> {
            money += 1;
            screenView.setText("Klink! Added more money!");
        });


        bottleBuyer.setOnClickListener(v -> {
            if (money < 1.8) {
                screenView.setText("Add money first!");
            } else {
                if (bottles > 0) {
                    bottles -= 1;
                    money = money - 1.8;
                    screenView.setText("KACHUNK! " + bottle_array.get(bottles).getName() + " came out of the dispenser!");

                } else {
                    screenView.setText("Out of bottles!");
                }
            }
        });

        returnCash.setOnClickListener(v -> {
            money = 0;
            screenView.setText("Klink klink. Money came out!");
        });

        catalogShower.setOnClickListener(v -> {
            String printti = "";
            for(int j = 1; j<= bottles; j++) {
                printti = printti + "\n" + j +". " + "Name: Pepsi Max\n\tSize: 0.5	Price: 1.8";
            }
            screenView.setText(printti);
        });

    }

    }
}

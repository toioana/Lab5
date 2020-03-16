package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

class Car{

    public String name;
    public int imageResource;
}

class TagCar{

    public TextView name;
    public ImageView image;
}

public class MainActivity extends Activity {
    private ListView listOfCars;
    CarAdapter carAdapter;
    private EditText addNewCar;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO 1, 2, 3,4
        listOfCars = (ListView)findViewById(R.id.lv_list_cars);

        carAdapter = new CarAdapter(this);




        carAdapter.addCar("masina", R.drawable.car);
        carAdapter.addCar("masinuta", R.drawable.car);
        carAdapter.addCar("masinaFrumoasa", R.drawable.car);
        carAdapter.addCar("masinaRapida", R.drawable.car);
        listOfCars.setAdapter(carAdapter);


    }
}


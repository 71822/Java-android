package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.toolbox.JsonObjectRequest;
import com.example.myapplication.Product;
import com.example.myapplication.ProductListAdapter;
import com.example.myapplication.RequestManager;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Stock> stockList = new ArrayList<>();
    private ArrayList<User> userList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        stockList.add(new Stock("Shorts (F)", "Stone Wash Dmin Shorts ", 20, 25.90));
        stockList.add(new Stock("Bag (F)", "Leather Shoulder Bag", 4, 50.45));
        stockList.add(new Stock("Blouse (F)", "Vintage Blue Silk Polka Dot Blouse", 8, 45.99));
        stockList.add(new Stock("Boots (F)", "Soft Leather Brown Ankle Boots", 3, 65.35));
        stockList.add(new Stock("Belts (F)", "Woven Finish Fashion Belt", 15, 21.99));
        stockList.add(new Stock("Shirt (M)", "Jacquard Patter Wrangler Western Shirt", 19, 34.87));
        stockList.add(new Stock("Shoes (M)", "Suede Ankle Boots", 6, 55.00));
        stockList.add(new Stock("Trousers (M)", "Izod Peach Chinos", 23, 31.75));
        stockList.add(new Stock("Belt (M)", "Suede Casual Belt", 4, 22.98));
        stockList.add(new Stock("Hat (M)", "Trilby Style Brown Woven Fix", 2, 67.80));

        userList.add(new User("Martin", "David", 20));
        userList.add(new User("Schmitt", "Séverine", 40));
        userList.add(new User("Brocoli", "Paul", 8));
        userList.add(new User("Chou", "Fleure", 3));

        setContentView(R.layout.activity_main);


        RecyclerView rvProductList = findViewById(R.id.rvProductList);
        rvProductList.setLayoutManager(new LinearLayoutManager(this));
        rvProductList.setAdapter(new ProductListAdapter(stockList));


        RecyclerView rvPersoList = findViewById(R.id.rvPersoList);
        rvPersoList.setLayoutManager(new LinearLayoutManager(this));
        rvPersoList.setAdapter(new PersoListAdapter(userList));
    }

}

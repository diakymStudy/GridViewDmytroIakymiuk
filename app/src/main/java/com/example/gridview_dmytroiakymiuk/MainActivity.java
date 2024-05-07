package com.example.gridview_dmytroiakymiuk;

import android.os.Bundle;
import android.widget.GridView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    int[] icons = {
        R.drawable.angular,
        R.drawable.aws,
        R.drawable.cpp,
        R.drawable.java,
        R.drawable.jsp,
        R.drawable.php,
        R.drawable.python,
        R.drawable.react,
        R.drawable.sql
    };
    String[] names = {"angular","aws","cpp","java","jsp","php","python","react","sql"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        gridView = (GridView)findViewById(R.id.gridView);
        GridAdapter grdAdapter = new GridAdapter(names, icons, this);
        gridView.setAdapter(grdAdapter);

    }
}
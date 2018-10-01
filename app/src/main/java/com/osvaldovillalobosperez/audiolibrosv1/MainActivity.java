package com.osvaldovillalobosperez.audiolibrosv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Aplicacion app = (Aplicacion) getApplication();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setAdapter(app.getAdaptador());
        layoutManager = new GridLinearLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);

        app.getAdaptador().setOnItemClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Seleccionado el elemento: " + recyclerView.getChildAdapterPosition(v), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

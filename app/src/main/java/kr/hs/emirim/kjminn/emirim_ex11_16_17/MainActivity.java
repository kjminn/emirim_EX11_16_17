package kr.hs.emirim.kjminn.emirim_ex11_16_17;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    String[] itemArrs = {"겨울왕국", "라라랜드", "신과함께", "엑시트", "스파이더맨","말모이","글래디에이터","위대한쇼맨","너의 결혼식","작은 아씨들"};
    int[] posterIds = {R.drawable.poster01, R.drawable.poster02, R.drawable.poster03, R.drawable.poster04, R.drawable.poster05,
            R.drawable.poster06, R.drawable.poster07, R.drawable.poster08, R.drawable.poster09, R.drawable.poster10   };
    ImageView imgv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("스피너와 영화포스터");
        Spinner spinner1 = findViewById(R.id.spinner1);
        imgv = findViewById(R.id.imgv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, itemArrs);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imgv.setImageResource(posterIds[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
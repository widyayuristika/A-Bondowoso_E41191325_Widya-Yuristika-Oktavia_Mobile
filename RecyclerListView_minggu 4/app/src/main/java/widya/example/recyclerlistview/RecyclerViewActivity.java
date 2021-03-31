package widya.example.recyclerlistview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Widya", "E41191325", "085961496220"));
        mahasiswaArrayList.add(new Mahasiswa("Sheila", "E41190250", "082890371893"));
        mahasiswaArrayList.add(new Mahasiswa("Rizky", "E41192406", "085342089345"));
        mahasiswaArrayList.add(new Mahasiswa("Mika", "E41191383", "085802471023"));
        mahasiswaArrayList.add(new Mahasiswa("Tasya", "E41192010", "085780234200"));
        mahasiswaArrayList.add(new Mahasiswa("Mekayla", "E41193010", "085231562108"));
        mahasiswaArrayList.add(new Mahasiswa("Meyza", "E41194509", "085980724517"));
    }
}
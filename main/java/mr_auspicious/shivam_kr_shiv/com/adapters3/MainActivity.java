package mr_auspicious.shivam_kr_shiv.com.adapters3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grdlst);

        ArrayList<Image> arr = new ArrayList<>();
        arr.add(new Image(R.drawable.gingerbread));
        arr.add(new Image(R.drawable.images));
        arr.add(new Image(R.drawable.ic));
        arr.add(new Image(R.drawable.jelly));
        arr.add(new Image(R.drawable.download));
        arr.add(new Image(R.drawable.lollipo));

        GridView grid = (GridView) findViewById(R.id.grd);
        ImageAdapter imageAdapter = new ImageAdapter(MainActivity.this,arr);
        grid.setAdapter(imageAdapter);

    }
}

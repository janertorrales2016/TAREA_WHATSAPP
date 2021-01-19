package uteq.student.whatsapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.Menu;
import android.widget.LinearLayout;

import com.google.android.material.tabs.TabLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import uteq.student.whatsapp2.WebService.Asynchtask;
import uteq.student.whatsapp2.WebService.WebService;
import uteq.student.whatsapp2.adapter.ViewPagerAdapter;
import uteq.student.whatsapp2.model.llamada;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager =(ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //añadir fragmentos
        adapter.AddFragment(new CameraFragment(),"");
        adapter.AddFragment(new ChatFragment(),"Chat");
        adapter.AddFragment(new EstadFragment(),"Estado");
        adapter.AddFragment(new CallFragment(),"Llamada");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.camara);
        LinearLayout layout = ((LinearLayout) ((LinearLayout) tabLayout.getChildAt(0)).getChildAt(0));
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) layout.getLayoutParams();
        layoutParams.weight = 0.0f; //con este numero le podes asignar un porcentaje fijo relativo a los otros tabs por ejemplo 0.5f sera la mitad que los demas taps y 2f sera el doble
        layoutParams.width = LinearLayout.LayoutParams.WRAP_CONTENT; //esto sirve si queres que se ajuste al icono que le pusiste y nada mas

        layout.setLayoutParams(layoutParams);
        tabLayout.selectTab(tabLayout.getTabAt(1));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }


}
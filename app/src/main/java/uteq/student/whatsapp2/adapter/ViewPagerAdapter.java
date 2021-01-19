package uteq.student.whatsapp2.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
     private final List<Fragment> lstFragment = new ArrayList<>();
     private final List<String> lstTittle = new ArrayList<>();
      public ViewPagerAdapter(FragmentManager fm){
          super(fm);
      }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return lstFragment.get(position);
    }

    @Override
    public int getCount() {
        return lstTittle.size();
    }

    @Override
    public  CharSequence getPageTitle(int position){

          return lstTittle.get(position);
    }

    public void AddFragment(Fragment fragment, String title){
          lstFragment.add(fragment);
          lstTittle.add(title);
    }
}

package com.example.joseph.destinationdota;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

import rm.com.longpresspopup.LongPressPopup;
import rm.com.longpresspopup.LongPressPopupBuilder;

/**
 * Created by Joseph on 11/15/2016.
 */
public class hero_st extends Fragment {

    GridView gridView;
    ImageView imV;
    Integer img_id[] = {R.drawable.h_abbadon_sb,R.drawable.h_alchemist_sb, R.drawable.h_axe_sb,
            R.drawable.h_beastmaster_sb, R.drawable.h_brewmaster_sb,R.drawable.h_bristleback_sb,R.drawable.h_cent_sb, R.drawable.h_chaos_knight_sb,
            R.drawable.h_clockwork_sb, R.drawable.h_doom_bringer_sb,
            R.drawable.h_dragon_knight_sb, R.drawable.h_earth_spirit_sb, R.drawable.h_earthshaker_sb,R.drawable.h_elder_titan_sb,
            R.drawable.h_huskar_sb, R.drawable.h_io_sb, R.drawable.h_kunkka_sb,R.drawable.h_legion_commander_sb, R.drawable.h_life_stealer_sb,
            R.drawable.h_lone_druid_sb, R.drawable.h_lycan_sb, R.drawable.h_magnataur_sb, R.drawable.h_meepo_sb, R.drawable.h_night_stalker_sb,
            R.drawable.h_omniknight_sb, R.drawable.h_pheonix_sb, R.drawable.h_pudge_sb,
            R.drawable.h_sand_king_sb, R.drawable.h_slardar_sb, R.drawable.h_spirit_breaker_sb,
            R.drawable.h_sven_sb, R.drawable.h_tidehunter_sb,R.drawable.h_timbersaw_sb, R.drawable.h_tiny_sb, R.drawable.h_treant_sb, R.drawable.h_tusk_sb, R.drawable.h_underlord_sb, R.drawable.h_undying_sb, R.drawable.h_ursa_sb,
            R.drawable.h_wraith_king_sb,};

    String hero_name[] = {"Abbadon","Alchemist","Axe", "Beastmaster", "Brewmaster",
            "Bristleback", "Centaur Warrunner", "Chaos Knight", "Clockwork",
            "Doom", "Dragon Knight", "Earth Spirit", "Earthshaker", "Elder Titan", "Huskar", "Io",
            "Kunkka", "Legion Commander", "Lifestealer", "Lone Druid", "Lycan", "Magnus", "Meepo", "Night Stalker",
            "Omniknight", "Pheonix", "Pudge", "Sand King", "Slardar", "Spirit Breaker", "Sven", "Tidehunter","Timbersaw", "Tiny", "Treant",
            "Tusk", "Underlord", "Undying","Ursa", "Wraith King"};

    public hero_st() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        setHasOptionsMenu(true);
        View v = inflater.inflate(R.layout.adapter_fragment, container, false);
        gridView = (GridView) v.findViewById(R.id.adapterGrid);
        imV = new ImageView(getActivity());
        gridView.setAdapter(new Adapter(v.getContext(), img_id, hero_name));
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                imV.setImageResource(img_id[i]);
                imV.setScaleType(ImageView.ScaleType.FIT_CENTER);
                Toaster.show(getActivity(), hero_name[i], true);
                return true;
            }
        });

        LongPressPopup popup = new LongPressPopupBuilder(getActivity())// A Context object for the builder constructor
                .setTarget(gridView)// The View which will open the popup if long pressed
                .setPopupView(imV)
                .setLongPressDuration(750)
                .setDismissOnLongPressStop(true)
                .setDismissOnBackPressed(true)
                .setCancelTouchOnDragOutsideView(false)
                .setAnimationType(LongPressPopup.ANIMATION_TYPE_FROM_CENTER)// The View to show when long pressed
                .build();
        popup.register();
        // Inflate the layout for this fragment
        return v;
    }

    @Override
    public void onCreateOptionsMenu (Menu menu, MenuInflater inflater) {
        menu.clear();
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.main, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.str) {
            hero_st fragment = new hero_st();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragment).commit();
        }
        else if (id == R.id.agi){
            hero_agi fragment = new hero_agi();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragment).commit();
        }
        else if (id == R.id.intel){
            hero_int fragment = new hero_int();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container,fragment).commit();

        }

        return true;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        startAct(0);
                        break;
                    case 1:
                        startAct(1);
                        break;
                    case 2:
                        startAct(5);
                        break;
                    case 3:
                        startAct(8);
                        break;
                    case 4:
                        startAct(11);
                        break;
                    case 5:
                        startAct(12);
                        break;
                    case 6:
                        startAct(14);
                        break;
                    case 7:
                        startAct(15);
                        break;
                    case 8:
                        startAct(18);
                        break;
                    case 9:
                        startAct(24);
                        break;
                    case 10:
                        startAct(25);
                        break;
                    case 11:
                        startAct(27);
                        break;
                    case 12:
                        startAct(28);
                        break;
                    case 13:
                        startAct(29);
                        break;
                    case 14:
                        startAct(35);
                        break;
                    case 15:
                        startAct(37);
                        break;
                    case 16:
                        startAct(41);
                        break;
                    case 17:
                        startAct(42);
                        break;
                    case 18:
                        startAct(45);
                        break;
                    case 19:
                        startAct(48);
                        break;
                    case 20:
                        startAct(50);
                        break;
                    case 21:
                        startAct(51);
                        break;
                    case 22:
                        startAct(53);
                        break;
                    case 23:
                        startAct(59);
                        break;
                    case 24:
                        startAct(62);
                        break;
                    case 25:
                        startAct(67);
                        break;
                    case 26:
                        startAct(69);
                        break;
                    case 27:
                        startAct(75);
                        break;
                    case 28:
                        startAct(81);
                        break;
                    case 29:
                        startAct(85);
                        break;
                    case 30:
                        startAct(87);
                        break;
                    case 31:
                        startAct(91);
                        break;
                    case 32:
                        startAct(92);
                        break;
                    case 33:
                        startAct(94);
                        break;
                    case 34:
                        startAct(95);
                        break;
                    case 35:
                        startAct(97);
                        break;
                    case 36:
                        startAct(98);
                        break;
                    case 37:
                        startAct(99);
                        break;
                    case 38:
                        startAct(100);
                        break;
                    case 39:
                        startAct(109);
                        break;
                    default:
                        startAct(i);
                }
            }
        });
    }

    public void startAct(int i){

        Intent intent = new Intent(getActivity(), Main2Activity.class);
        intent.putExtra("id", i);
        intent.putExtra("page","hero");
        startActivity(intent);

    }


}

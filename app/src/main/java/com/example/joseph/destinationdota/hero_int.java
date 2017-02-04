package com.example.joseph.destinationdota;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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
public class hero_int extends Fragment {

    GridView gridView;
    ImageView imV;
    Integer img_id[] = {R.drawable.h_ancient_apparition_sb, R.drawable.h_bane_sb, R.drawable.h_batrider_sb,
            R.drawable.h_chen_sb, R.drawable.h_crystal_maiden_sb, R.drawable.h_dark_seer_sb, R.drawable.h_dazzle_sb, R.drawable.h_death_prophet_sb, R.drawable.h_disruptor_sb,
            R.drawable.h_enchantress_sb, R.drawable.h_enigma_sb, R.drawable.h_invoker_sb, R.drawable.h_jakiro_sb, R.drawable.h_keeper_of_the_light_sb, R.drawable.h_leshrac_sb, R.drawable.h_lich_sb, R.drawable.h_lina_sb, R.drawable.h_lion_sb,
            R.drawable.h_nature_prophet_sb, R.drawable.h_necrolyte_sb, R.drawable.h_ogre_magi_sb, R.drawable.h_oracle_sb, R.drawable.h_outworld_devourer_sb, R.drawable.h_puck_sb,  R.drawable.h_pugna_sb, R.drawable.h_queenofpain_sb,
            R.drawable.h_rubick_sb, R.drawable.h_shadow_demon_sb, R.drawable.h_shadow_shaman_sb, R.drawable.h_silencer_sb, R.drawable.h_skywrath_mage_sb, R.drawable.h_storm_spirit_sb,
            R.drawable.h_techies_sb, R.drawable.h_tinker_sb, R.drawable.h_visage_sb, R.drawable.h_warlock_sb, R.drawable.h_windrunner_sb, R.drawable.h_witch_doctor_sb, R.drawable.h_ww_sb, R.drawable.h_zeus_sb};

    String hero_name[] = {"Ancient Apparition", "Bane", "Batrider", "Chen", "Crystal Maiden", "Dark Seer", "Dazzle", "Death Prophet", "Distruptor",
            "Enchantress", "Enigma", "Invoker", "Jakiro", "Keeper of the Light", "Leshrac", "Lich", "Lina", "Lion", "Nature's Prophet", "Necrophos",
            "Ogre Magi", "Oracle", "Outworld Devourer", "Puck", "Pugna", "Queen of Pain", "Rubick", "Shadow Demon", "Shadow Shaman",
            "Silencer", "Skywrath Mage", "Storm Spirit", "Techies", "Tinker", "Visage", "Warlock", "Windranger", "Witch Doctor", "Winter Wyvern", "Zeus"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View v = inflater.inflate(R.layout.adapter_fragment, container, false);
        gridView = (GridView) v.findViewById(R.id.adapterGrid);
        imV = new ImageView(getActivity());
        gridView.setAdapter(new Adapter(v.getContext(), img_id, hero_name));
        // Inflate the layout for this fragment
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
                        startAct(2);
                        break;
                    case 1:
                        startAct(6);
                        break;
                    case 2:
                        startAct(7);
                        break;
                    case 3:
                        startAct(16);
                        break;
                    case 4:
                        startAct(19);
                        break;
                    case 5:
                        startAct(20);
                        break;
                    case 6:
                        startAct(21);
                        break;
                    case 7:
                        startAct(22);
                        break;
                    case 8:
                        startAct(23);
                        break;
                    case 9:
                        startAct(31);
                        break;
                    case 10:
                        startAct(32);
                        break;
                    case 11:
                        startAct(36);
                        break;
                    case 12:
                        startAct(38);
                        break;
                    case 13:
                        startAct(40);
                        break;
                    case 14:
                        startAct(43);
                        break;
                    case 15:
                        startAct(44);
                        break;
                    case 16:
                        startAct(46);
                        break;
                    case 17:
                        startAct(47);
                        break;
                    case 18:
                        startAct(57);
                        break;
                    case 19:
                        startAct(58);
                        break;
                    case 20:
                        startAct(61);
                        break;
                    case 21:
                        startAct(63);
                        break;
                    case 22:
                        startAct(64);
                        break;
                    case 23:
                        startAct(68);
                        break;
                    case 24:
                        startAct(70);
                        break;
                    case 25:
                        startAct(71);
                        break;
                    case 26:
                        startAct(74);
                        break;
                    case 27:
                        startAct(76);
                        break;
                    case 28:
                        startAct(78);
                        break;
                    case 29:
                        startAct(79);
                        break;
                    case 30:
                        startAct(80);
                        break;
                    case 31:
                        startAct(86);
                        break;
                    case 32:
                        startAct(88);
                        break;
                    case 33:
                        startAct(93);
                        break;
                    case 34:
                        startAct(104);
                        break;
                    case 35:
                        startAct(105);
                        break;
                    case 36:
                        startAct(107);
                        break;
                    case 37:
                        startAct(108);
                        break;
                    case 38:
                        startAct(110);
                        break;
                    case 39:
                        startAct(111);
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


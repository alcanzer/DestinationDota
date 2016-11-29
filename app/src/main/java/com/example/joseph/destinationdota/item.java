package com.example.joseph.destinationdota;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import rm.com.longpresspopup.LongPressPopup;
import rm.com.longpresspopup.LongPressPopupBuilder;


/**
 * A simple {@link Fragment} subclass.
 */
public class item extends Fragment {
    GridView gridView;
    ImageView imV;
    Integer item_id[] = {R.drawable.i_abyssal, R.drawable.i_aegis, R.drawable.i_aether, R.drawable.i_aghanims, R.drawable.i_arcane, R.drawable.i_armlet, R.drawable.i_assault, R.drawable.i_banana, R.drawable.i_bandelven, R.drawable.i_battlefury, R.drawable.i_belt_of_strength,
            R.drawable.i_black_king, R.drawable.i_blade_alacrity, R.drawable.i_blade_attack, R.drawable.i_blademail, R.drawable.i_blight, R.drawable.i_blink, R.drawable.i_bloodstone, R.drawable.i_bloodthorn, R.drawable.i_boots_speed, R.drawable.i_boots_travel, R.drawable.i_boots_travel2,
            R.drawable.i_bottle, R.drawable.i_bracer, R.drawable.i_broadsword, R.drawable.i_buckler, R.drawable.i_butterfly, R.drawable.i_chainmail, R.drawable.i_cheese, R.drawable.i_circlet, R.drawable.i_clarity, R.drawable.i_claymore, R.drawable.i_cloak, R.drawable.i_courier, R.drawable.i_crimson, R.drawable.i_crystalys, R.drawable.i_daedalus,
            R.drawable.i_dagon, R.drawable.i_dagon2, R.drawable.i_dagon3, R.drawable.i_dagon4, R.drawable.i_dagon5, R.drawable.i_demon, R.drawable.i_deso, R.drawable.i_diffusal, R.drawable.i_diffusal2, R.drawable.i_divine_rapier, R.drawable.i_dragon_lance, R.drawable.i_drums, R.drawable.i_dust, R.drawable.i_eaglesong,
            R.drawable.i_echo, R.drawable.i_enchanted_mango, R.drawable.i_energy_booster, R.drawable.i_ethereal_blade, R.drawable.i_euls_scepter, R.drawable.i_eye_skadi, R.drawable.i_faerie, R.drawable.i_flying_cour, R.drawable.i_force_staff, R.drawable.i_gaunt, R.drawable.i_gem, R.drawable.i_ghost,
            R.drawable.i_glimmer,R.drawable.i_gloves,R.drawable.i_greaves,R.drawable.i_hand,R.drawable.i_headdress,R.drawable.i_healing_salve,R.drawable.i_heart,R.drawable.i_heavens,R.drawable.i_helm_dom,R.drawable.i_helm_will,R.drawable.i_hood,R.drawable.i_hurricane,R.drawable.i_hyper,R.drawable.i_infused,R.drawable.i_iron_branch,
            R.drawable.i_iron_talon,R.drawable.i_javelin,R.drawable.i_linkens,R.drawable.i_lotus,R.drawable.i_maelstrom,R.drawable.i_magic_stick,R.drawable.i_magic_wand,R.drawable.i_manta,R.drawable.i_mantle,R.drawable.i_mask_madness,R.drawable.i_medallion,R.drawable.i_mekansm,R.drawable.i_mithril,R.drawable.i_mjollnir,R.drawable.i_monkey,R.drawable.i_moon,R.drawable.i_morbid,
            R.drawable.i_mystic,R.drawable.i_necro1,R.drawable.i_necro2,R.drawable.i_necro3,R.drawable.i_null,R.drawable.i_oblivion,R.drawable.i_obs,R.drawable.i_obs_sent,R.drawable.i_octa,R.drawable.i_ogre,R.drawable.i_orb_venom,R.drawable.i_orchid,R.drawable.i_pers,R.drawable.i_phase,R.drawable.i_pipe,R.drawable.i_platemail,R.drawable.i_point_booster,R.drawable.i_poors,
            R.drawable.i_power_treads,R.drawable.i_quarter,R.drawable.i_quelling,R.drawable.i_radiance,R.drawable.i_reaver,R.drawable.i_refresher,R.drawable.i_ring_aquila,R.drawable.i_ring_basi,R.drawable.i_ring_health,R.drawable.i_ring_protect,R.drawable.i_ring_regen,R.drawable.i_robe,R.drawable.i_rod,R.drawable.i_sacred,R.drawable.i_sage,
            R.drawable.i_sange,R.drawable.i_sangeayasha,R.drawable.i_satanic,R.drawable.i_scythe,R.drawable.i_shadow_a,R.drawable.i_shadow_b,R.drawable.i_shivas,R.drawable.i_silver_edge,R.drawable.i_skull,R.drawable.i_slippers,R.drawable.i_smoke,R.drawable.i_solar,R.drawable.i_soul_booster,R.drawable.i_soul_ring,R.drawable.i_staff,R.drawable.i_stout,
            R.drawable.i_talisman,R.drawable.i_tango,R.drawable.i_tango_s,R.drawable.i_tome,R.drawable.i_town,R.drawable.i_tranquil,R.drawable.i_ulti,R.drawable.i_urn,R.drawable.i_vanguard,R.drawable.i_veil,R.drawable.i_vitality,R.drawable.i_vladmir,R.drawable.i_void,R.drawable.i_wind,R.drawable.i_wraith,R.drawable.i_yasha
    };

    String item_name[] = {"Abyssal Blade","Aegis", "Aether Lens", "Aghanims Scepter", "Arcane Boots", "Armlet of Mordigan", "Assault Cuirass", "Banana", "Band of Elven", "Battle Fury", "Belt of Strenghth", "Black King Bar", "Blade of Alacrity", "Blade of Attack", "Blade Mail", "Blight Stone", "Blink Dagger", "Bloodstone", "Bloodthorn",
            "Boots of speed", "Boots of Travel", "Boots of Travel II", "Bottle", "Bracers", "Broadsword", "Buckler", "Butterfly", "Chainmail", "Cheese", "Circlet", "Clarity", "Claymore", "Cloak", "Courier", "Crimson Guard", "Crystalys", "Daedalus", "Dagon", "Dagon II","Dagon III","Dagon IV","Dagon V", "Demon Edge", "Desolator", "Diffusal Blade I", "Diffusal Blade II",
            "Divine Rapier", "Dragon Lance", "Drums of Endurance", "Smoke of Appearance", "Eagle Song", "Echo Saber", "Mango","energy Booster", "Ethereal Blade", "Eul's Scepter", "Skadi", "Faerie Fire", "Flying Courier", "Force Staff", "Gaunlet of Strength", "Gem of True Sight", "Ghost Scepter", "Glimmer Cape", "Gloves of Haste", "Greaves", "Hand of Midas", "Headdress", "Salve", "Heart of Tarrasque", "Heaven's Halberd",
            "Helm of Dominator", "Helm of Iron Will", "Hood of Defiance", "Hurricane Pike", "Hyperstone", "Raindrop", "Iron Branch", "Iron Talon", "Javelin", "Linken's Sphere", "Lotus Orb", "Maelstrom", "Magic Stick", "Magic Wand", "Manta Style", "Mantle of Intelligence", "Mask of Madness", "Medallion of Courage", "Mekansm", "Mithril Hammer", "Mjollnir", "Monkey King Bar",
            "Moonshard", "Morbid Mask", "Mystic Staff", "Necronomicon I", "Necronomicon II", "Necronomicon III", "Null Talisman", "Oblivion Staff", "Observer Ward", "Sentry Ward", "Octarine Core", "Ogre Club", "Orb of Venom", "Orchid Malevolence", "Perseverance", "Phase Boots", "Pipe of Insight", "Platemail", "Point Booster", "Poor man's Shield", "Power Treads", "Quarterstaff",
            "Quelling Blade", "Radiance", "Reaver", "Refresher's Orb", "Ring of Aquila", "Ring of Basilius", "Ring of Health", "Ring of Protection", "Ring of Regen", "Robe of the Magi", "Rod of Atos", "Sacred Relic", "Sage Mask", "Sange", "Sange and Yasha", "Satanic", "Scythe of Vyse", "Shadow Amulet", "Shadow Blade", "Shiva's Guard", "Silver Edge", "Skull Basher",
            "Slippers of Agility", "Smoke of Deceit", "Solar Crest", "Soul Booster", "Soul Ring", "Staff of Wizardry", "Stout Shield", "Talisman of Evasion", "Tango", "Tango(Shared)", "Tome of Knowledge", "Teleport Scroll", "Tranquil Boots", "Ultimate Orb", "Shadow Urn", "Vanguard", "Veil of Discord", "Vitality Booster", "Vladimir's Offering", "Void Stone", "Wind Lace", "Wraith Band",
            "Yasha"};

    public item() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.adapter_fragment, container, false);
        gridView = (GridView)v.findViewById(R.id.adapterGrid);
        imV = new ImageView(getActivity());
        gridView.setAdapter(new Adapter(v.getContext(),item_id, item_name));
        getActivity().setTitle("Items");
        gridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                imV.setImageResource(item_id[i]);
                imV.setScaleType(ImageView.ScaleType.FIT_CENTER);
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
        return v;


    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getActivity(), Main2Activity.class);
                intent.putExtra("id", i);
                intent.putExtra("page","item");
                startActivity(intent);
            }
        });
    }
}

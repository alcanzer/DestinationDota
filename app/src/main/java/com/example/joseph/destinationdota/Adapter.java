package com.example.joseph.destinationdota;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Joseph on 10/22/2016.
 */
public class Adapter extends BaseAdapter {
    private Context cnt;
    private LayoutInflater inflater;
    private Integer img_id[]; /*= {R.drawable.h_abbadon_sb,R.drawable.h_alchemist_sb, R.drawable.h_ancient_apparition_sb, R.drawable.h_antimage_sb,R.drawable.h_arc_warden_sb, R.drawable.h_axe_sb,
            R.drawable.h_bane_sb, R.drawable.h_batrider_sb, R.drawable.h_beastmaster_sb, R.drawable.h_bloodseeker_sb, R.drawable.h_bounty_hunter_sb, R.drawable.h_brewmaster_sb,R.drawable.h_bristleback_sb, R.drawable.h_broodmother_sb,R.drawable.h_cent_sb, R.drawable.h_chaos_knight_sb,
            R.drawable.h_chen_sb, R.drawable.h_clinkz_sb,R.drawable.h_clockwork_sb, R.drawable.h_crystal_maiden_sb, R.drawable.h_dark_seer_sb, R.drawable.h_dazzle_sb, R.drawable.h_death_prophet_sb, R.drawable.h_disruptor_sb, R.drawable.h_doom_bringer_sb,
            R.drawable.h_dragon_knight_sb, R.drawable.h_drow_ranger_sb,R.drawable.h_earth_spirit_sb, R.drawable.h_earthshaker_sb,R.drawable.h_elder_titan_sb,R.drawable.h_ember_spirit_sb, R.drawable.h_enchantress_sb, R.drawable.h_enigma_sb, R.drawable.h_faceless_void_sb, R.drawable.h_gyrocopter_sb,
            R.drawable.h_huskar_sb, R.drawable.h_invoker_sb,R.drawable.h_io_sb, R.drawable.h_jakiro_sb, R.drawable.h_juggernaut_sb, R.drawable.h_keeper_of_the_light_sb, R.drawable.h_kunkka_sb,R.drawable.h_legion_commander_sb, R.drawable.h_leshrac_sb, R.drawable.h_lich_sb, R.drawable.h_life_stealer_sb, R.drawable.h_lina_sb, R.drawable.h_lion_sb, R.drawable.h_lone_druid_sb, R.drawable.h_luna_sb, R.drawable.h_lycan_sb, R.drawable.h_magnataur_sb,R.drawable.h_medusa_sb, R.drawable.h_meepo_sb, R.drawable.h_mirana_sb, R.drawable.h_morphling_sb, R.drawable.h_naga_siren_sb,R.drawable.h_nature_prophet_sb, R.drawable.h_necrolyte_sb, R.drawable.h_night_stalker_sb, R.drawable.h_nyx_assassin_sb, R.drawable.h_ogre_magi_sb, R.drawable.h_omniknight_sb,R.drawable.h_oracle_sb,R.drawable.h_outworld_devourer_sb, R.drawable.h_phantom_assassin_sb, R.drawable.h_phantom_lancer_sb,R.drawable.h_pheonix_sb, R.drawable.h_puck_sb, R.drawable.h_pudge_sb, R.drawable.h_pugna_sb, R.drawable.h_queenofpain_sb, R.drawable.h_razor_sb, R.drawable.h_riki_sb, R.drawable.h_rubick_sb, R.drawable.h_sand_king_sb, R.drawable.h_shadow_demon_sb,R.drawable.h_shadow_fiend_sb, R.drawable.h_shadow_shaman_sb, R.drawable.h_silencer_sb,R.drawable.h_skywrath_mage_sb, R.drawable.h_slardar_sb,R.drawable.h_slark_sb, R.drawable.h_sniper_sb, R.drawable.h_spectre_sb, R.drawable.h_spirit_breaker_sb, R.drawable.h_storm_spirit_sb, R.drawable.h_sven_sb,R.drawable.h_techies_sb, R.drawable.h_templar_assassin_sb,R.drawable.h_terror_blade_sb, R.drawable.h_tidehunter_sb,R.drawable.h_timbersaw_sb, R.drawable.h_tinker_sb, R.drawable.h_tiny_sb, R.drawable.h_treant_sb, R.drawable.h_troll_warlord_sb,R.drawable.h_tusk_sb,R.drawable.h_underlord_sb,R.drawable.h_undying_sb, R.drawable.h_ursa_sb, R.drawable.h_vengefulspirit_sb, R.drawable.h_venomancer_sb, R.drawable.h_viper_sb, R.drawable.h_visage_sb, R.drawable.h_warlock_sb, R.drawable.h_weaver_sb, R.drawable.h_windrunner_sb, R.drawable.h_witch_doctor_sb,R.drawable.h_wraith_king_sb,R.drawable.h_ww_sb, R.drawable.h_zeus_sb};
*/
    public Adapter(Context cnt, Integer[] img_id, String[] hero_name) {
        this.cnt = cnt;
        this.img_id = img_id;
        this.hero_name = hero_name;
    }

    @Override

    public int getCount() {
        return img_id.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = view;

        if (view == null){
            inflater = (LayoutInflater) cnt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inflater.inflate(R.layout.layout,null);
        }
        ImageView hero = (ImageView) v.findViewById(R.id.icon_image);
        TextView desc = (TextView) v.findViewById(R.id.icon_text);

        hero.setImageResource(img_id[i]);
        desc.setText(hero_name[i]);
        /*LayoutInflater layoutInflater;
        View v;
        TextView tv = (TextView)view.findViewById(R.id.icon_text);
        ImageView iv =(ImageView)view.findViewById(R.id.icon_image);
        ViewHolder vh = new ViewHolder();
        if (view == null) {
            vh.im = new ImageView(cnt);
            vh.im.setLayoutParams(new GridView.LayoutParams(350, 250));
            vh.im.setScaleType(ImageView.ScaleType.CENTER_CROP);
            vh.im.setPadding(0, 0, 0, 0);
        } else {
            vh.im = (ImageView) view;
        }
        vh.im.setImageResource(img_id[i]);*/
        return v;
    }

    private String hero_name[]/* = {"Abbadon","Alchemist","Ancient Apparition","Anti-Mage", "Arc-Warden","Axe", "Bane", "Batrider","Beastmaster", "Bloodseeker", "Bounty Hunter","Brewmaster",
    "Bristleback","Broodmother", "Centaur Warrunner","Chaos Knight","Chen","Clinkz","Clockwork","Crystal Maiden","Dark Seer","Dazzle","Death Prophet","Distruptor",
    "Doom", "Dragon Knight","Drow Ranger","Earth Spirit","Earthshaker","Elder Titan","Ember Spirit","Enchantress","Enigma","Faceless Void","Gyrocopter","Huskar","Invoker","Io",
    "Jakiro","Juggernaut","Keeper of the Light","Kunkka","Legion Commander","Leshrac","Lich","Lifestealer","Lina","Lion","Lone Druid","Luna","Lycan","Magnus","Medusa","Meepo","Mirana","Morphling","Naga Siren","Nature's Prophet","Necrophos","Night Stalker",
    "Nyx Assassin","Ogre Magi","Omniknight","Oracle","Outworld Devourer","Phantom Assassin","Phantom Lancer","Pheonix","Puck","Pudge","Pugna","Queen of Pain","Razor","Riki","Rubick","Sand King","Shadow Demon","Shadow Fiend","Shadow Shaman",
            "Silencer","Skywrath Mage","Slardar","Slark","Sniper","Spectre","Spirit Breaker","Storm Spirit","Sven","Techies" ,"Templar Assassin","Terrorblade", "Tidehunter","Timbersaw","Tinker","Tiny","Treant",
            "Troll Warlord","Tusk","Underlord","Undying","Ursa","Vengeful Spirit","Venomancer","Viper","Visage","Warlock","Weaver","Windranger","Witch Doctor","Wraith King", "Winter Wyvern","Zeus"
    }*/;
}

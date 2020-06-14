package com.example.tampilanandroid;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;
    final Fragment beranda = new BerandaFragment();
    final Fragment pemesanan = new PemesananFragment();
    final Fragment profil = new ProfilFragment();
    final FragmentManager fm = getSupportFragmentManager();

    private FragmentManager getSupportFragmentManager() {

        return null;
    }

}

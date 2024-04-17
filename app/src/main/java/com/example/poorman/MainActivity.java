package com.example.poorman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView image,image1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Autocomplete TextView
            AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autoCompleteTextView);
            image= findViewById(R.id.image);
            AutoCompleteTextView autoCompleteTextView1 = findViewById(R.id.autoCompleteTextView1);
            image1= findViewById(R.id.image1);
            String [] district=getResources().getStringArray(R.array.array_bd_distric) ;

            String[] barguna =getResources().getStringArray(R.array.Barguna) ;
        String[] barishal =getResources().getStringArray(R.array.Barishal) ;
        String[] bhola =getResources().getStringArray(R.array.Bhola) ;
        String[] bBaria =getResources().getStringArray(R.array.BBaria) ;
        String[] bandarban =getResources().getStringArray(R.array.Bandarban) ;
        String[] bagethat =getResources().getStringArray(R.array.Bagerhat) ;
        String[] bogura =getResources().getStringArray(R.array.Bogura) ;

        String[] cnawabganj =getResources().getStringArray(R.array.Cnawabganj) ;
        String[] chuadanga =getResources().getStringArray(R.array.Chuadanga) ;
        String[] chandpur =getResources().getStringArray(R.array.Chandpur) ;
        String[] chattogram =getResources().getStringArray(R.array.Chattogram) ;
        String[] coxsbazar =getResources().getStringArray(R.array.COXSBAZAR) ;
        String[] cumilla =getResources().getStringArray(R.array.Cumilla) ;

        String[] dhaka =getResources().getStringArray(R.array.Dhaka) ;
        String[] dinajpur =getResources().getStringArray(R.array.Dinajpur) ;

        String[] feni =getResources().getStringArray(R.array.Feni) ;
        String[] faridpur =getResources().getStringArray(R.array.Faridpur) ;

        String[] gazipur =getResources().getStringArray(R.array.Gazipur) ;
        String[] gopalganj =getResources().getStringArray(R.array.Gopalganj) ;
        String[] gaibandha =getResources().getStringArray(R.array.Gaibandha) ;

        String[] habiganj =getResources().getStringArray(R.array.Habiganj) ;

        String[] jhalokathi =getResources().getStringArray(R.array.Jhalokathi) ;
        String[] jashore =getResources().getStringArray(R.array.Jashore) ;
        String[] jhenaidah =getResources().getStringArray(R.array.Jhenaidah) ;
        String[] jamalpur =getResources().getStringArray(R.array.Jamalpur) ;
        String[] joypurhat =getResources().getStringArray(R.array.Joypurhat) ;

        String[] kishoreganj =getResources().getStringArray(R.array.Kishoreganj) ;
        String[] khagrachari =getResources().getStringArray(R.array.Khagrachari) ;
        String[] kurigram =getResources().getStringArray(R.array.Kurigram) ;
        String[] khulna =getResources().getStringArray(R.array.Khulna) ;
        String[] kushtia =getResources().getStringArray(R.array.Kushtia) ;

        String[] lalmonirhat =getResources().getStringArray(R.array.Lalmonirhat) ;
        String[] laxmipur =getResources().getStringArray(R.array.Laxmipur) ;

        String[] madaripur =getResources().getStringArray(R.array.Madaripur) ;
        String[] manikganj =getResources().getStringArray(R.array.Manikganj) ;
        String[] munshiganj =getResources().getStringArray(R.array.Munshiganj) ;
        String[] magura =getResources().getStringArray(R.array.Magura) ;
        String[] meherpur =getResources().getStringArray(R.array.Meherpur) ;
        String[] mymensingh =getResources().getStringArray(R.array.Mymensingh) ;
        String[] moulvibazar =getResources().getStringArray(R.array.Moulvibazar) ;

        String[] netrokona =getResources().getStringArray(R.array.Netrokona) ;
        String[] narail =getResources().getStringArray(R.array.Narail) ;
        String[] noakhali =getResources().getStringArray(R.array.Noakhali) ;
        String[] narayanganj =getResources().getStringArray(R.array.Narayanganj) ;
        String[] narshinghi =getResources().getStringArray(R.array.Narshingdi) ;
        String[] naogaon =getResources().getStringArray(R.array.Naogaon) ;
        String[] natore =getResources().getStringArray(R.array.Natore) ;
        String[] nilphamari =getResources().getStringArray(R.array.Nilphamari) ;

        String[] panchagarh =getResources().getStringArray(R.array.Panchagarh) ;
        String[] patuakhali =getResources().getStringArray(R.array.Patuakhali) ;
        String[] pirojpur =getResources().getStringArray(R.array.Pirojpur) ;
        String[] pabna =getResources().getStringArray(R.array.Pabna) ;

        String[] rajbari =getResources().getStringArray(R.array.Rajbari) ;
        String[] rangamati =getResources().getStringArray(R.array.Rangamati) ;
        String[] rajshahi =getResources().getStringArray(R.array.Rajshahi) ;
        String[] rangpur =getResources().getStringArray(R.array.Rangpur) ;

        String[] shariatpur =getResources().getStringArray(R.array.Shariatpur) ;
        String[] satkhira =getResources().getStringArray(R.array.Satkhira) ;
        String[] sherpur =getResources().getStringArray(R.array.Sherpur) ;
        String[] sirajganj =getResources().getStringArray(R.array.Sirajganj) ;
        String[] sunamganj =getResources().getStringArray(R.array.Sunamganj) ;
        String[] sylhet =getResources().getStringArray(R.array.Sylhet) ;

        String[] tangail =getResources().getStringArray(R.array.Tangail) ;
        String[] thakurgaan =getResources().getStringArray(R.array.Thakurgaon) ;

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,district);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, barguna);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, barishal);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, bhola);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, bBaria);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, bandarban);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, bagethat);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, bogura);

        ArrayAdapter<String> adapter8 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, cnawabganj);
        ArrayAdapter<String> adapter9 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, chuadanga);
        ArrayAdapter<String> adapter10 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, chandpur);
        ArrayAdapter<String> adapter11 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, chattogram);
        ArrayAdapter<String> adapter12 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, coxsbazar);
        ArrayAdapter<String> adapter13 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, cumilla);

        ArrayAdapter<String> adapter14 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, dhaka);
        ArrayAdapter<String> adapter15 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, dinajpur);

        ArrayAdapter<String> adapter16 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, feni);
        ArrayAdapter<String> adapter17 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, faridpur);

        ArrayAdapter<String> adapter18 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, gazipur);
        ArrayAdapter<String> adapter19 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, gopalganj);
        ArrayAdapter<String> adapter20 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, gaibandha);

        ArrayAdapter<String> adapter21 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, habiganj);

        ArrayAdapter<String> adapter22 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, jhalokathi);
        ArrayAdapter<String> adapter23 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, jashore);
        ArrayAdapter<String> adapter24 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, jhenaidah);
        ArrayAdapter<String> adapter25 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, jamalpur);
        ArrayAdapter<String> adapter26 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, joypurhat);

        ArrayAdapter<String> adapter27 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, kishoreganj);
        ArrayAdapter<String> adapter28 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, khagrachari);
        ArrayAdapter<String> adapter29 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, kurigram);
        ArrayAdapter<String> adapter30 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, khulna);
        ArrayAdapter<String> adapter31 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, kushtia);

        ArrayAdapter<String> adapter32 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, lalmonirhat);
        ArrayAdapter<String> adapter33 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, laxmipur);

        ArrayAdapter<String> adapter34 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, madaripur);
        ArrayAdapter<String> adapter35 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, manikganj);
        ArrayAdapter<String> adapter36 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, munshiganj);
        ArrayAdapter<String> adapter37 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, magura);
        ArrayAdapter<String> adapter38 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, meherpur);
        ArrayAdapter<String> adapter39 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,mymensingh);
        ArrayAdapter<String> adapter40 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, moulvibazar);

        ArrayAdapter<String> adapter41 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, netrokona);
        ArrayAdapter<String> adapter42 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, narail);
        ArrayAdapter<String> adapter43 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, noakhali);
        ArrayAdapter<String> adapter44 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, narayanganj);
        ArrayAdapter<String> adapter45 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, narshinghi);
        ArrayAdapter<String> adapter46 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, naogaon);
        ArrayAdapter<String> adapter47 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line,natore);
        ArrayAdapter<String> adapter48 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, nilphamari);

        ArrayAdapter<String> adapter49 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, panchagarh);
        ArrayAdapter<String> adapter50 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, patuakhali);
        ArrayAdapter<String> adapter51 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, pirojpur);
        ArrayAdapter<String> adapter52 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, pabna);

        ArrayAdapter<String> adapter53 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, rajbari);
        ArrayAdapter<String> adapter54 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, rangamati);
        ArrayAdapter<String> adapter55 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, rajshahi);
        ArrayAdapter<String> adapter56 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, rangpur);

        ArrayAdapter<String> adapter57 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, shariatpur);
        ArrayAdapter<String> adapter58 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, satkhira);
        ArrayAdapter<String> adapter59 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, sherpur);
        ArrayAdapter<String> adapter60 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, sirajganj);
        ArrayAdapter<String> adapter61 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, sunamganj);
        ArrayAdapter<String> adapter62 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, sylhet);
        ArrayAdapter<String> adapter63 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, tangail);
        ArrayAdapter<String> adapter64 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, thakurgaan);


        autoCompleteTextView.setAdapter(adapter);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                autoCompleteTextView.showDropDown();
            }
        });
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                    autoCompleteTextView1.setAdapter(adapter1);
                    image1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            autoCompleteTextView1.showDropDown();
                        }
                    });
                    break;
                    case 1:
                        autoCompleteTextView1.setAdapter(adapter2);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                    case 2:
                        autoCompleteTextView1.setAdapter(adapter3);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                         case 3:
                        autoCompleteTextView1.setAdapter(adapter4);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 4:
                        autoCompleteTextView1.setAdapter(adapter5);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 5:
                        autoCompleteTextView1.setAdapter(adapter6);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 6:
                        autoCompleteTextView1.setAdapter(adapter7);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 7:
                        autoCompleteTextView1.setAdapter(adapter8);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 8:
                        autoCompleteTextView1.setAdapter(adapter9);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                    case 9:
                        autoCompleteTextView1.setAdapter(adapter10);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 10:
                        autoCompleteTextView1.setAdapter(adapter12);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 11:
                        autoCompleteTextView1.setAdapter(adapter12);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 12:
                        autoCompleteTextView1.setAdapter(adapter13);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 13:
                        autoCompleteTextView1.setAdapter(adapter14);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 14:
                        autoCompleteTextView1.setAdapter(adapter15);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 15:
                        autoCompleteTextView1.setAdapter(adapter16);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 16:
                        autoCompleteTextView1.setAdapter(adapter17);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 17:
                        autoCompleteTextView1.setAdapter(adapter18);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 18:
                        autoCompleteTextView1.setAdapter(adapter19);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 19:
                        autoCompleteTextView1.setAdapter(adapter20);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 20:
                        autoCompleteTextView1.setAdapter(adapter21);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 21:
                        autoCompleteTextView1.setAdapter(adapter22);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 22:
                        autoCompleteTextView1.setAdapter(adapter23);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 23:
                        autoCompleteTextView1.setAdapter(adapter24);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 24:
                        autoCompleteTextView1.setAdapter(adapter25);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 25:
                        autoCompleteTextView1.setAdapter(adapter26);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 26:
                        autoCompleteTextView1.setAdapter(adapter27);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 27:
                        autoCompleteTextView1.setAdapter(adapter28);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 28:
                        autoCompleteTextView1.setAdapter(adapter29);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 29:
                        autoCompleteTextView1.setAdapter(adapter30);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 30:
                        autoCompleteTextView1.setAdapter(adapter31);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 31:
                        autoCompleteTextView1.setAdapter(adapter32);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 32:
                        autoCompleteTextView1.setAdapter(adapter33);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 33:
                        autoCompleteTextView1.setAdapter(adapter34);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 34:
                        autoCompleteTextView1.setAdapter(adapter35);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 35:
                        autoCompleteTextView1.setAdapter(adapter36);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break; case 36:
                        autoCompleteTextView1.setAdapter(adapter37);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 37:
                        autoCompleteTextView1.setAdapter(adapter38);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 38:
                        autoCompleteTextView1.setAdapter(adapter39);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 39:
                        autoCompleteTextView1.setAdapter(adapter40);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 40:
                        autoCompleteTextView1.setAdapter(adapter41);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 41:
                        autoCompleteTextView1.setAdapter(adapter42);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 42:
                        autoCompleteTextView1.setAdapter(adapter43);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 43:
                        autoCompleteTextView1.setAdapter(adapter44);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 44:
                        autoCompleteTextView1.setAdapter(adapter45);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 45:
                        autoCompleteTextView1.setAdapter(adapter46);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 46:
                        autoCompleteTextView1.setAdapter(adapter47);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 47:
                        autoCompleteTextView1.setAdapter(adapter48);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 48:
                        autoCompleteTextView1.setAdapter(adapter49);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 49:
                        autoCompleteTextView1.setAdapter(adapter50);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 50:
                        autoCompleteTextView1.setAdapter(adapter51);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 51:
                        autoCompleteTextView1.setAdapter(adapter52);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 52:
                        autoCompleteTextView1.setAdapter(adapter53);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 53:
                        autoCompleteTextView1.setAdapter(adapter54);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 54:
                        autoCompleteTextView1.setAdapter(adapter55);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 55:
                        autoCompleteTextView1.setAdapter(adapter56);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 56:
                        autoCompleteTextView1.setAdapter(adapter57);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 57:
                        autoCompleteTextView1.setAdapter(adapter58);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 58:
                        autoCompleteTextView1.setAdapter(adapter59);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 59:
                        autoCompleteTextView1.setAdapter(adapter60);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 60:
                        autoCompleteTextView1.setAdapter(adapter61);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 61:
                        autoCompleteTextView1.setAdapter(adapter62);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 62:
                        autoCompleteTextView1.setAdapter(adapter63);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });
                        break;
                        case 63:
                        autoCompleteTextView1.setAdapter(adapter64);
                        image1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                autoCompleteTextView1.showDropDown();
                            }
                        });

                }
            }
        });


        }
    }
package com.example.candylovers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    //vars
    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();
    private ArrayList<String> mDesc = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

        initImageBitmaps();


    }

    private void initImageBitmaps(){
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.");

        mImageUrls.add("https://ultraimg.com/images/p-gummijelly.jpg");
        mNames.add("Permen Jelly");
        mDesc.add("Permen jelly adalah permen bertekstur lunak yang diproses dengan penambahan komponen hidrokoloid seperti agar, gum, pektin, pati, karagenan, gelatin dan lain-lain yang digunakan untuk modifikasi tekstur sehingga menghasilkan produk yang kenyal. Permen ini diciptakan oleh Hans Riegel pada 1922 di Jerman. Nama aslinya gummibar, kalo dalam Bahasa Inggris namanya jadi Gummy Bear.");

        mImageUrls.add("https://cf.dvh.bz/library/1/9/1/4/1914_840x576.jpg");
        mNames.add("Permen Karet");
        mDesc.add("Permen karet adalah permen kunyah yang memiliki ciri khas yaitu dapat dibuat untuk mengembangkan gelembung. Warnanya beraneka ragam dan memiliki rasa tertentu. Biasanya permen karet bersifat lengket dan pada saat gelembung terkembang hingga batas tertentu, maka gelembung akan pecah dan mengenai wajah. ");

        mImageUrls.add("http://www.detroitmommies.com/wp-content/uploads/2010/03/marshmallows.jpg");
        mNames.add("Marshmallow");
        mDesc.add("Marshmallow bila dimakan meleleh di dalam mulut karena merupakan hasil dari campuran gula atau sirup jagung, putih telur, gelatin, gom arab, dan bahan perasa yang dikocok hingga mengembang.Marshmallow merupakan makanan ringan yang sering dimakan setelah dipanggang di atas api unggun. ");

        mImageUrls.add("https://cdn.shopify.com/s/files/1/1590/7679/collections/Swirl_POP_COllection_x400.jpg?v=1509840748");
        mNames.add("Lollipop");
        mDesc.add("Lolipop adalah permen gula terfavorit yang sudah ada sejak zaman dulu. Asal usul permen lolipop diduga berasal dari cara manusia purba untuk mengumpulkan madu dengan menggunakan tongkat. Cikal bakal permen lolipop yang lebih modern diperkirakan ditemukan pada masa kebudayaan Arab, Cina, dan Mesir Kuno. ");

        mImageUrls.add("https://lh3.googleusercontent.com/yNRsT_58zbnwCeWh3SHtcPQAXKevs2c2gXFrNsyPNeZd8bchfa7J3Ra02JJ_-SYj03gyPIV6FCxo5mhqnN_VWQ");
        mNames.add("Turkish Delight");
        mDesc.add("Permen yang berasal dari Turki ini mempunyai tekstur yang lembut dan lengket mirip jelly dan ditambahkan dengan potongan-potongan walnut, almond, atau kenari, serta taburan gula halus di permukaannya. ");

        mImageUrls.add("https://i.etsystatic.com/17843935/r/il/75f4c7/1542860362/il_570xN.1542860362_1r5x.jpg");
        mNames.add("Botan Rice Candy");
        mDesc.add("Kalo biasanya permen dibuat dari gula atau caramel, Botan Rice Candy ini ternyata terbuat dari campuran beras yang dicampur dengan jelly. Permen ini biasanya dibungkus menggunakan kertas yang bisa dimakan.  ");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStYaaxWikHkw8JT4P35k_LIQgD0dgBzXfXOAnJBKjcad1ocal9");
        mNames.add("Brigadeiro");
        mDesc.add("Permen asal Brazil yang satu ini biasanya disuguhkan saat pesta ulang tahun. Permen ini terbuat dari susu dan bubuk cocoa. Nama Brigadeiro sendiri diambil dari nama seorang jenderal AU Brazil, Eduardo Gomez, yang sangat terkenal karena berhasil membasmi pemberontak pada tahun 1940an.");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGx6qBwte6WME8hgzBY2NKXmOtlNs3ChCSLeOPZzCgkyKs7E8W4A");
        mNames.add("Licorice  Candy");
        mDesc.add("Permen ini berasal dari negara Belanda dan termasuk camilan favorit di negara tersebut. Permen akar manis (Inggris Britania: liquorice, Inggris Amerika: licorice) adalah sejenis permen yang terbuat dari ekstrak tanaman akar manis glycyrrhiza glabra. Di Belanda dan negara-negara Nordik, permen akar manis memiliki kandungan amonium klorida yang bernama salmiakki.");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRw1Db42R0RwXkOrFoWHUVLlMOPCzj22ljysfmZVaJ70sxGcNrX");
        mNames.add("Permen Jahe");
        mDesc.add("Permen ini termasuk permen kuno dari negeri kita yakni Indonesia. Permen ini sangat cocok untuk menghangatkan badan dan menyegarkan tenggorokan dan permen ini sangat disukai sama orang-orang Eropa.");

        mImageUrls.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSCi-1JJSPDYwh68dduiv3Ro3BOUAYFcRbxSODnTwvG_42mOdFz");
        mNames.add("Candy Bar");
        mDesc.add("Jenis permen tua ini adalah jenis permen yang paling standar karena bentuk dan kemasannya yang sangat sederhana. Bentuknya kotak dengan panjang sekitar 8 inci( 20cm). Biasanya candy bar menggunakan campuran susu, cokelat, dan caramel (gula yang dimasak).");

        initRecyclerView();


    }
    private void initRecyclerView(){
        Log.d(TAG, "initRecyclerView: init recyclerview.");
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this, mNames, mImageUrls, mDesc);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}

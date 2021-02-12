package com.recepyesilkaya.databinding_sample.data.mock

import com.recepyesilkaya.databinding_sample.data.model.Market

object Mock {

    fun getMarkets(): ArrayList<Market> {
        val temps = ArrayList<Market>()
        temps.add(
            Market(
                1,
                "Televizyon",
                "Elektronik",
                1000,
                15,
                "http://blog.recognize.im/wp-content/uploads/2013/03/TV.png"
            )
        )
        temps.add(
            Market(
                2,
                "Ütü",
                "Elektronik",
                650,
                10,
                "https://st1.myideasoft.com/idea/dm/10/myassets/products/584/20242549-r1.png?revision=1498651719"
            )
        )
        temps.add(
            Market(
                3,
                "Şampuan",
                "Kozmetik",
                30,
                5,
                "http://pngimg.com/uploads/shampoo/shampoo_PNG10.png"
            )
        )
        temps.add(
            Market(
                4,
                "Makarna",
                "Gıda",
                12,
                10,
                "https://www.selva.com.tr/Files/product/79d7eaa3-cadd-40f9-84c4-1794cc90d067.png"
            )
        )
        temps.add(
            Market(
                5,
                "Pirinç",
                "Gıda",
                24,
                45,
                "https://st3.myideasoft.com/idea/bi/33/myassets/products/049/kam.png?revision=1477220685"
            )
        )
        temps.add(
            Market(
                6,
                "Cips",
                "Gıda",
                5,
                30,
                "https://st3.myideasoft.com/idea/ef/68/myassets/products/290/f1e9467c-43f4-4d8d-a712-eb5b6d5fc8bc.png?revision=1551246456"
            )
        )
        temps.add(
            Market(
                7,
                "Çikolata",
                "Gıda",
                4,
                5,
                "https://static.happycenter.com.tr/Uploads/ulker-cikolatali-gofret-5-li-paket-200-gr-11610-500x500.png"
            )
        )

        return temps
    }
}
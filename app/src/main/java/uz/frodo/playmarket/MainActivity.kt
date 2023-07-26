package uz.frodo.playmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import uz.frodo.playmarket.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var list:ArrayList<Title>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadData()
        binding.rv.adapter = MyAdapter(this,list)
    }

    private fun loadData() {
        list = ArrayList()
        val app1 = arrayListOf<App>(
            App("Instagram","https://cdn.pixabay.com/photo/2016/08/09/17/52/instagram-1581266_640.jpg",4.0f),
            App("Snapchat","https://pbs.twimg.com/profile_images/1607410723227054082/RaQz46j7_400x400.jpg",4.5f),
            App("Pinterest","https://static.vecteezy.com/system/resources/previews/018/930/744/original/pinterest-logo-pinterest-transparent-free-png.png",4.2f),
            App("Likee","https://upload.wikimedia.org/wikipedia/commons/0/03/Likee_%28cropped%29_2.png",4.6f),
            App("Bigo-Live","https://iconlogovector.com/uploads/images/2023/02/lg-63ff39cf37b55bd5d33663a47bda0c6f48.jpg",4.7f)
        )
        list.add(Title("Share photo & vidios",app1))
        val app2 = arrayListOf<App>(
            App("Tik Tok","https://cdn.pixabay.com/photo/2022/02/09/08/24/tiktok-7002866_1280.png",4.2f),
            App("Telegram","https://static.vecteezy.com/system/resources/previews/023/986/562/original/telegram-logo-telegram-logo-transparent-telegram-icon-transparent-free-free-png.png",4.6f),
            App("Threads, an Instagram app","https://staticg.sportskeeda.com/editor/2023/07/c590e-16886371769609.png",4.4f),
            App("CapCut - Video Editor","https://freelogopng.com/images/all_img/1664284836cap-cut-logo-png.png",4.7f),
            App("imo video calls","https://seeklogo.com/images/I/imo-logo-C66FDBF9B5-seeklogo.com.png",4.2f)
        )
        list.add(Title("Popular apps",app2))

        val app3 = arrayListOf<App>(
            App("Telegram","https://static.vecteezy.com/system/resources/previews/023/986/562/original/telegram-logo-telegram-logo-transparent-telegram-icon-transparent-free-free-png.png",4.7f),
            App("Tik Tok","https://cdn.pixabay.com/photo/2022/02/09/08/24/tiktok-7002866_1280.png",4.5f),
            App("Threads, an Instagram app","https://staticg.sportskeeda.com/editor/2023/07/c590e-16886371769609.png",4.0f),
            App("Instagram","https://cdn.pixabay.com/photo/2016/08/09/17/52/instagram-1581266_640.jpg",4.2f),
            App("Facebook","https://1000logos.net/wp-content/uploads/2021/04/Facebook-logo.png",4.5f)
        )
        list.add(Title("Social network",app3))

        val app4 = arrayListOf<App>(
            App("WeChat","https://seeklogo.com/images/W/wechat-logo-24CA7667E7-seeklogo.com.png",4.2f),
            App("Threads, an Instagram app","https://staticg.sportskeeda.com/editor/2023/07/c590e-16886371769609.png",4.0f),
            App("WhatsApp Business","https://logowik.com/content/uploads/images/whatsapp-business4638.jpg",4.8f),
            App("Facebook","https://1000logos.net/wp-content/uploads/2021/04/Facebook-logo.png",4.4f),
            App("Telegram","https://static.vecteezy.com/system/resources/previews/023/986/562/original/telegram-logo-telegram-logo-transparent-telegram-icon-transparent-free-free-png.png",4.8f)
        )
        list.add(Title("Messaging apps",app4))
    }
}
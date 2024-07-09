package com.example.article

import Article
import ArticleAdapter
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.article.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvRecyclerView.layoutManager  = LinearLayoutManager(this)
        displayArticles()

    }
    fun displayArticles(){
        val article1=Article("Wamui","2023","The woods","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search",
            "https://plus.unsplash.com/premium_photo-1689596510917-d337f077d559?dpr=1&w=306&auto=format&fit=crop&q=60&crop=entropy&cs=tinysrgb&fm=jpg&ixid=M3wxMjA3fDB8MXxzZWFyY2h8NHx8ZnJ1aXRzfGVufDB8fHx8MTcyMDQ0MDk1MHwx&ixlib=rb-4.0.3")
        val article2=Article("Susan","2022","The man","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search",
            "https://plus.unsplash.com/premium_photo-1661661588574-c49396dc4f28?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzF8fGZydWl0fGVufDB8fDB8fHwx")
        val article3=Article("Waluse","2021","Gaint","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search",
            "https://plus.unsplash.com/premium_photo-1689596510917-d337f077d559?dpr=1&w=306&auto=format&fit=crop&q=60&crop=entropy&cs=tinysrgb&fm=jpg&ixid=M3wxMjA3fDB8MXxzZWFyY2h8NHx8ZnJ1aXRzfGVufDB8fHx8MTcyMDQ0MDk1MHwx&ixlib=rb-4.0.3")
        val article4=Article("Tracy","2020","Hero","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search",
            "https://plus.unsplash.com/premium_photo-1689596510917-d337f077d559?dpr=1&w=306&auto=format&fit=crop&q=60&crop=entropy&cs=tinysrgb&fm=jpg&ixid=M3wxMjA3fDB8MXxzZWFyY2h8NHx8ZnJ1aXRzfGVufDB8fHx8MTcyMDQ0MDk1MHwx&ixlib=rb-4.0.3")
        val article5=Article("Axum","2012","Grow","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search",
            "https://plus.unsplash.com/premium_photo-1689596510917-d337f077d559?dpr=1&w=306&auto=format&fit=crop&q=60&crop=entropy&cs=tinysrgb&fm=jpg&ixid=M3wxMjA3fDB8MXxzZWFyY2h8NHx8ZnJ1aXRzfGVufDB8fHx8MTcyMDQ0MDk1MHwx&ixlib=rb-4.0.3")
        val article6=Article("Rachiel","2013","From","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search",
            "https://plus.unsplash.com/premium_photo-1689596510917-d337f077d559?dpr=1&w=306&auto=format&fit=crop&q=60&crop=entropy&cs=tinysrgb&fm=jpg&ixid=M3wxMjA3fDB8MXxzZWFyY2h8NHx8ZnJ1aXRzfGVufDB8fHx8MTcyMDQ0MDk1MHwx&ixlib=rb-4.0.3")
        val article7=Article("Junnet","2013","Become","The woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search",
            "https://plus.unsplash.com/premium_photo-1689596510917-d337f077d559?dpr=1&w=306&auto=format&fit=crop&q=60&crop=entropy&cs=tinysrgb&fm=jpg&ixid=M3wxMjA3fDB8MXxzZWFyY2h8NHx8ZnJ1aXRzfGVufDB8fHx8MTcyMDQ0MDk1MHwx&ixlib=rb-4.0.3")
        val article8=Article("WDorcus","2009","Accidental","TThe woods  were dark and hostile the night was long and hauntinng as she bravely traveled the wilderness","https://www.google.com/search",
            "https://plus.unsplash.com/premium_photo-1689596510917-d337f077d559?dpr=1&w=306&auto=format&fit=crop&q=60&crop=entropy&cs=tinysrgb&fm=jpg&ixid=M3wxMjA3fDB8MXxzZWFyY2h8NHx8ZnJ1aXRzfGVufDB8fHx8MTcyMDQ0MDk1MHwx&ixlib=rb-4.0.3")

        val article= listOf(article1,article2,article3,article5,article6,article7,article8,article4)
        val articleAdapter=ArticleAdapter(article)
        binding.rvRecyclerView.adapter=articleAdapter
    }
}
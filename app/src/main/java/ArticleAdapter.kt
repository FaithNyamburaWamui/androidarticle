import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.article.R
import com.example.article.databinding.ArticleListItemBinding
import com.squareup.picasso.Picasso

class ArticleAdapter (val article:List<Article>):RecyclerView.Adapter<ArticleViewHolder>(){

    @SuppressLint("SuspiciousIndentation")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticleViewHolder {
     val binding=ArticleListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ArticleViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return article.size
    }


    override fun onBindViewHolder(holder: ArticleViewHolder, position: Int) {
        val article= article[position]
        holder.binding.tvName.text=article.name
        holder.binding.tvPublish.text=article.publish
        holder.binding.tvTittle.text=article.title
        holder.binding.tvPreview.text=article.preview
        holder.binding.tvLink.text=article.link

        Picasso.get().load(article.image).placeholder(R.drawable.orange).resize(300,120).centerCrop().into(holder.binding.ivArticle)

    }
}

class  ArticleViewHolder(var binding:ArticleListItemBinding):RecyclerView.ViewHolder(binding.root){
//    val tvName=itemView.findViewById<TextView>(R.id.tvName)
//    val tvPublish=itemView.findViewById<TextView>(R.id.tvPublish)
//    val tvTittle=itemView.findViewById<TextView>(R.id.tvTittle)
//    val tvPreview=itemView.findViewById<TextView>(R.id.tvPreview)
//    val tvLink=itemView.findViewById<TextView>(R.id.tvLink)



}